package com.example.dominic.photoview;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.itheima.library.Info;
import com.itheima.library.PhotoView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        PhotoView photoView = (PhotoView) findViewById(R.id.img);
        // 启用图片缩放功能
                photoView.enable();
        // 禁用图片缩放功能 (默认为禁用，会跟普通的ImageView一样，缩放功能需手动调用enable()启用)
      //          photoView.disenable();
        // 获取图片信息
        Info info = photoView.getInfo();
        // 从普通的ImageView中获取Info
    //    Info info = PhotoView.getImageViewInfo(ImageView);
    }
}

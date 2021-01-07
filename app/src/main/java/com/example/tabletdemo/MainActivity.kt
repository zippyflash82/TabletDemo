package com.example.tabletdemo

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.TextUtils
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        tv_banner.ellipsize = TextUtils.TruncateAt.MARQUEE
        tv_banner.isSelected = true
        tv_banner.setSingleLine()
    }
}
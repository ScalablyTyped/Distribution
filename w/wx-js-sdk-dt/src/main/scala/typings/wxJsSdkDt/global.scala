package typings.wxJsSdkDt

import typings.wxJsSdkDt.anon.LocalId
import typings.wxJsSdkDt.anon.NetworkType
import typings.wxJsSdkDt.wx.AddCardConfig
import typings.wxJsSdkDt.wx.CheckApiConfig
import typings.wxJsSdkDt.wx.ChooseCardConfig
import typings.wxJsSdkDt.wx.ChooseImageConfig
import typings.wxJsSdkDt.wx.ChooseWXPayConfig
import typings.wxJsSdkDt.wx.DownLoadImageConfig
import typings.wxJsSdkDt.wx.DownloadVoiceConfig
import typings.wxJsSdkDt.wx.GetLocalImgDataConfig
import typings.wxJsSdkDt.wx.GetLocationConfig
import typings.wxJsSdkDt.wx.MenuItemsConfig
import typings.wxJsSdkDt.wx.MenuShareQQ
import typings.wxJsSdkDt.wx.MenuShareWeibo
import typings.wxJsSdkDt.wx.OnSearchBeaconsConfig
import typings.wxJsSdkDt.wx.OpenAddressConfig
import typings.wxJsSdkDt.wx.OpenCardConfig
import typings.wxJsSdkDt.wx.OpenLocationConfig
import typings.wxJsSdkDt.wx.OpenProductSpecificViewConfig
import typings.wxJsSdkDt.wx.PreviewImageConfig
import typings.wxJsSdkDt.wx.ScanQRCodeConfig
import typings.wxJsSdkDt.wx.ShareTimelineConfig
import typings.wxJsSdkDt.wx.ShareToTimelineConfig
import typings.wxJsSdkDt.wx.ShareToUserConfig
import typings.wxJsSdkDt.wx.SharedAppMessage
import typings.wxJsSdkDt.wx.StartSearchBeaconsConfig
import typings.wxJsSdkDt.wx.StopSearchBeaconsConfig
import typings.wxJsSdkDt.wx.UploadImageConfig
import typings.wxJsSdkDt.wx.UploadVoiceConfig
import typings.wxJsSdkDt.wx.WxConfig
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object global {
  
  object wx {
    
    @JSGlobal("wx")
    @js.native
    val ^ : js.Any = js.native
    
    @JSGlobal("wx.OpenCardObj")
    @js.native
    class OpenCardObj ()
      extends StObject
         with typings.wxJsSdkDt.wx.OpenCardObj {
      
      /* CompleteClass */
      var cardId: String = js.native
      
      /* CompleteClass */
      var code: String = js.native
    }
    
    /**
      * 批量添加卡券接口
      */
    inline def addCard(config: AddCardConfig): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("addCard")(config.asInstanceOf[js.Any]).asInstanceOf[Unit]
    
    /**
      * 判断当前客户端版本是否支持指定 JS 接口
      */
    inline def checkJsApi(setting: CheckApiConfig): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("checkJsApi")(setting.asInstanceOf[js.Any]).asInstanceOf[Unit]
    
    /**
      * 拉取适用卡券列表并获取用户选择信息
      */
    inline def chooseCard(config: ChooseCardConfig): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("chooseCard")(config.asInstanceOf[js.Any]).asInstanceOf[Unit]
    
    /**
      * 拍照或从手机相册中选图接口
      */
    inline def chooseImage(config: ChooseImageConfig): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("chooseImage")(config.asInstanceOf[js.Any]).asInstanceOf[Unit]
    
    /**
      * 发起一个微信支付请求
      */
    inline def chooseWXPay(config: ChooseWXPayConfig): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("chooseWXPay")(config.asInstanceOf[js.Any]).asInstanceOf[Unit]
    
    /**
      * 关闭当前网页窗口接口
      */
    inline def closeWindow(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("closeWindow")().asInstanceOf[Unit]
    
    /**
      * 初始化，做任何操作前必须调用该方法
      * @param setting 配置对象
      */
    inline def config(setting: WxConfig): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("config")(setting.asInstanceOf[js.Any]).asInstanceOf[Unit]
    
    inline def downloadImage(config: DownLoadImageConfig): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("downloadImage")(config.asInstanceOf[js.Any]).asInstanceOf[Unit]
    
    inline def downloadVoice(config: DownloadVoiceConfig): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("downloadVoice")(config.asInstanceOf[js.Any]).asInstanceOf[Unit]
    
    /**
      * 配置微信初始化失败后的回调
      * @param err 失败回调
      */
    inline def error(err: js.Function1[/* res */ js.Any, Unit]): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("error")(err.asInstanceOf[js.Any]).asInstanceOf[Unit]
    
    /**
      * 获取本地图片接口,此接口仅在 iOS WKWebview 下提供，用于兼容 iOS WKWebview 不支持 localId 直接显示图片的问题
      */
    inline def getLocalImgData(config: GetLocalImgDataConfig): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("getLocalImgData")(config.asInstanceOf[js.Any]).asInstanceOf[Unit]
    
    /**
      * 获取地理位置接口
      */
    inline def getLocation(config: GetLocationConfig): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("getLocation")(config.asInstanceOf[js.Any]).asInstanceOf[Unit]
    
    /**
      * 获取网络状态, var networkType = res.networkType; 返回网络类型 2g，3g，4g，wifi
      */
    inline def getNetworkType(success: js.Function1[/* res */ NetworkType, Unit]): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("getNetworkType")(success.asInstanceOf[js.Any]).asInstanceOf[Unit]
    
    /**
      * 隐藏所有非基础按钮接口
      */
    inline def hideAllNonBaseMenuItem(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("hideAllNonBaseMenuItem")().asInstanceOf[Unit]
    
    /**
      * 批量隐藏功能按钮接口
      */
    inline def hideMenuItems(config: MenuItemsConfig): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("hideMenuItems")(config.asInstanceOf[js.Any]).asInstanceOf[Unit]
    
    /**
      * 获取“分享给朋友”按钮点击状态及自定义分享内容接口
      * @deprecated
      */
    inline def onMenuShareAppMessage(setting: SharedAppMessage): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("onMenuShareAppMessage")(setting.asInstanceOf[js.Any]).asInstanceOf[Unit]
    
    /**
      * “分享到QQ”按钮点击状态及自定义分享内容接口
      * @deprecated
      */
    inline def onMenuShareQQ(config: MenuShareQQ): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("onMenuShareQQ")(config.asInstanceOf[js.Any]).asInstanceOf[Unit]
    
    /**
      * 获取“分享到QQ空间”按钮点击状态及自定义分享内容接口
      * @deprecated
      */
    inline def onMenuShareQZone(config: MenuShareWeibo): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("onMenuShareQZone")(config.asInstanceOf[js.Any]).asInstanceOf[Unit]
    
    /**
      * 获取“分享到朋友圈”按钮点击状态及自定义分享内容接口
      * @deprecated
      */
    inline def onMenuShareTimeline(setting: ShareTimelineConfig): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("onMenuShareTimeline")(setting.asInstanceOf[js.Any]).asInstanceOf[Unit]
    
    /**
      * 获取“分享到腾讯微博”按钮点击状态及自定义分享内容接口
      */
    inline def onMenuShareWeibo(config: MenuShareWeibo): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("onMenuShareWeibo")(config.asInstanceOf[js.Any]).asInstanceOf[Unit]
    
    /**
      * 监听周边 ibeacon 设备接口,
      * 摇一摇周边接口使用注意事项及更多返回结果说明，请参考：摇一摇周边获取设备信息
      */
    inline def onSearchBeacons(config: OnSearchBeaconsConfig): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("onSearchBeacons")(config.asInstanceOf[js.Any]).asInstanceOf[Unit]
    
    /**
      * 停止播放后的回调
      */
    inline def onVoicePlayEnd(success: js.Function1[/* res */ LocalId, Unit]): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("onVoicePlayEnd")(success.asInstanceOf[js.Any]).asInstanceOf[Unit]
    
    /**
      * 录音时间超过一分钟没有停止的时候会执行回调
      */
    inline def onVoiceRecordEnd(complete: js.Function1[/* res */ LocalId, Unit]): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("onVoiceRecordEnd")(complete.asInstanceOf[js.Any]).asInstanceOf[Unit]
    
    /**
      * 快速输入共享收货地址接口
      */
    inline def openAddress(config: OpenAddressConfig): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("openAddress")(config.asInstanceOf[js.Any]).asInstanceOf[Unit]
    
    /**
      * 查看微信卡包中的卡券接口
      */
    inline def openCard(config: OpenCardConfig): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("openCard")(config.asInstanceOf[js.Any]).asInstanceOf[Unit]
    
    /**
      * 微信内置地图查看位置
      */
    inline def openLocation(config: OpenLocationConfig): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("openLocation")(config.asInstanceOf[js.Any]).asInstanceOf[Unit]
    
    /**
      * 跳转微信商品页接口
      */
    inline def openProductSpecificView(config: OpenProductSpecificViewConfig): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("openProductSpecificView")(config.asInstanceOf[js.Any]).asInstanceOf[Unit]
    
    /**
      * 暂停音频
      */
    inline def pauseVoice(localId: String): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("pauseVoice")(localId.asInstanceOf[js.Any]).asInstanceOf[Unit]
    
    /**
      * 播放音频
      */
    inline def playVoice(localId: String): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("playVoice")(localId.asInstanceOf[js.Any]).asInstanceOf[Unit]
    
    /**
      * 预览图片接口
      */
    inline def previewImage(config: PreviewImageConfig): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("previewImage")(config.asInstanceOf[js.Any]).asInstanceOf[Unit]
    
    /**
      * 配置微信初始化成功后的回调
      * @param x 回调
      */
    inline def ready(x: js.Function0[Unit]): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("ready")(x.asInstanceOf[js.Any]).asInstanceOf[Unit]
    
    /**
      * 调起微信扫一扫接口
      */
    inline def scanQRCode(config: ScanQRCodeConfig): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("scanQRCode")(config.asInstanceOf[js.Any]).asInstanceOf[Unit]
    
    /**
      * 显示所有功能按钮接口
      */
    inline def showAllNonBaseMenuItem(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("showAllNonBaseMenuItem")().asInstanceOf[Unit]
    
    /**
      * 批量显示功能按钮接口
      */
    inline def showMenuItems(config: MenuItemsConfig): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("showMenuItems")(config.asInstanceOf[js.Any]).asInstanceOf[Unit]
    
    /**
      * 开始录音
      */
    inline def startRecord(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("startRecord")().asInstanceOf[Unit]
    
    /**
      * 开启查找周边 ibeacon 设备接口
      */
    inline def startSearchBeacons(config: StartSearchBeaconsConfig): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("startSearchBeacons")(config.asInstanceOf[js.Any]).asInstanceOf[Unit]
    
    /**
      * 停止录音
      */
    inline def stopRecord(success: js.Function1[/* res */ LocalId, Unit]): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("stopRecord")(success.asInstanceOf[js.Any]).asInstanceOf[Unit]
    
    /**
      * 关闭查找完成后的回调函数
      */
    inline def stopSearchBeacons(config: StopSearchBeaconsConfig): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("stopSearchBeacons")(config.asInstanceOf[js.Any]).asInstanceOf[Unit]
    
    /**
      * 停止播放音频
      */
    inline def stopVoice(localId: String): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("stopVoice")(localId.asInstanceOf[js.Any]).asInstanceOf[Unit]
    
    /**
      * 识别音频并返回识别结果接口
      */
    inline def translateVoice(config: UploadVoiceConfig): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("translateVoice")(config.asInstanceOf[js.Any]).asInstanceOf[Unit]
    
    /**
      * “分享给朋友”及“分享到QQ”
      * @param config
      */
    inline def updateAppMessageShareData(config: ShareToUserConfig): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("updateAppMessageShareData")(config.asInstanceOf[js.Any]).asInstanceOf[Unit]
    
    /**
      * “分享到朋友圈”及“分享到QQ空间”
      * @param config
      */
    inline def updateTimelineShareData(config: ShareToTimelineConfig): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("updateTimelineShareData")(config.asInstanceOf[js.Any]).asInstanceOf[Unit]
    
    /**
      * 上传图片
      */
    inline def uploadImage(config: UploadImageConfig): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("uploadImage")(config.asInstanceOf[js.Any]).asInstanceOf[Unit]
    
    /**
      * 上传语音接口, 上传语音有效期3天，可用微信多媒体接口下载语音到自己的服务器，
      */
    inline def uploadVoice(config: UploadVoiceConfig): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("uploadVoice")(config.asInstanceOf[js.Any]).asInstanceOf[Unit]
  }
}

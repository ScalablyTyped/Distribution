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
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object global {
  
  object wx {
    
    @JSGlobal("wx.OpenCardObj")
    @js.native
    class OpenCardObj ()
      extends typings.wxJsSdkDt.wx.OpenCardObj
    
    /**
      * 批量添加卡券接口
      */
    @JSGlobal("wx.addCard")
    @js.native
    def addCard(config: AddCardConfig): Unit = js.native
    
    /**
      * 判断当前客户端版本是否支持指定 JS 接口
      */
    @JSGlobal("wx.checkJsApi")
    @js.native
    def checkJsApi(setting: CheckApiConfig): Unit = js.native
    
    /**
      * 拉取适用卡券列表并获取用户选择信息
      */
    @JSGlobal("wx.chooseCard")
    @js.native
    def chooseCard(config: ChooseCardConfig): Unit = js.native
    
    /**
      * 拍照或从手机相册中选图接口
      */
    @JSGlobal("wx.chooseImage")
    @js.native
    def chooseImage(config: ChooseImageConfig): Unit = js.native
    
    /**
      * 发起一个微信支付请求
      */
    @JSGlobal("wx.chooseWXPay")
    @js.native
    def chooseWXPay(config: ChooseWXPayConfig): Unit = js.native
    
    /**
      * 关闭当前网页窗口接口
      */
    @JSGlobal("wx.closeWindow")
    @js.native
    def closeWindow(): Unit = js.native
    
    /**
      * 初始化，做任何操作前必须调用该方法
      * @param setting 配置对象
      */
    @JSGlobal("wx.config")
    @js.native
    def config(setting: WxConfig): Unit = js.native
    
    @JSGlobal("wx.downloadImage")
    @js.native
    def downloadImage(config: DownLoadImageConfig): Unit = js.native
    
    @JSGlobal("wx.downloadVoice")
    @js.native
    def downloadVoice(config: DownloadVoiceConfig): Unit = js.native
    
    /**
      * 配置微信初始化失败后的回调
      * @param err 失败回调
      */
    @JSGlobal("wx.error")
    @js.native
    def error(err: js.Function1[/* res */ js.Any, Unit]): Unit = js.native
    
    /**
      * 获取本地图片接口,此接口仅在 iOS WKWebview 下提供，用于兼容 iOS WKWebview 不支持 localId 直接显示图片的问题
      */
    @JSGlobal("wx.getLocalImgData")
    @js.native
    def getLocalImgData(config: GetLocalImgDataConfig): Unit = js.native
    
    /**
      * 获取地理位置接口
      */
    @JSGlobal("wx.getLocation")
    @js.native
    def getLocation(config: GetLocationConfig): Unit = js.native
    
    /**
      * 获取网络状态, var networkType = res.networkType; 返回网络类型 2g，3g，4g，wifi
      */
    @JSGlobal("wx.getNetworkType")
    @js.native
    def getNetworkType(success: js.Function1[/* res */ NetworkType, Unit]): Unit = js.native
    
    /**
      * 隐藏所有非基础按钮接口
      */
    @JSGlobal("wx.hideAllNonBaseMenuItem")
    @js.native
    def hideAllNonBaseMenuItem(): Unit = js.native
    
    /**
      * 批量隐藏功能按钮接口
      */
    @JSGlobal("wx.hideMenuItems")
    @js.native
    def hideMenuItems(config: MenuItemsConfig): Unit = js.native
    
    /**
      * 获取“分享给朋友”按钮点击状态及自定义分享内容接口
      * @deprecated
      */
    @JSGlobal("wx.onMenuShareAppMessage")
    @js.native
    def onMenuShareAppMessage(setting: SharedAppMessage): Unit = js.native
    
    /**
      * “分享到QQ”按钮点击状态及自定义分享内容接口
      * @deprecated
      */
    @JSGlobal("wx.onMenuShareQQ")
    @js.native
    def onMenuShareQQ(config: MenuShareQQ): Unit = js.native
    
    /**
      * 获取“分享到QQ空间”按钮点击状态及自定义分享内容接口
      * @deprecated
      */
    @JSGlobal("wx.onMenuShareQZone")
    @js.native
    def onMenuShareQZone(config: MenuShareWeibo): Unit = js.native
    
    /**
      * 获取“分享到朋友圈”按钮点击状态及自定义分享内容接口
      * @deprecated
      */
    @JSGlobal("wx.onMenuShareTimeline")
    @js.native
    def onMenuShareTimeline(setting: ShareTimelineConfig): Unit = js.native
    
    /**
      * 获取“分享到腾讯微博”按钮点击状态及自定义分享内容接口
      */
    @JSGlobal("wx.onMenuShareWeibo")
    @js.native
    def onMenuShareWeibo(config: MenuShareWeibo): Unit = js.native
    
    /**
      * 监听周边 ibeacon 设备接口,
      * 摇一摇周边接口使用注意事项及更多返回结果说明，请参考：摇一摇周边获取设备信息
      */
    @JSGlobal("wx.onSearchBeacons")
    @js.native
    def onSearchBeacons(config: OnSearchBeaconsConfig): Unit = js.native
    
    /**
      * 停止播放后的回调
      */
    @JSGlobal("wx.onVoicePlayEnd")
    @js.native
    def onVoicePlayEnd(success: js.Function1[/* res */ LocalId, Unit]): Unit = js.native
    
    /**
      * 录音时间超过一分钟没有停止的时候会执行回调
      */
    @JSGlobal("wx.onVoiceRecordEnd")
    @js.native
    def onVoiceRecordEnd(complete: js.Function1[/* res */ LocalId, Unit]): Unit = js.native
    
    /**
      * 快速输入共享收货地址接口
      */
    @JSGlobal("wx.openAddress")
    @js.native
    def openAddress(config: OpenAddressConfig): Unit = js.native
    
    /**
      * 查看微信卡包中的卡券接口
      */
    @JSGlobal("wx.openCard")
    @js.native
    def openCard(config: OpenCardConfig): Unit = js.native
    
    /**
      * 微信内置地图查看位置
      */
    @JSGlobal("wx.openLocation")
    @js.native
    def openLocation(config: OpenLocationConfig): Unit = js.native
    
    /**
      * 跳转微信商品页接口
      */
    @JSGlobal("wx.openProductSpecificView")
    @js.native
    def openProductSpecificView(config: OpenProductSpecificViewConfig): Unit = js.native
    
    /**
      * 暂停音频
      */
    @JSGlobal("wx.pauseVoice")
    @js.native
    def pauseVoice(localId: String): Unit = js.native
    
    /**
      * 播放音频
      */
    @JSGlobal("wx.playVoice")
    @js.native
    def playVoice(localId: String): Unit = js.native
    
    /**
      * 预览图片接口
      */
    @JSGlobal("wx.previewImage")
    @js.native
    def previewImage(config: PreviewImageConfig): Unit = js.native
    
    /**
      * 配置微信初始化成功后的回调
      * @param x 回调
      */
    @JSGlobal("wx.ready")
    @js.native
    def ready(x: js.Function0[Unit]): Unit = js.native
    
    /**
      * 调起微信扫一扫接口
      */
    @JSGlobal("wx.scanQRCode")
    @js.native
    def scanQRCode(config: ScanQRCodeConfig): Unit = js.native
    
    /**
      * 显示所有功能按钮接口
      */
    @JSGlobal("wx.showAllNonBaseMenuItem")
    @js.native
    def showAllNonBaseMenuItem(): Unit = js.native
    
    /**
      * 批量显示功能按钮接口
      */
    @JSGlobal("wx.showMenuItems")
    @js.native
    def showMenuItems(config: MenuItemsConfig): Unit = js.native
    
    /**
      * 开始录音
      */
    @JSGlobal("wx.startRecord")
    @js.native
    def startRecord(): Unit = js.native
    
    /**
      * 开启查找周边 ibeacon 设备接口
      */
    @JSGlobal("wx.startSearchBeacons")
    @js.native
    def startSearchBeacons(config: StartSearchBeaconsConfig): Unit = js.native
    
    /**
      * 停止录音
      */
    @JSGlobal("wx.stopRecord")
    @js.native
    def stopRecord(success: js.Function1[/* res */ LocalId, Unit]): Unit = js.native
    
    /**
      * 关闭查找完成后的回调函数
      */
    @JSGlobal("wx.stopSearchBeacons")
    @js.native
    def stopSearchBeacons(config: StopSearchBeaconsConfig): Unit = js.native
    
    /**
      * 停止播放音频
      */
    @JSGlobal("wx.stopVoice")
    @js.native
    def stopVoice(localId: String): Unit = js.native
    
    /**
      * 识别音频并返回识别结果接口
      */
    @JSGlobal("wx.translateVoice")
    @js.native
    def translateVoice(config: UploadVoiceConfig): Unit = js.native
    
    /**
      * “分享给朋友”及“分享到QQ”
      * @param config
      */
    @JSGlobal("wx.updateAppMessageShareData")
    @js.native
    def updateAppMessageShareData(config: ShareToUserConfig): Unit = js.native
    
    /**
      * “分享到朋友圈”及“分享到QQ空间”
      * @param config
      */
    @JSGlobal("wx.updateTimelineShareData")
    @js.native
    def updateTimelineShareData(config: ShareToTimelineConfig): Unit = js.native
    
    /**
      * 上传图片
      */
    @JSGlobal("wx.uploadImage")
    @js.native
    def uploadImage(config: UploadImageConfig): Unit = js.native
    
    /**
      * 上传语音接口, 上传语音有效期3天，可用微信多媒体接口下载语音到自己的服务器，
      */
    @JSGlobal("wx.uploadVoice")
    @js.native
    def uploadVoice(config: UploadVoiceConfig): Unit = js.native
  }
}

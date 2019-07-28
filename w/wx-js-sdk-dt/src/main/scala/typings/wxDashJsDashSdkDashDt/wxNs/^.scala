package typings.wxDashJsDashSdkDashDt.wxNs

import typings.wxDashJsDashSdkDashDt.Anon_LocalId
import typings.wxDashJsDashSdkDashDt.Anon_NetworkType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("wx")
@js.native
object ^ extends js.Object {
  /**
    * 批量添加卡券接口
    */
  def addCard(config: AddCardConfig): Unit = js.native
  /**
    * 判断当前客户端版本是否支持指定 JS 接口
    */
  def checkJsApi(setting: CheckApiConfig): Unit = js.native
  /**
    * 拉取适用卡券列表并获取用户选择信息
    */
  def chooseCard(config: ChooseCardConfig): Unit = js.native
  /**
    * 拍照或从手机相册中选图接口
    */
  def chooseImage(config: ChooseImageConfig): Unit = js.native
  /**
    * 发起一个微信支付请求
    */
  def chooseWXPay(config: ChooseWXPayConfig): Unit = js.native
  /**
    * 关闭当前网页窗口接口
    */
  def closeWindow(): Unit = js.native
  /**
    * 初始化，做任何操作前必须调用该方法
    * @param setting 配置对象
    */
  def config(setting: WxConfig): Unit = js.native
  def downloadImage(config: DownLoadImageConfig): Unit = js.native
  def downloadVoice(config: DownloadVoiceConfig): Unit = js.native
  /**
    * 配置微信初始化失败后的回调
    * @param err 失败回调
    */
  def error(err: js.Function1[/* res */ js.Any, Unit]): Unit = js.native
  /**
    * 获取本地图片接口,此接口仅在 iOS WKWebview 下提供，用于兼容 iOS WKWebview 不支持 localId 直接显示图片的问题
    */
  def getLocalImgData(config: GetLocalImgDataConfig): Unit = js.native
  /**
    * 获取地理位置接口
    */
  def getLocation(config: GetLocationConfig): Unit = js.native
  /**
    * 获取网络状态, var networkType = res.networkType; 返回网络类型 2g，3g，4g，wifi
    */
  def getNetworkType(success: js.Function1[/* res */ Anon_NetworkType, Unit]): Unit = js.native
  /**
    * 隐藏所有非基础按钮接口
    */
  def hideAllNonBaseMenuItem(): Unit = js.native
  /**
    * 批量隐藏功能按钮接口
    */
  def hideMenuItems(config: MenuItemsConfig): Unit = js.native
  /**
    * 获取“分享给朋友”按钮点击状态及自定义分享内容接口
    * @deprecated
    */
  def onMenuShareAppMessage(setting: SharedAppMessage): Unit = js.native
  /**
    * “分享到QQ”按钮点击状态及自定义分享内容接口
    * @deprecated
    */
  def onMenuShareQQ(config: MenuShareQQ): Unit = js.native
  /**
    * 获取“分享到QQ空间”按钮点击状态及自定义分享内容接口
    * @deprecated
    */
  def onMenuShareQZone(config: MenuShareWeibo): Unit = js.native
  /**
    * 获取“分享到朋友圈”按钮点击状态及自定义分享内容接口
    * @deprecated
    */
  def onMenuShareTimeline(setting: ShareTimelineConfig): Unit = js.native
  /**
    * 获取“分享到腾讯微博”按钮点击状态及自定义分享内容接口
    */
  def onMenuShareWeibo(config: MenuShareWeibo): Unit = js.native
  /**
    * 监听周边 ibeacon 设备接口,
    * 摇一摇周边接口使用注意事项及更多返回结果说明，请参考：摇一摇周边获取设备信息
    */
  def onSearchBeacons(config: OnSearchBeaconsConfig): Unit = js.native
  /**
    * 停止播放后的回调
    */
  def onVoicePlayEnd(success: js.Function1[/* res */ Anon_LocalId, Unit]): Unit = js.native
  /**
    * 录音时间超过一分钟没有停止的时候会执行回调
    */
  def onVoiceRecordEnd(complete: js.Function1[/* res */ Anon_LocalId, Unit]): Unit = js.native
  /**
    * 查看微信卡包中的卡券接口
    */
  def openCard(config: OpenCardConfig): Unit = js.native
  /**
    * 微信内置地图查看位置
    */
  def openLocation(config: OpenLocationConfig): Unit = js.native
  /**
    * 跳转微信商品页接口
    */
  def openProductSpecificView(config: OpenProductSpecificViewConfig): Unit = js.native
  /**
    * 暂停音频
    */
  def pauseVoice(localId: String): Unit = js.native
  /**
    * 播放音频
    */
  def playVoice(localId: String): Unit = js.native
  /**
    * 预览图片接口
    */
  def previewImage(config: PreviewImageConfig): Unit = js.native
  /**
    * 配置微信初始化成功后的回调
    * @param x 回调
    */
  def ready(x: js.Function0[Unit]): Unit = js.native
  /**
    * 调起微信扫一扫接口
    */
  def scanQRCode(config: ScanQRCodeConfig): Unit = js.native
  /**
    * 显示所有功能按钮接口
    */
  def showAllNonBaseMenuItem(): Unit = js.native
  /**
    * 批量显示功能按钮接口
    */
  def showMenuItems(config: MenuItemsConfig): Unit = js.native
  /**
    * 开始录音
    */
  def startRecord(): Unit = js.native
  /**
    * 开启查找周边 ibeacon 设备接口
    */
  def startSearchBeacons(config: StartSearchBeaconsConfig): Unit = js.native
  /**
    * 停止录音
    */
  def stopRecord(success: js.Function1[/* res */ Anon_LocalId, Unit]): Unit = js.native
  /**
    * 关闭查找完成后的回调函数
    */
  def stopSearchBeacons(config: StopSearchBeaconsConfig): Unit = js.native
  /**
    * 停止播放音频
    */
  def stopVoice(localId: String): Unit = js.native
  /**
    * 识别音频并返回识别结果接口
    */
  def translateVoice(config: UploadVoiceConfig): Unit = js.native
  /**
    * “分享给朋友”及“分享到QQ”
    * @param config
    */
  def updateAppMessageShareData(config: ShareToUserConfig): Unit = js.native
  /**
    * “分享到朋友圈”及“分享到QQ空间”
    * @param config
    */
  def updateTimelineShareData(config: ShareToTimelineConfig): Unit = js.native
  /**
    * 上传图片
    */
  def uploadImage(config: UploadImageConfig): Unit = js.native
  /**
    * 上传语音接口, 上传语音有效期3天，可用微信多媒体接口下载语音到自己的服务器，
    */
  def uploadVoice(config: UploadVoiceConfig): Unit = js.native
}


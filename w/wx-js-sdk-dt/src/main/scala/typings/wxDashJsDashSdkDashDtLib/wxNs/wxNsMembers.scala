package typings
package wxDashJsDashSdkDashDtLib.wxNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("wx")
@js.native
object wxNsMembers extends js.Object {
  /**
       * 批量添加卡券接口
       */
  def addCard(config: AddCardConfig): scala.Unit = js.native
  /**
       * 判断当前客户端版本是否支持指定 JS 接口
       */
  def checkJsApi(setting: CheckApiConfig): scala.Unit = js.native
  /**
       * 拉取适用卡券列表并获取用户选择信息
       */
  def chooseCard(config: ChooseCardConfig): scala.Unit = js.native
  /**
       * 拍照或从手机相册中选图接口
       */
  def chooseImage(config: ChooseImageConfig): scala.Unit = js.native
  /**
       * 发起一个微信支付请求
       */
  def chooseWXPay(config: ChooseWXPayConfig): scala.Unit = js.native
  /**
       * 关闭当前网页窗口接口
       */
  def closeWindow(): scala.Unit = js.native
  /**
       * 初始化，做任何操作前必须调用该方法
       * @param setting 配置对象
       */
  def config(setting: WxConfig): scala.Unit = js.native
  def downloadImage(config: DownLoadImageConfig): scala.Unit = js.native
  def downloadVoice(config: downloadVoiceConfig): scala.Unit = js.native
  /**
       * 配置微信初始化失败后的回调
       * @param err 失败回调
       */
  def error(err: js.Function1[/* res */ js.Any, scala.Unit]): scala.Unit = js.native
  /**
       * 获取本地图片接口,此接口仅在 iOS WKWebview 下提供，用于兼容 iOS WKWebview 不支持 localId 直接显示图片的问题
       */
  def getLocalImgData(config: GetLocalImgDataConfig): scala.Unit = js.native
  /**
       * 获取地理位置接口
       */
  def getLocation(config: GetLocationConfig): scala.Unit = js.native
  /**
       * 获取网络状态, var networkType = res.networkType; 返回网络类型 2g，3g，4g，wifi
       */
  def getNetworkType(success: js.Function1[/* res */ wxDashJsDashSdkDashDtLib.Anon_NetworkType, scala.Unit]): scala.Unit = js.native
  /**
       * 隐藏所有非基础按钮接口
       */
  def hideAllNonBaseMenuItem(): scala.Unit = js.native
  /**
       * 批量隐藏功能按钮接口
       */
  def hideMenuItems(config: MenuItemsConfig): scala.Unit = js.native
  /**
       * 获取“分享给朋友”按钮点击状态及自定义分享内容接口
       */
  def onMenuShareAppMessage(setting: SharedAppMessage): scala.Unit = js.native
  /**
       * “分享到QQ”按钮点击状态及自定义分享内容接口
       */
  def onMenuShareQQ(config: MenuShareQQ): scala.Unit = js.native
  /**
       * 获取“分享到QQ空间”按钮点击状态及自定义分享内容接口
       */
  def onMenuShareQzone(config: MenuShareWeibo): scala.Unit = js.native
  /**
       * 获取“分享到朋友圈”按钮点击状态及自定义分享内容接口
       */
  def onMenuShareTimeline(setting: ShareTimelineConfig): scala.Unit = js.native
  /**
       * 获取“分享到腾讯微博”按钮点击状态及自定义分享内容接口
       */
  def onMenuShareWeibo(config: MenuShareWeibo): scala.Unit = js.native
  /**
       * 监听周边 ibeacon 设备接口,
       * 摇一摇周边接口使用注意事项及更多返回结果说明，请参考：摇一摇周边获取设备信息
       */
  def onSearchBeacons(config: OnSearchBeaconsConfig): scala.Unit = js.native
  /**
       * 停止播放后的回调
       */
  def onVoicePlayEnd(success: js.Function1[/* res */ wxDashJsDashSdkDashDtLib.Anon_LocalId, scala.Unit]): scala.Unit = js.native
  /**
       * 录音时间超过一分钟没有停止的时候会执行回调
       */
  def onVoiceRecordEnd(complete: js.Function1[/* res */ wxDashJsDashSdkDashDtLib.Anon_LocalId, scala.Unit]): scala.Unit = js.native
  /**
       * 查看微信卡包中的卡券接口
       */
  def openCard(config: OpenCardConfig): scala.Unit = js.native
  /**
       * 微信内置地图查看位置
       */
  def openLocation(config: OpenLocationConfig): scala.Unit = js.native
  /**
       * 跳转微信商品页接口
       */
  def openProductSpecificView(config: OpenProductSpecificViewConfig): scala.Unit = js.native
  /**
       * 暂停音频
       */
  def pauseVoice(localId: java.lang.String): scala.Unit = js.native
  /**
       * 播放音频
       */
  def playVoice(localId: java.lang.String): scala.Unit = js.native
  /**
       * 预览图片接口
       */
  def previewImage(config: PreviewImageConfig): scala.Unit = js.native
  /**
       * 配置微信初始化成功后的回调
       * @param x 回调
       */
  def ready(x: js.Function0[scala.Unit]): scala.Unit = js.native
  /**
       * 调起微信扫一扫接口
       */
  def scanQRCode(config: ScanQRCodeConfig): scala.Unit = js.native
  /**
       * 显示所有功能按钮接口
       */
  def showAllNonBaseMenuItem(): scala.Unit = js.native
  /**
       * 批量显示功能按钮接口
       */
  def showMenuItems(config: MenuItemsConfig): scala.Unit = js.native
  /**
       * 开始录音
       */
  def startRecord(): scala.Unit = js.native
  /**
       * 开启查找周边 ibeacon 设备接口
       */
  def startSearchBeacons(config: StartSearchBeaconsConfig): scala.Unit = js.native
  /**
       * 停止录音
       */
  def stopRecord(success: js.Function1[/* res */ wxDashJsDashSdkDashDtLib.Anon_LocalId, scala.Unit]): scala.Unit = js.native
  /**
       * 关闭查找完成后的回调函数
       */
  def stopSearchBeacons(config: StopSearchBeaconsConfig): scala.Unit = js.native
  /**
       * 停止播放音频
       */
  def stopVoice(localId: java.lang.String): scala.Unit = js.native
  /**
       * 识别音频并返回识别结果接口
       */
  def translateVoice(config: UploadVoiceConfig): scala.Unit = js.native
  /**
       * 上传图片
       */
  def uploadImage(config: UploadImageConfig): scala.Unit = js.native
  /**
       * 上传语音接口, 上传语音有效期3天，可用微信多媒体接口下载语音到自己的服务器，
       */
  def uploadVoice(config: UploadVoiceConfig): scala.Unit = js.native
}


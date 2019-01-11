package typings
package weappDashApiLib.wxNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("wx")
@js.native
object ^ extends js.Object {
  /**
    * 从本地相册选择图片或使用相机拍照。
    */
  def chooseImage(options: weappDashApiLib.wxNs.ChooseImageOptions): scala.Unit = js.native
  /**
    * 拍摄视频或从手机相册中选视频，返回视频的临时文件路径。
    */
  def chooseVideo(options: weappDashApiLib.wxNs.ChooseVideoOptions): scala.Unit = js.native
  /**
    * 清理本地数据缓存。
    */
  def clearStorage(): scala.Unit = js.native
  /**
    * 同步清理本地数据缓存
    */
  def clearStorageSync(): scala.Unit = js.native
  /**
    * 关闭WebSocket连接。
    */
  def closeSocket(): scala.Unit = js.native
  /**
    * 创建一个 WebSocket 连接；
    * 一个微信小程序同时只能有一个 WebSocket 连接，
    * 如果当前已存在一个 WebSocket 连接，
    * 会自动关闭该连接，并重新创建一个 WebSocket 连接。
    */
  def connectSocket(options: weappDashApiLib.wxNs.ConnectSocketOptions): scala.Unit = js.native
  /**
    * 创建一个动画实例animation。调用实例的方法来描述动画。
    * 最后通过动画实例的export方法导出动画数据传递给组件的animation属性。
    *
    * 注意: export 方法每次调用后会清掉之前的动画操作
    */
  def createAnimation(): weappDashApiLib.wxNs.Animation = js.native
  def createAnimation(options: weappDashApiLib.wxNs.CreateAnimationOptions): weappDashApiLib.wxNs.Animation = js.native
  /**
    * 创建并返回绘图上下文context对象。
    * context只是一个记录方法调用的容器，
    * 用于生成记录绘制行为的actions数组。c
    * ontext跟<canvas/>不存在对应关系，
    * 一个context生成画布的绘制动作数组可以应用于多个<canvas/>。
    */
  def createContext(): weappDashApiLib.wxNs.CanvasContext = js.native
  /**
    * 下载文件资源到本地。客户端直接发起一个 HTTP GET 请求，
    * 把下载到的资源根据 type 进行处理，并返回文件的本地临时路径。
    */
  def downloadFile(options: weappDashApiLib.wxNs.DownloadFileOptions): scala.Unit = js.native
  /**
    * 绘制画布
    */
  def drawCanvas(options: weappDashApiLib.wxNs.DrawCanvasOptions): scala.Unit = js.native
  /** 获取音乐播放状态。 */
  def getBackgroundAudioPlayerState(options: weappDashApiLib.wxNs.GetBackgroundAudioPlayerStateOptions): scala.Unit = js.native
  /**
    * 获取当前的地理位置、速度。
    */
  def getLocation(options: weappDashApiLib.wxNs.GetLocationOptions): scala.Unit = js.native
  /**
    * 获取网络类型。
    */
  def getNetworkType(options: weappDashApiLib.wxNs.GetNetworkTypeOptions): scala.Unit = js.native
  /**
    * 从本地缓存中异步获取指定 key 对应的内容。
    */
  def getStorage(options: weappDashApiLib.wxNs.GetStorageOptions): scala.Unit = js.native
  /**
    * 从本地缓存中同步获取指定 key 对应的内容。
    *
    * @param {string} key
    * @returns {(Object | string)}
    */
  def getStorageSync(key: java.lang.String): js.Any | java.lang.String = js.native
  /**
    * 获取系统信息。
    */
  def getSystemInfo(options: weappDashApiLib.wxNs.GetSystemInfoOptions): scala.Unit = js.native
  /**
    * 获取用户信息，需要先调用 wx.login 接口。
    */
  def getUserInfo(options: weappDashApiLib.wxNs.GetUserInfoOptions): scala.Unit = js.native
  /**
    * 收起键盘。
    */
  def hideKeyboard(): scala.Unit = js.native
  /**
    * 隐藏导航条加载动画。
    */
  def hideNavigationBarLoading(): scala.Unit = js.native
  /**
    * 调用接口获取登录凭证（code）进而换取用户登录态信息，
    * 包括用户的唯一标识（openid） 及本次登录的 会话密钥（session_key）。
    * 用户数据的加解密通讯需要依赖会话密钥完成。
    */
  def login(option: weappDashApiLib.wxNs.LoginOptions): scala.Unit = js.native
  /**
    * 关闭当前页面，回退前一页面。
    */
  def navigateBack(): scala.Unit = js.native
  /**
    * 保留当前页面，跳转到应用内的某个页面，使用wx.navigateBack可以返回到原页面。
    *
    * 注意：为了不让用户在使用小程序时造成困扰，
    * 我们规定页面路径只能是五层，请尽量避免多层级的交互方式。
    */
  def navigateTo(options: weappDashApiLib.wxNs.NavigateToOptions): scala.Unit = js.native
  /**
    * 监听重力感应数据，频率：5次/秒
    */
  def onAccelerometerChange(callback: weappDashApiLib.wxNs.AccelerometerChangeCallback): scala.Unit = js.native
  /** 监听音乐暂停。 */
  def onBackgroundAudioPause(callback: weappDashApiLib.wxNs.NoneParamCallback): scala.Unit = js.native
  /** 监听音乐播放。 */
  def onBackgroundAudioPlay(callback: weappDashApiLib.wxNs.NoneParamCallback): scala.Unit = js.native
  /** 监听音乐停止。 */
  def onBackgroundAudioStop(callback: weappDashApiLib.wxNs.NoneParamCallback): scala.Unit = js.native
  def onCompassChange(callback: weappDashApiLib.wxNs.CompassChangeCallback): scala.Unit = js.native
  /** 监听WebSocket关闭。 */
  def onSocketClose(callback: weappDashApiLib.wxNs.ResponseCallback): scala.Unit = js.native
  /** 监听WebSocket错误。 */
  def onSocketError(callback: weappDashApiLib.wxNs.ErrorCallback): scala.Unit = js.native
  /**
    * 监听WebSocket接受到服务器的消息事件。
    */
  def onSocketMessage(callback: weappDashApiLib.wxNs.DataResponseCallback): scala.Unit = js.native
  /** 监听WebSocket连接打开事件。 */
  def onSocketOpen(callback: weappDashApiLib.wxNs.OneParamCallback): scala.Unit = js.native
  /**
    * 使用微信内置地图查看位置
    */
  def openLocation(options: weappDashApiLib.wxNs.OpenLocationOptions): scala.Unit = js.native
  /** 暂停播放音乐。 */
  def pauseBackgroundAudio(): scala.Unit = js.native
  /**
    * 暂停正在播放的语音。
    * 再次调用wx.playVoice播放同一个文件时，会从暂停处开始播放。
    * 如果想从头开始播放，需要先调用 wx.stopVoice。
    */
  def pauseVoice(): scala.Unit = js.native
  /** 播放音乐，同时只能有一首音乐正在播放。 */
  def playBackgroundAudio(options: weappDashApiLib.wxNs.PlayBackgroundAudioOptions): scala.Unit = js.native
  /**
    * 开始播放语音，同时只允许一个语音文件正在播放，
    * 如果前一个语音文件还没播放完，将中断前一个语音播放。
    */
  def playVoice(options: weappDashApiLib.wxNs.PlayVoiceOptions): scala.Unit = js.native
  /**
    * 预览图片。
    */
  def previewImage(options: weappDashApiLib.wxNs.PreviewImageOptions): scala.Unit = js.native
  /**
    * 关闭当前页面，跳转到应用内的某个页面。
    */
  def redirectTo(options: weappDashApiLib.wxNs.RedirectToOptions): scala.Unit = js.native
  /**
    * wx.request发起的是https请求。一个微信小程序，同时只能有5个网络请求连接。
    */
  def request(options: weappDashApiLib.wxNs.RequestOptions): scala.Unit = js.native
  /**
    * 发起微信支付。
    */
  def requestPayment(options: weappDashApiLib.wxNs.RequestPaymentOptions): scala.Unit = js.native
  /**
    * 保存文件到本地。
    */
  def saveFile(options: weappDashApiLib.wxNs.SaveFileOptions): scala.Unit = js.native
  /**
    * 控制音乐播放进度。
    */
  def seekBackgroundAudio(options: weappDashApiLib.wxNs.SeekBackgroundAudioOptions): scala.Unit = js.native
  /**
    * 通过 WebSocket 连接发送数据，需要先 wx.connectSocket，
    * 并在 wx.onSocketOpen 回调之后才能发送。
    */
  def sendSocketMessage(options: weappDashApiLib.wxNs.SendSocketMessageOptions): scala.Unit = js.native
  /**
    * 动态设置当前页面的标题。
    */
  def setNavigationBarTitle(options: weappDashApiLib.wxNs.SetNavigationBarTitleOptions): scala.Unit = js.native
  /**
    * 将数据存储在本地缓存中指定的 key 中，
    * 会覆盖掉原来该 key 对应的内容，这是一个异步接口。
    */
  def setStorage(options: weappDashApiLib.wxNs.SetStorageOptions): scala.Unit = js.native
  def setStorageSync(key: java.lang.String, data: java.lang.String): scala.Unit = js.native
  /**
    * 将 data 存储在本地缓存中指定的 key 中，
    * 会覆盖掉原来该 key 对应的内容，这是一个同步接口。
    *
    * @param {string} key 本地缓存中的指定的 key
    * @param {(Object | string)} data 需要存储的内容
    */
  def setStorageSync(key: java.lang.String, data: js.Any): scala.Unit = js.native
  /**
    * 在当前页面显示导航条加载动画。
    */
  def showNavigationBarLoading(): scala.Unit = js.native
  /**
    * 开始录音。当主动调用wx.stopRecord，
    * 或者录音超过1分钟时自动结束录音，返回录音文件的临时文件路径。
    * 注：文件的临时路径，在小程序本次启动期间可以正常使用，
    * 如需持久保存，需在主动调用wx.saveFile，在小程序下次启动时才能访问得到。
    */
  def startRecord(options: weappDashApiLib.wxNs.StartRecordOptions): scala.Unit = js.native
  /**
    * 停止播放音乐。
    */
  def stopBackgroundAudio(): scala.Unit = js.native
  /**
    * ​ 主动调用停止录音。
    */
  def stopRecord(): scala.Unit = js.native
  /**
    * 结束播放语音。
    */
  def stopVoice(): scala.Unit = js.native
  /**
    * 将本地资源上传到开发者服务器。
    * 如页面通过 wx.chooseImage 等接口获取到一个本地资源的临时文件路径后，
    * 可通过此接口将本地资源上传到指定服务器。
    * 客户端发起一个 HTTPS POST 请求，
    * 其中 Content-Type 为 multipart/form-data 。
    */
  def uploadFile(options: weappDashApiLib.wxNs.UploadFileOptions): scala.Unit = js.native
}


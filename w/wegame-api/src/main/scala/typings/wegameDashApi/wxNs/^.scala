package typings.wegameDashApi.wxNs

import typings.wegameDashApi.Anon_0
import typings.wegameDashApi.Anon_AdUnitId
import typings.wegameDashApi.Anon_AdUnitIdString
import typings.wegameDashApi.Anon_Album
import typings.wegameDashApi.Anon_Altitude
import typings.wegameDashApi.Anon_AudioSources
import typings.wegameDashApi.Anon_AuthSetting
import typings.wegameDashApi.Anon_Autoplay
import typings.wegameDashApi.Anon_Black
import typings.wegameDashApi.Anon_Bottom
import typings.wegameDashApi.Anon_CancelColor
import typings.wegameDashApi.Anon_Code
import typings.wegameDashApi.Anon_Complete
import typings.wegameDashApi.Anon_CompleteCurrent
import typings.wegameDashApi.Anon_CompleteDark
import typings.wegameDashApi.Anon_CompleteDuration
import typings.wegameDashApi.Anon_CompleteEnableDebug
import typings.wegameDashApi.Anon_CompleteFail
import typings.wegameDashApi.Anon_CompleteFailFilePath
import typings.wegameDashApi.Anon_CompleteFailItemColor
import typings.wegameDashApi.Anon_CompleteFailKVDataList
import typings.wegameDashApi.Anon_CompleteFailKeyList
import typings.wegameDashApi.Anon_CompleteFailKeyListRes
import typings.wegameDashApi.Anon_CompleteFailKeyListSuccess
import typings.wegameDashApi.Anon_CompleteFailMask
import typings.wegameDashApi.Anon_CompleteFailName
import typings.wegameDashApi.Anon_CompleteFailRes
import typings.wegameDashApi.Anon_CompleteFailResShareTicket
import typings.wegameDashApi.Anon_CompleteFailScope
import typings.wegameDashApi.Anon_CompleteFailSendMessageImg
import typings.wegameDashApi.Anon_CompleteFailSuccess
import typings.wegameDashApi.Anon_CompleteFailSuccessValue
import typings.wegameDashApi.Anon_ConfirmHold
import typings.wegameDashApi.Anon_Direction
import typings.wegameDashApi.Anon_En
import typings.wegameDashApi.Anon_EncryptedDataIv
import typings.wegameDashApi.Anon_Icon
import typings.wegameDashApi.Anon_Image
import typings.wegameDashApi.Anon_IsConnected
import typings.wegameDashApi.Anon_Level
import typings.wegameDashApi.Anon_MessageStack
import typings.wegameDashApi.Anon_Query
import typings.wegameDashApi.Anon_Value
import typings.wegameDashApi.Anon_ValueString
import typings.wegameDashApi.Anon_WindowHeight
import typings.wegameDashApi.Anon_X
import typings.wegameDashApi.BannerAd
import typings.wegameDashApi.Canvas
import typings.wegameDashApi.DownloadTask
import typings.wegameDashApi.FeedbackButton
import typings.wegameDashApi.FileSystemManager
import typings.wegameDashApi.GameClubButton
import typings.wegameDashApi.InnerAudioContext
import typings.wegameDashApi.LoadSubpackageTask
import typings.wegameDashApi.OpenDataContext
import typings.wegameDashApi.OpenSettingButton
import typings.wegameDashApi.RecorderManager
import typings.wegameDashApi.RequestTask
import typings.wegameDashApi.RewardedVideoAd
import typings.wegameDashApi.SocketTask
import typings.wegameDashApi.UpdateManager
import typings.wegameDashApi.UploadTask
import typings.wegameDashApi.UserInfoButton
import typings.wegameDashApi.Video
import typings.wegameDashApi.WxPerformance
import typings.wegameDashApi.WxWorker
import typings.wegameDashApi.wxNs.typesNs.AccelerometerParams
import typings.wegameDashApi.wxNs.typesNs.BatteryInfo
import typings.wegameDashApi.wxNs.typesNs.Callbacks
import typings.wegameDashApi.wxNs.typesNs.CallbacksWithType
import typings.wegameDashApi.wxNs.typesNs.ClipboardData
import typings.wegameDashApi.wxNs.typesNs.DownfileParams
import typings.wegameDashApi.wxNs.typesNs.GetStorageParams
import typings.wegameDashApi.wxNs.typesNs.Image
import typings.wegameDashApi.wxNs.typesNs.LaunchOption
import typings.wegameDashApi.wxNs.typesNs.LineHeightParams
import typings.wegameDashApi.wxNs.typesNs.NewUserInfoParam
import typings.wegameDashApi.wxNs.typesNs.OldUserInfoParam
import typings.wegameDashApi.wxNs.typesNs.RemoveStorageParams
import typings.wegameDashApi.wxNs.typesNs.RequestParams
import typings.wegameDashApi.wxNs.typesNs.SetClipboardDataParams
import typings.wegameDashApi.wxNs.typesNs.SetKeepScreenOnParams
import typings.wegameDashApi.wxNs.typesNs.SetScreenBrightnessParams
import typings.wegameDashApi.wxNs.typesNs.SetStorageParams
import typings.wegameDashApi.wxNs.typesNs.ShareOption
import typings.wegameDashApi.wxNs.typesNs.SocketCloseParams
import typings.wegameDashApi.wxNs.typesNs.SocketConnectParams
import typings.wegameDashApi.wxNs.typesNs.SocketErrorCallback
import typings.wegameDashApi.wxNs.typesNs.SocketMessageCallback
import typings.wegameDashApi.wxNs.typesNs.SocketOpenCallback
import typings.wegameDashApi.wxNs.typesNs.SocketSendParams
import typings.wegameDashApi.wxNs.typesNs.StorageInfo
import typings.wegameDashApi.wxNs.typesNs.SystemInfo
import typings.wegameDashApi.wxNs.typesNs.TouchData
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("wx")
@js.native
object ^ extends js.Object {
  // --授权
  /**
    * 提前向用户发起授权请求。调用后会立刻弹窗询问用户是否同意授权小程序使用某项功能或获取用户的某些数据，但不会实际调用对应接口。如果用户之前已经同意授权，则不会出现弹窗，直接返回成功。
    */
  def authorize(param: Anon_CompleteFailScope): Unit = js.native
  // --防沉迷
  /**
    * 根据用户当天游戏时间判断用户是否需要休息
    */
  def checkIsUserAdvisedToRest(param: Anon_CompleteFailRes): Unit = js.native
  // --登录
  /**
    * 通过 wx.login 接口获得的用户登录态拥有一定的时效性。用户越久未使用小程序，用户登录态越有可能失效。反之如果用户一直在使用小程序，则用户登录态一直保持有效。具体时效逻辑由微信维护，对开发者透明。开发者只需要调用 wx.checkSession 接口检测当前用户登录态是否有效。登录态过期后开发者可以再调用 wx.login 获取新的用户登录态。
    */
  def checkSession(cb: Callbacks): Unit = js.native
  // --图片
  /**
    * 从本地相册选择图片或使用相机拍照。
    */
  def chooseImage(param: Anon_Album): Unit = js.native
  // --数据缓存
  /**
    * 清理本地数据缓存
    */
  def clearStorage(param: Callbacks): Unit = js.native
  /**
    * clearStorage的同步版本
    */
  def clearStorageSync(): Unit = js.native
  /**
    * 关闭WebSocket
    */
  def closeSocket(param: SocketCloseParams): Unit = js.native
  // --websocket
  /**
    * 创建一个 WebSocket 连接。最多同时存在 5 个 WebSocket 连接。
    */
  def connectSocket(param: SocketConnectParams): SocketTask = js.native
  // --广告
  /**
    * 创建 banner 广告组件。请通过 wx.getSystemInfoSync() 返回对象的 SDKVersion 判断基础库版本号 >= 2.0.4 后再使用该 API。同时，开发者工具上暂不支持调试该 API，请直接在真机上进行调试。
    */
  def createBannerAd(param: Anon_AdUnitId): BannerAd = js.native
  /**
    * 创建一个画布对象。首次调用创建的是显示在屏幕上的画布，之后调用创建的都是离屏画布。
    */
  def createCanvas(): Canvas = js.native
  // --意见反馈
  /**
    * 用户点击后打开意见反馈页面的按钮
    */
  def createFeedbackButton(param: Anon_Image): FeedbackButton = js.native
  // --游戏圈
  /**
    * 创建游戏圈按钮。游戏圈按钮被点击后会跳转到小游戏的游戏圈。更多关于游戏圈的信息见 游戏圈使用指南
    */
  def createGameClubButton(param: Anon_Icon): GameClubButton = js.native
  /**
    * 创建一个图片对象
    */
  def createImage(): Image = js.native
  // --音频
  /**
    * 创建一个 InnerAudioContext 实例
    */
  def createInnerAudioContext(): InnerAudioContext = js.native
  // --设置
  /**
    * 创建打开设置页面的按钮
    */
  def createOpenSettingButton(param: Anon_Image): OpenSettingButton = js.native
  /**
    * 创建激励视频广告组件。请通过 wx.getSystemInfoSync() 返回对象的 SDKVersion 判断基础库版本号 >= 2.0.4 后再使用该 API。同时，开发者工具上暂不支持调试该 API，请直接在真机上进行调试。
    */
  def createRewardedVideoAd(param: Anon_AdUnitIdString): RewardedVideoAd = js.native
  // --用户信息
  def createUserInfoButton(param: Anon_En): UserInfoButton = js.native
  // --视频
  def createVideo(param: Anon_Autoplay): Video = js.native
  // --Worker
  /**
    * 创建一个 Worker 线程，目前限制最多只能创建一个 Worker，创建下一个 Worker 前请调用 Worker.terminate
    */
  def createWorker(): WxWorker = js.native
  // --网络
  /**
    * 下载文件
    */
  def downloadFile(param: DownfileParams): DownloadTask = js.native
  // --生命周期
  def exitMiniProgram(): Unit = js.native
  def exitMiniProgram(cb: Callbacks): Unit = js.native
  /**
    * 获取当前支持的音频输入源
    */
  def getAvailableAudioSources(param: CallbacksWithType[Anon_AudioSources]): Unit = js.native
  // --电量
  /**
    * 获取设备电量。同步 API wx.getBatteryInfoSync 在 iOS 上不可用。
    */
  def getBatteryInfo(cb: CallbacksWithType[BatteryInfo]): Unit = js.native
  /**
    * IOS上这个同步API无法使用
    */
  def getBatteryInfoSync(): BatteryInfo = js.native
  // --剪贴板
  /**
    * 取得系统剪贴板的内容
    */
  def getClipboardData(cb: CallbacksWithType[ClipboardData]): Unit = js.native
  // --文件系统
  def getFileSystemManager(): FileSystemManager = js.native
  // --开放数据
  /**
    * 拉取当前用户所有同玩好友的托管数据。该接口只可在开放数据域下使用
    */
  def getFriendCloudStorage(param: Anon_CompleteFail): Unit = js.native
  /**
    * 在小游戏是通过群分享卡片打开的情况下，可以通过调用该接口获取群同玩成员的游戏数据。该接口只可在开放数据域下使用。
    */
  def getGroupCloudStorage(param: Anon_CompleteFailKeyListRes): Unit = js.native
  def getLaunchOptionsSync(): LaunchOption = js.native
  // --位置
  /**
    * 获取当前的地理位置、速度。当用户离开小程序后，此接口无法调用；当用户点击“显示在聊天顶部”时，此接口可继续调用。
    */
  def getLocation(param: Anon_Altitude): Unit = js.native
  // --菜单
  /**
    * 获取菜单按钮的布局置信息
    */
  def getMenuButtonBoundingClientRect(): Anon_Bottom = js.native
  // --网络
  /**
    * 获取网络类型
    */
  def getNetworkType(cb: CallbacksWithType[Anon_IsConnected]): Unit = js.native
  // --开放数据域
  /**
    * 获取开放数据域
    */
  def getOpenDataContext(): OpenDataContext = js.native
  // --性能
  /**
    * 获取性能管理器
    */
  def getPerformance(): WxPerformance = js.native
  // --录音
  def getRecorderManager(): RecorderManager = js.native
  // --屏幕
  /**
    * 获取屏幕亮度
    */
  def getScreenBrightness(cb: CallbacksWithType[Anon_Value]): Unit = js.native
  /**
    * 获取用户的当前设置。返回值中只会出现小程序已经向用户请求过的权限。
    */
  def getSetting(p: CallbacksWithType[Anon_AuthSetting]): Unit = js.native
  // --转发
  /**
    * 获取转发详细信息
    */
  def getShareInfo(param: Anon_CompleteFailResShareTicket): Unit = js.native
  /**
    * 只有开放数据域能调用，获取主域和开放数据域共享的 sharedCanvas
    */
  def getSharedCanvas(): Canvas = js.native
  /**
    * 从本地缓存中异步获取指定 key 的内容
    */
  def getStorage(param: GetStorageParams): Unit = js.native
  /**
    * 异步获取当前storage的相关信息
    */
  def getStorageInfo(param: CallbacksWithType[StorageInfo]): Unit = js.native
  /**
    * getStorageInfo 的同步版本
    */
  def getStorageInfoSync(): StorageInfo = js.native
  /**
    * getStorage 的同步版本
    */
  def getStorageSync(key: String): js.Any = js.native
  // --系统信息
  def getSystemInfo(cb: CallbacksWithType[SystemInfo]): Unit = js.native
  def getSystemInfoSync(): SystemInfo = js.native
  /**
    * 获取一行文本的行高
    * @param p 字体参数
    */
  def getTextLineHeight(p: LineHeightParams): Double = js.native
  // --更新
  def getUpdateManager(): UpdateManager = js.native
  /**
    * 获取当前用户托管数据当中对应 key 的数据。该接口只可在开放数据域下使用
    */
  def getUserCloudStorage(param: Anon_CompleteFailKeyList): Unit = js.native
  /**
    * 在无须用户授权的情况下，批量获取用户信息。该接口只在开放数据域下可用
    * 请注意！！旧版本的该接口已过期，微信不允许主动弹出授权框，旧版本API会被逐渐作废，请使用wx.createUserInfoButton或在隔离数据区取得用户信息
    * 如使用旧接口取得用户信息，withCredentials 为 true 时需要先调用 wx.login 接口。需要用户授权 scope.userInfo
    */
  def getUserInfo(param: NewUserInfoParam): Unit = js.native
  def getUserInfo(param: OldUserInfoParam): Unit = js.native
  // --微信运动
  /**
    * 获取用户过去三十天微信运动步数，需要先调用 wx.login 接口。需要用户授权 scope.werun。
    */
  def getWeRunData(p: CallbacksWithType[Anon_EncryptedDataIv]): Unit = js.native
  // --键盘
  def hideKeyboard(): Unit = js.native
  /**
    * 隐藏 loading 提示框
    */
  def hideLoading(): Unit = js.native
  def hideLoading(cb: Callbacks): Unit = js.native
  /**
    * 隐藏转发按钮
    */
  def hideShareMenu(): Unit = js.native
  def hideShareMenu(cb: Callbacks): Unit = js.native
  /**
    * 隐藏消息提示框
    */
  def hideToast(): Unit = js.native
  def hideToast(cb: Callbacks): Unit = js.native
  /**
    * 加载自定义字体文件
    * @param path 字体文件路径。可以是代码包文件路径，也可以是 wxfile:// 协议的本地文件路径。
    */
  def loadFont(path: String): String = js.native
  // --分包加载
  /**
    * 触发分包加载，详见 分包加载
    */
  def loadSubpackage(param: Anon_CompleteFailName): LoadSubpackageTask = js.native
  /**
    * 调用接口获取登录凭证（code）进而换取用户登录态信息，包括用户的唯一标识（openid） 及本次登录的 会话密钥（session_key）等。用户数据的加解密通讯需要依赖会话密钥完成。
    */
  def login(cb: CallbacksWithType[Anon_Code]): Unit = js.native
  /**
    * 取消监听音频因为受到系统占用而被中断开始，以下场景会触发此事件：闹钟、电话、FaceTime 通话、微信语音聊天、微信视频聊天。此事件触发后，小程序内所有音频会暂停。
    */
  def offAudioInterruptionBegin(cb: js.Function0[Unit]): Unit = js.native
  /**
    * 取消监听音频中断结束，在收到 onAudioInterruptionBegin 事件之后，小程序内所有音频会暂停，收到此事件之后才可再次播放成功
    */
  def offAudioInterruptionEnd(cb: js.Function0[Unit]): Unit = js.native
  /**
    * 取消监听横竖屏切换事件
    */
  def offDeviceOrientationChange(callback: js.Function1[/* res */ Anon_ValueString, Unit]): Unit = js.native
  def offError(cb: js.Function1[/* res */ Anon_MessageStack, Unit]): Unit = js.native
  def offHide(cb: js.Function0[Unit]): Unit = js.native
  /**
    * 取消监听监听键盘收起的事件
    */
  def offKeyboardComplete(callback: js.Function1[/* res */ Anon_ValueString, Unit]): Unit = js.native
  /**
    * 取消监听用户点击键盘 Confirm 按钮时的事件
    */
  def offKeyboardConfirm(callback: js.Function1[/* res */ Anon_ValueString, Unit]): Unit = js.native
  /**
    * 取消监听键盘输入事件
    */
  def offKeyboardInput(callback: js.Function1[/* res */ Anon_ValueString, Unit]): Unit = js.native
  /**
    * 取消监听用户点击右上角菜单的“转发”按钮时触发的事件
    */
  def offShareAppMessage(cb: js.Function0[ShareOption]): Unit = js.native
  def offShow(cb: js.Function1[/* res */ Anon_Query, Unit]): Unit = js.native
  def offTouchCancel(cb: js.Function1[/* res */ TouchData, Unit]): Unit = js.native
  def offTouchEnd(cb: js.Function1[/* res */ TouchData, Unit]): Unit = js.native
  def offTouchMove(cb: js.Function1[/* res */ TouchData, Unit]): Unit = js.native
  def offTouchStart(cb: js.Function1[/* res */ TouchData, Unit]): Unit = js.native
  /**
    * 取消监听窗口尺寸变化事件
    */
  def offWindowResize(cb: js.Function1[/* res */ Anon_WindowHeight, Unit]): Unit = js.native
  // --加速计
  /**
    * 监听加速度数据，频率：5次/秒，接口调用后会自动开始监听，可使用 wx.stopAccelerometer 停止监听。
    */
  def onAccelerometerChange(cb: js.Function1[/* res */ Anon_X, Unit]): Unit = js.native
  /**
    * 监听音频因为受到系统占用而被中断开始，以下场景会触发此事件：闹钟、电话、FaceTime 通话、微信语音聊天、微信视频聊天。此事件触发后，小程序内所有音频会暂停。
    */
  def onAudioInterruptionBegin(cb: js.Function0[Unit]): Unit = js.native
  /**
    * 监听音频中断结束，在收到 onAudioInterruptionBegin 事件之后，小程序内所有音频会暂停，收到此事件之后才可再次播放成功
    */
  def onAudioInterruptionEnd(cb: js.Function0[Unit]): Unit = js.native
  // --罗盘
  /**
    * 监听罗盘数据，频率：5 次/秒，接口调用后会自动开始监听，可使用 wx.stopCompass 停止监听。
    * @param cb.res.direction 面对的方向度数
    */
  def onCompassChange(cb: js.Function1[/* res */ Anon_Direction, Unit]): Unit = js.native
  // --转屏
  /**
    * 监听横竖屏切换事件
    */
  def onDeviceOrientationChange(callback: js.Function1[/* res */ Anon_ValueString, Unit]): Unit = js.native
  /**
    * 监听全局错误事件
    */
  def onError(cb: js.Function1[/* res */ Anon_MessageStack, Unit]): Unit = js.native
  def onHide(cb: js.Function0[Unit]): Unit = js.native
  /**
    * 监听监听键盘收起的事件
    * @param callback.res.value 键盘输入的当前值
    */
  def onKeyboardComplete(callback: js.Function1[/* res */ Anon_ValueString, Unit]): Unit = js.native
  /**
    * 监听用户点击键盘 Confirm 按钮时的事件
    * @param callback.res.value 键盘输入的当前值
    */
  def onKeyboardConfirm(callback: js.Function1[/* res */ Anon_ValueString, Unit]): Unit = js.native
  /**
    * 监听键盘输入事件
    * @param callback.res.value 键盘输入的当前值
    */
  def onKeyboardInput(callback: js.Function1[/* res */ Anon_ValueString, Unit]): Unit = js.native
  /**
    * 监听内存不足告警
    * @param callback.res.level 内存告警等级，只有 Android 才有，对应系统宏定义:
    *                           10 TRIM_MEMORY_RUNNING_LOW
    *                           15 TRIM_MEMORY_RUNNING_CRITICAL
    */
  def onMemoryWarning(callback: js.Function1[/* res */ Anon_Level, Unit]): Unit = js.native
  /**
    * 监听主域发送的消息
    */
  def onMessage(callback: js.Function1[/* data */ js.Any, Unit]): Unit = js.native
  /**
    * 监听网络状态变化事件
    */
  def onNetworkStatusChange(cb: js.Function1[/* res */ Anon_IsConnected, Unit]): Unit = js.native
  /**
    * 监听用户点击右上角菜单的“转发”按钮时触发的事件
    */
  def onShareAppMessage(cb: js.Function0[ShareOption]): Unit = js.native
  def onShow(cb: js.Function1[/* res */ Anon_Query, Unit]): Unit = js.native
  /**
    * 监听WebSocket 连接关闭事件
    */
  def onSocketClose(callback: js.Function0[Unit]): Unit = js.native
  /**
    * 监听WebSocket 错误事件
    */
  def onSocketError(callback: SocketErrorCallback): Unit = js.native
  /**
    * 监听WebSocket 接受到服务器的消息事件
    */
  def onSocketMessage(callback: SocketMessageCallback): Unit = js.native
  /**
    * 监听WebSocket 连接打开事件
    */
  def onSocketOpen(callback: SocketOpenCallback): Unit = js.native
  /**
    * 监听触点失效事件
    */
  def onTouchCancel(cb: js.Function1[/* res */ TouchData, Unit]): Unit = js.native
  /**
    * 监听触摸结束事件
    */
  def onTouchEnd(cb: js.Function1[/* res */ TouchData, Unit]): Unit = js.native
  /**
    * 监听触点移动事件
    */
  def onTouchMove(cb: js.Function1[/* res */ TouchData, Unit]): Unit = js.native
  // --触摸事件
  /**
    * 监听开始始触摸事件
    */
  def onTouchStart(cb: js.Function1[/* res */ TouchData, Unit]): Unit = js.native
  // --窗口
  /**
    * 监听窗口尺寸变化事件
    */
  def onWindowResize(cb: js.Function1[/* res */ Anon_WindowHeight, Unit]): Unit = js.native
  // --客服消息
  /**
    * 进入客服会话，要求在用户发生过至少一次 touch 事件后才能调用。后台接入方式与小程序一致，详见 客服消息接入
    */
  def openCustomerServiceConversation(param: Anon_CompleteFailSendMessageImg): Unit = js.native
  /**
    * 调起客户端小程序设置界面，返回用户设置的操作结果。设置界面只会出现小程序已经向用户请求过的权限。
    * @deprecated
    */
  def openSetting(p: CallbacksWithType[Anon_AuthSetting]): Unit = js.native
  /**
    * 预览图片，调用之后会在新打开的页面中全屏预览传入的图片，预览的过程中用户可以进行保存图片、发送给朋友等操作
    */
  def previewImage(param: Anon_CompleteCurrent): Unit = js.native
  /**
    * 从本地缓存中移除指定 key
    */
  def removeStorage(param: RemoveStorageParams): Unit = js.native
  /**
    * removeStorage 的同步版本
    * @param key 本地缓存中指定的 key
    */
  def removeStorageSync(key: String): Unit = js.native
  /**
    * 删除用户托管数据当中对应 key 的数据。
    */
  def removeUserCloudStorage(param: Anon_CompleteFailKeyListSuccess): Unit = js.native
  // --发起请求
  def request(param: RequestParams): RequestTask = js.native
  // --虚拟支付
  /**
    * 发起米大师支付
    */
  def requestMidasPayment(param: Anon_0): Unit = js.native
  /**
    * 保存图片到系统相册。需要用户授权 scope.writePhotosAlbum
    */
  def saveImageToPhotosAlbum(param: Anon_CompleteFailFilePath): Unit = js.native
  /**
    * 通过 WebSocket 连接发送数据，需要先 wx.connectSocket，并在 wx.onSocketOpen 回调之后才能发送。
    */
  def sendSocketMessage(param: SocketSendParams): Unit = js.native
  /**
    * 设置系统剪贴板的内容
    */
  def setClipboardData(p: SetClipboardDataParams): Unit = js.native
  // --调试
  def setEnableDebug(p: Anon_CompleteEnableDebug): Unit = js.native
  /**
    * 设置是否保持常亮状态。仅在当前小程序生效，离开小程序后设置失效。
    */
  def setKeepScreenOn(p: SetKeepScreenOnParams): Unit = js.native
  def setMenuStyle(param: Anon_CompleteDark): Unit = js.native
  /**
    * 可以修改渲染帧率。默认渲染帧率为 60 帧每秒。修改后，requestAnimationFrame 的回调频率会发生改变。
    * @param fps 帧率，有效范围 1 - 60。
    */
  def setPreferredFramesPerSecond(fps: Double): Unit = js.native
  /**
    * 设置屏幕亮度
    */
  def setScreenBrightness(p: SetScreenBrightnessParams): Unit = js.native
  // --状态栏
  /**
    * 当在配置中设置 showStatusBarStyle 时，屏幕顶部会显示状态栏。此接口可以修改状态栏的样式。
    */
  def setStatusBarStyle(param: Anon_Black): Unit = js.native
  /**
    * 将数据存储在本地缓存中指定的 key 中，会覆盖掉原来该 key 对应的内容。
    */
  def setStorage(param: SetStorageParams): Unit = js.native
  /**
    * setStorage 的同步版本
    * @param key 本地缓存中指定的 key
    * @param data 需要存储的内容
    */
  def setStorageSync(key: String, data: js.Any): Unit = js.native
  /**
    * 对用户托管数据进行写数据操作，允许同时写多组 KV 数据。
    * 托管数据的限制
    *      > 每个openid所标识的微信用户在每个游戏上托管的数据不能超过128个key-value对。
    *      > 上报的key-value列表当中每一项的key+value长度都不能超过1K(1024)字节。
    *      > 上报的key-value列表当中每一个key长度都不能超过128字节。
    */
  def setUserCloudStorage(param: Anon_CompleteFailKVDataList): Unit = js.native
  /**
    * 主动拉起转发，进入选择通讯录界面。
    */
  def shareAppMessage(param: ShareOption): Unit = js.native
  /**
    * 显示选择器
    */
  def showActionSheet(params: Anon_CompleteFailItemColor): Unit = js.native
  /**
    * 显示键盘
    */
  def showKeyboard(param: Anon_ConfirmHold): Unit = js.native
  /**
    * 显示 loading 提示框, 需主动调用 wx.hideLoading 才能关闭提示框
    */
  def showLoading(): Unit = js.native
  def showLoading(prms: Anon_CompleteFailMask): Unit = js.native
  /**
    * 显示模态对话框
    */
  def showModal(param: Anon_CancelColor): Unit = js.native
  /**
    * 显示当前页面的转发按钮
    */
  def showShareMenu(): Unit = js.native
  def showShareMenu(param: Anon_CompleteFailSuccess): Unit = js.native
  // --交互
  /**
    * 显示消息提示框
    */
  def showToast(param: Anon_CompleteDuration): Unit = js.native
  /**
    * 开始监听加速度数据。
    */
  def startAccelerometer(cb: AccelerometerParams): Unit = js.native
  /**
    * 开始监听罗盘数据
    */
  def startCompass(): Unit = js.native
  def startCompass(cb: Callbacks): Unit = js.native
  /**
    * 停止监听加速度数据。
    */
  def stopAccelerometer(): Unit = js.native
  def stopAccelerometer(cb: Callbacks): Unit = js.native
  /**
    * 停止监听罗盘数据
    */
  def stopCompass(): Unit = js.native
  def stopCompass(cb: Callbacks): Unit = js.native
  /**
    * 加快触发 JavaScriptCore Garbage Collection（垃圾回收），GC 时机是由 JavaScriptCore 来控制的，并不能保证调用后马上触发 GC。
    */
  def triggerGC(): Unit = js.native
  /**
    * 更新键盘，只有当键盘处于拉起状态时才会产生效果
    */
  def updateKeyboard(param: Anon_CompleteFailSuccessValue): Unit = js.native
  /**
    * 更新转发属性
    */
  def updateShareMenu(param: Anon_CompleteFailSuccess): Unit = js.native
  // --上传
  def uploadFile(param: Anon_Complete): UploadTask = js.native
  /**
    * 使手机发生较长时间的振动（400 ms)
    */
  def vibrateLong(): Unit = js.native
  def vibrateLong(cb: Callbacks): Unit = js.native
  // --振动
  /**
    * 使手机发生较短时间的振动（15 ms）
    */
  def vibrateShort(): Unit = js.native
  def vibrateShort(cb: Callbacks): Unit = js.native
}


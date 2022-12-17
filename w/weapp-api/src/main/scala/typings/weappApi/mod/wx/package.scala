package typings.weappApi.mod.wx

import org.scalablytyped.runtime.StringDictionary
import typings.weappApi.anon.TapIndex
import typings.weappApi.mod.wx.^
import typings.weappApi.weappApiStrings.MD5
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}


/**
  * 提前向用户发起授权请求。调用后会立刻弹窗询问用户是否同意授权小程序使用某项功能或获取用户的某些数据，但不会实际调用对应接口。如果用户之前已经同意授权，则不会出现弹窗，直接返回成功。
  */
inline def authorize(options: AuthorizeOptions): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("authorize")(options.asInstanceOf[js.Any]).asInstanceOf[Unit]

/**
  *  检查登录态是否过期。
  */
inline def checkSession(options: CommonCallbackOptions): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("checkSession")(options.asInstanceOf[js.Any]).asInstanceOf[Unit]

/**
  * 从本地相册选择图片或使用相机拍照。
  */
inline def chooseImage(options: ChooseImageOptions): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("chooseImage")(options.asInstanceOf[js.Any]).asInstanceOf[Unit]

/**
  * 拍摄视频或从手机相册中选视频，返回视频的临时文件路径。
  */
inline def chooseVideo(options: ChooseVideoOptions): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("chooseVideo")(options.asInstanceOf[js.Any]).asInstanceOf[Unit]

/**
  * 清理本地数据缓存。
  */
inline def clearStorage(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("clearStorage")().asInstanceOf[Unit]

/**
  * 同步清理本地数据缓存
  */
inline def clearStorageSync(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("clearStorageSync")().asInstanceOf[Unit]

/**
  * 关闭WebSocket连接。
  */
inline def closeSocket(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("closeSocket")().asInstanceOf[Unit]

/**
  * 创建一个 WebSocket 连接；
  * 一个微信小程序同时只能有一个 WebSocket 连接，
  * 如果当前已存在一个 WebSocket 连接，
  * 会自动关闭该连接，并重新创建一个 WebSocket 连接。
  */
inline def connectSocket(options: ConnectSocketOptions): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("connectSocket")(options.asInstanceOf[js.Any]).asInstanceOf[Unit]

/**
  * 创建一个动画实例animation。调用实例的方法来描述动画。
  * 最后通过动画实例的export方法导出动画数据传递给组件的animation属性。
  *
  * 注意: export 方法每次调用后会清掉之前的动画操作
  */
inline def createAnimation(): Animation = ^.asInstanceOf[js.Dynamic].applyDynamic("createAnimation")().asInstanceOf[Animation]
inline def createAnimation(options: CreateAnimationOptions): Animation = ^.asInstanceOf[js.Dynamic].applyDynamic("createAnimation")(options.asInstanceOf[js.Any]).asInstanceOf[Animation]

/**
  * 创建并返回绘图上下文context对象。
  * context只是一个记录方法调用的容器，
  * 用于生成记录绘制行为的actions数组。c
  * ontext跟<canvas/>不存在对应关系，
  * 一个context生成画布的绘制动作数组可以应用于多个<canvas/>。
  */
inline def createContext(): CanvasContext = ^.asInstanceOf[js.Dynamic].applyDynamic("createContext")().asInstanceOf[CanvasContext]

/**
  * 下载文件资源到本地。客户端直接发起一个 HTTP GET 请求，
  * 把下载到的资源根据 type 进行处理，并返回文件的本地临时路径。
  */
inline def downloadFile(options: DownloadFileOptions): DownloadTask = ^.asInstanceOf[js.Dynamic].applyDynamic("downloadFile")(options.asInstanceOf[js.Any]).asInstanceOf[DownloadTask]

/**
  * 绘制画布
  */
inline def drawCanvas(options: DrawCanvasOptions): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("drawCanvas")(options.asInstanceOf[js.Any]).asInstanceOf[Unit]

/**
  * 获取当前账号信息
  */
inline def getAccountInfoSync(): AccountInfo = ^.asInstanceOf[js.Dynamic].applyDynamic("getAccountInfoSync")().asInstanceOf[AccountInfo]

/** 获取音乐播放状态。 */
inline def getBackgroundAudioPlayerState(options: GetBackgroundAudioPlayerStateOptions): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("getBackgroundAudioPlayerState")(options.asInstanceOf[js.Any]).asInstanceOf[Unit]

/**
  * 获取小程序启动时的参数。与 App.onLaunch 的回调参数一致。
  */
inline def getLaunchOptionsSync(): onLaunchCallback = ^.asInstanceOf[js.Dynamic].applyDynamic("getLaunchOptionsSync")().asInstanceOf[onLaunchCallback]

/**
  * 获取当前的地理位置、速度。
  */
inline def getLocation(options: GetLocationOptions): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("getLocation")(options.asInstanceOf[js.Any]).asInstanceOf[Unit]

/**
  * 获取网络类型。
  */
inline def getNetworkType(options: GetNetworkTypeOptions): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("getNetworkType")(options.asInstanceOf[js.Any]).asInstanceOf[Unit]

/**
  * 获取用户的当前设置。返回值中只会出现小程序已经向用户请求过的权限。
  */
inline def getSetting(options: SettingOptions): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("getSetting")(options.asInstanceOf[js.Any]).asInstanceOf[Unit]

/**
  * 从本地缓存中异步获取指定 key 对应的内容。
  */
inline def getStorage(options: GetStorageOptions): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("getStorage")(options.asInstanceOf[js.Any]).asInstanceOf[Unit]

/**
  * 异步获取当前storage的相关信息
  * @param options
  */
inline def getStorageInfo(options: StorageInfoOptions): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("getStorageInfo")(options.asInstanceOf[js.Any]).asInstanceOf[Unit]

/**
  * getStorageInfo的同步版本
  */
inline def getStorageInfoSync(): StorageInfo = ^.asInstanceOf[js.Dynamic].applyDynamic("getStorageInfoSync")().asInstanceOf[StorageInfo]

/**
  * 从本地缓存中同步获取指定 key 对应的内容。
  *
  * @param {string} key
  * @returns {(Object | string)}
  */
inline def getStorageSync(key: String): Any | String = ^.asInstanceOf[js.Dynamic].applyDynamic("getStorageSync")(key.asInstanceOf[js.Any]).asInstanceOf[Any | String]

/**
  * 获取系统信息。
  */
inline def getSystemInfo(options: GetSystemInfoOptions): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("getSystemInfo")(options.asInstanceOf[js.Any]).asInstanceOf[Unit]

/**
  * 获取全局唯一的版本更新管理器，用于管理小程序更新。关于小程序的更新机制，可以查看运行机制文档。
  */
inline def getUpdateManager(): UpdateManager = ^.asInstanceOf[js.Dynamic].applyDynamic("getUpdateManager")().asInstanceOf[UpdateManager]

/**
  * 获取用户信息，需要先调用 wx.login 接口。
  */
inline def getUserInfo(options: GetUserInfoOptions): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("getUserInfo")(options.asInstanceOf[js.Any]).asInstanceOf[Unit]

/**
  * 收起键盘。
  */
inline def hideKeyboard(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("hideKeyboard")().asInstanceOf[Unit]

/**
  * 隐藏 loading 提示框
  * @param options
  */
inline def hideLoading(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("hideLoading")().asInstanceOf[Unit]
inline def hideLoading(options: CommonCallbackOptions): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("hideLoading")(options.asInstanceOf[js.Any]).asInstanceOf[Unit]

/**
  * 在当前页面隐藏导航条加载动画
  */
/**
  * 隐藏导航条加载动画。
  */
inline def hideNavigationBarLoading(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("hideNavigationBarLoading")().asInstanceOf[Unit]
inline def hideNavigationBarLoading(options: CommonCallbackOptions): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("hideNavigationBarLoading")(options.asInstanceOf[js.Any]).asInstanceOf[Unit]

/**
  * 隐藏tabBar
  */
inline def hideTabBar(options: TabBarAnimationOptions): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("hideTabBar")(options.asInstanceOf[js.Any]).asInstanceOf[Unit]

/**
  * 隐藏 tabBar 某一项的右上角的红点
  * @param options
  */
inline def hideTabBarRedDot(options: TabBarBadgeOptions): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("hideTabBarRedDot")(options.asInstanceOf[js.Any]).asInstanceOf[Unit]

/**
  * 隐藏消息提示框
  * @param options
  */
inline def hideToast(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("hideToast")().asInstanceOf[Unit]
inline def hideToast(options: CommonCallbackOptions): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("hideToast")(options.asInstanceOf[js.Any]).asInstanceOf[Unit]

inline def loadFontFace(options: FontFaceOptions): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("loadFontFace")(options.asInstanceOf[js.Any]).asInstanceOf[Unit]

/**
  * 调用接口获取登录凭证（code）进而换取用户登录态信息，
  * 包括用户的唯一标识（openid） 及本次登录的 会话密钥（session_key）。
  * 用户数据的加解密通讯需要依赖会话密钥完成。
  */
inline def login(option: LoginOptions): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("login")(option.asInstanceOf[js.Any]).asInstanceOf[Unit]

/**
  * 关闭当前页面，返回上一页面或多级页面。可通过 getCurrentPages() 获取当前的页面栈，决定需要返回几层。
  */
inline def navigateBack(options: NavigateBackOptions): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("navigateBack")(options.asInstanceOf[js.Any]).asInstanceOf[Unit]

/**
  * 返回到上一个小程序。只有在当前小程序是被其他小程序打开时可以调用成功
  */
inline def navigateBackMiniProgram(options: NavigateBackMiniProgramOptions): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("navigateBackMiniProgram")(options.asInstanceOf[js.Any]).asInstanceOf[Unit]

/**
  * 保留当前页面，跳转到应用内的某个页面。但是不能跳到 tabbar 页面。使用 wx.navigateBack 可以返回到原页面。
  * @param options
  */
inline def navigateTo(options: routerOptions): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("navigateTo")(options.asInstanceOf[js.Any]).asInstanceOf[Unit]

/**
  * 打开另一个小程序
  */
inline def navigateToMiniProgram(options: NavigateToMiniProgramOptions): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("navigateToMiniProgram")(options.asInstanceOf[js.Any]).asInstanceOf[Unit]

/**
  * 取消监听小程序切后台事件
  */
inline def offAppHide(): NoneParamCallback = ^.asInstanceOf[js.Dynamic].applyDynamic("offAppHide")().asInstanceOf[NoneParamCallback]

/**
  *  取消监听小程序切前台事件
  */
inline def offAppShow(): NoneParamCallback = ^.asInstanceOf[js.Dynamic].applyDynamic("offAppShow")().asInstanceOf[NoneParamCallback]

/**
  * 取消监听小程序错误事件。
  */
inline def offError(): NoneParamCallback = ^.asInstanceOf[js.Dynamic].applyDynamic("offError")().asInstanceOf[NoneParamCallback]

// 应用级事件
/**
  * 取消监听小程序要打开的页面不存在事件
  */
inline def offPageNotFound(): NoneParamCallback = ^.asInstanceOf[js.Dynamic].applyDynamic("offPageNotFound")().asInstanceOf[NoneParamCallback]

/**
  * 监听重力感应数据，频率：5次/秒
  */
inline def onAccelerometerChange(callback: AccelerometerChangeCallback): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("onAccelerometerChange")(callback.asInstanceOf[js.Any]).asInstanceOf[Unit]

/**
  * 监听小程序切后台事件。该事件与 App.onHide 的回调时机一致。
  */
inline def onAppHide(): NoneParamCallback = ^.asInstanceOf[js.Dynamic].applyDynamic("onAppHide")().asInstanceOf[NoneParamCallback]

/**
  * 监听小程序切前台事件。该事件与 App.onShow 的回调参数一致。
  * @param callback
  */
inline def onAppShow(callback: onShowOptions): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("onAppShow")(callback.asInstanceOf[js.Any]).asInstanceOf[Unit]

/** 监听音乐暂停。 */
inline def onBackgroundAudioPause(callback: NoneParamCallback): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("onBackgroundAudioPause")(callback.asInstanceOf[js.Any]).asInstanceOf[Unit]

/** 监听音乐播放。 */
inline def onBackgroundAudioPlay(callback: NoneParamCallback): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("onBackgroundAudioPlay")(callback.asInstanceOf[js.Any]).asInstanceOf[Unit]

/** 监听音乐停止。 */
inline def onBackgroundAudioStop(callback: NoneParamCallback): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("onBackgroundAudioStop")(callback.asInstanceOf[js.Any]).asInstanceOf[Unit]

inline def onCompassChange(callback: CompassChangeCallback): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("onCompassChange")(callback.asInstanceOf[js.Any]).asInstanceOf[Unit]

/**
  * 监听小程序错误事件。如脚本错误或 API 调用报错等。该事件与 App.onError 的回调时机与参数一致。
  */
inline def onError(): ErrorCallback = ^.asInstanceOf[js.Dynamic].applyDynamic("onError")().asInstanceOf[ErrorCallback]

/**
  * 监听小程序要打开的页面不存在事件。该事件与 App.onPageNotFound 的回调时机一致。
  */
inline def onPageNotFound(): NoneParamCallback = ^.asInstanceOf[js.Dynamic].applyDynamic("onPageNotFound")().asInstanceOf[NoneParamCallback]

/** 监听WebSocket关闭。 */
inline def onSocketClose(callback: ResponseCallback): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("onSocketClose")(callback.asInstanceOf[js.Any]).asInstanceOf[Unit]

/** 监听WebSocket错误。 */
inline def onSocketError(callback: ErrorCallback): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("onSocketError")(callback.asInstanceOf[js.Any]).asInstanceOf[Unit]

/**
  * 监听WebSocket接受到服务器的消息事件。
  */
inline def onSocketMessage(callback: DataResponseCallback): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("onSocketMessage")(callback.asInstanceOf[js.Any]).asInstanceOf[Unit]

/** 监听WebSocket连接打开事件。 */
inline def onSocketOpen(callback: OneParamCallback): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("onSocketOpen")(callback.asInstanceOf[js.Any]).asInstanceOf[Unit]

/**
  * 使用微信内置地图查看位置
  */
inline def openLocation(options: OpenLocationOptions): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("openLocation")(options.asInstanceOf[js.Any]).asInstanceOf[Unit]

/**
  * 调起客户端小程序设置界面，返回用户设置的操作结果。设置界面只会出现小程序已经向用户请求过的权限。
  */
inline def openSetting(options: SettingOptions): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("openSetting")(options.asInstanceOf[js.Any]).asInstanceOf[Unit]

/**
  * 将页面滚动到
  */
inline def pageScrollTo(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("pageScrollTo")().asInstanceOf[Unit]

/** 暂停播放音乐。 */
inline def pauseBackgroundAudio(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("pauseBackgroundAudio")().asInstanceOf[Unit]

/**
  * 暂停正在播放的语音。
  * 再次调用wx.playVoice播放同一个文件时，会从暂停处开始播放。
  * 如果想从头开始播放，需要先调用 wx.stopVoice。
  */
inline def pauseVoice(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("pauseVoice")().asInstanceOf[Unit]

/** 播放音乐，同时只能有一首音乐正在播放。 */
inline def playBackgroundAudio(options: PlayBackgroundAudioOptions): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("playBackgroundAudio")(options.asInstanceOf[js.Any]).asInstanceOf[Unit]

/**
  * 开始播放语音，同时只允许一个语音文件正在播放，
  * 如果前一个语音文件还没播放完，将中断前一个语音播放。
  */
inline def playVoice(options: PlayVoiceOptions): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("playVoice")(options.asInstanceOf[js.Any]).asInstanceOf[Unit]

/**
  * 预览图片。
  */
inline def previewImage(options: PreviewImageOptions): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("previewImage")(options.asInstanceOf[js.Any]).asInstanceOf[Unit]

/**
  * 关闭所有页面，打开到应用内的某个页面
  */
inline def reLaunch(options: routerOptions): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("reLaunch")(options.asInstanceOf[js.Any]).asInstanceOf[Unit]

/**
  * 关闭当前页面，跳转到应用内的某个页面。但是不允许跳转到 tabbar 页面。
  */
inline def redirectTo(options: routerOptions): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("redirectTo")(options.asInstanceOf[js.Any]).asInstanceOf[Unit]

/**
  * 移除 tabBar 某一项右上角的文本
  * @param options
  */
inline def removeTabBarBadge(options: TabBarRedDotOptions): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("removeTabBarBadge")(options.asInstanceOf[js.Any]).asInstanceOf[Unit]

/**
  * wx.request发起的是https请求。一个微信小程序，同时只能有5个网络请求连接。
  */
inline def request(options: RequestOptions): RequestTask = ^.asInstanceOf[js.Dynamic].applyDynamic("request")(options.asInstanceOf[js.Any]).asInstanceOf[RequestTask]

//  支付
/**
  * 发起微信支付。
  */
inline def requestPayment(options: RequestPaymentOptions): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("requestPayment")(options.asInstanceOf[js.Any]).asInstanceOf[Unit]

/**
  * 保存文件到本地。
  */
inline def saveFile(options: SaveFileOptions): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("saveFile")(options.asInstanceOf[js.Any]).asInstanceOf[Unit]

/**
  * 控制音乐播放进度。
  */
inline def seekBackgroundAudio(options: SeekBackgroundAudioOptions): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("seekBackgroundAudio")(options.asInstanceOf[js.Any]).asInstanceOf[Unit]

/**
  * 通过 WebSocket 连接发送数据，需要先 wx.connectSocket，
  * 并在 wx.onSocketOpen 回调之后才能发送。
  */
inline def sendSocketMessage(options: SendSocketMessageOptions): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("sendSocketMessage")(options.asInstanceOf[js.Any]).asInstanceOf[Unit]

inline def setBackgroundColor(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("setBackgroundColor")().asInstanceOf[Unit]

//  背景
inline def setBackgroundTextStyle(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("setBackgroundTextStyle")().asInstanceOf[Unit]

// 导航栏
inline def setNavigationBarColor(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("setNavigationBarColor")().asInstanceOf[Unit]

/**
  * 动态设置当前页面的标题
  * @param options
  */
inline def setNavigationBarTitle(options: NavigationBarTitleOptions): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("setNavigationBarTitle")(options.asInstanceOf[js.Any]).asInstanceOf[Unit]
/**
  * 动态设置当前页面的标题。
  */
inline def setNavigationBarTitle(options: SetNavigationBarTitleOptions): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("setNavigationBarTitle")(options.asInstanceOf[js.Any]).asInstanceOf[Unit]

/**
  * 将数据存储在本地缓存中指定的 key 中，
  * 会覆盖掉原来该 key 对应的内容，这是一个异步接口。
  */
inline def setStorage(options: SetStorageOptions): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("setStorage")(options.asInstanceOf[js.Any]).asInstanceOf[Unit]

inline def setStorageSync(key: String, data: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("setStorageSync")(key.asInstanceOf[js.Any], data.asInstanceOf[js.Any])).asInstanceOf[Unit]
/**
  * 将 data 存储在本地缓存中指定的 key 中，
  * 会覆盖掉原来该 key 对应的内容，这是一个同步接口。
  *
  * @param {string} key 本地缓存中的指定的 key
  * @param {(Object | string)} data 需要存储的内容
  */
inline def setStorageSync(key: String, data: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("setStorageSync")(key.asInstanceOf[js.Any], data.asInstanceOf[js.Any])).asInstanceOf[Unit]

/**
  * 为 tabBar 某一项的右上角添加文本
  * @param options
  */
inline def setTabBarBadge(options: TabBarBadgeOptions): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("setTabBarBadge")(options.asInstanceOf[js.Any]).asInstanceOf[Unit]

/**
  * 动态设置 tabBar 某一项的内容
  * @param options
  */
inline def setTabBarItem(options: TabBarItemOptions): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("setTabBarItem")(options.asInstanceOf[js.Any]).asInstanceOf[Unit]

/**
  * 动态设置tabBar的整体样式
  */
inline def setTabBarStyle(options: TabBarItemOptions): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("setTabBarStyle")(options.asInstanceOf[js.Any]).asInstanceOf[Unit]

/**
  * 显示操作菜单
  */
inline def showActionSheet(options: ActionSheetOptions): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("showActionSheet")(options.asInstanceOf[js.Any]).asInstanceOf[Unit]

/**
  * 显示 loading 提示框。需主动调用 wx.hideLoading 才能关闭提示框
  * @param options
  */
inline def showLoading(options: LoadingOptions): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("showLoading")(options.asInstanceOf[js.Any]).asInstanceOf[Unit]

/**
  * 显示模态对话框
  * @param options
  */
inline def showModal(options: ModalOptions): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("showModal")(options.asInstanceOf[js.Any]).asInstanceOf[Unit]

/**
  * 在当前页面显示导航条加载动画。
  */
inline def showNavigationBarLoading(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("showNavigationBarLoading")().asInstanceOf[Unit]
/**
  * 在当前页面显示导航条加载动画
  */
inline def showNavigationBarLoading(options: CommonCallbackOptions): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("showNavigationBarLoading")(options.asInstanceOf[js.Any]).asInstanceOf[Unit]

/**
  * 显示tabBar
  */
inline def showTabBar(options: TabBarAnimationOptions): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("showTabBar")(options.asInstanceOf[js.Any]).asInstanceOf[Unit]

/**
  * 显示 tabBar 某一项的右上角的红点
  * @param options
  */
inline def showTabBarRedDot(options: TabBarRedDotOptions): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("showTabBarRedDot")(options.asInstanceOf[js.Any]).asInstanceOf[Unit]

/**
  * 显示消息提示框
  * @param options
  */
inline def showToast(options: ToastOptions): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("showToast")(options.asInstanceOf[js.Any]).asInstanceOf[Unit]

/**
  * 开始下拉刷新。调用后触发下拉刷新动画，效果与用户手动下拉刷新一致。
  */
inline def startPullDownRefresh(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("startPullDownRefresh")().asInstanceOf[Unit]
inline def startPullDownRefresh(options: CommonCallbackOptions): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("startPullDownRefresh")(options.asInstanceOf[js.Any]).asInstanceOf[Unit]

/**
  * 开始录音。当主动调用wx.stopRecord，
  * 或者录音超过1分钟时自动结束录音，返回录音文件的临时文件路径。
  * 注：文件的临时路径，在小程序本次启动期间可以正常使用，
  * 如需持久保存，需在主动调用wx.saveFile，在小程序下次启动时才能访问得到。
  */
inline def startRecord(options: StartRecordOptions): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("startRecord")(options.asInstanceOf[js.Any]).asInstanceOf[Unit]

/**
  * 停止播放音乐。
  */
inline def stopBackgroundAudio(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("stopBackgroundAudio")().asInstanceOf[Unit]

//  下拉刷新
/**
  * 停止当前页面下拉刷新。
  */
inline def stopPullDownRefresh(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("stopPullDownRefresh")().asInstanceOf[Unit]
inline def stopPullDownRefresh(options: CommonCallbackOptions): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("stopPullDownRefresh")(options.asInstanceOf[js.Any]).asInstanceOf[Unit]

/**
  * ​ 主动调用停止录音。
  */
inline def stopRecord(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("stopRecord")().asInstanceOf[Unit]

/**
  * 结束播放语音。
  */
inline def stopVoice(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("stopVoice")().asInstanceOf[Unit]

/**
  * 跳转到 tabBar 页面，并关闭其他所有非 tabBar 页面
  * @param options
  */
inline def switchTab(options: routerOptions): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("switchTab")(options.asInstanceOf[js.Any]).asInstanceOf[Unit]

/**
  * 将本地资源上传到开发者服务器。
  * 如页面通过 wx.chooseImage 等接口获取到一个本地资源的临时文件路径后，
  * 可通过此接口将本地资源上传到指定服务器。
  * 客户端发起一个 HTTPS POST 请求，
  * 其中 Content-Type 为 multipart/form-data 。
  */
inline def uploadFile(options: UploadFileOptions): UploadTask = ^.asInstanceOf[js.Dynamic].applyDynamic("uploadFile")(options.asInstanceOf[js.Any]).asInstanceOf[UploadTask]

type AccelerometerChangeCallback = js.Function1[/* res */ AccelerometerData, Unit]

// 界面
// 交互
// tapIndex为用户点击的按钮序号，从上到下的顺序，从0开始
type ActionSheetSuccessCallback = js.Function1[/* res */ TapIndex, Unit]

type CompassChangeCallback = js.Function1[/* res */ CompassData, Unit]

type DataResponseCallback = js.Function1[/* res */ DataResponse, Unit]

type ErrorCallback = js.Function1[/* error */ Any, Unit]

type EventCallback = js.Function1[/* event */ Any, Unit]

type GetBackgroundAudioPlayerStateSuccessCallback = js.Function1[/* state */ BackgroundAudioPlayerState, Unit]

// import startPullDownRefresh = swan.startPullDownRefresh;
type NoneParamCallback = js.Function0[Unit]

type OneParamCallback = js.Function1[/* data */ Any, Unit]

type PaymentSignType = MD5

//  网络
//  发起请求
type RequestHeader = StringDictionary[String]

type ResponseCallback = js.Function1[/* res */ Any, Unit]

type StorageInfoCallback = js.Function1[/* res */ StorageInfoOptions, Unit]

type TempFileResponseCallback = js.Function1[/* res */ TempFileResponse, Unit]

type onLaunchCallback = js.Function1[/* options */ onLaunchOptions, Unit]

type onShowOptions = onLaunchOptions

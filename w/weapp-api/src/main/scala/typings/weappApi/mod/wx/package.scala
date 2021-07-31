package typings.weappApi.mod.wx

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}


/**
  * 提前向用户发起授权请求。调用后会立刻弹窗询问用户是否同意授权小程序使用某项功能或获取用户的某些数据，但不会实际调用对应接口。如果用户之前已经同意授权，则不会出现弹窗，直接返回成功。
  */
@scala.inline
def authorize(options: typings.weappApi.mod.wx.AuthorizeOptions): scala.Unit = typings.weappApi.mod.wx.^.asInstanceOf[js.Dynamic].applyDynamic("authorize")(options.asInstanceOf[js.Any]).asInstanceOf[scala.Unit]

/**
  *  检查登录态是否过期。
  */
@scala.inline
def checkSession(options: typings.weappApi.mod.wx.CommonCallbackOptions): scala.Unit = typings.weappApi.mod.wx.^.asInstanceOf[js.Dynamic].applyDynamic("checkSession")(options.asInstanceOf[js.Any]).asInstanceOf[scala.Unit]

/**
  * 从本地相册选择图片或使用相机拍照。
  */
@scala.inline
def chooseImage(options: typings.weappApi.mod.wx.ChooseImageOptions): scala.Unit = typings.weappApi.mod.wx.^.asInstanceOf[js.Dynamic].applyDynamic("chooseImage")(options.asInstanceOf[js.Any]).asInstanceOf[scala.Unit]

/**
  * 拍摄视频或从手机相册中选视频，返回视频的临时文件路径。
  */
@scala.inline
def chooseVideo(options: typings.weappApi.mod.wx.ChooseVideoOptions): scala.Unit = typings.weappApi.mod.wx.^.asInstanceOf[js.Dynamic].applyDynamic("chooseVideo")(options.asInstanceOf[js.Any]).asInstanceOf[scala.Unit]

/**
  * 清理本地数据缓存。
  */
@scala.inline
def clearStorage(): scala.Unit = typings.weappApi.mod.wx.^.asInstanceOf[js.Dynamic].applyDynamic("clearStorage")().asInstanceOf[scala.Unit]

/**
  * 同步清理本地数据缓存
  */
@scala.inline
def clearStorageSync(): scala.Unit = typings.weappApi.mod.wx.^.asInstanceOf[js.Dynamic].applyDynamic("clearStorageSync")().asInstanceOf[scala.Unit]

/**
  * 关闭WebSocket连接。
  */
@scala.inline
def closeSocket(): scala.Unit = typings.weappApi.mod.wx.^.asInstanceOf[js.Dynamic].applyDynamic("closeSocket")().asInstanceOf[scala.Unit]

/**
  * 创建一个 WebSocket 连接；
  * 一个微信小程序同时只能有一个 WebSocket 连接，
  * 如果当前已存在一个 WebSocket 连接，
  * 会自动关闭该连接，并重新创建一个 WebSocket 连接。
  */
@scala.inline
def connectSocket(options: typings.weappApi.mod.wx.ConnectSocketOptions): scala.Unit = typings.weappApi.mod.wx.^.asInstanceOf[js.Dynamic].applyDynamic("connectSocket")(options.asInstanceOf[js.Any]).asInstanceOf[scala.Unit]

/**
  * 创建一个动画实例animation。调用实例的方法来描述动画。
  * 最后通过动画实例的export方法导出动画数据传递给组件的animation属性。
  *
  * 注意: export 方法每次调用后会清掉之前的动画操作
  */
@scala.inline
def createAnimation(): typings.weappApi.mod.wx.Animation = typings.weappApi.mod.wx.^.asInstanceOf[js.Dynamic].applyDynamic("createAnimation")().asInstanceOf[typings.weappApi.mod.wx.Animation]
@scala.inline
def createAnimation(options: typings.weappApi.mod.wx.CreateAnimationOptions): typings.weappApi.mod.wx.Animation = typings.weappApi.mod.wx.^.asInstanceOf[js.Dynamic].applyDynamic("createAnimation")(options.asInstanceOf[js.Any]).asInstanceOf[typings.weappApi.mod.wx.Animation]

/**
  * 创建并返回绘图上下文context对象。
  * context只是一个记录方法调用的容器，
  * 用于生成记录绘制行为的actions数组。c
  * ontext跟<canvas/>不存在对应关系，
  * 一个context生成画布的绘制动作数组可以应用于多个<canvas/>。
  */
@scala.inline
def createContext(): typings.weappApi.mod.wx.CanvasContext = typings.weappApi.mod.wx.^.asInstanceOf[js.Dynamic].applyDynamic("createContext")().asInstanceOf[typings.weappApi.mod.wx.CanvasContext]

/**
  * 下载文件资源到本地。客户端直接发起一个 HTTP GET 请求，
  * 把下载到的资源根据 type 进行处理，并返回文件的本地临时路径。
  */
@scala.inline
def downloadFile(options: typings.weappApi.mod.wx.DownloadFileOptions): typings.weappApi.mod.wx.DownloadTask = typings.weappApi.mod.wx.^.asInstanceOf[js.Dynamic].applyDynamic("downloadFile")(options.asInstanceOf[js.Any]).asInstanceOf[typings.weappApi.mod.wx.DownloadTask]

/**
  * 绘制画布
  */
@scala.inline
def drawCanvas(options: typings.weappApi.mod.wx.DrawCanvasOptions): scala.Unit = typings.weappApi.mod.wx.^.asInstanceOf[js.Dynamic].applyDynamic("drawCanvas")(options.asInstanceOf[js.Any]).asInstanceOf[scala.Unit]

/**
  * 获取当前账号信息
  */
@scala.inline
def getAccountInfoSync(): typings.weappApi.mod.wx.AccountInfo = typings.weappApi.mod.wx.^.asInstanceOf[js.Dynamic].applyDynamic("getAccountInfoSync")().asInstanceOf[typings.weappApi.mod.wx.AccountInfo]

/** 获取音乐播放状态。 */
@scala.inline
def getBackgroundAudioPlayerState(options: typings.weappApi.mod.wx.GetBackgroundAudioPlayerStateOptions): scala.Unit = typings.weappApi.mod.wx.^.asInstanceOf[js.Dynamic].applyDynamic("getBackgroundAudioPlayerState")(options.asInstanceOf[js.Any]).asInstanceOf[scala.Unit]

/**
  * 获取小程序启动时的参数。与 App.onLaunch 的回调参数一致。
  */
@scala.inline
def getLaunchOptionsSync(): typings.weappApi.mod.wx.onLaunchCallback = typings.weappApi.mod.wx.^.asInstanceOf[js.Dynamic].applyDynamic("getLaunchOptionsSync")().asInstanceOf[typings.weappApi.mod.wx.onLaunchCallback]

/**
  * 获取当前的地理位置、速度。
  */
@scala.inline
def getLocation(options: typings.weappApi.mod.wx.GetLocationOptions): scala.Unit = typings.weappApi.mod.wx.^.asInstanceOf[js.Dynamic].applyDynamic("getLocation")(options.asInstanceOf[js.Any]).asInstanceOf[scala.Unit]

/**
  * 获取网络类型。
  */
@scala.inline
def getNetworkType(options: typings.weappApi.mod.wx.GetNetworkTypeOptions): scala.Unit = typings.weappApi.mod.wx.^.asInstanceOf[js.Dynamic].applyDynamic("getNetworkType")(options.asInstanceOf[js.Any]).asInstanceOf[scala.Unit]

/**
  * 获取用户的当前设置。返回值中只会出现小程序已经向用户请求过的权限。
  */
@scala.inline
def getSetting(options: typings.weappApi.mod.wx.SettingOptions): scala.Unit = typings.weappApi.mod.wx.^.asInstanceOf[js.Dynamic].applyDynamic("getSetting")(options.asInstanceOf[js.Any]).asInstanceOf[scala.Unit]

/**
  * 从本地缓存中异步获取指定 key 对应的内容。
  */
@scala.inline
def getStorage(options: typings.weappApi.mod.wx.GetStorageOptions): scala.Unit = typings.weappApi.mod.wx.^.asInstanceOf[js.Dynamic].applyDynamic("getStorage")(options.asInstanceOf[js.Any]).asInstanceOf[scala.Unit]

/**
  * 异步获取当前storage的相关信息
  * @param options
  */
@scala.inline
def getStorageInfo(options: typings.weappApi.mod.wx.StorageInfoOptions): scala.Unit = typings.weappApi.mod.wx.^.asInstanceOf[js.Dynamic].applyDynamic("getStorageInfo")(options.asInstanceOf[js.Any]).asInstanceOf[scala.Unit]

/**
  * getStorageInfo的同步版本
  */
@scala.inline
def getStorageInfoSync(): typings.weappApi.mod.wx.StorageInfo = typings.weappApi.mod.wx.^.asInstanceOf[js.Dynamic].applyDynamic("getStorageInfoSync")().asInstanceOf[typings.weappApi.mod.wx.StorageInfo]

/**
  * 从本地缓存中同步获取指定 key 对应的内容。
  *
  * @param {string} key
  * @returns {(Object | string)}
  */
@scala.inline
def getStorageSync(key: java.lang.String): js.Any | java.lang.String = typings.weappApi.mod.wx.^.asInstanceOf[js.Dynamic].applyDynamic("getStorageSync")(key.asInstanceOf[js.Any]).asInstanceOf[js.Any | java.lang.String]

/**
  * 获取系统信息。
  */
@scala.inline
def getSystemInfo(options: typings.weappApi.mod.wx.GetSystemInfoOptions): scala.Unit = typings.weappApi.mod.wx.^.asInstanceOf[js.Dynamic].applyDynamic("getSystemInfo")(options.asInstanceOf[js.Any]).asInstanceOf[scala.Unit]

/**
  * 获取全局唯一的版本更新管理器，用于管理小程序更新。关于小程序的更新机制，可以查看运行机制文档。
  */
@scala.inline
def getUpdateManager(): typings.weappApi.mod.wx.UpdateManager = typings.weappApi.mod.wx.^.asInstanceOf[js.Dynamic].applyDynamic("getUpdateManager")().asInstanceOf[typings.weappApi.mod.wx.UpdateManager]

/**
  * 获取用户信息，需要先调用 wx.login 接口。
  */
@scala.inline
def getUserInfo(options: typings.weappApi.mod.wx.GetUserInfoOptions): scala.Unit = typings.weappApi.mod.wx.^.asInstanceOf[js.Dynamic].applyDynamic("getUserInfo")(options.asInstanceOf[js.Any]).asInstanceOf[scala.Unit]

/**
  * 收起键盘。
  */
@scala.inline
def hideKeyboard(): scala.Unit = typings.weappApi.mod.wx.^.asInstanceOf[js.Dynamic].applyDynamic("hideKeyboard")().asInstanceOf[scala.Unit]

/**
  * 隐藏 loading 提示框
  * @param options
  */
@scala.inline
def hideLoading(): scala.Unit = typings.weappApi.mod.wx.^.asInstanceOf[js.Dynamic].applyDynamic("hideLoading")().asInstanceOf[scala.Unit]
@scala.inline
def hideLoading(options: typings.weappApi.mod.wx.CommonCallbackOptions): scala.Unit = typings.weappApi.mod.wx.^.asInstanceOf[js.Dynamic].applyDynamic("hideLoading")(options.asInstanceOf[js.Any]).asInstanceOf[scala.Unit]

/**
  * 在当前页面隐藏导航条加载动画
  */
/**
  * 隐藏导航条加载动画。
  */
@scala.inline
def hideNavigationBarLoading(): scala.Unit = typings.weappApi.mod.wx.^.asInstanceOf[js.Dynamic].applyDynamic("hideNavigationBarLoading")().asInstanceOf[scala.Unit]
@scala.inline
def hideNavigationBarLoading(options: typings.weappApi.mod.wx.CommonCallbackOptions): scala.Unit = typings.weappApi.mod.wx.^.asInstanceOf[js.Dynamic].applyDynamic("hideNavigationBarLoading")(options.asInstanceOf[js.Any]).asInstanceOf[scala.Unit]

/**
  * 隐藏tabBar
  */
@scala.inline
def hideTabBar(options: typings.weappApi.mod.wx.TabBarAnimationOptions): scala.Unit = typings.weappApi.mod.wx.^.asInstanceOf[js.Dynamic].applyDynamic("hideTabBar")(options.asInstanceOf[js.Any]).asInstanceOf[scala.Unit]

/**
  * 隐藏 tabBar 某一项的右上角的红点
  * @param options
  */
@scala.inline
def hideTabBarRedDot(options: typings.weappApi.mod.wx.TabBarBadgeOptions): scala.Unit = typings.weappApi.mod.wx.^.asInstanceOf[js.Dynamic].applyDynamic("hideTabBarRedDot")(options.asInstanceOf[js.Any]).asInstanceOf[scala.Unit]

/**
  * 隐藏消息提示框
  * @param options
  */
@scala.inline
def hideToast(): scala.Unit = typings.weappApi.mod.wx.^.asInstanceOf[js.Dynamic].applyDynamic("hideToast")().asInstanceOf[scala.Unit]
@scala.inline
def hideToast(options: typings.weappApi.mod.wx.CommonCallbackOptions): scala.Unit = typings.weappApi.mod.wx.^.asInstanceOf[js.Dynamic].applyDynamic("hideToast")(options.asInstanceOf[js.Any]).asInstanceOf[scala.Unit]

@scala.inline
def loadFontFace(options: typings.weappApi.mod.wx.FontFaceOptions): scala.Unit = typings.weappApi.mod.wx.^.asInstanceOf[js.Dynamic].applyDynamic("loadFontFace")(options.asInstanceOf[js.Any]).asInstanceOf[scala.Unit]

/**
  * 调用接口获取登录凭证（code）进而换取用户登录态信息，
  * 包括用户的唯一标识（openid） 及本次登录的 会话密钥（session_key）。
  * 用户数据的加解密通讯需要依赖会话密钥完成。
  */
@scala.inline
def login(option: typings.weappApi.mod.wx.LoginOptions): scala.Unit = typings.weappApi.mod.wx.^.asInstanceOf[js.Dynamic].applyDynamic("login")(option.asInstanceOf[js.Any]).asInstanceOf[scala.Unit]

/**
  * 关闭当前页面，返回上一页面或多级页面。可通过 getCurrentPages() 获取当前的页面栈，决定需要返回几层。
  */
@scala.inline
def navigateBack(options: typings.weappApi.mod.wx.NavigateBackOptions): scala.Unit = typings.weappApi.mod.wx.^.asInstanceOf[js.Dynamic].applyDynamic("navigateBack")(options.asInstanceOf[js.Any]).asInstanceOf[scala.Unit]

/**
  * 返回到上一个小程序。只有在当前小程序是被其他小程序打开时可以调用成功
  */
@scala.inline
def navigateBackMiniProgram(options: typings.weappApi.mod.wx.NavigateBackMiniProgramOptions): scala.Unit = typings.weappApi.mod.wx.^.asInstanceOf[js.Dynamic].applyDynamic("navigateBackMiniProgram")(options.asInstanceOf[js.Any]).asInstanceOf[scala.Unit]

/**
  * 保留当前页面，跳转到应用内的某个页面。但是不能跳到 tabbar 页面。使用 wx.navigateBack 可以返回到原页面。
  * @param options
  */
@scala.inline
def navigateTo(options: typings.weappApi.mod.wx.routerOptions): scala.Unit = typings.weappApi.mod.wx.^.asInstanceOf[js.Dynamic].applyDynamic("navigateTo")(options.asInstanceOf[js.Any]).asInstanceOf[scala.Unit]

/**
  * 打开另一个小程序
  */
@scala.inline
def navigateToMiniProgram(options: typings.weappApi.mod.wx.NavigateToMiniProgramOptions): scala.Unit = typings.weappApi.mod.wx.^.asInstanceOf[js.Dynamic].applyDynamic("navigateToMiniProgram")(options.asInstanceOf[js.Any]).asInstanceOf[scala.Unit]

/**
  * 取消监听小程序切后台事件
  */
@scala.inline
def offAppHide(): typings.weappApi.mod.wx.NoneParamCallback = typings.weappApi.mod.wx.^.asInstanceOf[js.Dynamic].applyDynamic("offAppHide")().asInstanceOf[typings.weappApi.mod.wx.NoneParamCallback]

/**
  *  取消监听小程序切前台事件
  */
@scala.inline
def offAppShow(): typings.weappApi.mod.wx.NoneParamCallback = typings.weappApi.mod.wx.^.asInstanceOf[js.Dynamic].applyDynamic("offAppShow")().asInstanceOf[typings.weappApi.mod.wx.NoneParamCallback]

/**
  * 取消监听小程序错误事件。
  */
@scala.inline
def offError(): typings.weappApi.mod.wx.NoneParamCallback = typings.weappApi.mod.wx.^.asInstanceOf[js.Dynamic].applyDynamic("offError")().asInstanceOf[typings.weappApi.mod.wx.NoneParamCallback]

// 应用级事件
/**
  * 取消监听小程序要打开的页面不存在事件
  */
@scala.inline
def offPageNotFound(): typings.weappApi.mod.wx.NoneParamCallback = typings.weappApi.mod.wx.^.asInstanceOf[js.Dynamic].applyDynamic("offPageNotFound")().asInstanceOf[typings.weappApi.mod.wx.NoneParamCallback]

/**
  * 监听重力感应数据，频率：5次/秒
  */
@scala.inline
def onAccelerometerChange(callback: typings.weappApi.mod.wx.AccelerometerChangeCallback): scala.Unit = typings.weappApi.mod.wx.^.asInstanceOf[js.Dynamic].applyDynamic("onAccelerometerChange")(callback.asInstanceOf[js.Any]).asInstanceOf[scala.Unit]

/**
  * 监听小程序切后台事件。该事件与 App.onHide 的回调时机一致。
  */
@scala.inline
def onAppHide(): typings.weappApi.mod.wx.NoneParamCallback = typings.weappApi.mod.wx.^.asInstanceOf[js.Dynamic].applyDynamic("onAppHide")().asInstanceOf[typings.weappApi.mod.wx.NoneParamCallback]

/**
  * 监听小程序切前台事件。该事件与 App.onShow 的回调参数一致。
  * @param callback
  */
@scala.inline
def onAppShow(callback: typings.weappApi.mod.wx.onShowOptions): scala.Unit = typings.weappApi.mod.wx.^.asInstanceOf[js.Dynamic].applyDynamic("onAppShow")(callback.asInstanceOf[js.Any]).asInstanceOf[scala.Unit]

/** 监听音乐暂停。 */
@scala.inline
def onBackgroundAudioPause(callback: typings.weappApi.mod.wx.NoneParamCallback): scala.Unit = typings.weappApi.mod.wx.^.asInstanceOf[js.Dynamic].applyDynamic("onBackgroundAudioPause")(callback.asInstanceOf[js.Any]).asInstanceOf[scala.Unit]

/** 监听音乐播放。 */
@scala.inline
def onBackgroundAudioPlay(callback: typings.weappApi.mod.wx.NoneParamCallback): scala.Unit = typings.weappApi.mod.wx.^.asInstanceOf[js.Dynamic].applyDynamic("onBackgroundAudioPlay")(callback.asInstanceOf[js.Any]).asInstanceOf[scala.Unit]

/** 监听音乐停止。 */
@scala.inline
def onBackgroundAudioStop(callback: typings.weappApi.mod.wx.NoneParamCallback): scala.Unit = typings.weappApi.mod.wx.^.asInstanceOf[js.Dynamic].applyDynamic("onBackgroundAudioStop")(callback.asInstanceOf[js.Any]).asInstanceOf[scala.Unit]

@scala.inline
def onCompassChange(callback: typings.weappApi.mod.wx.CompassChangeCallback): scala.Unit = typings.weappApi.mod.wx.^.asInstanceOf[js.Dynamic].applyDynamic("onCompassChange")(callback.asInstanceOf[js.Any]).asInstanceOf[scala.Unit]

/**
  * 监听小程序错误事件。如脚本错误或 API 调用报错等。该事件与 App.onError 的回调时机与参数一致。
  */
@scala.inline
def onError(): typings.weappApi.mod.wx.ErrorCallback = typings.weappApi.mod.wx.^.asInstanceOf[js.Dynamic].applyDynamic("onError")().asInstanceOf[typings.weappApi.mod.wx.ErrorCallback]

/**
  * 监听小程序要打开的页面不存在事件。该事件与 App.onPageNotFound 的回调时机一致。
  */
@scala.inline
def onPageNotFound(): typings.weappApi.mod.wx.NoneParamCallback = typings.weappApi.mod.wx.^.asInstanceOf[js.Dynamic].applyDynamic("onPageNotFound")().asInstanceOf[typings.weappApi.mod.wx.NoneParamCallback]

/** 监听WebSocket关闭。 */
@scala.inline
def onSocketClose(callback: typings.weappApi.mod.wx.ResponseCallback): scala.Unit = typings.weappApi.mod.wx.^.asInstanceOf[js.Dynamic].applyDynamic("onSocketClose")(callback.asInstanceOf[js.Any]).asInstanceOf[scala.Unit]

/** 监听WebSocket错误。 */
@scala.inline
def onSocketError(callback: typings.weappApi.mod.wx.ErrorCallback): scala.Unit = typings.weappApi.mod.wx.^.asInstanceOf[js.Dynamic].applyDynamic("onSocketError")(callback.asInstanceOf[js.Any]).asInstanceOf[scala.Unit]

/**
  * 监听WebSocket接受到服务器的消息事件。
  */
@scala.inline
def onSocketMessage(callback: typings.weappApi.mod.wx.DataResponseCallback): scala.Unit = typings.weappApi.mod.wx.^.asInstanceOf[js.Dynamic].applyDynamic("onSocketMessage")(callback.asInstanceOf[js.Any]).asInstanceOf[scala.Unit]

/** 监听WebSocket连接打开事件。 */
@scala.inline
def onSocketOpen(callback: typings.weappApi.mod.wx.OneParamCallback): scala.Unit = typings.weappApi.mod.wx.^.asInstanceOf[js.Dynamic].applyDynamic("onSocketOpen")(callback.asInstanceOf[js.Any]).asInstanceOf[scala.Unit]

/**
  * 使用微信内置地图查看位置
  */
@scala.inline
def openLocation(options: typings.weappApi.mod.wx.OpenLocationOptions): scala.Unit = typings.weappApi.mod.wx.^.asInstanceOf[js.Dynamic].applyDynamic("openLocation")(options.asInstanceOf[js.Any]).asInstanceOf[scala.Unit]

/**
  * 调起客户端小程序设置界面，返回用户设置的操作结果。设置界面只会出现小程序已经向用户请求过的权限。
  */
@scala.inline
def openSetting(options: typings.weappApi.mod.wx.SettingOptions): scala.Unit = typings.weappApi.mod.wx.^.asInstanceOf[js.Dynamic].applyDynamic("openSetting")(options.asInstanceOf[js.Any]).asInstanceOf[scala.Unit]

/**
  * 将页面滚动到
  */
@scala.inline
def pageScrollTo(): scala.Unit = typings.weappApi.mod.wx.^.asInstanceOf[js.Dynamic].applyDynamic("pageScrollTo")().asInstanceOf[scala.Unit]

/** 暂停播放音乐。 */
@scala.inline
def pauseBackgroundAudio(): scala.Unit = typings.weappApi.mod.wx.^.asInstanceOf[js.Dynamic].applyDynamic("pauseBackgroundAudio")().asInstanceOf[scala.Unit]

/**
  * 暂停正在播放的语音。
  * 再次调用wx.playVoice播放同一个文件时，会从暂停处开始播放。
  * 如果想从头开始播放，需要先调用 wx.stopVoice。
  */
@scala.inline
def pauseVoice(): scala.Unit = typings.weappApi.mod.wx.^.asInstanceOf[js.Dynamic].applyDynamic("pauseVoice")().asInstanceOf[scala.Unit]

/** 播放音乐，同时只能有一首音乐正在播放。 */
@scala.inline
def playBackgroundAudio(options: typings.weappApi.mod.wx.PlayBackgroundAudioOptions): scala.Unit = typings.weappApi.mod.wx.^.asInstanceOf[js.Dynamic].applyDynamic("playBackgroundAudio")(options.asInstanceOf[js.Any]).asInstanceOf[scala.Unit]

/**
  * 开始播放语音，同时只允许一个语音文件正在播放，
  * 如果前一个语音文件还没播放完，将中断前一个语音播放。
  */
@scala.inline
def playVoice(options: typings.weappApi.mod.wx.PlayVoiceOptions): scala.Unit = typings.weappApi.mod.wx.^.asInstanceOf[js.Dynamic].applyDynamic("playVoice")(options.asInstanceOf[js.Any]).asInstanceOf[scala.Unit]

/**
  * 预览图片。
  */
@scala.inline
def previewImage(options: typings.weappApi.mod.wx.PreviewImageOptions): scala.Unit = typings.weappApi.mod.wx.^.asInstanceOf[js.Dynamic].applyDynamic("previewImage")(options.asInstanceOf[js.Any]).asInstanceOf[scala.Unit]

/**
  * 关闭所有页面，打开到应用内的某个页面
  */
@scala.inline
def reLaunch(options: typings.weappApi.mod.wx.routerOptions): scala.Unit = typings.weappApi.mod.wx.^.asInstanceOf[js.Dynamic].applyDynamic("reLaunch")(options.asInstanceOf[js.Any]).asInstanceOf[scala.Unit]

/**
  * 关闭当前页面，跳转到应用内的某个页面。但是不允许跳转到 tabbar 页面。
  */
@scala.inline
def redirectTo(options: typings.weappApi.mod.wx.routerOptions): scala.Unit = typings.weappApi.mod.wx.^.asInstanceOf[js.Dynamic].applyDynamic("redirectTo")(options.asInstanceOf[js.Any]).asInstanceOf[scala.Unit]

/**
  * 移除 tabBar 某一项右上角的文本
  * @param options
  */
@scala.inline
def removeTabBarBadge(options: typings.weappApi.mod.wx.TabBarRedDotOptions): scala.Unit = typings.weappApi.mod.wx.^.asInstanceOf[js.Dynamic].applyDynamic("removeTabBarBadge")(options.asInstanceOf[js.Any]).asInstanceOf[scala.Unit]

/**
  * wx.request发起的是https请求。一个微信小程序，同时只能有5个网络请求连接。
  */
@scala.inline
def request(options: typings.weappApi.mod.wx.RequestOptions): typings.weappApi.mod.wx.RequestTask = typings.weappApi.mod.wx.^.asInstanceOf[js.Dynamic].applyDynamic("request")(options.asInstanceOf[js.Any]).asInstanceOf[typings.weappApi.mod.wx.RequestTask]

//  支付
/**
  * 发起微信支付。
  */
@scala.inline
def requestPayment(options: typings.weappApi.mod.wx.RequestPaymentOptions): scala.Unit = typings.weappApi.mod.wx.^.asInstanceOf[js.Dynamic].applyDynamic("requestPayment")(options.asInstanceOf[js.Any]).asInstanceOf[scala.Unit]

/**
  * 保存文件到本地。
  */
@scala.inline
def saveFile(options: typings.weappApi.mod.wx.SaveFileOptions): scala.Unit = typings.weappApi.mod.wx.^.asInstanceOf[js.Dynamic].applyDynamic("saveFile")(options.asInstanceOf[js.Any]).asInstanceOf[scala.Unit]

/**
  * 控制音乐播放进度。
  */
@scala.inline
def seekBackgroundAudio(options: typings.weappApi.mod.wx.SeekBackgroundAudioOptions): scala.Unit = typings.weappApi.mod.wx.^.asInstanceOf[js.Dynamic].applyDynamic("seekBackgroundAudio")(options.asInstanceOf[js.Any]).asInstanceOf[scala.Unit]

/**
  * 通过 WebSocket 连接发送数据，需要先 wx.connectSocket，
  * 并在 wx.onSocketOpen 回调之后才能发送。
  */
@scala.inline
def sendSocketMessage(options: typings.weappApi.mod.wx.SendSocketMessageOptions): scala.Unit = typings.weappApi.mod.wx.^.asInstanceOf[js.Dynamic].applyDynamic("sendSocketMessage")(options.asInstanceOf[js.Any]).asInstanceOf[scala.Unit]

@scala.inline
def setBackgroundColor(): scala.Unit = typings.weappApi.mod.wx.^.asInstanceOf[js.Dynamic].applyDynamic("setBackgroundColor")().asInstanceOf[scala.Unit]

//  背景
@scala.inline
def setBackgroundTextStyle(): scala.Unit = typings.weappApi.mod.wx.^.asInstanceOf[js.Dynamic].applyDynamic("setBackgroundTextStyle")().asInstanceOf[scala.Unit]

// 导航栏
@scala.inline
def setNavigationBarColor(): scala.Unit = typings.weappApi.mod.wx.^.asInstanceOf[js.Dynamic].applyDynamic("setNavigationBarColor")().asInstanceOf[scala.Unit]

/**
  * 动态设置当前页面的标题
  * @param options
  */
@scala.inline
def setNavigationBarTitle(options: typings.weappApi.mod.wx.NavigationBarTitleOptions): scala.Unit = typings.weappApi.mod.wx.^.asInstanceOf[js.Dynamic].applyDynamic("setNavigationBarTitle")(options.asInstanceOf[js.Any]).asInstanceOf[scala.Unit]
/**
  * 动态设置当前页面的标题。
  */
@scala.inline
def setNavigationBarTitle(options: typings.weappApi.mod.wx.SetNavigationBarTitleOptions): scala.Unit = typings.weappApi.mod.wx.^.asInstanceOf[js.Dynamic].applyDynamic("setNavigationBarTitle")(options.asInstanceOf[js.Any]).asInstanceOf[scala.Unit]

/**
  * 将数据存储在本地缓存中指定的 key 中，
  * 会覆盖掉原来该 key 对应的内容，这是一个异步接口。
  */
@scala.inline
def setStorage(options: typings.weappApi.mod.wx.SetStorageOptions): scala.Unit = typings.weappApi.mod.wx.^.asInstanceOf[js.Dynamic].applyDynamic("setStorage")(options.asInstanceOf[js.Any]).asInstanceOf[scala.Unit]

@scala.inline
def setStorageSync(key: java.lang.String, data: java.lang.String): scala.Unit = (typings.weappApi.mod.wx.^.asInstanceOf[js.Dynamic].applyDynamic("setStorageSync")(key.asInstanceOf[js.Any], data.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
/**
  * 将 data 存储在本地缓存中指定的 key 中，
  * 会覆盖掉原来该 key 对应的内容，这是一个同步接口。
  *
  * @param {string} key 本地缓存中的指定的 key
  * @param {(Object | string)} data 需要存储的内容
  */
@scala.inline
def setStorageSync(key: java.lang.String, data: js.Any): scala.Unit = (typings.weappApi.mod.wx.^.asInstanceOf[js.Dynamic].applyDynamic("setStorageSync")(key.asInstanceOf[js.Any], data.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]

/**
  * 为 tabBar 某一项的右上角添加文本
  * @param options
  */
@scala.inline
def setTabBarBadge(options: typings.weappApi.mod.wx.TabBarBadgeOptions): scala.Unit = typings.weappApi.mod.wx.^.asInstanceOf[js.Dynamic].applyDynamic("setTabBarBadge")(options.asInstanceOf[js.Any]).asInstanceOf[scala.Unit]

/**
  * 动态设置 tabBar 某一项的内容
  * @param options
  */
@scala.inline
def setTabBarItem(options: typings.weappApi.mod.wx.TabBarItemOptions): scala.Unit = typings.weappApi.mod.wx.^.asInstanceOf[js.Dynamic].applyDynamic("setTabBarItem")(options.asInstanceOf[js.Any]).asInstanceOf[scala.Unit]

/**
  * 动态设置tabBar的整体样式
  */
@scala.inline
def setTabBarStyle(options: typings.weappApi.mod.wx.TabBarItemOptions): scala.Unit = typings.weappApi.mod.wx.^.asInstanceOf[js.Dynamic].applyDynamic("setTabBarStyle")(options.asInstanceOf[js.Any]).asInstanceOf[scala.Unit]

/**
  * 显示操作菜单
  */
@scala.inline
def showActionSheet(options: typings.weappApi.mod.wx.ActionSheetOptions): scala.Unit = typings.weappApi.mod.wx.^.asInstanceOf[js.Dynamic].applyDynamic("showActionSheet")(options.asInstanceOf[js.Any]).asInstanceOf[scala.Unit]

/**
  * 显示 loading 提示框。需主动调用 wx.hideLoading 才能关闭提示框
  * @param options
  */
@scala.inline
def showLoading(options: typings.weappApi.mod.wx.LoadingOptions): scala.Unit = typings.weappApi.mod.wx.^.asInstanceOf[js.Dynamic].applyDynamic("showLoading")(options.asInstanceOf[js.Any]).asInstanceOf[scala.Unit]

/**
  * 显示模态对话框
  * @param options
  */
@scala.inline
def showModal(options: typings.weappApi.mod.wx.ModalOptions): scala.Unit = typings.weappApi.mod.wx.^.asInstanceOf[js.Dynamic].applyDynamic("showModal")(options.asInstanceOf[js.Any]).asInstanceOf[scala.Unit]

/**
  * 在当前页面显示导航条加载动画。
  */
@scala.inline
def showNavigationBarLoading(): scala.Unit = typings.weappApi.mod.wx.^.asInstanceOf[js.Dynamic].applyDynamic("showNavigationBarLoading")().asInstanceOf[scala.Unit]
/**
  * 在当前页面显示导航条加载动画
  */
@scala.inline
def showNavigationBarLoading(options: typings.weappApi.mod.wx.CommonCallbackOptions): scala.Unit = typings.weappApi.mod.wx.^.asInstanceOf[js.Dynamic].applyDynamic("showNavigationBarLoading")(options.asInstanceOf[js.Any]).asInstanceOf[scala.Unit]

/**
  * 显示tabBar
  */
@scala.inline
def showTabBar(options: typings.weappApi.mod.wx.TabBarAnimationOptions): scala.Unit = typings.weappApi.mod.wx.^.asInstanceOf[js.Dynamic].applyDynamic("showTabBar")(options.asInstanceOf[js.Any]).asInstanceOf[scala.Unit]

/**
  * 显示 tabBar 某一项的右上角的红点
  * @param options
  */
@scala.inline
def showTabBarRedDot(options: typings.weappApi.mod.wx.TabBarRedDotOptions): scala.Unit = typings.weappApi.mod.wx.^.asInstanceOf[js.Dynamic].applyDynamic("showTabBarRedDot")(options.asInstanceOf[js.Any]).asInstanceOf[scala.Unit]

/**
  * 显示消息提示框
  * @param options
  */
@scala.inline
def showToast(options: typings.weappApi.mod.wx.ToastOptions): scala.Unit = typings.weappApi.mod.wx.^.asInstanceOf[js.Dynamic].applyDynamic("showToast")(options.asInstanceOf[js.Any]).asInstanceOf[scala.Unit]

/**
  * 开始下拉刷新。调用后触发下拉刷新动画，效果与用户手动下拉刷新一致。
  */
@scala.inline
def startPullDownRefresh(): scala.Unit = typings.weappApi.mod.wx.^.asInstanceOf[js.Dynamic].applyDynamic("startPullDownRefresh")().asInstanceOf[scala.Unit]
@scala.inline
def startPullDownRefresh(options: typings.weappApi.mod.wx.CommonCallbackOptions): scala.Unit = typings.weappApi.mod.wx.^.asInstanceOf[js.Dynamic].applyDynamic("startPullDownRefresh")(options.asInstanceOf[js.Any]).asInstanceOf[scala.Unit]

/**
  * 开始录音。当主动调用wx.stopRecord，
  * 或者录音超过1分钟时自动结束录音，返回录音文件的临时文件路径。
  * 注：文件的临时路径，在小程序本次启动期间可以正常使用，
  * 如需持久保存，需在主动调用wx.saveFile，在小程序下次启动时才能访问得到。
  */
@scala.inline
def startRecord(options: typings.weappApi.mod.wx.StartRecordOptions): scala.Unit = typings.weappApi.mod.wx.^.asInstanceOf[js.Dynamic].applyDynamic("startRecord")(options.asInstanceOf[js.Any]).asInstanceOf[scala.Unit]

/**
  * 停止播放音乐。
  */
@scala.inline
def stopBackgroundAudio(): scala.Unit = typings.weappApi.mod.wx.^.asInstanceOf[js.Dynamic].applyDynamic("stopBackgroundAudio")().asInstanceOf[scala.Unit]

//  下拉刷新
/**
  * 停止当前页面下拉刷新。
  */
@scala.inline
def stopPullDownRefresh(): scala.Unit = typings.weappApi.mod.wx.^.asInstanceOf[js.Dynamic].applyDynamic("stopPullDownRefresh")().asInstanceOf[scala.Unit]
@scala.inline
def stopPullDownRefresh(options: typings.weappApi.mod.wx.CommonCallbackOptions): scala.Unit = typings.weappApi.mod.wx.^.asInstanceOf[js.Dynamic].applyDynamic("stopPullDownRefresh")(options.asInstanceOf[js.Any]).asInstanceOf[scala.Unit]

/**
  * ​ 主动调用停止录音。
  */
@scala.inline
def stopRecord(): scala.Unit = typings.weappApi.mod.wx.^.asInstanceOf[js.Dynamic].applyDynamic("stopRecord")().asInstanceOf[scala.Unit]

/**
  * 结束播放语音。
  */
@scala.inline
def stopVoice(): scala.Unit = typings.weappApi.mod.wx.^.asInstanceOf[js.Dynamic].applyDynamic("stopVoice")().asInstanceOf[scala.Unit]

/**
  * 跳转到 tabBar 页面，并关闭其他所有非 tabBar 页面
  * @param options
  */
@scala.inline
def switchTab(options: typings.weappApi.mod.wx.routerOptions): scala.Unit = typings.weappApi.mod.wx.^.asInstanceOf[js.Dynamic].applyDynamic("switchTab")(options.asInstanceOf[js.Any]).asInstanceOf[scala.Unit]

/**
  * 将本地资源上传到开发者服务器。
  * 如页面通过 wx.chooseImage 等接口获取到一个本地资源的临时文件路径后，
  * 可通过此接口将本地资源上传到指定服务器。
  * 客户端发起一个 HTTPS POST 请求，
  * 其中 Content-Type 为 multipart/form-data 。
  */
@scala.inline
def uploadFile(options: typings.weappApi.mod.wx.UploadFileOptions): typings.weappApi.mod.wx.UploadTask = typings.weappApi.mod.wx.^.asInstanceOf[js.Dynamic].applyDynamic("uploadFile")(options.asInstanceOf[js.Any]).asInstanceOf[typings.weappApi.mod.wx.UploadTask]

type AccelerometerChangeCallback = js.Function1[/* res */ typings.weappApi.mod.wx.AccelerometerData, scala.Unit]

// 界面
// 交互
// tapIndex为用户点击的按钮序号，从上到下的顺序，从0开始
type ActionSheetSuccessCallback = js.Function1[/* res */ typings.weappApi.anon.TapIndex, scala.Unit]

type CompassChangeCallback = js.Function1[/* res */ typings.weappApi.mod.wx.CompassData, scala.Unit]

type DataResponseCallback = js.Function1[/* res */ typings.weappApi.mod.wx.DataResponse, scala.Unit]

type ErrorCallback = js.Function1[/* error */ js.Any, scala.Unit]

type EventCallback = js.Function1[/* event */ js.Any, scala.Unit]

type GetBackgroundAudioPlayerStateSuccessCallback = js.Function1[/* state */ typings.weappApi.mod.wx.BackgroundAudioPlayerState, scala.Unit]

// import startPullDownRefresh = swan.startPullDownRefresh;
type NoneParamCallback = js.Function0[scala.Unit]

type OneParamCallback = js.Function1[/* data */ js.Any, scala.Unit]

type PaymentSignType = typings.weappApi.weappApiStrings.MD5

//  网络
//  发起请求
type RequestHeader = org.scalablytyped.runtime.StringDictionary[java.lang.String]

type ResponseCallback = js.Function1[/* res */ js.Any, scala.Unit]

type StorageInfoCallback = js.Function1[/* res */ typings.weappApi.mod.wx.StorageInfoOptions, scala.Unit]

type TempFileResponseCallback = js.Function1[/* res */ typings.weappApi.mod.wx.TempFileResponse, scala.Unit]

type onLaunchCallback = js.Function1[/* options */ typings.weappApi.mod.wx.onLaunchOptions, scala.Unit]

type onShowOptions = typings.weappApi.mod.wx.onLaunchOptions

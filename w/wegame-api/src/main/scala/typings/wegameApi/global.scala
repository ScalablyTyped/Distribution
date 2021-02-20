package typings.wegameApi

import typings.std.CanvasRenderingContext2D
import typings.wegameApi.anon.AdUnitId
import typings.wegameApi.anon.AdUnitIdStyle
import typings.wegameApi.anon.Alpha
import typings.wegameApi.anon.Altitude
import typings.wegameApi.anon.AudioSources
import typings.wegameApi.anon.AuthSetting
import typings.wegameApi.anon.Autoplay
import typings.wegameApi.anon.Bottom
import typings.wegameApi.anon.BuyQuantity
import typings.wegameApi.anon.CallbacksWithTypeopenIdLi
import typings.wegameApi.anon.CallbacksmuteConfigmuteMi
import typings.wegameApi.anon.Callbacksxnumberundefined
import typings.wegameApi.anon.CancelColor
import typings.wegameApi.anon.Code
import typings.wegameApi.anon.Complete
import typings.wegameApi.anon.CompleteFail
import typings.wegameApi.anon.ConfirmHold
import typings.wegameApi.anon.Count
import typings.wegameApi.anon.Current
import typings.wegameApi.anon.Direction
import typings.wegameApi.anon.EnableDebug
import typings.wegameApi.anon.ErrCodeErrMsg
import typings.wegameApi.anon.ExtConfig
import typings.wegameApi.anon.Fail
import typings.wegameApi.anon.FailShareTicket
import typings.wegameApi.anon.FailStyle
import typings.wegameApi.anon.FailSuccess
import typings.wegameApi.anon.FilePath
import typings.wegameApi.anon.Icon
import typings.wegameApi.anon.ImageUrl
import typings.wegameApi.anon.ImageUrlId
import typings.wegameApi.anon.IsConnected
import typings.wegameApi.anon.ItemColor
import typings.wegameApi.anon.Iv
import typings.wegameApi.anon.KeyList
import typings.wegameApi.anon.Level
import typings.wegameApi.anon.List
import typings.wegameApi.anon.Mask
import typings.wegameApi.anon.Name
import typings.wegameApi.anon.OpenIdList
import typings.wegameApi.anon.Query
import typings.wegameApi.anon.Scope
import typings.wegameApi.anon.SendMessageImg
import typings.wegameApi.anon.ShareMessageToFriendScene
import typings.wegameApi.anon.ShareTicket
import typings.wegameApi.anon.SizeType
import typings.wegameApi.anon.Stack
import typings.wegameApi.anon.Style
import typings.wegameApi.anon.StyleSuccess
import typings.wegameApi.anon.Success
import typings.wegameApi.anon.Text
import typings.wegameApi.anon.Title
import typings.wegameApi.anon.TodayPlayedTime
import typings.wegameApi.anon.Value
import typings.wegameApi.anon.ValueString
import typings.wegameApi.anon.WindowHeight
import typings.wegameApi.anon.WithShareTicket
import typings.wegameApi.anon.X
import typings.wegameApi.anon.`3`
import typings.wegameApi.anon.appIdstringpathstringunde
import typings.wegameApi.anon.cardListReadonlyArraycard
import typings.wegameApi.anon.cardListReadonlyArraycardCardList
import typings.wegameApi.anon.intervalgameuinormalCallb
import typings.wegameApi.anon.keyListArraystringCallbac
import typings.wegameApi.anon.tmplIdsReadonlyArraystrin
import typings.wegameApi.wx.types.AccelerometerParams
import typings.wegameApi.wx.types.BatteryInfo
import typings.wegameApi.wx.types.Callbacks
import typings.wegameApi.wx.types.CallbacksWithType
import typings.wegameApi.wx.types.ClipboardData
import typings.wegameApi.wx.types.DownfileParams
import typings.wegameApi.wx.types.GetStorageParams
import typings.wegameApi.wx.types.Image
import typings.wegameApi.wx.types.LaunchOption
import typings.wegameApi.wx.types.LineHeightParams
import typings.wegameApi.wx.types.NewUserInfoParam
import typings.wegameApi.wx.types.OldUserInfoParam
import typings.wegameApi.wx.types.RemoveStorageParams
import typings.wegameApi.wx.types.RequestParams
import typings.wegameApi.wx.types.SetClipboardDataParams
import typings.wegameApi.wx.types.SetKeepScreenOnParams
import typings.wegameApi.wx.types.SetScreenBrightnessParams
import typings.wegameApi.wx.types.SetStorageParams
import typings.wegameApi.wx.types.ShareOption
import typings.wegameApi.wx.types.SocketCloseParams
import typings.wegameApi.wx.types.SocketConnectParams
import typings.wegameApi.wx.types.SocketErrorCallback
import typings.wegameApi.wx.types.SocketMessageCallback
import typings.wegameApi.wx.types.SocketOpenCallback
import typings.wegameApi.wx.types.SocketSendParams
import typings.wegameApi.wx.types.StorageInfo
import typings.wegameApi.wx.types.SystemInfo
import typings.wegameApi.wx.types.TouchData
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object global {
  
  /**
    * banner 广告组件。banner 广告组件是一个原生组件，层级比上屏 Canvas 高，会覆盖在上屏 Canvas 上。banner 广告组件默认是隐藏的，需要调用 BannerAd.show() 将其显示。banner 广告会根据开发者设置的宽度进行等比缩放，缩放后的尺寸将通过 BannerAd.onResize() 事件中提供。
    */
  @JSGlobal("BannerAd")
  @js.native
  class BannerAd ()
    extends typings.wegameApi.BannerAd
  
  /**
    * 相机对象
    */
  @JSGlobal("Camera")
  @js.native
  class Camera ()
    extends typings.wegameApi.Camera
  
  @JSGlobal("Canvas")
  @js.native
  class Canvas ()
    extends typings.wegameApi.Canvas
  
  @JSGlobal("CreatedButton")
  @js.native
  class CreatedButton ()
    extends typings.wegameApi.CreatedButton
  
  @JSGlobal("DownloadTask")
  @js.native
  class DownloadTask ()
    extends typings.wegameApi.DownloadTask
  
  @JSGlobal("FeedbackButton")
  @js.native
  class FeedbackButton ()
    extends typings.wegameApi.FeedbackButton
  
  @JSGlobal("FileSystemManager")
  @js.native
  class FileSystemManager ()
    extends typings.wegameApi.FileSystemManager
  
  @JSGlobal("GameClubButton")
  @js.native
  class GameClubButton ()
    extends typings.wegameApi.GameClubButton
  
  @JSGlobal("ImageFile")
  @js.native
  class ImageFile ()
    extends typings.wegameApi.ImageFile
  
  /**
    * InnerAudioContext 实例，可通过 wx.createInnerAudioContext 接口获取实例。
    */
  @JSGlobal("InnerAudioContext")
  @js.native
  class InnerAudioContext ()
    extends typings.wegameApi.InnerAudioContext
  
  @JSGlobal("InterstitialAd")
  @js.native
  class InterstitialAd ()
    extends typings.wegameApi.InterstitialAd
  
  @JSGlobal("KVData")
  @js.native
  class KVData ()
    extends typings.wegameApi.KVData
  
  @JSGlobal("LoadSubpackageTask")
  @js.native
  class LoadSubpackageTask ()
    extends typings.wegameApi.LoadSubpackageTask
  
  /**
    * 日志管理类，最多保存5M的日志内容，超过5M后，旧的日志内容会被删除。
    * 对于小程序，用户可以通过使用 button 组件的 open-type="feedback" 来上传打印的日志。
    * 对于小游戏，用户可以通过使用 wx.createFeedbackButton 来创建上传打印的日志的按钮。
    * 开发者可以通过小程序管理后台左侧菜单“反馈管理”页面查看相关打印日志。
    * 基础库默认会把 App、Page 的生命周期函数和 wx 命名空间下的函数调用写入日志。
    */
  @JSGlobal("LogManager")
  @js.native
  class LogManager ()
    extends typings.wegameApi.LogManager
  
  @JSGlobal("OpenDataContext")
  @js.native
  class OpenDataContext ()
    extends typings.wegameApi.OpenDataContext
  
  @JSGlobal("OpenSettingButton")
  @js.native
  class OpenSettingButton ()
    extends typings.wegameApi.OpenSettingButton
  
  @JSGlobal("RecorderManager")
  @js.native
  class RecorderManager ()
    extends typings.wegameApi.RecorderManager
  
  @JSGlobal("RequestTask")
  @js.native
  class RequestTask ()
    extends typings.wegameApi.RequestTask
  
  @JSGlobal("RewardedVideoAd")
  @js.native
  class RewardedVideoAd ()
    extends typings.wegameApi.InterstitialAd
  
  @JSGlobal("SocketTask")
  @js.native
  class SocketTask ()
    extends typings.wegameApi.SocketTask
  
  @JSGlobal("Stats")
  @js.native
  class Stats ()
    extends typings.wegameApi.Stats
  
  /**
    * 一个 UDP Socket 实例，默认使用 IPv4 协议。
    * 错误码：
    *    -1  系统错误
    *    -2  socket接口错误
    *    -3  发送失败，无接口权限
    *     1  发送失败，参数错误，address不合法
    *     2  发送失败，参数错误，port不合法
    */
  @JSGlobal("UDPSocket")
  @js.native
  class UDPSocket ()
    extends typings.wegameApi.UDPSocket
  
  @JSGlobal("UpdateManager")
  @js.native
  class UpdateManager ()
    extends typings.wegameApi.UpdateManager
  
  @JSGlobal("UploadTask")
  @js.native
  class UploadTask ()
    extends typings.wegameApi.UploadTask
  
  @JSGlobal("UserGameData")
  @js.native
  class UserGameData ()
    extends typings.wegameApi.UserGameData
  
  @JSGlobal("UserInfoButton")
  @js.native
  class UserInfoButton ()
    extends typings.wegameApi.UserInfoButton
  
  @JSGlobal("Video")
  @js.native
  class Video ()
    extends typings.wegameApi.Video
  
  @JSGlobal("WxPerformance")
  @js.native
  class WxPerformance ()
    extends typings.wegameApi.WxPerformance
  
  @JSGlobal("WxRenderingContext")
  @js.native
  class WxRenderingContext () extends CanvasRenderingContext2D
  
  /**
    * IOS及安卓不支持：
    *     pixelStorei 当第一个参数是 gl.UNPACK_COLORSPACE_CONVERSION_WEBGL 时不支持
    *     compressedTexImage2D不支持
    *     compressedTexSubImage2D不支持
    * 安卓不支持：
    *     getExtension
    *     getSupportedExtensions
    */
  @JSGlobal("WxWebGLRenderingContext")
  @js.native
  class WxWebGLRenderingContext ()
    extends typings.wegameApi.WxWebGLRenderingContext
  
  @JSGlobal("WxWorker")
  @js.native
  class WxWorker ()
    extends typings.wegameApi.WxWorker
  
  // --渲染
  @JSGlobal("cancelAnimationFrame")
  @js.native
  def cancelAnimationFrame(requestID: Double): Unit = js.native
  
  @JSGlobal("clearInterval")
  @js.native
  def clearInterval(intervalID: Double): Unit = js.native
  
  // --定时器
  @JSGlobal("clearTimeout")
  @js.native
  def clearTimeout(timeoutID: Double): Unit = js.native
  
  @JSGlobal("requestAnimationFrame")
  @js.native
  def requestAnimationFrame(callback: js.Function0[Unit]): Double = js.native
  
  @JSGlobal("setInterval")
  @js.native
  def setInterval(fn: js.Function0[Unit], delay: Double, rest: js.Any*): Double = js.native
  
  @JSGlobal("setTimeout")
  @js.native
  def setTimeout(fn: js.Function0[Unit], delay: Double, rest: js.Any*): Double = js.native
  
  object wx {
    
    // TODO: success回调里的res的结构官方文档没写
    /**
      * 批量添加卡券。只有通过 认证 的小程序或文化互动类目的小游戏才能使用。更多文档请参考 微信卡券接口文档（https://mp.weixin.qq.com/cgi-bin/announce?action=getannouncement&key=1490190158&version=1&lang=zh_CN&platform=2）。
      */
    @JSGlobal("wx.addCard")
    @js.native
    def addCard(param: cardListReadonlyArraycardCardList): Unit = js.native
    
    // --授权
    /**
      * 提前向用户发起授权请求。调用后会立刻弹窗询问用户是否同意授权小程序使用某项功能或获取用户的某些数据，但不会实际调用对应接口。如果用户之前已经同意授权，则不会出现弹窗，直接返回成功。
      */
    @JSGlobal("wx.authorize")
    @js.native
    def authorize(param: Scope): Unit = js.native
    
    // --防沉迷
    /**
      * 根据用户当天游戏时间判断用户是否需要休息
      */
    @JSGlobal("wx.checkIsUserAdvisedToRest")
    @js.native
    def checkIsUserAdvisedToRest(param: TodayPlayedTime): Unit = js.native
    
    // --登录
    /**
      * 通过 wx.login 接口获得的用户登录态拥有一定的时效性。用户越久未使用小程序，用户登录态越有可能失效。反之如果用户一直在使用小程序，则用户登录态一直保持有效。具体时效逻辑由微信维护，对开发者透明。开发者只需要调用 wx.checkSession 接口检测当前用户登录态是否有效。登录态过期后开发者可以再调用 wx.login 获取新的用户登录态。
      */
    @JSGlobal("wx.checkSession")
    @js.native
    def checkSession(cb: Callbacks): Unit = js.native
    
    // --图片
    /**
      * 从本地相册选择图片或使用相机拍照。
      */
    @JSGlobal("wx.chooseImage")
    @js.native
    def chooseImage(param: SizeType): Unit = js.native
    
    // --数据缓存
    /**
      * 清理本地数据缓存
      */
    @JSGlobal("wx.clearStorage")
    @js.native
    def clearStorage(param: Callbacks): Unit = js.native
    
    /**
      * clearStorage的同步版本
      */
    @JSGlobal("wx.clearStorageSync")
    @js.native
    def clearStorageSync(): Unit = js.native
    
    /**
      * 关闭WebSocket
      */
    @JSGlobal("wx.closeSocket")
    @js.native
    def closeSocket(param: SocketCloseParams): Unit = js.native
    
    // --websocket
    /**
      * 创建一个 WebSocket 连接。最多同时存在 5 个 WebSocket 连接。
      */
    @JSGlobal("wx.connectSocket")
    @js.native
    def connectSocket(param: SocketConnectParams): typings.wegameApi.SocketTask = js.native
    
    // --广告
    /**
      * 创建 banner 广告组件。请通过 wx.getSystemInfoSync() 返回对象的 SDKVersion 判断基础库版本号 >= 2.0.4 后再使用该 API。同时，开发者工具上暂不支持调试该 API，请直接在真机上进行调试。
      */
    @JSGlobal("wx.createBannerAd")
    @js.native
    def createBannerAd(param: AdUnitIdStyle): typings.wegameApi.BannerAd = js.native
    
    // --相机
    /**
      * 创建相机
      * @param param 创建相机所需的初始化信息
      */
    @JSGlobal("wx.createCamera")
    @js.native
    def createCamera(): typings.wegameApi.Camera = js.native
    @JSGlobal("wx.createCamera")
    @js.native
    def createCamera(param: Callbacksxnumberundefined): typings.wegameApi.Camera = js.native
    
    /**
      * 创建一个画布对象。首次调用创建的是显示在屏幕上的画布，之后调用创建的都是离屏画布。
      */
    @JSGlobal("wx.createCanvas")
    @js.native
    def createCanvas(): typings.wegameApi.Canvas = js.native
    
    // --意见反馈
    /**
      * 用户点击后打开意见反馈页面的按钮
      */
    @JSGlobal("wx.createFeedbackButton")
    @js.native
    def createFeedbackButton(param: Text): typings.wegameApi.FeedbackButton = js.native
    
    // TODO: GameIcon
    /**
      * 创建小游戏推荐banner组件。请通过 wx.getSystemInfoSync() 返回对象的 SDKVersion 判断基础库版本号 >= 2.7.5 后再使用该 API。每次调用该方法都会返回一个全新的实例。
      */
    @JSGlobal("wx.createGameBanner")
    @js.native
    def createGameBanner(param: Style): js.Any = js.native
    
    // --游戏圈
    /**
      * 创建游戏圈按钮。游戏圈按钮被点击后会跳转到小游戏的游戏圈。更多关于游戏圈的信息见 游戏圈使用指南
      */
    @JSGlobal("wx.createGameClubButton")
    @js.native
    def createGameClubButton(param: Icon): typings.wegameApi.GameClubButton = js.native
    
    // TODO: GamePortal
    /**
      * 创建小游戏推荐icon组件。请通过 wx.getSystemInfoSync() 返回对象的 SDKVersion 判断基础库版本号 >= 2.8.2 后再使用该 API。每次调用该方法都会返回一个全新的实例。
      */
    @JSGlobal("wx.createGameIcon")
    @js.native
    def createGameIcon(param: Count): js.Any = js.native
    
    // --推荐弹窗
    /**
      * 创建小游戏推荐弹窗组件。请通过 wx.getSystemInfoSync() 返回对象的 SDKVersion 判断基础库版本号 >= 2.7.5 后再使用该 API。每次调用该方法都会返回一个全新的实例。
      */
    @JSGlobal("wx.createGamePortal")
    @js.native
    def createGamePortal(param: AdUnitId): js.Any = js.native
    
    // TODO: GameRecorder
    /**
      * 创建游戏对局回放分享按钮，返回一个单例对象。按钮在被用户点击后会发起对最近一次录制完成的游戏对局回放的分享。
      */
    @JSGlobal("wx.createGameRecorderShareButton")
    @js.native
    def createGameRecorderShareButton(): js.Any = js.native
    
    /**
      * 创建一个图片对象
      */
    @JSGlobal("wx.createImage")
    @js.native
    def createImage(): Image = js.native
    
    // --音频
    /**
      * 创建一个 InnerAudioContext 实例
      */
    @JSGlobal("wx.createInnerAudioContext")
    @js.native
    def createInnerAudioContext(): typings.wegameApi.InnerAudioContext = js.native
    
    /**
      * 创建插屏广告组件。请通过 wx.getSystemInfoSync() 返回对象的 SDKVersion 判断基础库版本号后再使用该 API。每次调用该方法创建插屏广告都会返回一个全新的实例（小程序端的插屏广告实例不允许跨页面使用）。
      */
    @JSGlobal("wx.createInterstitialAd")
    @js.native
    def createInterstitialAd(param: AdUnitId): typings.wegameApi.InterstitialAd = js.native
    
    // --设置
    /**
      * 创建打开设置页面的按钮
      */
    @JSGlobal("wx.createOpenSettingButton")
    @js.native
    def createOpenSettingButton(param: Text): typings.wegameApi.OpenSettingButton = js.native
    
    /**
      * 创建激励视频广告组件。请通过 wx.getSystemInfoSync() 返回对象的 SDKVersion 判断基础库版本号 >= 2.0.4 后再使用该 API。同时，开发者工具上暂不支持调试该 API，请直接在真机上进行调试。
      */
    @JSGlobal("wx.createRewardedVideoAd")
    @js.native
    def createRewardedVideoAd(param: AdUnitId): typings.wegameApi.RewardedVideoAd = js.native
    
    // --UDP通信
    /**
      * 创建一个 UDP Socket 实例
      */
    @JSGlobal("wx.createUDPSocket")
    @js.native
    def createUDPSocket(): typings.wegameApi.UDPSocket = js.native
    
    // --用户信息
    @JSGlobal("wx.createUserInfoButton")
    @js.native
    def createUserInfoButton(param: typings.wegameApi.anon.Image): typings.wegameApi.UserInfoButton = js.native
    
    // --视频
    @JSGlobal("wx.createVideo")
    @js.native
    def createVideo(param: Autoplay): typings.wegameApi.Video = js.native
    
    // --Worker
    /**
      * 创建一个 Worker 线程，目前限制最多只能创建一个 Worker，创建下一个 Worker 前请调用 Worker.terminate
      */
    @JSGlobal("wx.createWorker")
    @js.native
    def createWorker(): typings.wegameApi.WxWorker = js.native
    
    // --网络
    /**
      * 下载文件
      */
    @JSGlobal("wx.downloadFile")
    @js.native
    def downloadFile(param: DownfileParams): typings.wegameApi.DownloadTask = js.native
    
    /**
      * 系统环境变量
      */
    object env {
      
      @JSGlobal("wx.env")
      @js.native
      val ^ : js.Any = js.native
      
      /**
        * 用户下载数据根目录
        */
      @JSGlobal("wx.env.USER_DATA_PATH")
      @js.native
      def USER_DATA_PATH: String = js.native
      @scala.inline
      def USER_DATA_PATH_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("USER_DATA_PATH")(x.asInstanceOf[js.Any])
    }
    
    // --生命周期
    @JSGlobal("wx.exitMiniProgram")
    @js.native
    def exitMiniProgram(): Unit = js.native
    @JSGlobal("wx.exitMiniProgram")
    @js.native
    def exitMiniProgram(cb: Callbacks): Unit = js.native
    
    /**
      * 退出（销毁）实时语音通话
      */
    @JSGlobal("wx.exitVoIPChat")
    @js.native
    def exitVoIPChat(): Unit = js.native
    @JSGlobal("wx.exitVoIPChat")
    @js.native
    def exitVoIPChat(callbacks: Callbacks): Unit = js.native
    
    /**
      * 获取当前支持的音频输入源
      */
    @JSGlobal("wx.getAvailableAudioSources")
    @js.native
    def getAvailableAudioSources(param: CallbacksWithType[AudioSources]): Unit = js.native
    
    // --电量
    /**
      * 获取设备电量。同步 API wx.getBatteryInfoSync 在 iOS 上不可用。
      */
    @JSGlobal("wx.getBatteryInfo")
    @js.native
    def getBatteryInfo(cb: CallbacksWithType[BatteryInfo]): Unit = js.native
    
    /**
      * IOS上这个同步API无法使用
      */
    @JSGlobal("wx.getBatteryInfoSync")
    @js.native
    def getBatteryInfoSync(): BatteryInfo = js.native
    
    // --剪贴板
    /**
      * 取得系统剪贴板的内容
      */
    @JSGlobal("wx.getClipboardData")
    @js.native
    def getClipboardData(cb: CallbacksWithType[ClipboardData]): Unit = js.native
    
    // TODO: GameRecorderShareButton
    // --第三方平台
    /**
      * 获取第三方平台自定义的数据字段。
      * Tips: 本接口暂时无法通过 wx.canIUse 判断是否兼容，开发者需要自行判断 wx.getExtConfig 是否存在来兼容，示例：
      *       if (wx.getExtConfig) {
      *          wx.getExtConfig({
      *              success (res) {
      *                  console.log(res.extConfig)
      *              }
      *         })
      *       }
      */
    @JSGlobal("wx.getExtConfig")
    @js.native
    def getExtConfig(callbacks: CallbacksWithType[ExtConfig]): Unit = js.native
    
    /**
      * wx.getExtConfig 的同步版本。
      */
    @JSGlobal("wx.getExtConfigSync")
    @js.native
    def getExtConfigSync(): js.Any = js.native
    
    // --文件系统
    @JSGlobal("wx.getFileSystemManager")
    @js.native
    def getFileSystemManager(): typings.wegameApi.FileSystemManager = js.native
    
    // --开放数据
    /**
      * 拉取当前用户所有同玩好友的托管数据。该接口只可在开放数据域下使用
      */
    @JSGlobal("wx.getFriendCloudStorage")
    @js.native
    def getFriendCloudStorage(param: Fail): Unit = js.native
    
    // TODO: GameBanner
    // --游戏对局回放
    /**
      * 获取全局唯一的游戏画面录制对象
      */
    @JSGlobal("wx.getGameRecorder")
    @js.native
    def getGameRecorder(): js.Any = js.native
    
    /**
      * 在小游戏是通过群分享卡片打开的情况下，可以通过调用该接口获取群同玩成员的游戏数据。该接口只可在开放数据域下使用。
      */
    @JSGlobal("wx.getGroupCloudStorage")
    @js.native
    def getGroupCloudStorage(param: ShareTicket): Unit = js.native
    
    @JSGlobal("wx.getLaunchOptionsSync")
    @js.native
    def getLaunchOptionsSync(): LaunchOption = js.native
    
    // --位置
    /**
      * 获取当前的地理位置、速度。当用户离开小程序后，此接口无法调用；当用户点击“显示在聊天顶部”时，此接口可继续调用。
      */
    @JSGlobal("wx.getLocation")
    @js.native
    def getLocation(param: Altitude): Unit = js.native
    
    /**
      * 获取日志管理器对象
      * @param param 初始化时的参数
      */
    @JSGlobal("wx.getLogManager")
    @js.native
    def getLogManager(): typings.wegameApi.LogManager = js.native
    @JSGlobal("wx.getLogManager")
    @js.native
    def getLogManager(param: `3`): typings.wegameApi.LogManager = js.native
    
    // --菜单
    /**
      * 获取菜单按钮的布局置信息
      */
    @JSGlobal("wx.getMenuButtonBoundingClientRect")
    @js.native
    def getMenuButtonBoundingClientRect(): Bottom = js.native
    
    // --网络
    /**
      * 获取网络类型
      */
    @JSGlobal("wx.getNetworkType")
    @js.native
    def getNetworkType(cb: CallbacksWithType[IsConnected]): Unit = js.native
    
    // --开放数据域
    /**
      * 获取开放数据域
      */
    @JSGlobal("wx.getOpenDataContext")
    @js.native
    def getOpenDataContext(): typings.wegameApi.OpenDataContext = js.native
    
    // --性能
    /**
      * 获取性能管理器
      */
    @JSGlobal("wx.getPerformance")
    @js.native
    def getPerformance(): typings.wegameApi.WxPerformance = js.native
    
    /**
      * 获取可能对游戏感兴趣的未注册的好友名单。每次调用最多可获得 5 个好友，此接口只能在开放数据域中使用
      */
    @JSGlobal("wx.getPotentialFriendList")
    @js.native
    def getPotentialFriendList(callback: CallbacksWithType[List]): Unit = js.native
    
    // --录音
    @JSGlobal("wx.getRecorderManager")
    @js.native
    def getRecorderManager(): typings.wegameApi.RecorderManager = js.native
    
    // --屏幕
    /**
      * 获取屏幕亮度
      */
    @JSGlobal("wx.getScreenBrightness")
    @js.native
    def getScreenBrightness(cb: CallbacksWithType[Value]): Unit = js.native
    
    /**
      * 获取用户的当前设置。返回值中只会出现小程序已经向用户请求过的权限。
      */
    @JSGlobal("wx.getSetting")
    @js.native
    def getSetting(p: CallbacksWithType[AuthSetting]): Unit = js.native
    
    // --转发
    /**
      * 获取转发详细信息
      */
    @JSGlobal("wx.getShareInfo")
    @js.native
    def getShareInfo(param: FailShareTicket): Unit = js.native
    
    /**
      * 只有开放数据域能调用，获取主域和开放数据域共享的 sharedCanvas
      */
    @JSGlobal("wx.getSharedCanvas")
    @js.native
    def getSharedCanvas(): typings.wegameApi.Canvas = js.native
    
    /**
      * 从本地缓存中异步获取指定 key 的内容
      */
    @JSGlobal("wx.getStorage")
    @js.native
    def getStorage(param: GetStorageParams): Unit = js.native
    
    /**
      * 异步获取当前storage的相关信息
      */
    @JSGlobal("wx.getStorageInfo")
    @js.native
    def getStorageInfo(param: CallbacksWithType[StorageInfo]): Unit = js.native
    
    /**
      * getStorageInfo 的同步版本
      */
    @JSGlobal("wx.getStorageInfoSync")
    @js.native
    def getStorageInfoSync(): StorageInfo = js.native
    
    /**
      * getStorage 的同步版本
      */
    @JSGlobal("wx.getStorageSync")
    @js.native
    def getStorageSync(key: String): js.Any = js.native
    
    // --系统信息
    @JSGlobal("wx.getSystemInfo")
    @js.native
    def getSystemInfo(cb: CallbacksWithType[SystemInfo]): Unit = js.native
    
    @JSGlobal("wx.getSystemInfoSync")
    @js.native
    def getSystemInfoSync(): SystemInfo = js.native
    
    /**
      * 获取一行文本的行高
      * @param p 字体参数
      */
    @JSGlobal("wx.getTextLineHeight")
    @js.native
    def getTextLineHeight(p: LineHeightParams): Double = js.native
    
    // --更新
    @JSGlobal("wx.getUpdateManager")
    @js.native
    def getUpdateManager(): typings.wegameApi.UpdateManager = js.native
    
    /**
      * 获取当前用户托管数据当中对应 key 的数据。该接口只可在开放数据域下使用
      */
    @JSGlobal("wx.getUserCloudStorage")
    @js.native
    def getUserCloudStorage(param: KeyList): Unit = js.native
    
    /**
      * 在无须用户授权的情况下，批量获取用户信息。该接口只在开放数据域下可用
      * 请注意！！旧版本的该接口已过期，微信不允许主动弹出授权框，旧版本API会被逐渐作废，请使用wx.createUserInfoButton或在隔离数据区取得用户信息
      * 如使用旧接口取得用户信息，withCredentials 为 true 时需要先调用 wx.login 接口。需要用户授权 scope.userInfo
      */
    @JSGlobal("wx.getUserInfo")
    @js.native
    def getUserInfo(param: NewUserInfoParam): Unit = js.native
    @JSGlobal("wx.getUserInfo")
    @js.native
    def getUserInfo(param: OldUserInfoParam): Unit = js.native
    
    /**
      * 获取当前用户互动型托管数据对应 key 的数据
      */
    @JSGlobal("wx.getUserInteractiveStorage")
    @js.native
    def getUserInteractiveStorage(param: keyListArraystringCallbac): Unit = js.native
    
    // --微信运动
    /**
      * 获取用户过去三十天微信运动步数，需要先调用 wx.login 接口。需要用户授权 scope.werun。
      */
    @JSGlobal("wx.getWeRunData")
    @js.native
    def getWeRunData(p: CallbacksWithType[Iv]): Unit = js.native
    
    // --键盘
    @JSGlobal("wx.hideKeyboard")
    @js.native
    def hideKeyboard(): Unit = js.native
    
    /**
      * 隐藏 loading 提示框
      */
    @JSGlobal("wx.hideLoading")
    @js.native
    def hideLoading(): Unit = js.native
    @JSGlobal("wx.hideLoading")
    @js.native
    def hideLoading(cb: Callbacks): Unit = js.native
    
    /**
      * 隐藏转发按钮
      */
    @JSGlobal("wx.hideShareMenu")
    @js.native
    def hideShareMenu(): Unit = js.native
    @JSGlobal("wx.hideShareMenu")
    @js.native
    def hideShareMenu(cb: Callbacks): Unit = js.native
    
    /**
      * 隐藏消息提示框
      */
    @JSGlobal("wx.hideToast")
    @js.native
    def hideToast(): Unit = js.native
    @JSGlobal("wx.hideToast")
    @js.native
    def hideToast(cb: Callbacks): Unit = js.native
    
    /**
      * 加入 (创建) 实时语音通话，更多信息可见：实时语音指南（https://developers.weixin.qq.com/minigame/dev/guide/open-ability/voip-chat.html）
      * 错误码
      *    -1    当前已在房间内
      *    -2    录音设备被占用，可能是当前正在使用微信内语音通话或系统通话
      *    -3    加入会话期间退出（可能是用户主动退出，或者退后台、来电等原因），因此加入失败
      *    -1000 系统错误
      * @param param 加入语音聊天时的初始化参数
      */
    @JSGlobal("wx.joinVoIPChat")
    @js.native
    def joinVoIPChat(param: CallbacksWithTypeopenIdLi): Unit = js.native
    
    /**
      * 加载自定义字体文件
      * @param path 字体文件路径。可以是代码包文件路径，也可以是 wxfile:// 协议的本地文件路径。
      */
    @JSGlobal("wx.loadFont")
    @js.native
    def loadFont(path: String): String = js.native
    
    // --分包加载
    /**
      * 触发分包加载，详见 分包加载
      */
    @JSGlobal("wx.loadSubpackage")
    @js.native
    def loadSubpackage(param: Name): typings.wegameApi.LoadSubpackageTask = js.native
    
    /**
      * 调用接口获取登录凭证（code）进而换取用户登录态信息，包括用户的唯一标识（openid） 及本次登录的 会话密钥（session_key）等。用户数据的加解密通讯需要依赖会话密钥完成。
      */
    @JSGlobal("wx.login")
    @js.native
    def login(cb: CallbacksWithType[Code]): Unit = js.native
    
    /**
      * 标记自定义场景
      * @param sceneId 在管理后台配置过的场景ID
      */
    @JSGlobal("wx.markScene")
    @js.native
    def markScene(sceneId: Double): Unit = js.native
    
    /**
      * 修改好友的互动型托管数据，该接口只可在开放数据域下使用，示例代码：
      * wx.modifyFriendInteractiveStorage({
      *     key: '1',
      *     opNum: 1,
      *     operation: 'add',
      *     toUser: '', // 好友的 openId
      *     title: '送你 10 个金币，赶快打开游戏看看吧', // 2.9.0 支持
      *     imageUrl: 'image/xxx' // 2.9.0 支持
      * });
      *
      * 赠送动作的校验：
      *     调用该接口需要上传 JSServer 函数 "checkInteractiveData"，该函数可用于执行赠送动作的校验逻辑，校验通过后返回结果表示本次赠送是否合法。只有 checkInteractiveData 返回了 {ret: true}，此次修改才会成功。
      *
      * 使用模板规则进行交互：
      *     每次调用该接口会弹窗询问用户是否确认执行该操作，2.9.0 之后版本，需要在 game.json 中设置 modifyFriendInteractiveStorageTemplates 来定制交互的文案。
      *     modifyFriendInteractiveStorageTemplates是一个模板数组，每一个模板需要有 key, action, object 参数，还有一个可选参数 ratio，详细说明见示例配置：
      *         {
      *             "modifyFriendInteractiveStorageTemplates": [
      *                  {
      *                      "key": "1", // 这个 key 与接口中同名参数相对应，不同的 key 对应不同的模板
      *                      "action": "赠送", // 互动行为
      *                      "object": "金币", // 互动物品
      *                      "ratio": 10 // 物品比率，opNum * ratio 代表物品个数
      *                  }
      *              ]
      *          }
      *     最后生成的文案为 "确认 ${action} ${nickname} ${object}？"，或者 "确认 ${action} ${nickname} ${object} x ${opNum * ratio}？"
      *
      * 使用自定义文案进行交互：
      *     2.7.7 之后，2.9.0 之前的版本，文案通过 game.json 的 modifyFriendInteractiveStorageConfirmWording 字段配置。 配置内容可包含 nickname 变量，用 ${nickname} 表示，实际调用时会被替换成好友的昵称。示例配置：
      *         {
      *             "modifyFriendInteractiveStorageConfirmWording": "确认送给${nickname}一个体力？"
      *         }
      *     2.9.0 之后，在 modifyFriendInteractiveStorageTemplates 和 modifyFriendInteractiveStorageConfirmWording 都存在的情况下，会优先使用前者。
      */
    @JSGlobal("wx.modifyFriendInteractiveStorage")
    @js.native
    def modifyFriendInteractiveStorage(param: ImageUrl): Unit = js.native
    
    // --小程序跳转
    /**
      * 打开另一个小程序
      * @param param 跳转参数
      */
    @JSGlobal("wx.navigateToMiniProgram")
    @js.native
    def navigateToMiniProgram(param: appIdstringpathstringunde): Unit = js.native
    
    /**
      * 取消监听音频因为受到系统占用而被中断开始，以下场景会触发此事件：闹钟、电话、FaceTime 通话、微信语音聊天、微信视频聊天。此事件触发后，小程序内所有音频会暂停。
      */
    @JSGlobal("wx.offAudioInterruptionBegin")
    @js.native
    def offAudioInterruptionBegin(cb: js.Function0[Unit]): Unit = js.native
    
    /**
      * 取消监听音频中断结束，在收到 onAudioInterruptionBegin 事件之后，小程序内所有音频会暂停，收到此事件之后才可再次播放成功
      */
    @JSGlobal("wx.offAudioInterruptionEnd")
    @js.native
    def offAudioInterruptionEnd(cb: js.Function0[Unit]): Unit = js.native
    
    /**
      * 取消监听设备方向变化事件，参数为空，则取消所有的事件监听。
      * @param callback 之前添加过的监听回调函数，如果不指定，则清空所有
      */
    @JSGlobal("wx.offDeviceMotionChange")
    @js.native
    def offDeviceMotionChange(): Unit = js.native
    @JSGlobal("wx.offDeviceMotionChange")
    @js.native
    def offDeviceMotionChange(callback: js.Any): Unit = js.native
    
    /**
      * 取消监听横竖屏切换事件
      */
    @JSGlobal("wx.offDeviceOrientationChange")
    @js.native
    def offDeviceOrientationChange(callback: js.Function1[/* res */ ValueString, Unit]): Unit = js.native
    
    @JSGlobal("wx.offError")
    @js.native
    def offError(cb: js.Function1[/* res */ Stack, Unit]): Unit = js.native
    
    /**
      * 取消监听陀螺仪数据变化事件。
      * @param callback 之前监听的回调函数
      */
    @JSGlobal("wx.offGyroscopeChange")
    @js.native
    def offGyroscopeChange(callback: js.Any): Unit = js.native
    
    @JSGlobal("wx.offHide")
    @js.native
    def offHide(cb: js.Function0[Unit]): Unit = js.native
    
    /**
      * 取消监听监听键盘收起的事件
      */
    @JSGlobal("wx.offKeyboardComplete")
    @js.native
    def offKeyboardComplete(callback: js.Function1[/* res */ ValueString, Unit]): Unit = js.native
    
    /**
      * 取消监听用户点击键盘 Confirm 按钮时的事件
      */
    @JSGlobal("wx.offKeyboardConfirm")
    @js.native
    def offKeyboardConfirm(callback: js.Function1[/* res */ ValueString, Unit]): Unit = js.native
    
    /**
      * 取消监听键盘输入事件
      */
    @JSGlobal("wx.offKeyboardInput")
    @js.native
    def offKeyboardInput(callback: js.Function1[/* res */ ValueString, Unit]): Unit = js.native
    
    /**
      * 取消监听用户点击右上角菜单的“转发”按钮时触发的事件
      */
    @JSGlobal("wx.offShareAppMessage")
    @js.native
    def offShareAppMessage(cb: js.Function0[ShareOption]): Unit = js.native
    
    @JSGlobal("wx.offShow")
    @js.native
    def offShow(cb: js.Function1[/* res */ Query, Unit]): Unit = js.native
    
    @JSGlobal("wx.offTouchCancel")
    @js.native
    def offTouchCancel(cb: js.Function1[/* res */ TouchData, Unit]): Unit = js.native
    
    @JSGlobal("wx.offTouchEnd")
    @js.native
    def offTouchEnd(cb: js.Function1[/* res */ TouchData, Unit]): Unit = js.native
    
    @JSGlobal("wx.offTouchMove")
    @js.native
    def offTouchMove(cb: js.Function1[/* res */ TouchData, Unit]): Unit = js.native
    
    @JSGlobal("wx.offTouchStart")
    @js.native
    def offTouchStart(cb: js.Function1[/* res */ TouchData, Unit]): Unit = js.native
    
    /**
      * 取消监听被动断开实时语音通话事件。
      * @param callback 之前监听的回调函数
      */
    @JSGlobal("wx.offVoIPChatInterrupted")
    @js.native
    def offVoIPChatInterrupted(callback: js.Any): Unit = js.native
    
    /**
      * 取消监听实时语音通话成员在线状态变化事件。
      * @param callback 之前监听的回调函数
      */
    @JSGlobal("wx.offVoIPChatMembersChanged")
    @js.native
    def offVoIPChatMembersChanged(callback: js.Any): Unit = js.native
    
    /**
      * 取消监听实时语音通话成员通话状态变化事件。
      * @param callback 之前监听的回调函数
      */
    @JSGlobal("wx.offVoIPChatSpeakersChanged")
    @js.native
    def offVoIPChatSpeakersChanged(callback: js.Any): Unit = js.native
    
    /**
      * 取消监听窗口尺寸变化事件
      */
    @JSGlobal("wx.offWindowResize")
    @js.native
    def offWindowResize(cb: js.Function1[/* res */ WindowHeight, Unit]): Unit = js.native
    
    // --加速计
    /**
      * 监听加速度数据，频率：5次/秒，接口调用后会自动开始监听，可使用 wx.stopAccelerometer 停止监听。
      */
    @JSGlobal("wx.onAccelerometerChange")
    @js.native
    def onAccelerometerChange(cb: js.Function1[/* res */ X, Unit]): Unit = js.native
    
    /**
      * 监听音频因为受到系统占用而被中断开始，以下场景会触发此事件：闹钟、电话、FaceTime 通话、微信语音聊天、微信视频聊天。此事件触发后，小程序内所有音频会暂停。
      */
    @JSGlobal("wx.onAudioInterruptionBegin")
    @js.native
    def onAudioInterruptionBegin(cb: js.Function0[Unit]): Unit = js.native
    
    /**
      * 监听音频中断结束，在收到 onAudioInterruptionBegin 事件之后，小程序内所有音频会暂停，收到此事件之后才可再次播放成功
      */
    @JSGlobal("wx.onAudioInterruptionEnd")
    @js.native
    def onAudioInterruptionEnd(cb: js.Function0[Unit]): Unit = js.native
    
    // --罗盘
    /**
      * 监听罗盘数据，频率：5 次/秒，接口调用后会自动开始监听，可使用 wx.stopCompass 停止监听。
      * @param cb.res.direction 面对的方向度数
      */
    @JSGlobal("wx.onCompassChange")
    @js.native
    def onCompassChange(cb: js.Function1[/* res */ Direction, Unit]): Unit = js.native
    
    /**
      * 监听设备方向变化事件。频率根据 wx.startDeviceMotionListening() 的 interval 参数。可以使用 wx.stopDeviceMotionListening() 停止监听。
      */
    @JSGlobal("wx.onDeviceMotionChange")
    @js.native
    def onDeviceMotionChange(callback: js.Function1[/* res */ Alpha, Unit]): Unit = js.native
    
    // --转屏
    /**
      * 监听横竖屏切换事件
      */
    @JSGlobal("wx.onDeviceOrientationChange")
    @js.native
    def onDeviceOrientationChange(callback: js.Function1[/* res */ ValueString, Unit]): Unit = js.native
    
    /**
      * 监听全局错误事件
      */
    @JSGlobal("wx.onError")
    @js.native
    def onError(cb: js.Function1[/* res */ Stack, Unit]): Unit = js.native
    
    /**
      * 监听陀螺仪数据变化事件。频率根据 wx.startGyroscope() 的 interval 参数。可以使用 wx.stopGyroscope() 停止监听。
      * @param callback 监听函数
      */
    @JSGlobal("wx.onGyroscopeChange")
    @js.native
    def onGyroscopeChange(callback: js.Function1[/* res */ X, Unit]): Unit = js.native
    
    @JSGlobal("wx.onHide")
    @js.native
    def onHide(cb: js.Function0[Unit]): Unit = js.native
    
    /**
      * 监听成功修改好友的互动型托管数据事件，该接口在游戏主域使用
      * @param callback 事件发生的回调函数，只有一个参数为 wx.modifyFriendInteractiveStorage 传入的 key
      */
    @JSGlobal("wx.onInteractiveStorageModified")
    @js.native
    def onInteractiveStorageModified(callback: js.Function1[/* key */ String, Unit]): Unit = js.native
    
    /**
      * 监听监听键盘收起的事件
      * @param callback.res.value 键盘输入的当前值
      */
    @JSGlobal("wx.onKeyboardComplete")
    @js.native
    def onKeyboardComplete(callback: js.Function1[/* res */ ValueString, Unit]): Unit = js.native
    
    /**
      * 监听用户点击键盘 Confirm 按钮时的事件
      * @param callback.res.value 键盘输入的当前值
      */
    @JSGlobal("wx.onKeyboardConfirm")
    @js.native
    def onKeyboardConfirm(callback: js.Function1[/* res */ ValueString, Unit]): Unit = js.native
    
    /**
      * 监听键盘输入事件
      * @param callback.res.value 键盘输入的当前值
      */
    @JSGlobal("wx.onKeyboardInput")
    @js.native
    def onKeyboardInput(callback: js.Function1[/* res */ ValueString, Unit]): Unit = js.native
    
    /**
      * 监听内存不足告警
      * @param callback.res.level 内存告警等级，只有 Android 才有，对应系统宏定义:
      *                           10 TRIM_MEMORY_RUNNING_LOW
      *                           15 TRIM_MEMORY_RUNNING_CRITICAL
      */
    @JSGlobal("wx.onMemoryWarning")
    @js.native
    def onMemoryWarning(callback: js.Function1[/* res */ Level, Unit]): Unit = js.native
    
    /**
      * 监听主域发送的消息
      */
    @JSGlobal("wx.onMessage")
    @js.native
    def onMessage(callback: js.Function1[/* data */ js.Any, Unit]): Unit = js.native
    
    /**
      * 监听网络状态变化事件
      */
    @JSGlobal("wx.onNetworkStatusChange")
    @js.native
    def onNetworkStatusChange(cb: js.Function1[/* res */ IsConnected, Unit]): Unit = js.native
    
    /**
      * 监听用户点击右上角菜单的“转发”按钮时触发的事件
      */
    @JSGlobal("wx.onShareAppMessage")
    @js.native
    def onShareAppMessage(cb: js.Function0[ShareOption]): Unit = js.native
    
    @JSGlobal("wx.onShow")
    @js.native
    def onShow(cb: js.Function1[/* res */ Query, Unit]): Unit = js.native
    
    /**
      * 监听WebSocket 连接关闭事件
      */
    @JSGlobal("wx.onSocketClose")
    @js.native
    def onSocketClose(callback: js.Function0[Unit]): Unit = js.native
    
    /**
      * 监听WebSocket 错误事件
      */
    @JSGlobal("wx.onSocketError")
    @js.native
    def onSocketError(callback: SocketErrorCallback): Unit = js.native
    
    /**
      * 监听WebSocket 接受到服务器的消息事件
      */
    @JSGlobal("wx.onSocketMessage")
    @js.native
    def onSocketMessage(callback: SocketMessageCallback): Unit = js.native
    
    /**
      * 监听WebSocket 连接打开事件
      */
    @JSGlobal("wx.onSocketOpen")
    @js.native
    def onSocketOpen(callback: SocketOpenCallback): Unit = js.native
    
    /**
      * 监听触点失效事件
      */
    @JSGlobal("wx.onTouchCancel")
    @js.native
    def onTouchCancel(cb: js.Function1[/* res */ TouchData, Unit]): Unit = js.native
    
    /**
      * 监听触摸结束事件
      */
    @JSGlobal("wx.onTouchEnd")
    @js.native
    def onTouchEnd(cb: js.Function1[/* res */ TouchData, Unit]): Unit = js.native
    
    /**
      * 监听触点移动事件
      */
    @JSGlobal("wx.onTouchMove")
    @js.native
    def onTouchMove(cb: js.Function1[/* res */ TouchData, Unit]): Unit = js.native
    
    // --触摸事件
    /**
      * 监听开始始触摸事件
      */
    @JSGlobal("wx.onTouchStart")
    @js.native
    def onTouchStart(cb: js.Function1[/* res */ TouchData, Unit]): Unit = js.native
    
    /**
      * 监听被动断开实时语音通话事件。包括小游戏切入后端时断开
      * @param callback 被动断开实时语音通话事件的回调函数
      */
    @JSGlobal("wx.onVoIPChatInterrupted")
    @js.native
    def onVoIPChatInterrupted(callback: js.Function1[/* res */ ErrCodeErrMsg, Unit]): Unit = js.native
    
    /**
      * 监听实时语音通话成员在线状态变化事件。有成员加入/退出通话时触发回调
      * @param callback 实时语音通话成员在线状态变化事件的回调函数
      */
    @JSGlobal("wx.onVoIPChatMembersChanged")
    @js.native
    def onVoIPChatMembersChanged(callback: js.Function1[/* res */ OpenIdList, Unit]): Unit = js.native
    
    /**
      * 监听实时语音通话成员通话状态变化事件。有成员开始/停止说话时触发回调
      * @param callback 实时语音通话成员通话状态变化事件的回调函数
      */
    @JSGlobal("wx.onVoIPChatSpeakersChanged")
    @js.native
    def onVoIPChatSpeakersChanged(callback: js.Function1[/* res */ OpenIdList, Unit]): Unit = js.native
    
    // --窗口
    /**
      * 监听窗口尺寸变化事件
      */
    @JSGlobal("wx.onWindowResize")
    @js.native
    def onWindowResize(cb: js.Function1[/* res */ WindowHeight, Unit]): Unit = js.native
    
    // --卡券
    /**
      * 查看微信卡包中的卡券。只有通过 认证 的小程序或文化互动类目的小游戏才能使用。更多文档请参考：微信卡券接口文档（https://mp.weixin.qq.com/cgi-bin/announce?action=getannouncement&key=1490190158&version=1&lang=zh_CN&platform=2）
      */
    @JSGlobal("wx.openCard")
    @js.native
    def openCard(param: cardListReadonlyArraycard): Unit = js.native
    
    // --客服消息
    /**
      * 进入客服会话，要求在用户发生过至少一次 touch 事件后才能调用。后台接入方式与小程序一致，详见 客服消息接入
      */
    @JSGlobal("wx.openCustomerServiceConversation")
    @js.native
    def openCustomerServiceConversation(param: SendMessageImg): Unit = js.native
    
    /**
      * 调起客户端小程序设置界面，返回用户设置的操作结果。设置界面只会出现小程序已经向用户请求过的权限。
      * @deprecated
      */
    @JSGlobal("wx.openSetting")
    @js.native
    def openSetting(p: CallbacksWithType[AuthSetting]): Unit = js.native
    
    /**
      * 预览图片，调用之后会在新打开的页面中全屏预览传入的图片，预览的过程中用户可以进行保存图片、发送给朋友等操作
      */
    @JSGlobal("wx.previewImage")
    @js.native
    def previewImage(param: Current): Unit = js.native
    
    /**
      * 从本地缓存中移除指定 key
      */
    @JSGlobal("wx.removeStorage")
    @js.native
    def removeStorage(param: RemoveStorageParams): Unit = js.native
    
    /**
      * removeStorage 的同步版本
      * @param key 本地缓存中指定的 key
      */
    @JSGlobal("wx.removeStorageSync")
    @js.native
    def removeStorageSync(key: String): Unit = js.native
    
    /**
      * 删除用户托管数据当中对应 key 的数据。
      */
    @JSGlobal("wx.removeUserCloudStorage")
    @js.native
    def removeUserCloudStorage(param: Success): Unit = js.native
    
    // --数据上报
    /**
      * 自定义业务数据监控上报接口。
      * 使用前，需要在「小程序管理后台-运维中心-性能监控-业务数据监控」中新建监控事件，配置监控描述与告警类型。每一个监控事件对应唯一的监控ID，开发者最多可以创建128个监控事件。
      * @param name 监控ID，在「小程序管理后台」新建数据指标后获得
      * @param value 上报数值，经处理后会在「小程序管理后台」上展示每分钟的上报总量
      */
    @JSGlobal("wx.reportMonitor")
    @js.native
    def reportMonitor(name: String, value: Double): Unit = js.native
    
    // --发起请求
    @JSGlobal("wx.request")
    @js.native
    def request(param: RequestParams): typings.wegameApi.RequestTask = js.native
    
    // --虚拟支付
    /**
      * 发起米大师支付
      */
    @JSGlobal("wx.requestMidasPayment")
    @js.native
    def requestMidasPayment(param: BuyQuantity): Unit = js.native
    
    // --订阅消息
    /**
      * 调起小游戏订阅消息界面，返回用户订阅消息的操作结果。（需要在 touchend 事件的回调中调用）
      */
    @JSGlobal("wx.requestSubscribeMessage")
    @js.native
    def requestSubscribeMessage(param: tmplIdsReadonlyArraystrin): Unit = js.native
    
    /**
      * 保存图片到系统相册。需要用户授权 scope.writePhotosAlbum
      */
    @JSGlobal("wx.saveImageToPhotosAlbum")
    @js.native
    def saveImageToPhotosAlbum(param: FilePath): Unit = js.native
    
    /**
      * 通过 WebSocket 连接发送数据，需要先 wx.connectSocket，并在 wx.onSocketOpen 回调之后才能发送。
      */
    @JSGlobal("wx.sendSocketMessage")
    @js.native
    def sendSocketMessage(param: SocketSendParams): Unit = js.native
    
    /**
      * 设置系统剪贴板的内容
      */
    @JSGlobal("wx.setClipboardData")
    @js.native
    def setClipboardData(p: SetClipboardDataParams): Unit = js.native
    
    // --调试
    @JSGlobal("wx.setEnableDebug")
    @js.native
    def setEnableDebug(p: EnableDebug): Unit = js.native
    
    /**
      * 设置是否保持常亮状态。仅在当前小程序生效，离开小程序后设置失效。
      */
    @JSGlobal("wx.setKeepScreenOn")
    @js.native
    def setKeepScreenOn(p: SetKeepScreenOnParams): Unit = js.native
    
    @JSGlobal("wx.setMenuStyle")
    @js.native
    def setMenuStyle(param: FailStyle): Unit = js.native
    
    /**
      * 设置 wx.shareMessageToFriend 接口 query 字段的值
      * @param param 设置参数
      * @returns 是否设置成功
      */
    @JSGlobal("wx.setMessageToFriendQuery")
    @js.native
    def setMessageToFriendQuery(param: ShareMessageToFriendScene): Boolean = js.native
    
    /**
      * 可以修改渲染帧率。默认渲染帧率为 60 帧每秒。修改后，requestAnimationFrame 的回调频率会发生改变。
      * @param fps 帧率，有效范围 1 - 60。
      */
    @JSGlobal("wx.setPreferredFramesPerSecond")
    @js.native
    def setPreferredFramesPerSecond(fps: Double): Unit = js.native
    
    /**
      * 设置屏幕亮度
      */
    @JSGlobal("wx.setScreenBrightness")
    @js.native
    def setScreenBrightness(p: SetScreenBrightnessParams): Unit = js.native
    
    // --状态栏
    /**
      * 当在配置中设置 showStatusBarStyle 时，屏幕顶部会显示状态栏。此接口可以修改状态栏的样式。
      */
    @JSGlobal("wx.setStatusBarStyle")
    @js.native
    def setStatusBarStyle(param: StyleSuccess): Unit = js.native
    
    /**
      * 将数据存储在本地缓存中指定的 key 中，会覆盖掉原来该 key 对应的内容。
      */
    @JSGlobal("wx.setStorage")
    @js.native
    def setStorage(param: SetStorageParams): Unit = js.native
    
    /**
      * setStorage 的同步版本
      * @param key 本地缓存中指定的 key
      * @param data 需要存储的内容
      */
    @JSGlobal("wx.setStorageSync")
    @js.native
    def setStorageSync(key: String, data: js.Any): Unit = js.native
    
    /**
      * 对用户托管数据进行写数据操作，允许同时写多组 KV 数据。
      * 托管数据的限制
      *      > 每个openid所标识的微信用户在每个游戏上托管的数据不能超过128个key-value对。
      *      > 上报的key-value列表当中每一项的key+value长度都不能超过1K(1024)字节。
      *      > 上报的key-value列表当中每一个key长度都不能超过128字节。
      */
    @JSGlobal("wx.setUserCloudStorage")
    @js.native
    def setUserCloudStorage(param: CompleteFail): Unit = js.native
    
    /**
      * 主动拉起转发，进入选择通讯录界面。
      */
    @JSGlobal("wx.shareAppMessage")
    @js.native
    def shareAppMessage(param: ShareOption): Unit = js.native
    
    /**
      * 给指定的好友分享游戏信息，该接口只可在开放数据域下使用
      * 定向分享不允许直接在开放数据域设置 query 参数 需要设置时请参见游戏域 wx.setMessageToFriendQuery 接口
      * @param param 分享参数
      */
    @JSGlobal("wx.shareMessageToFriend")
    @js.native
    def shareMessageToFriend(param: ImageUrlId): Unit = js.native
    
    /**
      * 显示选择器
      */
    @JSGlobal("wx.showActionSheet")
    @js.native
    def showActionSheet(params: ItemColor): Unit = js.native
    
    /**
      * 显示键盘
      */
    @JSGlobal("wx.showKeyboard")
    @js.native
    def showKeyboard(param: ConfirmHold): Unit = js.native
    
    /**
      * 显示 loading 提示框, 需主动调用 wx.hideLoading 才能关闭提示框
      */
    @JSGlobal("wx.showLoading")
    @js.native
    def showLoading(): Unit = js.native
    @JSGlobal("wx.showLoading")
    @js.native
    def showLoading(prms: Mask): Unit = js.native
    
    /**
      * 显示模态对话框
      */
    @JSGlobal("wx.showModal")
    @js.native
    def showModal(param: CancelColor): Unit = js.native
    
    /**
      * 显示当前页面的转发按钮
      */
    @JSGlobal("wx.showShareMenu")
    @js.native
    def showShareMenu(): Unit = js.native
    @JSGlobal("wx.showShareMenu")
    @js.native
    def showShareMenu(param: WithShareTicket): Unit = js.native
    
    // --交互
    /**
      * 显示消息提示框
      */
    @JSGlobal("wx.showToast")
    @js.native
    def showToast(param: Title): Unit = js.native
    
    /**
      * 开始监听加速度数据。
      */
    @JSGlobal("wx.startAccelerometer")
    @js.native
    def startAccelerometer(cb: AccelerometerParams): Unit = js.native
    
    /**
      * 开始监听罗盘数据
      */
    @JSGlobal("wx.startCompass")
    @js.native
    def startCompass(): Unit = js.native
    @JSGlobal("wx.startCompass")
    @js.native
    def startCompass(cb: Callbacks): Unit = js.native
    
    /**
      * 开始监听设备方向的变化
      */
    @JSGlobal("wx.startDeviceMotionListening")
    @js.native
    def startDeviceMotionListening(param: intervalgameuinormalCallb): Unit = js.native
    
    /**
      * 开始监听陀螺仪数据。
      */
    @JSGlobal("wx.startGyroscope")
    @js.native
    def startGyroscope(param: intervalgameuinormalCallb): Unit = js.native
    
    /**
      * 停止监听加速度数据。
      */
    @JSGlobal("wx.stopAccelerometer")
    @js.native
    def stopAccelerometer(): Unit = js.native
    @JSGlobal("wx.stopAccelerometer")
    @js.native
    def stopAccelerometer(cb: Callbacks): Unit = js.native
    
    /**
      * 停止监听罗盘数据
      */
    @JSGlobal("wx.stopCompass")
    @js.native
    def stopCompass(): Unit = js.native
    @JSGlobal("wx.stopCompass")
    @js.native
    def stopCompass(cb: Callbacks): Unit = js.native
    
    // --设备方向
    /**
      * 停止监听设备方向的变化。
      */
    @JSGlobal("wx.stopDeviceMotionListening")
    @js.native
    def stopDeviceMotionListening(): Unit = js.native
    @JSGlobal("wx.stopDeviceMotionListening")
    @js.native
    def stopDeviceMotionListening(cb: Callbacks): Unit = js.native
    
    // --陀螺仪
    /**
      * 停止监听陀螺仪数据
      */
    @JSGlobal("wx.stopGyroscope")
    @js.native
    def stopGyroscope(): Unit = js.native
    @JSGlobal("wx.stopGyroscope")
    @js.native
    def stopGyroscope(cb: Callbacks): Unit = js.native
    
    /**
      * 加快触发 JavaScriptCore Garbage Collection（垃圾回收），GC 时机是由 JavaScriptCore 来控制的，并不能保证调用后马上触发 GC。
      */
    @JSGlobal("wx.triggerGC")
    @js.native
    def triggerGC(): Unit = js.native
    
    object types {
      
      @JSGlobal("wx.types.closeBLEConnection")
      @js.native
      def closeBLEConnection(): Unit = js.native
      
      @JSGlobal("wx.types.closeBluetoothAdapter")
      @js.native
      def closeBluetoothAdapter(): Unit = js.native
      
      @JSGlobal("wx.types.createBLEConnection")
      @js.native
      def createBLEConnection(): Unit = js.native
      
      @JSGlobal("wx.types.getBLEDeviceCharacteristics")
      @js.native
      def getBLEDeviceCharacteristics(): Unit = js.native
      
      @JSGlobal("wx.types.getBLEDeviceServices")
      @js.native
      def getBLEDeviceServices(): Unit = js.native
      
      /**
        * 获取所有已搜索到的 iBeacon 设备
        */
      @JSGlobal("wx.types.getBeacons")
      @js.native
      def getBeacons(param: js.Any): Unit = js.native
      
      @JSGlobal("wx.types.getBluetoothAdapterState")
      @js.native
      def getBluetoothAdapterState(): Unit = js.native
      
      @JSGlobal("wx.types.getBluetoothDevices")
      @js.native
      def getBluetoothDevices(): Unit = js.native
      
      @JSGlobal("wx.types.getConnectedBluetoothDevices")
      @js.native
      def getConnectedBluetoothDevices(): Unit = js.native
      
      @JSGlobal("wx.types.notifyBLECharacteristicValueChange")
      @js.native
      def notifyBLECharacteristicValueChange(): Unit = js.native
      
      /**
        * 取消监听 iBeacon 服务状态变化事件
        */
      @JSGlobal("wx.types.offBeaconServiceChange")
      @js.native
      def offBeaconServiceChange(callback: js.Any): Unit = js.native
      
      /**
        * 取消监听 iBeacon 设备更新事件
        */
      @JSGlobal("wx.types.offBeaconUpdate")
      @js.native
      def offBeaconUpdate(callback: js.Any): Unit = js.native
      
      @JSGlobal("wx.types.onBLECharacteristicValueChange")
      @js.native
      def onBLECharacteristicValueChange(): Unit = js.native
      
      @JSGlobal("wx.types.onBLEConnectionStateChange")
      @js.native
      def onBLEConnectionStateChange(): Unit = js.native
      
      /**
        * 监听 iBeacon 服务状态变化事件，仅能注册一个监听
        */
      @JSGlobal("wx.types.onBeaconServiceChange")
      @js.native
      def onBeaconServiceChange(callback: js.Any): Unit = js.native
      
      /**
        * 监听 iBeacon 设备更新事件，仅能注册一个监听
        */
      @JSGlobal("wx.types.onBeaconUpdate")
      @js.native
      def onBeaconUpdate(callback: js.Any): Unit = js.native
      
      @JSGlobal("wx.types.onBluetoothAdapterStateChange")
      @js.native
      def onBluetoothAdapterStateChange(): Unit = js.native
      
      @JSGlobal("wx.types.onBluetoothDeviceFound")
      @js.native
      def onBluetoothDeviceFound(): Unit = js.native
      
      @JSGlobal("wx.types.openBluetoothAdapter")
      @js.native
      def openBluetoothAdapter(): Unit = js.native
      
      @JSGlobal("wx.types.readBLECharacteristicValue")
      @js.native
      def readBLECharacteristicValue(): Unit = js.native
      
      /**
        * 开始搜索附近的 iBeacon 设备
        */
      @JSGlobal("wx.types.startBeaconDiscovery")
      @js.native
      def startBeaconDiscovery(param: js.Any): Unit = js.native
      
      @JSGlobal("wx.types.startBluetoothDevicesDiscovery")
      @js.native
      def startBluetoothDevicesDiscovery(): Unit = js.native
      
      // --iBeacon（TODO）
      /**
        * 停止搜索附近的 iBeacon 设备
        */
      @JSGlobal("wx.types.stopBeaconDiscovery")
      @js.native
      def stopBeaconDiscovery(param: js.Any): Unit = js.native
      
      // --蓝牙（TODO）
      @JSGlobal("wx.types.stopBluetoothDevicesDiscovery")
      @js.native
      def stopBluetoothDevicesDiscovery(): Unit = js.native
      
      /*
        IBeaconInfo
        属性
        string uuid
        iBeacon 设备广播的 uuid
        string major
        iBeacon 设备的主 id
        string minor
        iBeacon 设备的次 id
        number proximity
        表示设备距离的枚举值
        number accuracy
        iBeacon 设备的距离
        number rssi
        表示设备的信号强度
        */
      // --低功耗蓝牙（TODO）
      @JSGlobal("wx.types.writeBLECharacteristicValue")
      @js.native
      def writeBLECharacteristicValue(): Unit = js.native
    }
    
    /**
      * 更新键盘，只有当键盘处于拉起状态时才会产生效果
      */
    @JSGlobal("wx.updateKeyboard")
    @js.native
    def updateKeyboard(param: FailSuccess): Unit = js.native
    
    /**
      * 更新转发属性
      */
    @JSGlobal("wx.updateShareMenu")
    @js.native
    def updateShareMenu(param: WithShareTicket): Unit = js.native
    
    // -- VoIP
    /**
      * 更新实时语音静音设置
      * @param param 静音设置
      */
    @JSGlobal("wx.updateVoIPChatMuteConfig")
    @js.native
    def updateVoIPChatMuteConfig(param: CallbacksmuteConfigmuteMi): Unit = js.native
    
    // --上传
    @JSGlobal("wx.uploadFile")
    @js.native
    def uploadFile(param: Complete): typings.wegameApi.UploadTask = js.native
    
    /**
      * 使手机发生较长时间的振动（400 ms)
      */
    @JSGlobal("wx.vibrateLong")
    @js.native
    def vibrateLong(): Unit = js.native
    @JSGlobal("wx.vibrateLong")
    @js.native
    def vibrateLong(cb: Callbacks): Unit = js.native
    
    // --振动
    /**
      * 使手机发生较短时间的振动（15 ms）
      */
    @JSGlobal("wx.vibrateShort")
    @js.native
    def vibrateShort(): Unit = js.native
    @JSGlobal("wx.vibrateShort")
    @js.native
    def vibrateShort(cb: Callbacks): Unit = js.native
  }
}

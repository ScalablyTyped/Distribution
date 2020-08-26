package typings.uniApp

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetSystemInfoResult extends js.Object {
  /**
    * App平台
    */
  var AppPlatform: js.UndefOr[String] = js.native
  /**
    * 客户端基础库版本
    */
  var SDKVersion: js.UndefOr[String] = js.native
  /**
    * 允许微信使用相册的开关（仅 iOS 有效）
    */
  var albumAuthorized: js.UndefOr[Boolean] = js.native
  /**
    * 当前运行的客户端
    */
  var app: js.UndefOr[String] = js.native
  /**
    * 宿主APP名称
    */
  var appName: js.UndefOr[String] = js.native
  /**
    * 蓝牙的系统开关
    */
  var bluetoothEnabled: js.UndefOr[Boolean] = js.native
  /**
    * 手机品牌
    */
  var brand: js.UndefOr[String] = js.native
  /**
    * 上一次缓存的位置信息
    */
  var cacheLocation: js.UndefOr[js.Any] = js.native
  /**
    * 允许微信使用摄像头的开关
    */
  var cameraAuthorized: js.UndefOr[Boolean] = js.native
  /**
    * 当前电量百分比
    */
  var currentBattery: js.UndefOr[String] = js.native
  /**
    * 用户字体大小设置
    */
  var fontSizeSetting: js.UndefOr[Double] = js.native
  /**
    * 宿主平台
    */
  var host: js.UndefOr[String] = js.native
  /**
    * 程序设置的语言
    */
  var language: js.UndefOr[String] = js.native
  /**
    * 允许微信使用定位的开关
    */
  var locationAuthorized: js.UndefOr[Boolean] = js.native
  /**
    * 地理位置的系统开关
    */
  var locationEnabled: js.UndefOr[Boolean] = js.native
  /**
    * 允许微信使用麦克风的开关
    */
  var microphoneAuthorized: js.UndefOr[Boolean] = js.native
  /**
    * 手机型号
    */
  var model: js.UndefOr[String] = js.native
  /**
    * 导航栏的高度
    */
  var navigationBarHeight: js.UndefOr[Double] = js.native
  /**
    * 允许微信通知带有提醒的开关（仅 iOS 有效）
    */
  var notificationAlertAuthorized: js.UndefOr[Boolean] = js.native
  /**
    * 允许微信通知的开关
    */
  var notificationAuthorized: js.UndefOr[Boolean] = js.native
  /**
    * 允许微信通知带有标记的开关（仅 iOS 有效）
    */
  var notificationBadgeAuthorized: js.UndefOr[Boolean] = js.native
  /**
    * 允许微信通知带有声音的开关（仅 iOS 有效）
    */
  var notificationSoundAuthorized: js.UndefOr[Boolean] = js.native
  /**
    * 设备像素比
    */
  var pixelRatio: js.UndefOr[Double] = js.native
  /**
    * 客户端平台
    */
  var platform: js.UndefOr[String] = js.native
  /**
    * 在竖屏正方向下的安全区域
    */
  var safeArea: js.UndefOr[SafeAreaResult] = js.native
  /**
    * 屏幕高度
    */
  var screenHeight: js.UndefOr[Double] = js.native
  /**
    * 屏幕宽度
    */
  var screenWidth: js.UndefOr[Double] = js.native
  /**
    * 状态栏的高度
    */
  var statusBarHeight: js.UndefOr[Double] = js.native
  /**
    * 设备磁盘容量
    */
  var storage: js.UndefOr[String] = js.native
  /**
    * 宿主平台版本号
    */
  var swanNativeVersion: js.UndefOr[String] = js.native
  /**
    * 操作系统版本
    */
  var system: js.UndefOr[String] = js.native
  /**
    * 标题栏高度
    */
  var titleBarHeight: js.UndefOr[Double] = js.native
  /**
    * 引擎版本号
    */
  var version: js.UndefOr[Double] = js.native
  /**
    * Wi-Fi 的系统开关
    */
  var wifiEnabled: js.UndefOr[Boolean] = js.native
  /**
    * 可使用窗口的底部位置
    */
  var windowBottom: js.UndefOr[Double] = js.native
  /**
    * 可使用窗口高度
    */
  var windowHeight: js.UndefOr[Double] = js.native
  /**
    * 可使用窗口的顶部位置
    */
  var windowTop: js.UndefOr[Double] = js.native
  /**
    * 可使用窗口宽度
    */
  var windowWidth: js.UndefOr[Double] = js.native
}

object GetSystemInfoResult {
  @scala.inline
  def apply(): GetSystemInfoResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetSystemInfoResult]
  }
  @scala.inline
  implicit class GetSystemInfoResultOps[Self <: GetSystemInfoResult] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setAppPlatform(value: String): Self = this.set("AppPlatform", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAppPlatform: Self = this.set("AppPlatform", js.undefined)
    @scala.inline
    def setSDKVersion(value: String): Self = this.set("SDKVersion", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSDKVersion: Self = this.set("SDKVersion", js.undefined)
    @scala.inline
    def setAlbumAuthorized(value: Boolean): Self = this.set("albumAuthorized", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAlbumAuthorized: Self = this.set("albumAuthorized", js.undefined)
    @scala.inline
    def setApp(value: String): Self = this.set("app", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteApp: Self = this.set("app", js.undefined)
    @scala.inline
    def setAppName(value: String): Self = this.set("appName", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAppName: Self = this.set("appName", js.undefined)
    @scala.inline
    def setBluetoothEnabled(value: Boolean): Self = this.set("bluetoothEnabled", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBluetoothEnabled: Self = this.set("bluetoothEnabled", js.undefined)
    @scala.inline
    def setBrand(value: String): Self = this.set("brand", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBrand: Self = this.set("brand", js.undefined)
    @scala.inline
    def setCacheLocation(value: js.Any): Self = this.set("cacheLocation", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCacheLocation: Self = this.set("cacheLocation", js.undefined)
    @scala.inline
    def setCameraAuthorized(value: Boolean): Self = this.set("cameraAuthorized", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCameraAuthorized: Self = this.set("cameraAuthorized", js.undefined)
    @scala.inline
    def setCurrentBattery(value: String): Self = this.set("currentBattery", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCurrentBattery: Self = this.set("currentBattery", js.undefined)
    @scala.inline
    def setFontSizeSetting(value: Double): Self = this.set("fontSizeSetting", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFontSizeSetting: Self = this.set("fontSizeSetting", js.undefined)
    @scala.inline
    def setHost(value: String): Self = this.set("host", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHost: Self = this.set("host", js.undefined)
    @scala.inline
    def setLanguage(value: String): Self = this.set("language", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLanguage: Self = this.set("language", js.undefined)
    @scala.inline
    def setLocationAuthorized(value: Boolean): Self = this.set("locationAuthorized", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLocationAuthorized: Self = this.set("locationAuthorized", js.undefined)
    @scala.inline
    def setLocationEnabled(value: Boolean): Self = this.set("locationEnabled", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLocationEnabled: Self = this.set("locationEnabled", js.undefined)
    @scala.inline
    def setMicrophoneAuthorized(value: Boolean): Self = this.set("microphoneAuthorized", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMicrophoneAuthorized: Self = this.set("microphoneAuthorized", js.undefined)
    @scala.inline
    def setModel(value: String): Self = this.set("model", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteModel: Self = this.set("model", js.undefined)
    @scala.inline
    def setNavigationBarHeight(value: Double): Self = this.set("navigationBarHeight", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNavigationBarHeight: Self = this.set("navigationBarHeight", js.undefined)
    @scala.inline
    def setNotificationAlertAuthorized(value: Boolean): Self = this.set("notificationAlertAuthorized", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNotificationAlertAuthorized: Self = this.set("notificationAlertAuthorized", js.undefined)
    @scala.inline
    def setNotificationAuthorized(value: Boolean): Self = this.set("notificationAuthorized", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNotificationAuthorized: Self = this.set("notificationAuthorized", js.undefined)
    @scala.inline
    def setNotificationBadgeAuthorized(value: Boolean): Self = this.set("notificationBadgeAuthorized", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNotificationBadgeAuthorized: Self = this.set("notificationBadgeAuthorized", js.undefined)
    @scala.inline
    def setNotificationSoundAuthorized(value: Boolean): Self = this.set("notificationSoundAuthorized", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNotificationSoundAuthorized: Self = this.set("notificationSoundAuthorized", js.undefined)
    @scala.inline
    def setPixelRatio(value: Double): Self = this.set("pixelRatio", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePixelRatio: Self = this.set("pixelRatio", js.undefined)
    @scala.inline
    def setPlatform(value: String): Self = this.set("platform", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePlatform: Self = this.set("platform", js.undefined)
    @scala.inline
    def setSafeArea(value: SafeAreaResult): Self = this.set("safeArea", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSafeArea: Self = this.set("safeArea", js.undefined)
    @scala.inline
    def setScreenHeight(value: Double): Self = this.set("screenHeight", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteScreenHeight: Self = this.set("screenHeight", js.undefined)
    @scala.inline
    def setScreenWidth(value: Double): Self = this.set("screenWidth", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteScreenWidth: Self = this.set("screenWidth", js.undefined)
    @scala.inline
    def setStatusBarHeight(value: Double): Self = this.set("statusBarHeight", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStatusBarHeight: Self = this.set("statusBarHeight", js.undefined)
    @scala.inline
    def setStorage(value: String): Self = this.set("storage", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStorage: Self = this.set("storage", js.undefined)
    @scala.inline
    def setSwanNativeVersion(value: String): Self = this.set("swanNativeVersion", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSwanNativeVersion: Self = this.set("swanNativeVersion", js.undefined)
    @scala.inline
    def setSystem(value: String): Self = this.set("system", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSystem: Self = this.set("system", js.undefined)
    @scala.inline
    def setTitleBarHeight(value: Double): Self = this.set("titleBarHeight", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTitleBarHeight: Self = this.set("titleBarHeight", js.undefined)
    @scala.inline
    def setVersion(value: Double): Self = this.set("version", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteVersion: Self = this.set("version", js.undefined)
    @scala.inline
    def setWifiEnabled(value: Boolean): Self = this.set("wifiEnabled", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteWifiEnabled: Self = this.set("wifiEnabled", js.undefined)
    @scala.inline
    def setWindowBottom(value: Double): Self = this.set("windowBottom", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteWindowBottom: Self = this.set("windowBottom", js.undefined)
    @scala.inline
    def setWindowHeight(value: Double): Self = this.set("windowHeight", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteWindowHeight: Self = this.set("windowHeight", js.undefined)
    @scala.inline
    def setWindowTop(value: Double): Self = this.set("windowTop", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteWindowTop: Self = this.set("windowTop", js.undefined)
    @scala.inline
    def setWindowWidth(value: Double): Self = this.set("windowWidth", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteWindowWidth: Self = this.set("windowWidth", js.undefined)
  }
  
}


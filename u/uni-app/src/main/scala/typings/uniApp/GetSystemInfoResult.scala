package typings.uniApp

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GetSystemInfoResult extends StObject {
  
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
  implicit class GetSystemInfoResultMutableBuilder[Self <: GetSystemInfoResult] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAlbumAuthorized(value: Boolean): Self = StObject.set(x, "albumAuthorized", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAlbumAuthorizedUndefined: Self = StObject.set(x, "albumAuthorized", js.undefined)
    
    @scala.inline
    def setApp(value: String): Self = StObject.set(x, "app", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAppName(value: String): Self = StObject.set(x, "appName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAppNameUndefined: Self = StObject.set(x, "appName", js.undefined)
    
    @scala.inline
    def setAppPlatform(value: String): Self = StObject.set(x, "AppPlatform", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAppPlatformUndefined: Self = StObject.set(x, "AppPlatform", js.undefined)
    
    @scala.inline
    def setAppUndefined: Self = StObject.set(x, "app", js.undefined)
    
    @scala.inline
    def setBluetoothEnabled(value: Boolean): Self = StObject.set(x, "bluetoothEnabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBluetoothEnabledUndefined: Self = StObject.set(x, "bluetoothEnabled", js.undefined)
    
    @scala.inline
    def setBrand(value: String): Self = StObject.set(x, "brand", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBrandUndefined: Self = StObject.set(x, "brand", js.undefined)
    
    @scala.inline
    def setCacheLocation(value: js.Any): Self = StObject.set(x, "cacheLocation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCacheLocationUndefined: Self = StObject.set(x, "cacheLocation", js.undefined)
    
    @scala.inline
    def setCameraAuthorized(value: Boolean): Self = StObject.set(x, "cameraAuthorized", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCameraAuthorizedUndefined: Self = StObject.set(x, "cameraAuthorized", js.undefined)
    
    @scala.inline
    def setCurrentBattery(value: String): Self = StObject.set(x, "currentBattery", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCurrentBatteryUndefined: Self = StObject.set(x, "currentBattery", js.undefined)
    
    @scala.inline
    def setFontSizeSetting(value: Double): Self = StObject.set(x, "fontSizeSetting", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFontSizeSettingUndefined: Self = StObject.set(x, "fontSizeSetting", js.undefined)
    
    @scala.inline
    def setHost(value: String): Self = StObject.set(x, "host", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHostUndefined: Self = StObject.set(x, "host", js.undefined)
    
    @scala.inline
    def setLanguage(value: String): Self = StObject.set(x, "language", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLanguageUndefined: Self = StObject.set(x, "language", js.undefined)
    
    @scala.inline
    def setLocationAuthorized(value: Boolean): Self = StObject.set(x, "locationAuthorized", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLocationAuthorizedUndefined: Self = StObject.set(x, "locationAuthorized", js.undefined)
    
    @scala.inline
    def setLocationEnabled(value: Boolean): Self = StObject.set(x, "locationEnabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLocationEnabledUndefined: Self = StObject.set(x, "locationEnabled", js.undefined)
    
    @scala.inline
    def setMicrophoneAuthorized(value: Boolean): Self = StObject.set(x, "microphoneAuthorized", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMicrophoneAuthorizedUndefined: Self = StObject.set(x, "microphoneAuthorized", js.undefined)
    
    @scala.inline
    def setModel(value: String): Self = StObject.set(x, "model", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setModelUndefined: Self = StObject.set(x, "model", js.undefined)
    
    @scala.inline
    def setNavigationBarHeight(value: Double): Self = StObject.set(x, "navigationBarHeight", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNavigationBarHeightUndefined: Self = StObject.set(x, "navigationBarHeight", js.undefined)
    
    @scala.inline
    def setNotificationAlertAuthorized(value: Boolean): Self = StObject.set(x, "notificationAlertAuthorized", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNotificationAlertAuthorizedUndefined: Self = StObject.set(x, "notificationAlertAuthorized", js.undefined)
    
    @scala.inline
    def setNotificationAuthorized(value: Boolean): Self = StObject.set(x, "notificationAuthorized", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNotificationAuthorizedUndefined: Self = StObject.set(x, "notificationAuthorized", js.undefined)
    
    @scala.inline
    def setNotificationBadgeAuthorized(value: Boolean): Self = StObject.set(x, "notificationBadgeAuthorized", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNotificationBadgeAuthorizedUndefined: Self = StObject.set(x, "notificationBadgeAuthorized", js.undefined)
    
    @scala.inline
    def setNotificationSoundAuthorized(value: Boolean): Self = StObject.set(x, "notificationSoundAuthorized", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNotificationSoundAuthorizedUndefined: Self = StObject.set(x, "notificationSoundAuthorized", js.undefined)
    
    @scala.inline
    def setPixelRatio(value: Double): Self = StObject.set(x, "pixelRatio", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPixelRatioUndefined: Self = StObject.set(x, "pixelRatio", js.undefined)
    
    @scala.inline
    def setPlatform(value: String): Self = StObject.set(x, "platform", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPlatformUndefined: Self = StObject.set(x, "platform", js.undefined)
    
    @scala.inline
    def setSDKVersion(value: String): Self = StObject.set(x, "SDKVersion", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSDKVersionUndefined: Self = StObject.set(x, "SDKVersion", js.undefined)
    
    @scala.inline
    def setSafeArea(value: SafeAreaResult): Self = StObject.set(x, "safeArea", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSafeAreaUndefined: Self = StObject.set(x, "safeArea", js.undefined)
    
    @scala.inline
    def setScreenHeight(value: Double): Self = StObject.set(x, "screenHeight", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setScreenHeightUndefined: Self = StObject.set(x, "screenHeight", js.undefined)
    
    @scala.inline
    def setScreenWidth(value: Double): Self = StObject.set(x, "screenWidth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setScreenWidthUndefined: Self = StObject.set(x, "screenWidth", js.undefined)
    
    @scala.inline
    def setStatusBarHeight(value: Double): Self = StObject.set(x, "statusBarHeight", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStatusBarHeightUndefined: Self = StObject.set(x, "statusBarHeight", js.undefined)
    
    @scala.inline
    def setStorage(value: String): Self = StObject.set(x, "storage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStorageUndefined: Self = StObject.set(x, "storage", js.undefined)
    
    @scala.inline
    def setSwanNativeVersion(value: String): Self = StObject.set(x, "swanNativeVersion", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSwanNativeVersionUndefined: Self = StObject.set(x, "swanNativeVersion", js.undefined)
    
    @scala.inline
    def setSystem(value: String): Self = StObject.set(x, "system", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSystemUndefined: Self = StObject.set(x, "system", js.undefined)
    
    @scala.inline
    def setTitleBarHeight(value: Double): Self = StObject.set(x, "titleBarHeight", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTitleBarHeightUndefined: Self = StObject.set(x, "titleBarHeight", js.undefined)
    
    @scala.inline
    def setVersion(value: Double): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVersionUndefined: Self = StObject.set(x, "version", js.undefined)
    
    @scala.inline
    def setWifiEnabled(value: Boolean): Self = StObject.set(x, "wifiEnabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWifiEnabledUndefined: Self = StObject.set(x, "wifiEnabled", js.undefined)
    
    @scala.inline
    def setWindowBottom(value: Double): Self = StObject.set(x, "windowBottom", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWindowBottomUndefined: Self = StObject.set(x, "windowBottom", js.undefined)
    
    @scala.inline
    def setWindowHeight(value: Double): Self = StObject.set(x, "windowHeight", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWindowHeightUndefined: Self = StObject.set(x, "windowHeight", js.undefined)
    
    @scala.inline
    def setWindowTop(value: Double): Self = StObject.set(x, "windowTop", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWindowTopUndefined: Self = StObject.set(x, "windowTop", js.undefined)
    
    @scala.inline
    def setWindowWidth(value: Double): Self = StObject.set(x, "windowWidth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWindowWidthUndefined: Self = StObject.set(x, "windowWidth", js.undefined)
  }
}

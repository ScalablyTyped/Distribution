package typings.wechatMiniprogram.WechatMiniprogram

import typings.wechatMiniprogram.wechatMiniprogramStrings.dark
import typings.wechatMiniprogram.wechatMiniprogramStrings.light
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetSystemInfoSuccessCallbackResult extends StObject {
  
  /** 客户端基础库版本
    *
    * 最低基础库： `1.1.0` */
  var SDKVersion: String
  
  /** 允许微信使用相册的开关（仅 iOS 有效）
    *
    * 最低基础库： `2.6.0` */
  var albumAuthorized: Boolean
  
  /** 设备性能等级（仅 Android）。取值为：-2 或 0（该设备无法运行小游戏），-1（性能未知），>=1（设备性能值，该值越高，设备性能越好，目前最高不到50）
    *
    * 最低基础库： `1.8.0` */
  var benchmarkLevel: Double
  
  /** 蓝牙的系统开关
    *
    * 最低基础库： `2.6.0` */
  var bluetoothEnabled: Boolean
  
  /** 设备品牌
    *
    * 最低基础库： `1.5.0` */
  var brand: String
  
  /** 允许微信使用摄像头的开关
    *
    * 最低基础库： `2.6.0` */
  var cameraAuthorized: Boolean
  
  var errMsg: String
  
  /** 用户字体大小（单位px）。以微信客户端「我-设置-通用-字体大小」中的设置为准
    *
    * 最低基础库： `1.5.0` */
  var fontSizeSetting: Double
  
  /** 微信设置的语言 */
  var language: String
  
  /** 允许微信使用定位的开关
    *
    * 最低基础库： `2.6.0` */
  var locationAuthorized: Boolean
  
  /** 地理位置的系统开关
    *
    * 最低基础库： `2.6.0` */
  var locationEnabled: Boolean
  
  /** 允许微信使用麦克风的开关
    *
    * 最低基础库： `2.6.0` */
  var microphoneAuthorized: Boolean
  
  /** 设备型号 */
  var model: String
  
  /** 允许微信通知带有提醒的开关（仅 iOS 有效）
    *
    * 最低基础库： `2.6.0` */
  var notificationAlertAuthorized: Boolean
  
  /** 允许微信通知的开关
    *
    * 最低基础库： `2.6.0` */
  var notificationAuthorized: Boolean
  
  /** 允许微信通知带有标记的开关（仅 iOS 有效）
    *
    * 最低基础库： `2.6.0` */
  var notificationBadgeAuthorized: Boolean
  
  /** 允许微信通知带有声音的开关（仅 iOS 有效）
    *
    * 最低基础库： `2.6.0` */
  var notificationSoundAuthorized: Boolean
  
  /** 设备像素比 */
  var pixelRatio: Double
  
  /** 客户端平台 */
  var platform: String
  
  /** 在竖屏正方向下的安全区域
    *
    * 最低基础库： `2.7.0` */
  var safeArea: SafeAreaResult
  
  /** 屏幕高度，单位px
    *
    * 最低基础库： `1.1.0` */
  var screenHeight: Double
  
  /** 屏幕宽度，单位px
    *
    * 最低基础库： `1.1.0` */
  var screenWidth: Double
  
  /** 状态栏的高度，单位px
    *
    * 最低基础库： `1.9.0` */
  var statusBarHeight: Double
  
  /** 操作系统及版本 */
  var system: String
  
  /** 系统当前主题，取值为`light`或`dark`，全局配置`"darkmode":true`时才能获取，否则为 undefined （不支持小游戏）
    *
    * 可选值：
    * - 'dark': 深色主题;
    * - 'light': 浅色主题;
    *
    * 最低基础库： `2.11.0` */
  var theme: js.UndefOr[dark | light] = js.undefined
  
  /** 微信版本号 */
  var version: String
  
  /** Wi-Fi 的系统开关
    *
    * 最低基础库： `2.6.0` */
  var wifiEnabled: Boolean
  
  /** 可使用窗口高度，单位px */
  var windowHeight: Double
  
  /** 可使用窗口宽度，单位px */
  var windowWidth: Double
}
object GetSystemInfoSuccessCallbackResult {
  
  inline def apply(
    SDKVersion: String,
    albumAuthorized: Boolean,
    benchmarkLevel: Double,
    bluetoothEnabled: Boolean,
    brand: String,
    cameraAuthorized: Boolean,
    errMsg: String,
    fontSizeSetting: Double,
    language: String,
    locationAuthorized: Boolean,
    locationEnabled: Boolean,
    microphoneAuthorized: Boolean,
    model: String,
    notificationAlertAuthorized: Boolean,
    notificationAuthorized: Boolean,
    notificationBadgeAuthorized: Boolean,
    notificationSoundAuthorized: Boolean,
    pixelRatio: Double,
    platform: String,
    safeArea: SafeAreaResult,
    screenHeight: Double,
    screenWidth: Double,
    statusBarHeight: Double,
    system: String,
    version: String,
    wifiEnabled: Boolean,
    windowHeight: Double,
    windowWidth: Double
  ): GetSystemInfoSuccessCallbackResult = {
    val __obj = js.Dynamic.literal(SDKVersion = SDKVersion.asInstanceOf[js.Any], albumAuthorized = albumAuthorized.asInstanceOf[js.Any], benchmarkLevel = benchmarkLevel.asInstanceOf[js.Any], bluetoothEnabled = bluetoothEnabled.asInstanceOf[js.Any], brand = brand.asInstanceOf[js.Any], cameraAuthorized = cameraAuthorized.asInstanceOf[js.Any], errMsg = errMsg.asInstanceOf[js.Any], fontSizeSetting = fontSizeSetting.asInstanceOf[js.Any], language = language.asInstanceOf[js.Any], locationAuthorized = locationAuthorized.asInstanceOf[js.Any], locationEnabled = locationEnabled.asInstanceOf[js.Any], microphoneAuthorized = microphoneAuthorized.asInstanceOf[js.Any], model = model.asInstanceOf[js.Any], notificationAlertAuthorized = notificationAlertAuthorized.asInstanceOf[js.Any], notificationAuthorized = notificationAuthorized.asInstanceOf[js.Any], notificationBadgeAuthorized = notificationBadgeAuthorized.asInstanceOf[js.Any], notificationSoundAuthorized = notificationSoundAuthorized.asInstanceOf[js.Any], pixelRatio = pixelRatio.asInstanceOf[js.Any], platform = platform.asInstanceOf[js.Any], safeArea = safeArea.asInstanceOf[js.Any], screenHeight = screenHeight.asInstanceOf[js.Any], screenWidth = screenWidth.asInstanceOf[js.Any], statusBarHeight = statusBarHeight.asInstanceOf[js.Any], system = system.asInstanceOf[js.Any], version = version.asInstanceOf[js.Any], wifiEnabled = wifiEnabled.asInstanceOf[js.Any], windowHeight = windowHeight.asInstanceOf[js.Any], windowWidth = windowWidth.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetSystemInfoSuccessCallbackResult]
  }
  
  extension [Self <: GetSystemInfoSuccessCallbackResult](x: Self) {
    
    inline def setAlbumAuthorized(value: Boolean): Self = StObject.set(x, "albumAuthorized", value.asInstanceOf[js.Any])
    
    inline def setBenchmarkLevel(value: Double): Self = StObject.set(x, "benchmarkLevel", value.asInstanceOf[js.Any])
    
    inline def setBluetoothEnabled(value: Boolean): Self = StObject.set(x, "bluetoothEnabled", value.asInstanceOf[js.Any])
    
    inline def setBrand(value: String): Self = StObject.set(x, "brand", value.asInstanceOf[js.Any])
    
    inline def setCameraAuthorized(value: Boolean): Self = StObject.set(x, "cameraAuthorized", value.asInstanceOf[js.Any])
    
    inline def setErrMsg(value: String): Self = StObject.set(x, "errMsg", value.asInstanceOf[js.Any])
    
    inline def setFontSizeSetting(value: Double): Self = StObject.set(x, "fontSizeSetting", value.asInstanceOf[js.Any])
    
    inline def setLanguage(value: String): Self = StObject.set(x, "language", value.asInstanceOf[js.Any])
    
    inline def setLocationAuthorized(value: Boolean): Self = StObject.set(x, "locationAuthorized", value.asInstanceOf[js.Any])
    
    inline def setLocationEnabled(value: Boolean): Self = StObject.set(x, "locationEnabled", value.asInstanceOf[js.Any])
    
    inline def setMicrophoneAuthorized(value: Boolean): Self = StObject.set(x, "microphoneAuthorized", value.asInstanceOf[js.Any])
    
    inline def setModel(value: String): Self = StObject.set(x, "model", value.asInstanceOf[js.Any])
    
    inline def setNotificationAlertAuthorized(value: Boolean): Self = StObject.set(x, "notificationAlertAuthorized", value.asInstanceOf[js.Any])
    
    inline def setNotificationAuthorized(value: Boolean): Self = StObject.set(x, "notificationAuthorized", value.asInstanceOf[js.Any])
    
    inline def setNotificationBadgeAuthorized(value: Boolean): Self = StObject.set(x, "notificationBadgeAuthorized", value.asInstanceOf[js.Any])
    
    inline def setNotificationSoundAuthorized(value: Boolean): Self = StObject.set(x, "notificationSoundAuthorized", value.asInstanceOf[js.Any])
    
    inline def setPixelRatio(value: Double): Self = StObject.set(x, "pixelRatio", value.asInstanceOf[js.Any])
    
    inline def setPlatform(value: String): Self = StObject.set(x, "platform", value.asInstanceOf[js.Any])
    
    inline def setSDKVersion(value: String): Self = StObject.set(x, "SDKVersion", value.asInstanceOf[js.Any])
    
    inline def setSafeArea(value: SafeAreaResult): Self = StObject.set(x, "safeArea", value.asInstanceOf[js.Any])
    
    inline def setScreenHeight(value: Double): Self = StObject.set(x, "screenHeight", value.asInstanceOf[js.Any])
    
    inline def setScreenWidth(value: Double): Self = StObject.set(x, "screenWidth", value.asInstanceOf[js.Any])
    
    inline def setStatusBarHeight(value: Double): Self = StObject.set(x, "statusBarHeight", value.asInstanceOf[js.Any])
    
    inline def setSystem(value: String): Self = StObject.set(x, "system", value.asInstanceOf[js.Any])
    
    inline def setTheme(value: dark | light): Self = StObject.set(x, "theme", value.asInstanceOf[js.Any])
    
    inline def setThemeUndefined: Self = StObject.set(x, "theme", js.undefined)
    
    inline def setVersion(value: String): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
    
    inline def setWifiEnabled(value: Boolean): Self = StObject.set(x, "wifiEnabled", value.asInstanceOf[js.Any])
    
    inline def setWindowHeight(value: Double): Self = StObject.set(x, "windowHeight", value.asInstanceOf[js.Any])
    
    inline def setWindowWidth(value: Double): Self = StObject.set(x, "windowWidth", value.asInstanceOf[js.Any])
  }
}

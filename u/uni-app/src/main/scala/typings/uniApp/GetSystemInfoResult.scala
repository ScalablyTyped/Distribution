package typings.uniApp

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetSystemInfoResult extends js.Object {
  /**
    * App平台
    */
  var AppPlatform: js.UndefOr[String] = js.undefined
  /**
    * 客户端基础库版本
    */
  var SDKVersion: js.UndefOr[String] = js.undefined
  /**
    * 允许微信使用相册的开关（仅 iOS 有效）
    */
  var albumAuthorized: js.UndefOr[Boolean] = js.undefined
  /**
    * 当前运行的客户端
    */
  var app: js.UndefOr[String] = js.undefined
  /**
    * 宿主APP名称
    */
  var appName: js.UndefOr[String] = js.undefined
  /**
    * 蓝牙的系统开关
    */
  var bluetoothEnabled: js.UndefOr[Boolean] = js.undefined
  /**
    * 手机品牌
    */
  var brand: js.UndefOr[String] = js.undefined
  /**
    * 上一次缓存的位置信息
    */
  var cacheLocation: js.UndefOr[js.Any] = js.undefined
  /**
    * 允许微信使用摄像头的开关
    */
  var cameraAuthorized: js.UndefOr[Boolean] = js.undefined
  /**
    * 当前电量百分比
    */
  var currentBattery: js.UndefOr[String] = js.undefined
  /**
    * 用户字体大小设置
    */
  var fontSizeSetting: js.UndefOr[Double] = js.undefined
  /**
    * 宿主平台
    */
  var host: js.UndefOr[String] = js.undefined
  /**
    * 程序设置的语言
    */
  var language: js.UndefOr[String] = js.undefined
  /**
    * 允许微信使用定位的开关
    */
  var locationAuthorized: js.UndefOr[Boolean] = js.undefined
  /**
    * 地理位置的系统开关
    */
  var locationEnabled: js.UndefOr[Boolean] = js.undefined
  /**
    * 允许微信使用麦克风的开关
    */
  var microphoneAuthorized: js.UndefOr[Boolean] = js.undefined
  /**
    * 手机型号
    */
  var model: js.UndefOr[String] = js.undefined
  /**
    * 导航栏的高度
    */
  var navigationBarHeight: js.UndefOr[Double] = js.undefined
  /**
    * 允许微信通知带有提醒的开关（仅 iOS 有效）
    */
  var notificationAlertAuthorized: js.UndefOr[Boolean] = js.undefined
  /**
    * 允许微信通知的开关
    */
  var notificationAuthorized: js.UndefOr[Boolean] = js.undefined
  /**
    * 允许微信通知带有标记的开关（仅 iOS 有效）
    */
  var notificationBadgeAuthorized: js.UndefOr[Boolean] = js.undefined
  /**
    * 允许微信通知带有声音的开关（仅 iOS 有效）
    */
  var notificationSoundAuthorized: js.UndefOr[Boolean] = js.undefined
  /**
    * 设备像素比
    */
  var pixelRatio: js.UndefOr[Double] = js.undefined
  /**
    * 客户端平台
    */
  var platform: js.UndefOr[String] = js.undefined
  /**
    * 在竖屏正方向下的安全区域
    */
  var safeArea: js.UndefOr[SafeAreaResult] = js.undefined
  /**
    * 屏幕高度
    */
  var screenHeight: js.UndefOr[Double] = js.undefined
  /**
    * 屏幕宽度
    */
  var screenWidth: js.UndefOr[Double] = js.undefined
  /**
    * 状态栏的高度
    */
  var statusBarHeight: js.UndefOr[Double] = js.undefined
  /**
    * 设备磁盘容量
    */
  var storage: js.UndefOr[String] = js.undefined
  /**
    * 宿主平台版本号
    */
  var swanNativeVersion: js.UndefOr[String] = js.undefined
  /**
    * 操作系统版本
    */
  var system: js.UndefOr[String] = js.undefined
  /**
    * 标题栏高度
    */
  var titleBarHeight: js.UndefOr[Double] = js.undefined
  /**
    * 引擎版本号
    */
  var version: js.UndefOr[Double] = js.undefined
  /**
    * Wi-Fi 的系统开关
    */
  var wifiEnabled: js.UndefOr[Boolean] = js.undefined
  /**
    * 可使用窗口的底部位置
    */
  var windowBottom: js.UndefOr[Double] = js.undefined
  /**
    * 可使用窗口高度
    */
  var windowHeight: js.UndefOr[Double] = js.undefined
  /**
    * 可使用窗口的顶部位置
    */
  var windowTop: js.UndefOr[Double] = js.undefined
  /**
    * 可使用窗口宽度
    */
  var windowWidth: js.UndefOr[Double] = js.undefined
}

object GetSystemInfoResult {
  @scala.inline
  def apply(
    AppPlatform: String = null,
    SDKVersion: String = null,
    albumAuthorized: js.UndefOr[Boolean] = js.undefined,
    app: String = null,
    appName: String = null,
    bluetoothEnabled: js.UndefOr[Boolean] = js.undefined,
    brand: String = null,
    cacheLocation: js.Any = null,
    cameraAuthorized: js.UndefOr[Boolean] = js.undefined,
    currentBattery: String = null,
    fontSizeSetting: Int | Double = null,
    host: String = null,
    language: String = null,
    locationAuthorized: js.UndefOr[Boolean] = js.undefined,
    locationEnabled: js.UndefOr[Boolean] = js.undefined,
    microphoneAuthorized: js.UndefOr[Boolean] = js.undefined,
    model: String = null,
    navigationBarHeight: Int | Double = null,
    notificationAlertAuthorized: js.UndefOr[Boolean] = js.undefined,
    notificationAuthorized: js.UndefOr[Boolean] = js.undefined,
    notificationBadgeAuthorized: js.UndefOr[Boolean] = js.undefined,
    notificationSoundAuthorized: js.UndefOr[Boolean] = js.undefined,
    pixelRatio: Int | Double = null,
    platform: String = null,
    safeArea: SafeAreaResult = null,
    screenHeight: Int | Double = null,
    screenWidth: Int | Double = null,
    statusBarHeight: Int | Double = null,
    storage: String = null,
    swanNativeVersion: String = null,
    system: String = null,
    titleBarHeight: Int | Double = null,
    version: Int | Double = null,
    wifiEnabled: js.UndefOr[Boolean] = js.undefined,
    windowBottom: Int | Double = null,
    windowHeight: Int | Double = null,
    windowTop: Int | Double = null,
    windowWidth: Int | Double = null
  ): GetSystemInfoResult = {
    val __obj = js.Dynamic.literal()
    if (AppPlatform != null) __obj.updateDynamic("AppPlatform")(AppPlatform.asInstanceOf[js.Any])
    if (SDKVersion != null) __obj.updateDynamic("SDKVersion")(SDKVersion.asInstanceOf[js.Any])
    if (!js.isUndefined(albumAuthorized)) __obj.updateDynamic("albumAuthorized")(albumAuthorized.asInstanceOf[js.Any])
    if (app != null) __obj.updateDynamic("app")(app.asInstanceOf[js.Any])
    if (appName != null) __obj.updateDynamic("appName")(appName.asInstanceOf[js.Any])
    if (!js.isUndefined(bluetoothEnabled)) __obj.updateDynamic("bluetoothEnabled")(bluetoothEnabled.asInstanceOf[js.Any])
    if (brand != null) __obj.updateDynamic("brand")(brand.asInstanceOf[js.Any])
    if (cacheLocation != null) __obj.updateDynamic("cacheLocation")(cacheLocation.asInstanceOf[js.Any])
    if (!js.isUndefined(cameraAuthorized)) __obj.updateDynamic("cameraAuthorized")(cameraAuthorized.asInstanceOf[js.Any])
    if (currentBattery != null) __obj.updateDynamic("currentBattery")(currentBattery.asInstanceOf[js.Any])
    if (fontSizeSetting != null) __obj.updateDynamic("fontSizeSetting")(fontSizeSetting.asInstanceOf[js.Any])
    if (host != null) __obj.updateDynamic("host")(host.asInstanceOf[js.Any])
    if (language != null) __obj.updateDynamic("language")(language.asInstanceOf[js.Any])
    if (!js.isUndefined(locationAuthorized)) __obj.updateDynamic("locationAuthorized")(locationAuthorized.asInstanceOf[js.Any])
    if (!js.isUndefined(locationEnabled)) __obj.updateDynamic("locationEnabled")(locationEnabled.asInstanceOf[js.Any])
    if (!js.isUndefined(microphoneAuthorized)) __obj.updateDynamic("microphoneAuthorized")(microphoneAuthorized.asInstanceOf[js.Any])
    if (model != null) __obj.updateDynamic("model")(model.asInstanceOf[js.Any])
    if (navigationBarHeight != null) __obj.updateDynamic("navigationBarHeight")(navigationBarHeight.asInstanceOf[js.Any])
    if (!js.isUndefined(notificationAlertAuthorized)) __obj.updateDynamic("notificationAlertAuthorized")(notificationAlertAuthorized.asInstanceOf[js.Any])
    if (!js.isUndefined(notificationAuthorized)) __obj.updateDynamic("notificationAuthorized")(notificationAuthorized.asInstanceOf[js.Any])
    if (!js.isUndefined(notificationBadgeAuthorized)) __obj.updateDynamic("notificationBadgeAuthorized")(notificationBadgeAuthorized.asInstanceOf[js.Any])
    if (!js.isUndefined(notificationSoundAuthorized)) __obj.updateDynamic("notificationSoundAuthorized")(notificationSoundAuthorized.asInstanceOf[js.Any])
    if (pixelRatio != null) __obj.updateDynamic("pixelRatio")(pixelRatio.asInstanceOf[js.Any])
    if (platform != null) __obj.updateDynamic("platform")(platform.asInstanceOf[js.Any])
    if (safeArea != null) __obj.updateDynamic("safeArea")(safeArea.asInstanceOf[js.Any])
    if (screenHeight != null) __obj.updateDynamic("screenHeight")(screenHeight.asInstanceOf[js.Any])
    if (screenWidth != null) __obj.updateDynamic("screenWidth")(screenWidth.asInstanceOf[js.Any])
    if (statusBarHeight != null) __obj.updateDynamic("statusBarHeight")(statusBarHeight.asInstanceOf[js.Any])
    if (storage != null) __obj.updateDynamic("storage")(storage.asInstanceOf[js.Any])
    if (swanNativeVersion != null) __obj.updateDynamic("swanNativeVersion")(swanNativeVersion.asInstanceOf[js.Any])
    if (system != null) __obj.updateDynamic("system")(system.asInstanceOf[js.Any])
    if (titleBarHeight != null) __obj.updateDynamic("titleBarHeight")(titleBarHeight.asInstanceOf[js.Any])
    if (version != null) __obj.updateDynamic("version")(version.asInstanceOf[js.Any])
    if (!js.isUndefined(wifiEnabled)) __obj.updateDynamic("wifiEnabled")(wifiEnabled.asInstanceOf[js.Any])
    if (windowBottom != null) __obj.updateDynamic("windowBottom")(windowBottom.asInstanceOf[js.Any])
    if (windowHeight != null) __obj.updateDynamic("windowHeight")(windowHeight.asInstanceOf[js.Any])
    if (windowTop != null) __obj.updateDynamic("windowTop")(windowTop.asInstanceOf[js.Any])
    if (windowWidth != null) __obj.updateDynamic("windowWidth")(windowWidth.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetSystemInfoResult]
  }
}


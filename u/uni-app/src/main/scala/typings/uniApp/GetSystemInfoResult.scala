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
    fontSizeSetting: js.UndefOr[Double] = js.undefined,
    host: String = null,
    language: String = null,
    locationAuthorized: js.UndefOr[Boolean] = js.undefined,
    locationEnabled: js.UndefOr[Boolean] = js.undefined,
    microphoneAuthorized: js.UndefOr[Boolean] = js.undefined,
    model: String = null,
    navigationBarHeight: js.UndefOr[Double] = js.undefined,
    notificationAlertAuthorized: js.UndefOr[Boolean] = js.undefined,
    notificationAuthorized: js.UndefOr[Boolean] = js.undefined,
    notificationBadgeAuthorized: js.UndefOr[Boolean] = js.undefined,
    notificationSoundAuthorized: js.UndefOr[Boolean] = js.undefined,
    pixelRatio: js.UndefOr[Double] = js.undefined,
    platform: String = null,
    safeArea: SafeAreaResult = null,
    screenHeight: js.UndefOr[Double] = js.undefined,
    screenWidth: js.UndefOr[Double] = js.undefined,
    statusBarHeight: js.UndefOr[Double] = js.undefined,
    storage: String = null,
    swanNativeVersion: String = null,
    system: String = null,
    titleBarHeight: js.UndefOr[Double] = js.undefined,
    version: js.UndefOr[Double] = js.undefined,
    wifiEnabled: js.UndefOr[Boolean] = js.undefined,
    windowBottom: js.UndefOr[Double] = js.undefined,
    windowHeight: js.UndefOr[Double] = js.undefined,
    windowTop: js.UndefOr[Double] = js.undefined,
    windowWidth: js.UndefOr[Double] = js.undefined
  ): GetSystemInfoResult = {
    val __obj = js.Dynamic.literal()
    if (AppPlatform != null) __obj.updateDynamic("AppPlatform")(AppPlatform.asInstanceOf[js.Any])
    if (SDKVersion != null) __obj.updateDynamic("SDKVersion")(SDKVersion.asInstanceOf[js.Any])
    if (!js.isUndefined(albumAuthorized)) __obj.updateDynamic("albumAuthorized")(albumAuthorized.get.asInstanceOf[js.Any])
    if (app != null) __obj.updateDynamic("app")(app.asInstanceOf[js.Any])
    if (appName != null) __obj.updateDynamic("appName")(appName.asInstanceOf[js.Any])
    if (!js.isUndefined(bluetoothEnabled)) __obj.updateDynamic("bluetoothEnabled")(bluetoothEnabled.get.asInstanceOf[js.Any])
    if (brand != null) __obj.updateDynamic("brand")(brand.asInstanceOf[js.Any])
    if (cacheLocation != null) __obj.updateDynamic("cacheLocation")(cacheLocation.asInstanceOf[js.Any])
    if (!js.isUndefined(cameraAuthorized)) __obj.updateDynamic("cameraAuthorized")(cameraAuthorized.get.asInstanceOf[js.Any])
    if (currentBattery != null) __obj.updateDynamic("currentBattery")(currentBattery.asInstanceOf[js.Any])
    if (!js.isUndefined(fontSizeSetting)) __obj.updateDynamic("fontSizeSetting")(fontSizeSetting.get.asInstanceOf[js.Any])
    if (host != null) __obj.updateDynamic("host")(host.asInstanceOf[js.Any])
    if (language != null) __obj.updateDynamic("language")(language.asInstanceOf[js.Any])
    if (!js.isUndefined(locationAuthorized)) __obj.updateDynamic("locationAuthorized")(locationAuthorized.get.asInstanceOf[js.Any])
    if (!js.isUndefined(locationEnabled)) __obj.updateDynamic("locationEnabled")(locationEnabled.get.asInstanceOf[js.Any])
    if (!js.isUndefined(microphoneAuthorized)) __obj.updateDynamic("microphoneAuthorized")(microphoneAuthorized.get.asInstanceOf[js.Any])
    if (model != null) __obj.updateDynamic("model")(model.asInstanceOf[js.Any])
    if (!js.isUndefined(navigationBarHeight)) __obj.updateDynamic("navigationBarHeight")(navigationBarHeight.get.asInstanceOf[js.Any])
    if (!js.isUndefined(notificationAlertAuthorized)) __obj.updateDynamic("notificationAlertAuthorized")(notificationAlertAuthorized.get.asInstanceOf[js.Any])
    if (!js.isUndefined(notificationAuthorized)) __obj.updateDynamic("notificationAuthorized")(notificationAuthorized.get.asInstanceOf[js.Any])
    if (!js.isUndefined(notificationBadgeAuthorized)) __obj.updateDynamic("notificationBadgeAuthorized")(notificationBadgeAuthorized.get.asInstanceOf[js.Any])
    if (!js.isUndefined(notificationSoundAuthorized)) __obj.updateDynamic("notificationSoundAuthorized")(notificationSoundAuthorized.get.asInstanceOf[js.Any])
    if (!js.isUndefined(pixelRatio)) __obj.updateDynamic("pixelRatio")(pixelRatio.get.asInstanceOf[js.Any])
    if (platform != null) __obj.updateDynamic("platform")(platform.asInstanceOf[js.Any])
    if (safeArea != null) __obj.updateDynamic("safeArea")(safeArea.asInstanceOf[js.Any])
    if (!js.isUndefined(screenHeight)) __obj.updateDynamic("screenHeight")(screenHeight.get.asInstanceOf[js.Any])
    if (!js.isUndefined(screenWidth)) __obj.updateDynamic("screenWidth")(screenWidth.get.asInstanceOf[js.Any])
    if (!js.isUndefined(statusBarHeight)) __obj.updateDynamic("statusBarHeight")(statusBarHeight.get.asInstanceOf[js.Any])
    if (storage != null) __obj.updateDynamic("storage")(storage.asInstanceOf[js.Any])
    if (swanNativeVersion != null) __obj.updateDynamic("swanNativeVersion")(swanNativeVersion.asInstanceOf[js.Any])
    if (system != null) __obj.updateDynamic("system")(system.asInstanceOf[js.Any])
    if (!js.isUndefined(titleBarHeight)) __obj.updateDynamic("titleBarHeight")(titleBarHeight.get.asInstanceOf[js.Any])
    if (!js.isUndefined(version)) __obj.updateDynamic("version")(version.get.asInstanceOf[js.Any])
    if (!js.isUndefined(wifiEnabled)) __obj.updateDynamic("wifiEnabled")(wifiEnabled.get.asInstanceOf[js.Any])
    if (!js.isUndefined(windowBottom)) __obj.updateDynamic("windowBottom")(windowBottom.get.asInstanceOf[js.Any])
    if (!js.isUndefined(windowHeight)) __obj.updateDynamic("windowHeight")(windowHeight.get.asInstanceOf[js.Any])
    if (!js.isUndefined(windowTop)) __obj.updateDynamic("windowTop")(windowTop.get.asInstanceOf[js.Any])
    if (!js.isUndefined(windowWidth)) __obj.updateDynamic("windowWidth")(windowWidth.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetSystemInfoResult]
  }
}


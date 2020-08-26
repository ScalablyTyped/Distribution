package typings.wegameApi.wx.types

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// --系统信息
@js.native
trait SystemInfo extends js.Object {
  /**
    * 客户端基础库版本
    */
  var SDKVersion: String = js.native
  /**
    * 电量，范围 1 - 100
    */
  var battery: Double = js.native
  /**
    * 性能等级
    */
  var benchmarkLevel: Double = js.native
  /**
    * 手机品牌
    */
  var brand: String = js.native
  /**
    * 用户字体大小设置。以“我-设置-通用-字体大小”中的设置为准，单位 px。
    */
  var fontSizeSetting: String = js.native
  /**
    * 微信设置的语言
    */
  var language: String = js.native
  /**
    * 手机型号
    */
  var model: String = js.native
  /**
    * 设备像素比
    */
  var pixelRatio: Double = js.native
  /**
    * 客户端平台
    */
  var platform: String = js.native
  /**
    * 屏幕高度
    */
  var screenHeight: Double = js.native
  /**
    * 屏幕宽度
    */
  var screenWidth: Double = js.native
  /**
    * 操作系统版本
    */
  var system: String = js.native
  /**
    * 微信版本号
    */
  var version: String = js.native
  /**
    * wifi 信号强度，范围 0 - 4
    */
  var wifiSignal: Double = js.native
  /**
    * 可使用窗口高度
    */
  var windowHeight: Double = js.native
  /**
    * 可使用窗口宽度
    */
  var windowWidth: Double = js.native
}

object SystemInfo {
  @scala.inline
  def apply(
    SDKVersion: String,
    battery: Double,
    benchmarkLevel: Double,
    brand: String,
    fontSizeSetting: String,
    language: String,
    model: String,
    pixelRatio: Double,
    platform: String,
    screenHeight: Double,
    screenWidth: Double,
    system: String,
    version: String,
    wifiSignal: Double,
    windowHeight: Double,
    windowWidth: Double
  ): SystemInfo = {
    val __obj = js.Dynamic.literal(SDKVersion = SDKVersion.asInstanceOf[js.Any], battery = battery.asInstanceOf[js.Any], benchmarkLevel = benchmarkLevel.asInstanceOf[js.Any], brand = brand.asInstanceOf[js.Any], fontSizeSetting = fontSizeSetting.asInstanceOf[js.Any], language = language.asInstanceOf[js.Any], model = model.asInstanceOf[js.Any], pixelRatio = pixelRatio.asInstanceOf[js.Any], platform = platform.asInstanceOf[js.Any], screenHeight = screenHeight.asInstanceOf[js.Any], screenWidth = screenWidth.asInstanceOf[js.Any], system = system.asInstanceOf[js.Any], version = version.asInstanceOf[js.Any], wifiSignal = wifiSignal.asInstanceOf[js.Any], windowHeight = windowHeight.asInstanceOf[js.Any], windowWidth = windowWidth.asInstanceOf[js.Any])
    __obj.asInstanceOf[SystemInfo]
  }
  @scala.inline
  implicit class SystemInfoOps[Self <: SystemInfo] (val x: Self) extends AnyVal {
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
    def setSDKVersion(value: String): Self = this.set("SDKVersion", value.asInstanceOf[js.Any])
    @scala.inline
    def setBattery(value: Double): Self = this.set("battery", value.asInstanceOf[js.Any])
    @scala.inline
    def setBenchmarkLevel(value: Double): Self = this.set("benchmarkLevel", value.asInstanceOf[js.Any])
    @scala.inline
    def setBrand(value: String): Self = this.set("brand", value.asInstanceOf[js.Any])
    @scala.inline
    def setFontSizeSetting(value: String): Self = this.set("fontSizeSetting", value.asInstanceOf[js.Any])
    @scala.inline
    def setLanguage(value: String): Self = this.set("language", value.asInstanceOf[js.Any])
    @scala.inline
    def setModel(value: String): Self = this.set("model", value.asInstanceOf[js.Any])
    @scala.inline
    def setPixelRatio(value: Double): Self = this.set("pixelRatio", value.asInstanceOf[js.Any])
    @scala.inline
    def setPlatform(value: String): Self = this.set("platform", value.asInstanceOf[js.Any])
    @scala.inline
    def setScreenHeight(value: Double): Self = this.set("screenHeight", value.asInstanceOf[js.Any])
    @scala.inline
    def setScreenWidth(value: Double): Self = this.set("screenWidth", value.asInstanceOf[js.Any])
    @scala.inline
    def setSystem(value: String): Self = this.set("system", value.asInstanceOf[js.Any])
    @scala.inline
    def setVersion(value: String): Self = this.set("version", value.asInstanceOf[js.Any])
    @scala.inline
    def setWifiSignal(value: Double): Self = this.set("wifiSignal", value.asInstanceOf[js.Any])
    @scala.inline
    def setWindowHeight(value: Double): Self = this.set("windowHeight", value.asInstanceOf[js.Any])
    @scala.inline
    def setWindowWidth(value: Double): Self = this.set("windowWidth", value.asInstanceOf[js.Any])
  }
  
}


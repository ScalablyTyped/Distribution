package typings.wepy.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Brand extends js.Object {
  var SDKVersion: String = js.native
  var brand: String = js.native
  var fontSizeSetting: String = js.native
  var language: String = js.native
  var model: String = js.native
  var pixelRatio: Double = js.native
  var platform: String = js.native
  var screenHeight: Double = js.native
  var screenWidth: Double = js.native
  var statusBarHeight: Double = js.native
  var system: String = js.native
  var version: String = js.native
  var windowHeight: Double = js.native
  var windowWidth: Double = js.native
}

object Brand {
  @scala.inline
  def apply(
    SDKVersion: String,
    brand: String,
    fontSizeSetting: String,
    language: String,
    model: String,
    pixelRatio: Double,
    platform: String,
    screenHeight: Double,
    screenWidth: Double,
    statusBarHeight: Double,
    system: String,
    version: String,
    windowHeight: Double,
    windowWidth: Double
  ): Brand = {
    val __obj = js.Dynamic.literal(SDKVersion = SDKVersion.asInstanceOf[js.Any], brand = brand.asInstanceOf[js.Any], fontSizeSetting = fontSizeSetting.asInstanceOf[js.Any], language = language.asInstanceOf[js.Any], model = model.asInstanceOf[js.Any], pixelRatio = pixelRatio.asInstanceOf[js.Any], platform = platform.asInstanceOf[js.Any], screenHeight = screenHeight.asInstanceOf[js.Any], screenWidth = screenWidth.asInstanceOf[js.Any], statusBarHeight = statusBarHeight.asInstanceOf[js.Any], system = system.asInstanceOf[js.Any], version = version.asInstanceOf[js.Any], windowHeight = windowHeight.asInstanceOf[js.Any], windowWidth = windowWidth.asInstanceOf[js.Any])
    __obj.asInstanceOf[Brand]
  }
  @scala.inline
  implicit class BrandOps[Self <: Brand] (val x: Self) extends AnyVal {
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
    def setStatusBarHeight(value: Double): Self = this.set("statusBarHeight", value.asInstanceOf[js.Any])
    @scala.inline
    def setSystem(value: String): Self = this.set("system", value.asInstanceOf[js.Any])
    @scala.inline
    def setVersion(value: String): Self = this.set("version", value.asInstanceOf[js.Any])
    @scala.inline
    def setWindowHeight(value: Double): Self = this.set("windowHeight", value.asInstanceOf[js.Any])
    @scala.inline
    def setWindowWidth(value: Double): Self = this.set("windowWidth", value.asInstanceOf[js.Any])
  }
  
}


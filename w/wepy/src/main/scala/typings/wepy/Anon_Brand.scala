package typings.wepy

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Brand extends js.Object {
  var SDKVersion: String
  var brand: String
  var fontSizeSetting: String
  var language: String
  var model: String
  var pixelRatio: Double
  var platform: String
  var screenHeight: Double
  var screenWidth: Double
  var statusBarHeight: Double
  var system: String
  var version: String
  var windowHeight: Double
  var windowWidth: Double
}

object Anon_Brand {
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
  ): Anon_Brand = {
    val __obj = js.Dynamic.literal(SDKVersion = SDKVersion, brand = brand, fontSizeSetting = fontSizeSetting, language = language, model = model, pixelRatio = pixelRatio, platform = platform, screenHeight = screenHeight, screenWidth = screenWidth, statusBarHeight = statusBarHeight, system = system, version = version, windowHeight = windowHeight, windowWidth = windowWidth)
  
    __obj.asInstanceOf[Anon_Brand]
  }
}


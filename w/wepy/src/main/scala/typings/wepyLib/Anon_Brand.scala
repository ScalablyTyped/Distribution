package typings
package wepyLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Brand extends js.Object {
  var SDKVersion: java.lang.String
  var brand: java.lang.String
  var fontSizeSetting: java.lang.String
  var language: java.lang.String
  var model: java.lang.String
  var pixelRatio: scala.Double
  var platform: java.lang.String
  var screenHeight: scala.Double
  var screenWidth: scala.Double
  var statusBarHeight: scala.Double
  var system: java.lang.String
  var version: java.lang.String
  var windowHeight: scala.Double
  var windowWidth: scala.Double
}

object Anon_Brand {
  @scala.inline
  def apply(
    SDKVersion: java.lang.String,
    brand: java.lang.String,
    fontSizeSetting: java.lang.String,
    language: java.lang.String,
    model: java.lang.String,
    pixelRatio: scala.Double,
    platform: java.lang.String,
    screenHeight: scala.Double,
    screenWidth: scala.Double,
    statusBarHeight: scala.Double,
    system: java.lang.String,
    version: java.lang.String,
    windowHeight: scala.Double,
    windowWidth: scala.Double
  ): Anon_Brand = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("SDKVersion")(SDKVersion)
    __obj.updateDynamic("brand")(brand)
    __obj.updateDynamic("fontSizeSetting")(fontSizeSetting)
    __obj.updateDynamic("language")(language)
    __obj.updateDynamic("model")(model)
    __obj.updateDynamic("pixelRatio")(pixelRatio)
    __obj.updateDynamic("platform")(platform)
    __obj.updateDynamic("screenHeight")(screenHeight)
    __obj.updateDynamic("screenWidth")(screenWidth)
    __obj.updateDynamic("statusBarHeight")(statusBarHeight)
    __obj.updateDynamic("system")(system)
    __obj.updateDynamic("version")(version)
    __obj.updateDynamic("windowHeight")(windowHeight)
    __obj.updateDynamic("windowWidth")(windowWidth)
    __obj.asInstanceOf[Anon_Brand]
  }
}


package typings
package webdriverDashManagerLib.builtLibConfigMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ConfigFile
  extends /* key */ org.scalablytyped.runtime.StringDictionary[java.lang.String] {
  var android: js.UndefOr[java.lang.String] = js.undefined
  var appium: js.UndefOr[java.lang.String] = js.undefined
  var chrome: js.UndefOr[java.lang.String] = js.undefined
  var gecko: js.UndefOr[java.lang.String] = js.undefined
  var ie: js.UndefOr[java.lang.String] = js.undefined
  var selenium: js.UndefOr[java.lang.String] = js.undefined
}

object ConfigFile {
  @scala.inline
  def apply(
    StringDictionary: /* key */ org.scalablytyped.runtime.StringDictionary[java.lang.String] = null,
    android: java.lang.String = null,
    appium: java.lang.String = null,
    chrome: java.lang.String = null,
    gecko: java.lang.String = null,
    ie: java.lang.String = null,
    selenium: java.lang.String = null
  ): ConfigFile = {
    val __obj = js.Dynamic.literal()
    js.Dynamic.global.Object.assign(__obj, StringDictionary)
    if (android != null) __obj.updateDynamic("android")(android)
    if (appium != null) __obj.updateDynamic("appium")(appium)
    if (chrome != null) __obj.updateDynamic("chrome")(chrome)
    if (gecko != null) __obj.updateDynamic("gecko")(gecko)
    if (ie != null) __obj.updateDynamic("ie")(ie)
    if (selenium != null) __obj.updateDynamic("selenium")(selenium)
    __obj.asInstanceOf[ConfigFile]
  }
}


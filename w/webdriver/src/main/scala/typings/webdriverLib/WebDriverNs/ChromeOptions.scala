package typings
package webdriverLib.WebDriverNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ChromeOptions extends js.Object {
  var args: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  var binary: js.UndefOr[java.lang.String] = js.undefined
  var debuggerAddress: js.UndefOr[java.lang.String] = js.undefined
  var detach: js.UndefOr[scala.Boolean] = js.undefined
  var excludeSwitches: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  var extensions: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  var localState: js.UndefOr[org.scalablytyped.runtime.StringDictionary[js.Any]] = js.undefined
  var minidumpPath: js.UndefOr[java.lang.String] = js.undefined
  var mobileEmulation: js.UndefOr[org.scalablytyped.runtime.StringDictionary[js.Any]] = js.undefined
  var perfLoggingPrefs: js.UndefOr[org.scalablytyped.runtime.StringDictionary[js.Any]] = js.undefined
  var prefs: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  var windowTypes: js.UndefOr[js.Array[java.lang.String]] = js.undefined
}

object ChromeOptions {
  @scala.inline
  def apply(
    args: js.Array[java.lang.String] = null,
    binary: java.lang.String = null,
    debuggerAddress: java.lang.String = null,
    detach: js.UndefOr[scala.Boolean] = js.undefined,
    excludeSwitches: js.Array[java.lang.String] = null,
    extensions: js.Array[java.lang.String] = null,
    localState: org.scalablytyped.runtime.StringDictionary[js.Any] = null,
    minidumpPath: java.lang.String = null,
    mobileEmulation: org.scalablytyped.runtime.StringDictionary[js.Any] = null,
    perfLoggingPrefs: org.scalablytyped.runtime.StringDictionary[js.Any] = null,
    prefs: js.Array[java.lang.String] = null,
    windowTypes: js.Array[java.lang.String] = null
  ): ChromeOptions = {
    val __obj = js.Dynamic.literal()
    if (args != null) __obj.updateDynamic("args")(args)
    if (binary != null) __obj.updateDynamic("binary")(binary)
    if (debuggerAddress != null) __obj.updateDynamic("debuggerAddress")(debuggerAddress)
    if (!js.isUndefined(detach)) __obj.updateDynamic("detach")(detach)
    if (excludeSwitches != null) __obj.updateDynamic("excludeSwitches")(excludeSwitches)
    if (extensions != null) __obj.updateDynamic("extensions")(extensions)
    if (localState != null) __obj.updateDynamic("localState")(localState)
    if (minidumpPath != null) __obj.updateDynamic("minidumpPath")(minidumpPath)
    if (mobileEmulation != null) __obj.updateDynamic("mobileEmulation")(mobileEmulation)
    if (perfLoggingPrefs != null) __obj.updateDynamic("perfLoggingPrefs")(perfLoggingPrefs)
    if (prefs != null) __obj.updateDynamic("prefs")(prefs)
    if (windowTypes != null) __obj.updateDynamic("windowTypes")(windowTypes)
    __obj.asInstanceOf[ChromeOptions]
  }
}


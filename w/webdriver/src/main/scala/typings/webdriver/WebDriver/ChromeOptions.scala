package typings.webdriver.WebDriver

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ChromeOptions extends js.Object {
  var args: js.UndefOr[js.Array[String]] = js.undefined
  var binary: js.UndefOr[String] = js.undefined
  var debuggerAddress: js.UndefOr[String] = js.undefined
  var detach: js.UndefOr[Boolean] = js.undefined
  var excludeSwitches: js.UndefOr[js.Array[String]] = js.undefined
  var extensions: js.UndefOr[js.Array[String]] = js.undefined
  var localState: js.UndefOr[StringDictionary[js.Any]] = js.undefined
  var minidumpPath: js.UndefOr[String] = js.undefined
  var mobileEmulation: js.UndefOr[StringDictionary[js.Any]] = js.undefined
  var perfLoggingPrefs: js.UndefOr[StringDictionary[js.Any]] = js.undefined
  var prefs: js.UndefOr[js.Array[String]] = js.undefined
  var windowTypes: js.UndefOr[js.Array[String]] = js.undefined
}

object ChromeOptions {
  @scala.inline
  def apply(
    args: js.Array[String] = null,
    binary: String = null,
    debuggerAddress: String = null,
    detach: js.UndefOr[Boolean] = js.undefined,
    excludeSwitches: js.Array[String] = null,
    extensions: js.Array[String] = null,
    localState: StringDictionary[js.Any] = null,
    minidumpPath: String = null,
    mobileEmulation: StringDictionary[js.Any] = null,
    perfLoggingPrefs: StringDictionary[js.Any] = null,
    prefs: js.Array[String] = null,
    windowTypes: js.Array[String] = null
  ): ChromeOptions = {
    val __obj = js.Dynamic.literal()
    if (args != null) __obj.updateDynamic("args")(args.asInstanceOf[js.Any])
    if (binary != null) __obj.updateDynamic("binary")(binary.asInstanceOf[js.Any])
    if (debuggerAddress != null) __obj.updateDynamic("debuggerAddress")(debuggerAddress.asInstanceOf[js.Any])
    if (!js.isUndefined(detach)) __obj.updateDynamic("detach")(detach.asInstanceOf[js.Any])
    if (excludeSwitches != null) __obj.updateDynamic("excludeSwitches")(excludeSwitches.asInstanceOf[js.Any])
    if (extensions != null) __obj.updateDynamic("extensions")(extensions.asInstanceOf[js.Any])
    if (localState != null) __obj.updateDynamic("localState")(localState.asInstanceOf[js.Any])
    if (minidumpPath != null) __obj.updateDynamic("minidumpPath")(minidumpPath.asInstanceOf[js.Any])
    if (mobileEmulation != null) __obj.updateDynamic("mobileEmulation")(mobileEmulation.asInstanceOf[js.Any])
    if (perfLoggingPrefs != null) __obj.updateDynamic("perfLoggingPrefs")(perfLoggingPrefs.asInstanceOf[js.Any])
    if (prefs != null) __obj.updateDynamic("prefs")(prefs.asInstanceOf[js.Any])
    if (windowTypes != null) __obj.updateDynamic("windowTypes")(windowTypes.asInstanceOf[js.Any])
    __obj.asInstanceOf[ChromeOptions]
  }
}


package typings
package webdriverLib.WebDriverNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FirefoxOptions extends js.Object {
  var args: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  var binary: js.UndefOr[java.lang.String] = js.undefined
  var log: js.UndefOr[FirefoxLogObject] = js.undefined
  var prefs: org.scalablytyped.runtime.StringDictionary[java.lang.String | scala.Double | scala.Boolean]
  var profile: js.UndefOr[java.lang.String] = js.undefined
}

object FirefoxOptions {
  @scala.inline
  def apply(
    prefs: org.scalablytyped.runtime.StringDictionary[java.lang.String | scala.Double | scala.Boolean],
    args: js.Array[java.lang.String] = null,
    binary: java.lang.String = null,
    log: FirefoxLogObject = null,
    profile: java.lang.String = null
  ): FirefoxOptions = {
    val __obj = js.Dynamic.literal(prefs = prefs)
    if (args != null) __obj.updateDynamic("args")(args)
    if (binary != null) __obj.updateDynamic("binary")(binary)
    if (log != null) __obj.updateDynamic("log")(log)
    if (profile != null) __obj.updateDynamic("profile")(profile)
    __obj.asInstanceOf[FirefoxOptions]
  }
}


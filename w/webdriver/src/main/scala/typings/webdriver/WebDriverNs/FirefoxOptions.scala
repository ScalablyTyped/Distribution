package typings.webdriver.WebDriverNs

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FirefoxOptions extends js.Object {
  var args: js.UndefOr[js.Array[String]] = js.undefined
  var binary: js.UndefOr[String] = js.undefined
  var log: js.UndefOr[FirefoxLogObject] = js.undefined
  var prefs: js.UndefOr[StringDictionary[String | Double | Boolean]] = js.undefined
  var profile: js.UndefOr[String] = js.undefined
}

object FirefoxOptions {
  @scala.inline
  def apply(
    args: js.Array[String] = null,
    binary: String = null,
    log: FirefoxLogObject = null,
    prefs: StringDictionary[String | Double | Boolean] = null,
    profile: String = null
  ): FirefoxOptions = {
    val __obj = js.Dynamic.literal()
    if (args != null) __obj.updateDynamic("args")(args)
    if (binary != null) __obj.updateDynamic("binary")(binary)
    if (log != null) __obj.updateDynamic("log")(log)
    if (prefs != null) __obj.updateDynamic("prefs")(prefs)
    if (profile != null) __obj.updateDynamic("profile")(profile)
    __obj.asInstanceOf[FirefoxOptions]
  }
}


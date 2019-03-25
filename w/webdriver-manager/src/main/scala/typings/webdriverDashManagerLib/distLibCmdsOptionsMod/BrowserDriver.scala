package typings
package webdriverDashManagerLib.distLibCmdsOptionsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BrowserDriver extends js.Object {
  var name: js.UndefOr[
    webdriverDashManagerLib.webdriverDashManagerLibStrings.chromedriver | webdriverDashManagerLib.webdriverDashManagerLibStrings.geckodriver | webdriverDashManagerLib.webdriverDashManagerLibStrings.iedriver
  ] = js.undefined
  var version: js.UndefOr[java.lang.String] = js.undefined
}

object BrowserDriver {
  @scala.inline
  def apply(
    name: webdriverDashManagerLib.webdriverDashManagerLibStrings.chromedriver | webdriverDashManagerLib.webdriverDashManagerLibStrings.geckodriver | webdriverDashManagerLib.webdriverDashManagerLibStrings.iedriver = null,
    version: java.lang.String = null
  ): BrowserDriver = {
    val __obj = js.Dynamic.literal()
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (version != null) __obj.updateDynamic("version")(version)
    __obj.asInstanceOf[BrowserDriver]
  }
}


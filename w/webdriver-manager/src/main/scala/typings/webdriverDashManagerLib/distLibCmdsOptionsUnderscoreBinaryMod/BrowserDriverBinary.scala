package typings
package webdriverDashManagerLib.distLibCmdsOptionsUnderscoreBinaryMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BrowserDriverBinary
  extends webdriverDashManagerLib.distLibCmdsOptionsMod.BrowserDriver {
  var binary: js.UndefOr[webdriverDashManagerLib.distLibProviderProviderMod.ProviderInterface] = js.undefined
}

object BrowserDriverBinary {
  @scala.inline
  def apply(
    binary: webdriverDashManagerLib.distLibProviderProviderMod.ProviderInterface = null,
    name: webdriverDashManagerLib.webdriverDashManagerLibStrings.chromedriver | webdriverDashManagerLib.webdriverDashManagerLibStrings.geckodriver | webdriverDashManagerLib.webdriverDashManagerLibStrings.iedriver = null,
    version: java.lang.String = null
  ): BrowserDriverBinary = {
    val __obj = js.Dynamic.literal()
    if (binary != null) __obj.updateDynamic("binary")(binary)
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (version != null) __obj.updateDynamic("version")(version)
    __obj.asInstanceOf[BrowserDriverBinary]
  }
}


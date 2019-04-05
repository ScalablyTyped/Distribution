package typings
package webdriverDashManagerLib.builtLibBinariesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("webdriver-manager/built/lib/binaries", "ChromeDriver")
@js.native
class ChromeDriver ()
  extends webdriverDashManagerLib.builtLibBinariesChromeUnderscoreDriverMod.ChromeDriver {
  def this(opt_alternativeCdn: java.lang.String) = this()
}

/* static members */
@JSImport("webdriver-manager/built/lib/binaries", "ChromeDriver")
@js.native
object ChromeDriver extends js.Object {
  var id: java.lang.String = js.native
  var isDefault: scala.Boolean = js.native
  var os: js.Array[webdriverDashManagerLib.builtLibBinariesBinaryMod.OS] = js.native
  var versionDefault: java.lang.String = js.native
}


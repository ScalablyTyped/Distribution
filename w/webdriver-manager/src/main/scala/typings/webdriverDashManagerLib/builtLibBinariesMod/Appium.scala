package typings
package webdriverDashManagerLib.builtLibBinariesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("webdriver-manager/built/lib/binaries", "Appium")
@js.native
class Appium ()
  extends webdriverDashManagerLib.builtLibBinariesAppiumMod.Appium {
  def this(alternateCDN: java.lang.String) = this()
}

@JSImport("webdriver-manager/built/lib/binaries", "Appium")
@js.native
object Appium extends js.Object {
  var id: java.lang.String = js.native
  var isDefault: scala.Boolean = js.native
  var os: js.Array[webdriverDashManagerLib.builtLibBinariesBinaryMod.OS] = js.native
  var versionDefault: java.lang.String = js.native
}


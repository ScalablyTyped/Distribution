package typings
package webdriverDashManagerLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("webdriver-manager/built/lib/cmds/initialize", JSImport.Namespace)
@js.native
object builtLibCmdsInitializeMod extends js.Object {
  def android(
    sdkPath: java.lang.String,
    apiLevels: js.Array[java.lang.String],
    architectures: js.Array[java.lang.String],
    platforms: js.Array[java.lang.String],
    acceptLicenses: scala.Boolean,
    version: java.lang.String,
    oldAVDs: js.Array[java.lang.String],
    logger: webdriverDashManagerLib.builtLibCliMod.Logger,
    verbose: scala.Boolean
  ): scala.Unit = js.native
  def iOS(logger: webdriverDashManagerLib.builtLibCliMod.Logger): scala.Unit = js.native
}


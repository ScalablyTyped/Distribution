package typings.webdriverManager

import typings.webdriverManager.cliMod.Logger
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("webdriver-manager/built/lib/cmds/initialize", JSImport.Namespace)
@js.native
object initializeMod extends js.Object {
  
  def android(
    sdkPath: String,
    apiLevels: js.Array[String],
    architectures: js.Array[String],
    platforms: js.Array[String],
    acceptLicenses: Boolean,
    version: String,
    oldAVDs: js.Array[String],
    logger: Logger,
    verbose: Boolean
  ): Unit = js.native
  
  def iOS(logger: Logger): Unit = js.native
}

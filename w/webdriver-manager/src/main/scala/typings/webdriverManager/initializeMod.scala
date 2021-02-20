package typings.webdriverManager

import typings.webdriverManager.cliMod.Logger
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object initializeMod {
  
  @JSImport("webdriver-manager/built/lib/cmds/initialize", "android")
  @js.native
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
  
  @JSImport("webdriver-manager/built/lib/cmds/initialize", "iOS")
  @js.native
  def iOS(logger: Logger): Unit = js.native
}

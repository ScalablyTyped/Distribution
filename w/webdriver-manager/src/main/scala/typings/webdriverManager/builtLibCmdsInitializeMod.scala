package typings.webdriverManager

import typings.webdriverManager.builtLibCliMod.Logger
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object builtLibCmdsInitializeMod {
  
  @JSImport("webdriver-manager/built/lib/cmds/initialize", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def android(
    sdkPath: String,
    apiLevels: js.Array[String],
    architectures: js.Array[String],
    platforms: js.Array[String],
    acceptLicenses: Boolean,
    version: String,
    oldAVDs: js.Array[String],
    logger: Logger,
    verbose: Boolean
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("android")(sdkPath.asInstanceOf[js.Any], apiLevels.asInstanceOf[js.Any], architectures.asInstanceOf[js.Any], platforms.asInstanceOf[js.Any], acceptLicenses.asInstanceOf[js.Any], version.asInstanceOf[js.Any], oldAVDs.asInstanceOf[js.Any], logger.asInstanceOf[js.Any], verbose.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def iOS(logger: Logger): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("iOS")(logger.asInstanceOf[js.Any]).asInstanceOf[Unit]
}

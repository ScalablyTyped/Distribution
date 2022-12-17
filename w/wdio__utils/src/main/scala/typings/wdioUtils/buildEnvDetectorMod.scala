package typings.wdioUtils

import typings.wdioTypes.buildCapabilitiesMod.Capabilities
import typings.wdioTypes.buildCapabilitiesMod.DesiredCapabilities
import typings.wdioUtils.anon.IsAndroid
import typings.wdioUtils.anon.IsChrome
import typings.wdioUtils.anon.IsDevTools
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object buildEnvDetectorMod {
  
  @JSImport("@wdio/utils/build/envDetector", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def capabilitiesEnvironmentDetector(capabilities: Capabilities, automationProtocol: String): IsAndroid = (^.asInstanceOf[js.Dynamic].applyDynamic("capabilitiesEnvironmentDetector")(capabilities.asInstanceOf[js.Any], automationProtocol.asInstanceOf[js.Any])).asInstanceOf[IsAndroid]
  
  inline def devtoolsEnvironmentDetector(param0: Capabilities): IsDevTools = ^.asInstanceOf[js.Dynamic].applyDynamic("devtoolsEnvironmentDetector")(param0.asInstanceOf[js.Any]).asInstanceOf[IsDevTools]
  
  inline def isW3C(): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isW3C")().asInstanceOf[Boolean]
  inline def isW3C(capabilities: DesiredCapabilities): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isW3C")(capabilities.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def sessionEnvironmentDetector(param0: typings.wdioUtils.anon.Capabilities): IsChrome = ^.asInstanceOf[js.Dynamic].applyDynamic("sessionEnvironmentDetector")(param0.asInstanceOf[js.Any]).asInstanceOf[IsChrome]
  
  inline def webdriverEnvironmentDetector(capabilities: Capabilities): IsAndroid = ^.asInstanceOf[js.Dynamic].applyDynamic("webdriverEnvironmentDetector")(capabilities.asInstanceOf[js.Any]).asInstanceOf[IsAndroid]
}

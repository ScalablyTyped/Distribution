package typings.wdioUtils

import typings.wdioUtils.anon.Capabilities
import typings.wdioUtils.anon.IsAndroid
import typings.wdioUtils.anon.IsChrome
import typings.wdioUtils.anon.IsDevTools
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object envDetectorMod {
  
  @JSImport("@wdio/utils/build/envDetector", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def capabilitiesEnvironmentDetector(
    capabilities: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify WebDriver.Capabilities */ js.Any,
    automationProtocol: String
  ): IsAndroid = (^.asInstanceOf[js.Dynamic].applyDynamic("capabilitiesEnvironmentDetector")(capabilities.asInstanceOf[js.Any], automationProtocol.asInstanceOf[js.Any])).asInstanceOf[IsAndroid]
  
  inline def devtoolsEnvironmentDetector(
    hasBrowserName: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify WebDriver.Capabilities */ js.Any
  ): IsDevTools = ^.asInstanceOf[js.Dynamic].applyDynamic("devtoolsEnvironmentDetector")(hasBrowserName.asInstanceOf[js.Any]).asInstanceOf[IsDevTools]
  
  inline def isW3C(): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isW3C")().asInstanceOf[Boolean]
  inline def isW3C(
    capabilities: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify WebDriver.DesiredCapabilities */ js.Any
  ): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isW3C")(capabilities.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def sessionEnvironmentDetector(hasCapabilitiesRequestedCapabilities: Capabilities): IsChrome = ^.asInstanceOf[js.Dynamic].applyDynamic("sessionEnvironmentDetector")(hasCapabilitiesRequestedCapabilities.asInstanceOf[js.Any]).asInstanceOf[IsChrome]
  
  inline def webdriverEnvironmentDetector(
    capabilities: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify WebDriver.Capabilities */ js.Any
  ): IsAndroid = ^.asInstanceOf[js.Dynamic].applyDynamic("webdriverEnvironmentDetector")(capabilities.asInstanceOf[js.Any]).asInstanceOf[IsAndroid]
}

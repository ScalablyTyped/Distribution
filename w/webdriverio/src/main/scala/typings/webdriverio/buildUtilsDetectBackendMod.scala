package typings.webdriverio

import typings.wdioTypes.buildCapabilitiesMod.DesiredCapabilities
import typings.wdioTypes.buildCapabilitiesMod.RemoteCapabilities
import typings.wdioTypes.buildCapabilitiesMod.RemoteCapability
import typings.wdioTypes.buildCapabilitiesMod.W3CCapabilities
import typings.wdioTypes.buildOptionsMod.SauceRegions
import typings.webdriverio.anon.Hostname
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object buildUtilsDetectBackendMod {
  
  @JSImport("webdriverio/build/utils/detectBackend", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(): Hostname = ^.asInstanceOf[js.Dynamic].applyDynamic("default")().asInstanceOf[Hostname]
  inline def default(options: BackendConfigurations): Hostname = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(options.asInstanceOf[js.Any]).asInstanceOf[Hostname]
  
  trait BackendConfigurations extends StObject {
    
    var capabilities: js.UndefOr[RemoteCapabilities | RemoteCapability] = js.undefined
    
    var headless: js.UndefOr[Boolean] = js.undefined
    
    var hostname: js.UndefOr[String] = js.undefined
    
    var key: js.UndefOr[String] = js.undefined
    
    var path: js.UndefOr[String] = js.undefined
    
    var port: js.UndefOr[Double] = js.undefined
    
    var protocol: js.UndefOr[String] = js.undefined
    
    var region: js.UndefOr[SauceRegions] = js.undefined
    
    var user: js.UndefOr[String] = js.undefined
  }
  object BackendConfigurations {
    
    inline def apply(): BackendConfigurations = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[BackendConfigurations]
    }
    
    extension [Self <: BackendConfigurations](x: Self) {
      
      inline def setCapabilities(value: RemoteCapabilities | RemoteCapability): Self = StObject.set(x, "capabilities", value.asInstanceOf[js.Any])
      
      inline def setCapabilitiesUndefined: Self = StObject.set(x, "capabilities", js.undefined)
      
      inline def setCapabilitiesVarargs(value: (DesiredCapabilities | W3CCapabilities)*): Self = StObject.set(x, "capabilities", js.Array(value*))
      
      inline def setHeadless(value: Boolean): Self = StObject.set(x, "headless", value.asInstanceOf[js.Any])
      
      inline def setHeadlessUndefined: Self = StObject.set(x, "headless", js.undefined)
      
      inline def setHostname(value: String): Self = StObject.set(x, "hostname", value.asInstanceOf[js.Any])
      
      inline def setHostnameUndefined: Self = StObject.set(x, "hostname", js.undefined)
      
      inline def setKey(value: String): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
      
      inline def setKeyUndefined: Self = StObject.set(x, "key", js.undefined)
      
      inline def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
      
      inline def setPathUndefined: Self = StObject.set(x, "path", js.undefined)
      
      inline def setPort(value: Double): Self = StObject.set(x, "port", value.asInstanceOf[js.Any])
      
      inline def setPortUndefined: Self = StObject.set(x, "port", js.undefined)
      
      inline def setProtocol(value: String): Self = StObject.set(x, "protocol", value.asInstanceOf[js.Any])
      
      inline def setProtocolUndefined: Self = StObject.set(x, "protocol", js.undefined)
      
      inline def setRegion(value: SauceRegions): Self = StObject.set(x, "region", value.asInstanceOf[js.Any])
      
      inline def setRegionUndefined: Self = StObject.set(x, "region", js.undefined)
      
      inline def setUser(value: String): Self = StObject.set(x, "user", value.asInstanceOf[js.Any])
      
      inline def setUserUndefined: Self = StObject.set(x, "user", js.undefined)
    }
  }
}

package typings.webextensionPolyfill

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object namespacesPrivacyMod {
  
  object Privacy {
    
    trait Static extends StObject {
      
      var network: typings.webextensionPolyfill.namespacesPrivacyNetworkMod.PrivacyNetwork.Static
      
      var services: typings.webextensionPolyfill.namespacesPrivacyServicesMod.PrivacyServices.Static
      
      var websites: typings.webextensionPolyfill.namespacesPrivacyWebsitesMod.PrivacyWebsites.Static
    }
    object Static {
      
      inline def apply(
        network: typings.webextensionPolyfill.namespacesPrivacyNetworkMod.PrivacyNetwork.Static,
        services: typings.webextensionPolyfill.namespacesPrivacyServicesMod.PrivacyServices.Static,
        websites: typings.webextensionPolyfill.namespacesPrivacyWebsitesMod.PrivacyWebsites.Static
      ): Static = {
        val __obj = js.Dynamic.literal(network = network.asInstanceOf[js.Any], services = services.asInstanceOf[js.Any], websites = websites.asInstanceOf[js.Any])
        __obj.asInstanceOf[Static]
      }
      
      @scala.inline
      implicit open class MutableBuilder[Self <: Static] (val x: Self) extends AnyVal {
        
        inline def setNetwork(value: typings.webextensionPolyfill.namespacesPrivacyNetworkMod.PrivacyNetwork.Static): Self = StObject.set(x, "network", value.asInstanceOf[js.Any])
        
        inline def setServices(value: typings.webextensionPolyfill.namespacesPrivacyServicesMod.PrivacyServices.Static): Self = StObject.set(x, "services", value.asInstanceOf[js.Any])
        
        inline def setWebsites(value: typings.webextensionPolyfill.namespacesPrivacyWebsitesMod.PrivacyWebsites.Static): Self = StObject.set(x, "websites", value.asInstanceOf[js.Any])
      }
    }
  }
}

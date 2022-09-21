package typings.webextensionPolyfill

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object privacyMod {
  
  object Privacy {
    
    trait Static extends StObject {
      
      var network: typings.webextensionPolyfill.privacyNetworkMod.PrivacyNetwork.Static
      
      var services: typings.webextensionPolyfill.privacyServicesMod.PrivacyServices.Static
      
      var websites: typings.webextensionPolyfill.privacyWebsitesMod.PrivacyWebsites.Static
    }
    object Static {
      
      inline def apply(
        network: typings.webextensionPolyfill.privacyNetworkMod.PrivacyNetwork.Static,
        services: typings.webextensionPolyfill.privacyServicesMod.PrivacyServices.Static,
        websites: typings.webextensionPolyfill.privacyWebsitesMod.PrivacyWebsites.Static
      ): Static = {
        val __obj = js.Dynamic.literal(network = network.asInstanceOf[js.Any], services = services.asInstanceOf[js.Any], websites = websites.asInstanceOf[js.Any])
        __obj.asInstanceOf[Static]
      }
      
      extension [Self <: Static](x: Self) {
        
        inline def setNetwork(value: typings.webextensionPolyfill.privacyNetworkMod.PrivacyNetwork.Static): Self = StObject.set(x, "network", value.asInstanceOf[js.Any])
        
        inline def setServices(value: typings.webextensionPolyfill.privacyServicesMod.PrivacyServices.Static): Self = StObject.set(x, "services", value.asInstanceOf[js.Any])
        
        inline def setWebsites(value: typings.webextensionPolyfill.privacyWebsitesMod.PrivacyWebsites.Static): Self = StObject.set(x, "websites", value.asInstanceOf[js.Any])
      }
    }
  }
}

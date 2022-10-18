package typings.webextensionPolyfill

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object namespacesDevtoolsMod {
  
  object Devtools {
    
    trait Static extends StObject {
      
      var inspectedWindow: typings.webextensionPolyfill.namespacesDevtoolsInspectedWindowMod.DevtoolsInspectedWindow.Static
      
      var network: typings.webextensionPolyfill.namespacesDevtoolsNetworkMod.DevtoolsNetwork.Static
      
      var panels: typings.webextensionPolyfill.namespacesDevtoolsPanelsMod.DevtoolsPanels.Static
    }
    object Static {
      
      inline def apply(
        inspectedWindow: typings.webextensionPolyfill.namespacesDevtoolsInspectedWindowMod.DevtoolsInspectedWindow.Static,
        network: typings.webextensionPolyfill.namespacesDevtoolsNetworkMod.DevtoolsNetwork.Static,
        panels: typings.webextensionPolyfill.namespacesDevtoolsPanelsMod.DevtoolsPanels.Static
      ): Static = {
        val __obj = js.Dynamic.literal(inspectedWindow = inspectedWindow.asInstanceOf[js.Any], network = network.asInstanceOf[js.Any], panels = panels.asInstanceOf[js.Any])
        __obj.asInstanceOf[Static]
      }
      
      extension [Self <: Static](x: Self) {
        
        inline def setInspectedWindow(
          value: typings.webextensionPolyfill.namespacesDevtoolsInspectedWindowMod.DevtoolsInspectedWindow.Static
        ): Self = StObject.set(x, "inspectedWindow", value.asInstanceOf[js.Any])
        
        inline def setNetwork(value: typings.webextensionPolyfill.namespacesDevtoolsNetworkMod.DevtoolsNetwork.Static): Self = StObject.set(x, "network", value.asInstanceOf[js.Any])
        
        inline def setPanels(value: typings.webextensionPolyfill.namespacesDevtoolsPanelsMod.DevtoolsPanels.Static): Self = StObject.set(x, "panels", value.asInstanceOf[js.Any])
      }
    }
  }
}

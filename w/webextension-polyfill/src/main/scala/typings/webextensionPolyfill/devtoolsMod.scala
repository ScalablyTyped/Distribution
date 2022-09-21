package typings.webextensionPolyfill

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object devtoolsMod {
  
  object Devtools {
    
    trait Static extends StObject {
      
      var inspectedWindow: typings.webextensionPolyfill.devtoolsInspectedWindowMod.DevtoolsInspectedWindow.Static
      
      var network: typings.webextensionPolyfill.devtoolsNetworkMod.DevtoolsNetwork.Static
      
      var panels: typings.webextensionPolyfill.devtoolsPanelsMod.DevtoolsPanels.Static
    }
    object Static {
      
      inline def apply(
        inspectedWindow: typings.webextensionPolyfill.devtoolsInspectedWindowMod.DevtoolsInspectedWindow.Static,
        network: typings.webextensionPolyfill.devtoolsNetworkMod.DevtoolsNetwork.Static,
        panels: typings.webextensionPolyfill.devtoolsPanelsMod.DevtoolsPanels.Static
      ): Static = {
        val __obj = js.Dynamic.literal(inspectedWindow = inspectedWindow.asInstanceOf[js.Any], network = network.asInstanceOf[js.Any], panels = panels.asInstanceOf[js.Any])
        __obj.asInstanceOf[Static]
      }
      
      extension [Self <: Static](x: Self) {
        
        inline def setInspectedWindow(value: typings.webextensionPolyfill.devtoolsInspectedWindowMod.DevtoolsInspectedWindow.Static): Self = StObject.set(x, "inspectedWindow", value.asInstanceOf[js.Any])
        
        inline def setNetwork(value: typings.webextensionPolyfill.devtoolsNetworkMod.DevtoolsNetwork.Static): Self = StObject.set(x, "network", value.asInstanceOf[js.Any])
        
        inline def setPanels(value: typings.webextensionPolyfill.devtoolsPanelsMod.DevtoolsPanels.Static): Self = StObject.set(x, "panels", value.asInstanceOf[js.Any])
      }
    }
  }
}

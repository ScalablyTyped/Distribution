package typings.webextensionPolyfill

import typings.webextensionPolyfill.typesMod.Types.Setting
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object browserSettingsColorManagementMod {
  
  object BrowserSettingsColorManagement {
    
    trait Static extends StObject {
      
      /**
        * This setting controls the mode used for color management and must be a string from $(ref:browserSettings.
        * ColorManagementMode)
        */
      var mode: Setting
      
      /**
        * This boolean setting controls whether or not native sRGB color management is used.
        */
      var useNativeSRGB: Setting
      
      /**
        * This boolean setting controls whether or not the WebRender compositor is used.
        */
      var useWebRenderCompositor: Setting
    }
    object Static {
      
      inline def apply(mode: Setting, useNativeSRGB: Setting, useWebRenderCompositor: Setting): Static = {
        val __obj = js.Dynamic.literal(mode = mode.asInstanceOf[js.Any], useNativeSRGB = useNativeSRGB.asInstanceOf[js.Any], useWebRenderCompositor = useWebRenderCompositor.asInstanceOf[js.Any])
        __obj.asInstanceOf[Static]
      }
      
      extension [Self <: Static](x: Self) {
        
        inline def setMode(value: Setting): Self = StObject.set(x, "mode", value.asInstanceOf[js.Any])
        
        inline def setUseNativeSRGB(value: Setting): Self = StObject.set(x, "useNativeSRGB", value.asInstanceOf[js.Any])
        
        inline def setUseWebRenderCompositor(value: Setting): Self = StObject.set(x, "useWebRenderCompositor", value.asInstanceOf[js.Any])
      }
    }
  }
}

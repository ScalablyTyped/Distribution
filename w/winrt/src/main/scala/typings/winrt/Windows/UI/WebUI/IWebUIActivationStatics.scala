package typings.winrt.Windows.UI.WebUI

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IWebUIActivationStatics extends StObject {
  
  var onactivated: Any
  
  var onnavigated: Any
  
  var onresuming: Any
  
  var onsuspending: Any
}
object IWebUIActivationStatics {
  
  inline def apply(onactivated: Any, onnavigated: Any, onresuming: Any, onsuspending: Any): IWebUIActivationStatics = {
    val __obj = js.Dynamic.literal(onactivated = onactivated.asInstanceOf[js.Any], onnavigated = onnavigated.asInstanceOf[js.Any], onresuming = onresuming.asInstanceOf[js.Any], onsuspending = onsuspending.asInstanceOf[js.Any])
    __obj.asInstanceOf[IWebUIActivationStatics]
  }
  
  extension [Self <: IWebUIActivationStatics](x: Self) {
    
    inline def setOnactivated(value: Any): Self = StObject.set(x, "onactivated", value.asInstanceOf[js.Any])
    
    inline def setOnnavigated(value: Any): Self = StObject.set(x, "onnavigated", value.asInstanceOf[js.Any])
    
    inline def setOnresuming(value: Any): Self = StObject.set(x, "onresuming", value.asInstanceOf[js.Any])
    
    inline def setOnsuspending(value: Any): Self = StObject.set(x, "onsuspending", value.asInstanceOf[js.Any])
  }
}

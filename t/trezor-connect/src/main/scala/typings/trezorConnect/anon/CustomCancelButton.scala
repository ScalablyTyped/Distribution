package typings.trezorConnect.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CustomCancelButton extends StObject {
  
  var customCancelButton: js.UndefOr[ClassName] = js.undefined
  
  var customConfirmButton: js.UndefOr[ClassName] = js.undefined
  
  var label: js.UndefOr[String] = js.undefined
  
  var view: String
}
object CustomCancelButton {
  
  inline def apply(view: String): CustomCancelButton = {
    val __obj = js.Dynamic.literal(view = view.asInstanceOf[js.Any])
    __obj.asInstanceOf[CustomCancelButton]
  }
  
  extension [Self <: CustomCancelButton](x: Self) {
    
    inline def setCustomCancelButton(value: ClassName): Self = StObject.set(x, "customCancelButton", value.asInstanceOf[js.Any])
    
    inline def setCustomCancelButtonUndefined: Self = StObject.set(x, "customCancelButton", js.undefined)
    
    inline def setCustomConfirmButton(value: ClassName): Self = StObject.set(x, "customConfirmButton", value.asInstanceOf[js.Any])
    
    inline def setCustomConfirmButtonUndefined: Self = StObject.set(x, "customConfirmButton", js.undefined)
    
    inline def setLabel(value: String): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
    
    inline def setLabelUndefined: Self = StObject.set(x, "label", js.undefined)
    
    inline def setView(value: String): Self = StObject.set(x, "view", value.asInstanceOf[js.Any])
  }
}

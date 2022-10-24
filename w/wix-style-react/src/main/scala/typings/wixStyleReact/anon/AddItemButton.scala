package typings.wixStyleReact.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AddItemButton extends StObject {
  
  var AddItemButton: Medium
  
  var BaseModalLayout: js.UndefOr[HeloButton] = js.undefined
  
  var CircularProgressBar: js.UndefOr[Large] = js.undefined
  
  var CloseButton: js.UndefOr[Large] = js.undefined
}
object AddItemButton {
  
  inline def apply(AddItemButton: Medium): AddItemButton = {
    val __obj = js.Dynamic.literal(AddItemButton = AddItemButton.asInstanceOf[js.Any])
    __obj.asInstanceOf[AddItemButton]
  }
  
  extension [Self <: AddItemButton](x: Self) {
    
    inline def setAddItemButton(value: Medium): Self = StObject.set(x, "AddItemButton", value.asInstanceOf[js.Any])
    
    inline def setBaseModalLayout(value: HeloButton): Self = StObject.set(x, "BaseModalLayout", value.asInstanceOf[js.Any])
    
    inline def setBaseModalLayoutUndefined: Self = StObject.set(x, "BaseModalLayout", js.undefined)
    
    inline def setCircularProgressBar(value: Large): Self = StObject.set(x, "CircularProgressBar", value.asInstanceOf[js.Any])
    
    inline def setCircularProgressBarUndefined: Self = StObject.set(x, "CircularProgressBar", js.undefined)
    
    inline def setCloseButton(value: Large): Self = StObject.set(x, "CloseButton", value.asInstanceOf[js.Any])
    
    inline def setCloseButtonUndefined: Self = StObject.set(x, "CloseButton", js.undefined)
  }
}

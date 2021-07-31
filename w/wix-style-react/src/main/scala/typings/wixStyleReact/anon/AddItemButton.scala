package typings.wixStyleReact.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AddItemButton extends StObject {
  
  var AddItemButton: Image
  
  var BaseModalLayout: js.UndefOr[HeloButton] = js.undefined
  
  var CircularProgressBar: js.UndefOr[Large] = js.undefined
  
  var CloseButton: js.UndefOr[Large] = js.undefined
}
object AddItemButton {
  
  @scala.inline
  def apply(AddItemButton: Image): AddItemButton = {
    val __obj = js.Dynamic.literal(AddItemButton = AddItemButton.asInstanceOf[js.Any])
    __obj.asInstanceOf[AddItemButton]
  }
  
  @scala.inline
  implicit class AddItemButtonMutableBuilder[Self <: AddItemButton] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAddItemButton(value: Image): Self = StObject.set(x, "AddItemButton", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBaseModalLayout(value: HeloButton): Self = StObject.set(x, "BaseModalLayout", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBaseModalLayoutUndefined: Self = StObject.set(x, "BaseModalLayout", js.undefined)
    
    @scala.inline
    def setCircularProgressBar(value: Large): Self = StObject.set(x, "CircularProgressBar", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCircularProgressBarUndefined: Self = StObject.set(x, "CircularProgressBar", js.undefined)
    
    @scala.inline
    def setCloseButton(value: Large): Self = StObject.set(x, "CloseButton", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCloseButtonUndefined: Self = StObject.set(x, "CloseButton", js.undefined)
  }
}

package typings.wixUiCore.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FocusFocusVisible extends StObject {
  
  var focus: Boolean
  
  var focusVisible: Boolean
}
object FocusFocusVisible {
  
  @scala.inline
  def apply(focus: Boolean, focusVisible: Boolean): FocusFocusVisible = {
    val __obj = js.Dynamic.literal(focus = focus.asInstanceOf[js.Any], focusVisible = focusVisible.asInstanceOf[js.Any])
    __obj.asInstanceOf[FocusFocusVisible]
  }
  
  @scala.inline
  implicit class FocusFocusVisibleMutableBuilder[Self <: FocusFocusVisible] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFocus(value: Boolean): Self = StObject.set(x, "focus", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFocusVisible(value: Boolean): Self = StObject.set(x, "focusVisible", value.asInstanceOf[js.Any])
  }
}

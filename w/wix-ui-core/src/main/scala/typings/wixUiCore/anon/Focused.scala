package typings.wixUiCore.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Focused extends StObject {
  
  var focusVisible: Boolean
  
  var focused: Boolean
}
object Focused {
  
  @scala.inline
  def apply(focusVisible: Boolean, focused: Boolean): Focused = {
    val __obj = js.Dynamic.literal(focusVisible = focusVisible.asInstanceOf[js.Any], focused = focused.asInstanceOf[js.Any])
    __obj.asInstanceOf[Focused]
  }
  
  @scala.inline
  implicit class FocusedMutableBuilder[Self <: Focused] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFocusVisible(value: Boolean): Self = StObject.set(x, "focusVisible", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFocused(value: Boolean): Self = StObject.set(x, "focused", value.asInstanceOf[js.Any])
  }
}

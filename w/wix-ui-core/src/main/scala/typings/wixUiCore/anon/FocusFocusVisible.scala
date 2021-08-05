package typings.wixUiCore.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FocusFocusVisible extends StObject {
  
  var focus: Boolean
  
  var focusVisible: Boolean
}
object FocusFocusVisible {
  
  inline def apply(focus: Boolean, focusVisible: Boolean): FocusFocusVisible = {
    val __obj = js.Dynamic.literal(focus = focus.asInstanceOf[js.Any], focusVisible = focusVisible.asInstanceOf[js.Any])
    __obj.asInstanceOf[FocusFocusVisible]
  }
  
  extension [Self <: FocusFocusVisible](x: Self) {
    
    inline def setFocus(value: Boolean): Self = StObject.set(x, "focus", value.asInstanceOf[js.Any])
    
    inline def setFocusVisible(value: Boolean): Self = StObject.set(x, "focusVisible", value.asInstanceOf[js.Any])
  }
}

package typings.wixUiCore.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FocusVisible extends StObject {
  
  var focusVisible: Boolean
  
  var isFocused: Boolean
}
object FocusVisible {
  
  inline def apply(focusVisible: Boolean, isFocused: Boolean): FocusVisible = {
    val __obj = js.Dynamic.literal(focusVisible = focusVisible.asInstanceOf[js.Any], isFocused = isFocused.asInstanceOf[js.Any])
    __obj.asInstanceOf[FocusVisible]
  }
  
  extension [Self <: FocusVisible](x: Self) {
    
    inline def setFocusVisible(value: Boolean): Self = StObject.set(x, "focusVisible", value.asInstanceOf[js.Any])
    
    inline def setIsFocused(value: Boolean): Self = StObject.set(x, "isFocused", value.asInstanceOf[js.Any])
  }
}

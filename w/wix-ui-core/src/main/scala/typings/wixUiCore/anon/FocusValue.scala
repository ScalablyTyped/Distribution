package typings.wixUiCore.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FocusValue extends StObject {
  
  var focus: Boolean
  
  var value: String
}
object FocusValue {
  
  inline def apply(focus: Boolean, value: String): FocusValue = {
    val __obj = js.Dynamic.literal(focus = focus.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[FocusValue]
  }
  
  extension [Self <: FocusValue](x: Self) {
    
    inline def setFocus(value: Boolean): Self = StObject.set(x, "focus", value.asInstanceOf[js.Any])
    
    inline def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
  }
}

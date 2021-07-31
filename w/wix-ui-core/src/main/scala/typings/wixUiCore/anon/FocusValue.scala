package typings.wixUiCore.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FocusValue extends StObject {
  
  var focus: Boolean
  
  var value: String
}
object FocusValue {
  
  @scala.inline
  def apply(focus: Boolean, value: String): FocusValue = {
    val __obj = js.Dynamic.literal(focus = focus.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[FocusValue]
  }
  
  @scala.inline
  implicit class FocusValueMutableBuilder[Self <: FocusValue] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFocus(value: Boolean): Self = StObject.set(x, "focus", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
  }
}

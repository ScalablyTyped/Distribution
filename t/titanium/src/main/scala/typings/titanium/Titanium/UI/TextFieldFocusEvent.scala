package typings.titanium.Titanium.UI

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Fired when the field gains focus.
  */
@js.native
trait TextFieldFocusEvent extends TextFieldBaseEvent {
  
  /**
    * Value of the field.
    */
  var value: String = js.native
}
object TextFieldFocusEvent {
  
  @scala.inline
  def apply(source: TextField, value: String): TextFieldFocusEvent = {
    val __obj = js.Dynamic.literal(source = source.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[TextFieldFocusEvent]
  }
  
  @scala.inline
  implicit class TextFieldFocusEventMutableBuilder[Self <: TextFieldFocusEvent] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
  }
}

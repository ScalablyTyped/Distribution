package typings.titanium.Titanium.UI

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Fired when the field value changes.
  */
@js.native
trait TextFieldChangeEvent extends TextFieldBaseEvent {
  
  /**
    * New value of the field.
    */
  var value: String = js.native
}
object TextFieldChangeEvent {
  
  @scala.inline
  def apply(source: TextField, value: String): TextFieldChangeEvent = {
    val __obj = js.Dynamic.literal(source = source.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[TextFieldChangeEvent]
  }
  
  @scala.inline
  implicit class TextFieldChangeEventMutableBuilder[Self <: TextFieldChangeEvent] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
  }
}

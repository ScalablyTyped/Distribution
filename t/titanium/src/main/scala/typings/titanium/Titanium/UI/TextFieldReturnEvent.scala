package typings.titanium.Titanium.UI

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Fired when the return key is pressed on the keyboard.
  */
@js.native
trait TextFieldReturnEvent extends TextFieldBaseEvent {
  
  /**
    * Value of this text area.
    */
  var value: String = js.native
}
object TextFieldReturnEvent {
  
  @scala.inline
  def apply(source: TextField, value: String): TextFieldReturnEvent = {
    val __obj = js.Dynamic.literal(source = source.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[TextFieldReturnEvent]
  }
  
  @scala.inline
  implicit class TextFieldReturnEventMutableBuilder[Self <: TextFieldReturnEvent] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
  }
}

package typings.titanium.Titanium.UI

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Fired when the return key is pressed on the keyboard.
  */
@js.native
trait TextAreaReturnEvent extends TextAreaBaseEvent {
  
  /**
    * Value of this text area.
    */
  var value: String = js.native
}
object TextAreaReturnEvent {
  
  @scala.inline
  def apply(source: TextArea, value: String): TextAreaReturnEvent = {
    val __obj = js.Dynamic.literal(source = source.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[TextAreaReturnEvent]
  }
  
  @scala.inline
  implicit class TextAreaReturnEventMutableBuilder[Self <: TextAreaReturnEvent] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
  }
}

package typings.titanium.Titanium.UI

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Fired when this text area gains focus.
  */
@js.native
trait TextAreaFocusEvent extends TextAreaBaseEvent {
  
  /**
    * Value of this text area.
    */
  var value: String = js.native
}
object TextAreaFocusEvent {
  
  @scala.inline
  def apply(source: TextArea, value: String): TextAreaFocusEvent = {
    val __obj = js.Dynamic.literal(source = source.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[TextAreaFocusEvent]
  }
  
  @scala.inline
  implicit class TextAreaFocusEventMutableBuilder[Self <: TextAreaFocusEvent] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
  }
}

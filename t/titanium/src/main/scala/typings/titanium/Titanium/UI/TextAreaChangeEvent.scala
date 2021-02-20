package typings.titanium.Titanium.UI

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Fired when this text area value changes.
  */
@js.native
trait TextAreaChangeEvent extends TextAreaBaseEvent {
  
  /**
    * New value of this text area.
    */
  var value: String = js.native
}
object TextAreaChangeEvent {
  
  @scala.inline
  def apply(source: TextArea, value: String): TextAreaChangeEvent = {
    val __obj = js.Dynamic.literal(source = source.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[TextAreaChangeEvent]
  }
  
  @scala.inline
  implicit class TextAreaChangeEventMutableBuilder[Self <: TextAreaChangeEvent] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
  }
}

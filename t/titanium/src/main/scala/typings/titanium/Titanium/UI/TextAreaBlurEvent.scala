package typings.titanium.Titanium.UI

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Fired when this text area loses focus.
  */
@js.native
trait TextAreaBlurEvent extends TextAreaBaseEvent {
  
  /**
    * Value of this text area.
    */
  var value: String = js.native
}
object TextAreaBlurEvent {
  
  @scala.inline
  def apply(source: TextArea, value: String): TextAreaBlurEvent = {
    val __obj = js.Dynamic.literal(source = source.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[TextAreaBlurEvent]
  }
  
  @scala.inline
  implicit class TextAreaBlurEventMutableBuilder[Self <: TextAreaBlurEvent] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
  }
}

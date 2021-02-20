package typings.titanium.Titanium.UI

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Fired when the field loses focus.
  */
@js.native
trait TextFieldBlurEvent extends TextFieldBaseEvent {
  
  /**
    * Value of the field.
    */
  var value: String = js.native
}
object TextFieldBlurEvent {
  
  @scala.inline
  def apply(source: TextField, value: String): TextFieldBlurEvent = {
    val __obj = js.Dynamic.literal(source = source.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[TextFieldBlurEvent]
  }
  
  @scala.inline
  implicit class TextFieldBlurEventMutableBuilder[Self <: TextFieldBlurEvent] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
  }
}

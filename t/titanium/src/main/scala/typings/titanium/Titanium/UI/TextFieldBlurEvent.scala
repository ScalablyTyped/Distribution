package typings.titanium.Titanium.UI

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Fired when the field loses focus.
  */
trait TextFieldBlurEvent extends TextFieldBaseEvent {
  /**
    * Value of the field.
    */
  var value: String
}

object TextFieldBlurEvent {
  @scala.inline
  def apply(source: TextField, value: String): TextFieldBlurEvent = {
    val __obj = js.Dynamic.literal(source = source.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[TextFieldBlurEvent]
  }
}


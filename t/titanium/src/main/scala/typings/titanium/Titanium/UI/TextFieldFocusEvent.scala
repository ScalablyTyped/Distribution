package typings.titanium.Titanium.UI

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Fired when the field gains focus.
  */
trait TextFieldFocusEvent extends TextFieldBaseEvent {
  /**
    * Value of the field.
    */
  var value: String
}

object TextFieldFocusEvent {
  @scala.inline
  def apply(source: TextField, value: String): TextFieldFocusEvent = {
    val __obj = js.Dynamic.literal(source = source.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[TextFieldFocusEvent]
  }
}


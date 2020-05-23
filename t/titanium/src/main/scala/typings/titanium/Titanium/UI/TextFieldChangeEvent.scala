package typings.titanium.Titanium.UI

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Fired when the field value changes.
  */
trait TextFieldChangeEvent extends TextFieldBaseEvent {
  /**
    * New value of the field.
    */
  var value: String
}

object TextFieldChangeEvent {
  @scala.inline
  def apply(source: TextField, value: String): TextFieldChangeEvent = {
    val __obj = js.Dynamic.literal(source = source.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[TextFieldChangeEvent]
  }
}


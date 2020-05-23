package typings.titanium.Titanium.UI

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Fired when the return key is pressed on the keyboard.
  */
trait TextFieldReturnEvent extends TextFieldBaseEvent {
  /**
    * Value of this text area.
    */
  var value: String
}

object TextFieldReturnEvent {
  @scala.inline
  def apply(source: TextField, value: String): TextFieldReturnEvent = {
    val __obj = js.Dynamic.literal(source = source.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[TextFieldReturnEvent]
  }
}


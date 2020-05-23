package typings.titanium.Titanium.UI

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Fired when this text area gains focus.
  */
trait TextAreaFocusEvent extends TextAreaBaseEvent {
  /**
    * Value of this text area.
    */
  var value: String
}

object TextAreaFocusEvent {
  @scala.inline
  def apply(source: TextArea, value: String): TextAreaFocusEvent = {
    val __obj = js.Dynamic.literal(source = source.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[TextAreaFocusEvent]
  }
}


package typings.titanium.Titanium.UI

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
		 * Fired when this text area value changes.
		 */
trait TextAreaChangeEvent extends TextAreaBaseEvent {
  /**
  			 * New value of this text area.
  			 */
  var value: String
}

object TextAreaChangeEvent {
  @scala.inline
  def apply(source: TextArea, value: String): TextAreaChangeEvent = {
    val __obj = js.Dynamic.literal(source = source.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[TextAreaChangeEvent]
  }
}


package typings.titanium.Titanium.UI

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
		 * Fired when this text area loses focus.
		 */
trait TextAreaBlurEvent extends TextAreaBaseEvent {
  /**
  			 * Value of this text area.
  			 */
  var value: String
}

object TextAreaBlurEvent {
  @scala.inline
  def apply(source: TextArea, value: String): TextAreaBlurEvent = {
    val __obj = js.Dynamic.literal(source = source.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[TextAreaBlurEvent]
  }
}


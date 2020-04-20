package typings.titanium.Titanium.UI

import typings.titanium.textAreaSelectedParams
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
		 * Fired when text in this text area is selected.
		 */
trait TextAreaSelectedEvent extends TextAreaBaseEvent {
  /**
  			 * Dictionary that describes the position and length of the selected text.
  			 */
  var range: textAreaSelectedParams
}

object TextAreaSelectedEvent {
  @scala.inline
  def apply(range: textAreaSelectedParams, source: TextArea): TextAreaSelectedEvent = {
    val __obj = js.Dynamic.literal(range = range.asInstanceOf[js.Any], source = source.asInstanceOf[js.Any])
    __obj.asInstanceOf[TextAreaSelectedEvent]
  }
}


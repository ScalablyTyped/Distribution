package typings.titanium.Titanium.UI

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
		 * Fired when user interacts with a URL in the text area. See [handleLinks](Titanium.UI.TextArea.handleLinks).
		 */
trait TextAreaLinkEvent extends TextAreaBaseEvent {
  /**
  			 * This is false. This event does not bubble.
  			 */
  var bubbles: Boolean
  /**
  			 * An array of two numbers [location, length] describing the character range of the text associated with this URL.
  			 */
  var range: js.Array[_]
  /**
  			 * The URL that is associated with this event.
  			 */
  var url: String
}

object TextAreaLinkEvent {
  @scala.inline
  def apply(bubbles: Boolean, range: js.Array[_], source: TextArea, url: String): TextAreaLinkEvent = {
    val __obj = js.Dynamic.literal(bubbles = bubbles.asInstanceOf[js.Any], range = range.asInstanceOf[js.Any], source = source.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
    __obj.asInstanceOf[TextAreaLinkEvent]
  }
}


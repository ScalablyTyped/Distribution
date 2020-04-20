package typings.titanium.Titanium.UI

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
		 * Fired when the bookmark button is pressed.
		 */
trait SearchBarBookmarkEvent extends SearchBarBaseEvent {
  /**
  			 * Value of the search bar.
  			 */
  var value: String
}

object SearchBarBookmarkEvent {
  @scala.inline
  def apply(source: SearchBar, value: String): SearchBarBookmarkEvent = {
    val __obj = js.Dynamic.literal(source = source.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[SearchBarBookmarkEvent]
  }
}


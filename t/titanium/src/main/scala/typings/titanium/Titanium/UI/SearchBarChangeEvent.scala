package typings.titanium.Titanium.UI

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
		 * Fired when the value of the search bar changes.
		 */
trait SearchBarChangeEvent extends SearchBarBaseEvent {
  /**
  			 * Value of the search bar.
  			 */
  var value: String
}

object SearchBarChangeEvent {
  @scala.inline
  def apply(source: SearchBar, value: String): SearchBarChangeEvent = {
    val __obj = js.Dynamic.literal(source = source.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[SearchBarChangeEvent]
  }
}


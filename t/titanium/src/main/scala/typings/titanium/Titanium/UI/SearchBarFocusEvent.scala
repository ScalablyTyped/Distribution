package typings.titanium.Titanium.UI

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Fired when the search bar gains focus.
  */
trait SearchBarFocusEvent extends SearchBarBaseEvent {
  /**
    * Value of the search bar.
    */
  var value: String
}

object SearchBarFocusEvent {
  @scala.inline
  def apply(source: SearchBar, value: String): SearchBarFocusEvent = {
    val __obj = js.Dynamic.literal(source = source.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[SearchBarFocusEvent]
  }
}


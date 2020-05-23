package typings.titanium.Titanium.UI

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Fired when keyboard search button is pressed.
  */
trait SearchBarReturnEvent extends SearchBarBaseEvent {
  /**
    * Value of the search bar.
    */
  var value: String
}

object SearchBarReturnEvent {
  @scala.inline
  def apply(source: SearchBar, value: String): SearchBarReturnEvent = {
    val __obj = js.Dynamic.literal(source = source.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[SearchBarReturnEvent]
  }
}


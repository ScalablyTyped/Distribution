package typings.titanium.Titanium.UI

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Fired when the search bar loses focus.
  */
trait SearchBarBlurEvent extends SearchBarBaseEvent {
  /**
    * Value of the search bar.
    */
  var value: String
}

object SearchBarBlurEvent {
  @scala.inline
  def apply(source: SearchBar, value: String): SearchBarBlurEvent = {
    val __obj = js.Dynamic.literal(source = source.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[SearchBarBlurEvent]
  }
}


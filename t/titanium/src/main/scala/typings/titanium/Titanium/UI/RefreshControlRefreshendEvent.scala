package typings.titanium.Titanium.UI

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
		 * Fired in response to a user finished action to refresh the contents of the
		 * table view, list view or scroll view.
		 */
trait RefreshControlRefreshendEvent extends RefreshControlBaseEvent {
  /**
  			 * This is false. This event does not bubble
  			 */
  var bubbles: Boolean
}

object RefreshControlRefreshendEvent {
  @scala.inline
  def apply(bubbles: Boolean, source: RefreshControl): RefreshControlRefreshendEvent = {
    val __obj = js.Dynamic.literal(bubbles = bubbles.asInstanceOf[js.Any], source = source.asInstanceOf[js.Any])
    __obj.asInstanceOf[RefreshControlRefreshendEvent]
  }
}


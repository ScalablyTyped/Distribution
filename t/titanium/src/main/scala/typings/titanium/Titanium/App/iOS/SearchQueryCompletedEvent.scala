package typings.titanium.Titanium.App.iOS

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
			 * Fired when the query completes to inform you about it's success.
			 * To receive items, use the `founditems` event.
			 */
trait SearchQueryCompletedEvent extends SearchQueryBaseEvent {
  /**
  				 * Error message, if any returned. Undefined otherwise.
  				 */
  var error: String
  /**
  				 * Indicates if the operation succeeded. Returns true if download succeeded, false otherwise.
  				 */
  var success: Boolean
}

object SearchQueryCompletedEvent {
  @scala.inline
  def apply(error: String, source: SearchQuery, success: Boolean): SearchQueryCompletedEvent = {
    val __obj = js.Dynamic.literal(error = error.asInstanceOf[js.Any], source = source.asInstanceOf[js.Any], success = success.asInstanceOf[js.Any])
    __obj.asInstanceOf[SearchQueryCompletedEvent]
  }
}


package typings.titanium.Titanium.UI.Android

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
			 * Fired when the device detects a single tap against the view.
			 */
trait SearchViewSingletapEvent extends SearchViewBaseEvent {
  /**
  				 * X coordinate of the event from the `source` view's coordinate system.
  				 */
  var x: Double
  /**
  				 * Y coordinate of the event from the `source` view's coordinate system.
  				 */
  var y: Double
}

object SearchViewSingletapEvent {
  @scala.inline
  def apply(source: SearchView, x: Double, y: Double): SearchViewSingletapEvent = {
    val __obj = js.Dynamic.literal(source = source.asInstanceOf[js.Any], x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any])
    __obj.asInstanceOf[SearchViewSingletapEvent]
  }
}


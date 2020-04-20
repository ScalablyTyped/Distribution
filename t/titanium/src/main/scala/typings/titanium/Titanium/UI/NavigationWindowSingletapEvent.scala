package typings.titanium.Titanium.UI

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
		 * Fired when the device detects a single tap against the view.
		 */
trait NavigationWindowSingletapEvent extends NavigationWindowBaseEvent {
  /**
  			 * X coordinate of the event from the `source` view's coordinate system.
  			 */
  var x: Double
  /**
  			 * Y coordinate of the event from the `source` view's coordinate system.
  			 */
  var y: Double
}

object NavigationWindowSingletapEvent {
  @scala.inline
  def apply(source: NavigationWindow, x: Double, y: Double): NavigationWindowSingletapEvent = {
    val __obj = js.Dynamic.literal(source = source.asInstanceOf[js.Any], x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any])
    __obj.asInstanceOf[NavigationWindowSingletapEvent]
  }
}


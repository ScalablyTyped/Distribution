package typings.titanium.Titanium.UI.iOS

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
			 * Fired when the device detects a double tap against the view.
			 */
trait BlurViewDoubletapEvent extends BlurViewBaseEvent {
  /**
  				 * X coordinate of the event from the `source` view's coordinate system.
  				 */
  var x: Double
  /**
  				 * Y coordinate of the event from the `source` view's coordinate system.
  				 */
  var y: Double
}

object BlurViewDoubletapEvent {
  @scala.inline
  def apply(source: BlurView, x: Double, y: Double): BlurViewDoubletapEvent = {
    val __obj = js.Dynamic.literal(source = source.asInstanceOf[js.Any], x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any])
    __obj.asInstanceOf[BlurViewDoubletapEvent]
  }
}


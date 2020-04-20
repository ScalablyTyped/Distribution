package typings.titanium.Titanium.UI

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
		 * Fired when the device detects a click against the view.
		 */
trait ProgressBarClickEvent extends ProgressBarBaseEvent {
  /**
  			 * X coordinate of the event from the `source` view's coordinate system.
  			 */
  var x: Double
  /**
  			 * Y coordinate of the event from the `source` view's coordinate system.
  			 */
  var y: Double
}

object ProgressBarClickEvent {
  @scala.inline
  def apply(source: ProgressBar, x: Double, y: Double): ProgressBarClickEvent = {
    val __obj = js.Dynamic.literal(source = source.asInstanceOf[js.Any], x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any])
    __obj.asInstanceOf[ProgressBarClickEvent]
  }
}


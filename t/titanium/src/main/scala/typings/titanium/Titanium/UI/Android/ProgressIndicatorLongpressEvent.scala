package typings.titanium.Titanium.UI.Android

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
			 * Fired when the device detects a long press.
			 */
trait ProgressIndicatorLongpressEvent extends ProgressIndicatorBaseEvent {
  /**
  				 * X coordinate of the event from the `source` view's coordinate system.
  				 */
  var x: Double
  /**
  				 * Y coordinate of the event from the `source` view's coordinate system.
  				 */
  var y: Double
}

object ProgressIndicatorLongpressEvent {
  @scala.inline
  def apply(source: ProgressIndicator, x: Double, y: Double): ProgressIndicatorLongpressEvent = {
    val __obj = js.Dynamic.literal(source = source.asInstanceOf[js.Any], x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any])
    __obj.asInstanceOf[ProgressIndicatorLongpressEvent]
  }
}


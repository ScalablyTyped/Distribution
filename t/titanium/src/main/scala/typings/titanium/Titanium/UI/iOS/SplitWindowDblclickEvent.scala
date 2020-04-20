package typings.titanium.Titanium.UI.iOS

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
			 * Fired when the device detects a double click against the view.
			 */
trait SplitWindowDblclickEvent extends SplitWindowBaseEvent {
  /**
  				 * X coordinate of the event from the `source` view's coordinate system.
  				 */
  var x: Double
  /**
  				 * Y coordinate of the event from the `source` view's coordinate system.
  				 */
  var y: Double
}

object SplitWindowDblclickEvent {
  @scala.inline
  def apply(source: SplitWindow, x: Double, y: Double): SplitWindowDblclickEvent = {
    val __obj = js.Dynamic.literal(source = source.asInstanceOf[js.Any], x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any])
    __obj.asInstanceOf[SplitWindowDblclickEvent]
  }
}


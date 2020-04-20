package typings.titanium.Titanium.UI

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
		 * Fired when the device detects a two-finger tap against the view.
		 */
trait MaskedImageTwofingertapEvent extends MaskedImageBaseEvent {
  /**
  			 * X coordinate of the event from the `source` view's coordinate system.
  			 */
  var x: Double
  /**
  			 * Y coordinate of the event from the `source` view's coordinate system.
  			 */
  var y: Double
}

object MaskedImageTwofingertapEvent {
  @scala.inline
  def apply(source: MaskedImage, x: Double, y: Double): MaskedImageTwofingertapEvent = {
    val __obj = js.Dynamic.literal(source = source.asInstanceOf[js.Any], x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any])
    __obj.asInstanceOf[MaskedImageTwofingertapEvent]
  }
}


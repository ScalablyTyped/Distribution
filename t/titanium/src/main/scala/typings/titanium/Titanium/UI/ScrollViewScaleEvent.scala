package typings.titanium.Titanium.UI

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
		 * Fired when the zoom scale factor changes.
		 */
trait ScrollViewScaleEvent extends ScrollViewBaseEvent {
  /**
  			 * New scaling factor as a float.
  			 */
  var scale: Double
}

object ScrollViewScaleEvent {
  @scala.inline
  def apply(scale: Double, source: ScrollView): ScrollViewScaleEvent = {
    val __obj = js.Dynamic.literal(scale = scale.asInstanceOf[js.Any], source = source.asInstanceOf[js.Any])
    __obj.asInstanceOf[ScrollViewScaleEvent]
  }
}


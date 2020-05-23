package typings.titanium.Titanium.UI.iPad

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Fired when the device detects a two-finger tap against the view.
  */
trait PopoverTwofingertapEvent extends PopoverBaseEvent {
  /**
    * X coordinate of the event from the `source` view's coordinate system.
    */
  var x: Double
  /**
    * Y coordinate of the event from the `source` view's coordinate system.
    */
  var y: Double
}

object PopoverTwofingertapEvent {
  @scala.inline
  def apply(source: Popover, x: Double, y: Double): PopoverTwofingertapEvent = {
    val __obj = js.Dynamic.literal(source = source.asInstanceOf[js.Any], x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any])
    __obj.asInstanceOf[PopoverTwofingertapEvent]
  }
}


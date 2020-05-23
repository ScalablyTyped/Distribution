package typings.titanium.Titanium

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Fired when the device orientation changes.
  */
trait GestureOrientationchangeEvent extends GestureBaseEvent {
  /**
    * Orientation of the device.
    */
  var orientation: Double
}

object GestureOrientationchangeEvent {
  @scala.inline
  def apply(orientation: Double, source: Gesture): GestureOrientationchangeEvent = {
    val __obj = js.Dynamic.literal(orientation = orientation.asInstanceOf[js.Any], source = source.asInstanceOf[js.Any])
    __obj.asInstanceOf[GestureOrientationchangeEvent]
  }
}


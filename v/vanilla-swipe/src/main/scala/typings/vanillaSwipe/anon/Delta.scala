package typings.vanillaSwipe.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Delta extends js.Object {
  var delta: Double
  var element: Null
  var mouseTrackingEnabled: Boolean
  var preventDefaultTouchmoveEvent: Boolean
  var preventTrackingOnMouseleave: Boolean
  var rotationAngle: Double
  var touchTrackingEnabled: Boolean
}

object Delta {
  @scala.inline
  def apply(
    delta: Double,
    element: Null,
    mouseTrackingEnabled: Boolean,
    preventDefaultTouchmoveEvent: Boolean,
    preventTrackingOnMouseleave: Boolean,
    rotationAngle: Double,
    touchTrackingEnabled: Boolean
  ): Delta = {
    val __obj = js.Dynamic.literal(delta = delta.asInstanceOf[js.Any], element = element.asInstanceOf[js.Any], mouseTrackingEnabled = mouseTrackingEnabled.asInstanceOf[js.Any], preventDefaultTouchmoveEvent = preventDefaultTouchmoveEvent.asInstanceOf[js.Any], preventTrackingOnMouseleave = preventTrackingOnMouseleave.asInstanceOf[js.Any], rotationAngle = rotationAngle.asInstanceOf[js.Any], touchTrackingEnabled = touchTrackingEnabled.asInstanceOf[js.Any])
    __obj.asInstanceOf[Delta]
  }
}


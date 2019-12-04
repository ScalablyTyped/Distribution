package typings.vanillaDashSwipe

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Delta extends js.Object {
  var delta: Double
  var element: Null
  var mouseTrackingEnabled: Boolean
  var preventDefaultTouchmoveEvent: Boolean
  var rotationAngle: Double
  var stopPropagation: Boolean
  var touchTrackingEnabled: Boolean
}

object Anon_Delta {
  @scala.inline
  def apply(
    delta: Double,
    element: Null,
    mouseTrackingEnabled: Boolean,
    preventDefaultTouchmoveEvent: Boolean,
    rotationAngle: Double,
    stopPropagation: Boolean,
    touchTrackingEnabled: Boolean
  ): Anon_Delta = {
    val __obj = js.Dynamic.literal(delta = delta.asInstanceOf[js.Any], element = element.asInstanceOf[js.Any], mouseTrackingEnabled = mouseTrackingEnabled.asInstanceOf[js.Any], preventDefaultTouchmoveEvent = preventDefaultTouchmoveEvent.asInstanceOf[js.Any], rotationAngle = rotationAngle.asInstanceOf[js.Any], stopPropagation = stopPropagation.asInstanceOf[js.Any], touchTrackingEnabled = touchTrackingEnabled.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Anon_Delta]
  }
}


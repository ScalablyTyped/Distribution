package typings.vanillaSwipe.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Delta extends js.Object {
  var delta: Double = js.native
  var element: Null = js.native
  var mouseTrackingEnabled: Boolean = js.native
  var preventDefaultTouchmoveEvent: Boolean = js.native
  var preventTrackingOnMouseleave: Boolean = js.native
  var rotationAngle: Double = js.native
  var touchTrackingEnabled: Boolean = js.native
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
  @scala.inline
  implicit class DeltaOps[Self <: Delta] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setDelta(value: Double): Self = this.set("delta", value.asInstanceOf[js.Any])
    @scala.inline
    def setElement(value: Null): Self = this.set("element", value.asInstanceOf[js.Any])
    @scala.inline
    def setMouseTrackingEnabled(value: Boolean): Self = this.set("mouseTrackingEnabled", value.asInstanceOf[js.Any])
    @scala.inline
    def setPreventDefaultTouchmoveEvent(value: Boolean): Self = this.set("preventDefaultTouchmoveEvent", value.asInstanceOf[js.Any])
    @scala.inline
    def setPreventTrackingOnMouseleave(value: Boolean): Self = this.set("preventTrackingOnMouseleave", value.asInstanceOf[js.Any])
    @scala.inline
    def setRotationAngle(value: Double): Self = this.set("rotationAngle", value.asInstanceOf[js.Any])
    @scala.inline
    def setTouchTrackingEnabled(value: Boolean): Self = this.set("touchTrackingEnabled", value.asInstanceOf[js.Any])
  }
  
}


package typings.winrtUwp.Windows.UI.Core.AnimationMetrics

import typings.winrtUwp.Windows.Foundation.Point
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Provides methods that enable you to retrieve the parameters of an opacity (fade in or fade out) animation. */
@js.native
trait OpacityAnimation extends js.Object {
  /** Gets the location of the first control point for the cubic Bézier curve that describes how the opacity should animate over time. */
  var control1: Point = js.native
  /** Gets the location of the second control point for the cubic Bézier curve that describes how the opacity should animate over time. */
  var control2: Point = js.native
  /** Gets the amount of time between when the opacity animation is instructed to begin and when that animation actually begins to draw. */
  var delay: Double = js.native
  /** Gets the amount of time over which the opacity animation should be performed. This does not include the delay. */
  var duration: Double = js.native
  /** Gets the object's final opacity. */
  var finalOpacity: Double = js.native
  /** Gets the object's initial opacity. */
  var initialOpacity: Double = js.native
  /** Gets the type of animation represented by this object. */
  var `type`: PropertyAnimationType = js.native
}

object OpacityAnimation {
  @scala.inline
  def apply(
    control1: Point,
    control2: Point,
    delay: Double,
    duration: Double,
    finalOpacity: Double,
    initialOpacity: Double,
    `type`: PropertyAnimationType
  ): OpacityAnimation = {
    val __obj = js.Dynamic.literal(control1 = control1.asInstanceOf[js.Any], control2 = control2.asInstanceOf[js.Any], delay = delay.asInstanceOf[js.Any], duration = duration.asInstanceOf[js.Any], finalOpacity = finalOpacity.asInstanceOf[js.Any], initialOpacity = initialOpacity.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[OpacityAnimation]
  }
  @scala.inline
  implicit class OpacityAnimationOps[Self <: OpacityAnimation] (val x: Self) extends AnyVal {
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
    def setControl1(value: Point): Self = this.set("control1", value.asInstanceOf[js.Any])
    @scala.inline
    def setControl2(value: Point): Self = this.set("control2", value.asInstanceOf[js.Any])
    @scala.inline
    def setDelay(value: Double): Self = this.set("delay", value.asInstanceOf[js.Any])
    @scala.inline
    def setDuration(value: Double): Self = this.set("duration", value.asInstanceOf[js.Any])
    @scala.inline
    def setFinalOpacity(value: Double): Self = this.set("finalOpacity", value.asInstanceOf[js.Any])
    @scala.inline
    def setInitialOpacity(value: Double): Self = this.set("initialOpacity", value.asInstanceOf[js.Any])
    @scala.inline
    def setType(value: PropertyAnimationType): Self = this.set("type", value.asInstanceOf[js.Any])
  }
  
}


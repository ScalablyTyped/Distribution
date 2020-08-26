package typings.winrtUwp.Windows.UI.Core.AnimationMetrics

import typings.winrtUwp.Windows.Foundation.Point
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Provides methods that enable you to retrieve the parameters for a scaling (growing or shrinking) animation. */
@js.native
trait ScaleAnimation extends js.Object {
  /** Gets the location of the first control point for the cubic Bézier curve that describes how the scale should animate over time. */
  var control1: Point = js.native
  /** Gets the location of the second control point for the cubic Bézier curve that describes how the scale should animate over time. */
  var control2: Point = js.native
  /** Gets the amount of time between when the scale animation is instructed to begin and when that animation actually begins to draw. */
  var delay: Double = js.native
  /** Gets the amount of time over which the scale animation should be performed. This does not include the delay. */
  var duration: Double = js.native
  /** Gets the final horizontal scale factor for the object. */
  var finalScaleX: Double = js.native
  /** Gets the final vertical scale factor for the object. */
  var finalScaleY: Double = js.native
  /** Gets the initial horizontal scale factor for the object. */
  var initialScaleX: Double = js.native
  /** Gets the initial vertical scale factor for the object. */
  var initialScaleY: Double = js.native
  /** Gets the center point for the scaling animation, expressed as a point relative to the object's normal size. */
  var normalizedOrigin: Point = js.native
  /** Gets the type of animation represented by this object. */
  var `type`: PropertyAnimationType = js.native
}

object ScaleAnimation {
  @scala.inline
  def apply(
    control1: Point,
    control2: Point,
    delay: Double,
    duration: Double,
    finalScaleX: Double,
    finalScaleY: Double,
    initialScaleX: Double,
    initialScaleY: Double,
    normalizedOrigin: Point,
    `type`: PropertyAnimationType
  ): ScaleAnimation = {
    val __obj = js.Dynamic.literal(control1 = control1.asInstanceOf[js.Any], control2 = control2.asInstanceOf[js.Any], delay = delay.asInstanceOf[js.Any], duration = duration.asInstanceOf[js.Any], finalScaleX = finalScaleX.asInstanceOf[js.Any], finalScaleY = finalScaleY.asInstanceOf[js.Any], initialScaleX = initialScaleX.asInstanceOf[js.Any], initialScaleY = initialScaleY.asInstanceOf[js.Any], normalizedOrigin = normalizedOrigin.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ScaleAnimation]
  }
  @scala.inline
  implicit class ScaleAnimationOps[Self <: ScaleAnimation] (val x: Self) extends AnyVal {
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
    def setFinalScaleX(value: Double): Self = this.set("finalScaleX", value.asInstanceOf[js.Any])
    @scala.inline
    def setFinalScaleY(value: Double): Self = this.set("finalScaleY", value.asInstanceOf[js.Any])
    @scala.inline
    def setInitialScaleX(value: Double): Self = this.set("initialScaleX", value.asInstanceOf[js.Any])
    @scala.inline
    def setInitialScaleY(value: Double): Self = this.set("initialScaleY", value.asInstanceOf[js.Any])
    @scala.inline
    def setNormalizedOrigin(value: Point): Self = this.set("normalizedOrigin", value.asInstanceOf[js.Any])
    @scala.inline
    def setType(value: PropertyAnimationType): Self = this.set("type", value.asInstanceOf[js.Any])
  }
  
}


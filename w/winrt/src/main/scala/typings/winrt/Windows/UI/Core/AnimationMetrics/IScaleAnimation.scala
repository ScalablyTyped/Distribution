package typings.winrt.Windows.UI.Core.AnimationMetrics

import typings.winrt.Windows.Foundation.Point
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IScaleAnimation extends IPropertyAnimation {
  var finalScaleX: Double = js.native
  var finalScaleY: Double = js.native
  var initialScaleX: Double = js.native
  var initialScaleY: Double = js.native
  var normalizedOrigin: Point = js.native
}

object IScaleAnimation {
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
  ): IScaleAnimation = {
    val __obj = js.Dynamic.literal(control1 = control1.asInstanceOf[js.Any], control2 = control2.asInstanceOf[js.Any], delay = delay.asInstanceOf[js.Any], duration = duration.asInstanceOf[js.Any], finalScaleX = finalScaleX.asInstanceOf[js.Any], finalScaleY = finalScaleY.asInstanceOf[js.Any], initialScaleX = initialScaleX.asInstanceOf[js.Any], initialScaleY = initialScaleY.asInstanceOf[js.Any], normalizedOrigin = normalizedOrigin.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[IScaleAnimation]
  }
  @scala.inline
  implicit class IScaleAnimationOps[Self <: IScaleAnimation] (val x: Self) extends AnyVal {
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
    def setFinalScaleX(value: Double): Self = this.set("finalScaleX", value.asInstanceOf[js.Any])
    @scala.inline
    def setFinalScaleY(value: Double): Self = this.set("finalScaleY", value.asInstanceOf[js.Any])
    @scala.inline
    def setInitialScaleX(value: Double): Self = this.set("initialScaleX", value.asInstanceOf[js.Any])
    @scala.inline
    def setInitialScaleY(value: Double): Self = this.set("initialScaleY", value.asInstanceOf[js.Any])
    @scala.inline
    def setNormalizedOrigin(value: Point): Self = this.set("normalizedOrigin", value.asInstanceOf[js.Any])
  }
  
}


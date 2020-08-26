package typings.winrt.Windows.UI.Core.AnimationMetrics

import typings.winrt.Windows.Foundation.Point
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IOpacityAnimation extends IPropertyAnimation {
  var finalOpacity: Double = js.native
  var initialOpacity: Double = js.native
}

object IOpacityAnimation {
  @scala.inline
  def apply(
    control1: Point,
    control2: Point,
    delay: Double,
    duration: Double,
    finalOpacity: Double,
    initialOpacity: Double,
    `type`: PropertyAnimationType
  ): IOpacityAnimation = {
    val __obj = js.Dynamic.literal(control1 = control1.asInstanceOf[js.Any], control2 = control2.asInstanceOf[js.Any], delay = delay.asInstanceOf[js.Any], duration = duration.asInstanceOf[js.Any], finalOpacity = finalOpacity.asInstanceOf[js.Any], initialOpacity = initialOpacity.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[IOpacityAnimation]
  }
  @scala.inline
  implicit class IOpacityAnimationOps[Self <: IOpacityAnimation] (val x: Self) extends AnyVal {
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
    def setFinalOpacity(value: Double): Self = this.set("finalOpacity", value.asInstanceOf[js.Any])
    @scala.inline
    def setInitialOpacity(value: Double): Self = this.set("initialOpacity", value.asInstanceOf[js.Any])
  }
  
}


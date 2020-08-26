package typings.winrt.Windows.UI.Core.AnimationMetrics

import typings.winrt.Windows.Foundation.Point
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IPropertyAnimation extends js.Object {
  var control1: Point = js.native
  var control2: Point = js.native
  var delay: Double = js.native
  var duration: Double = js.native
  var `type`: PropertyAnimationType = js.native
}

object IPropertyAnimation {
  @scala.inline
  def apply(control1: Point, control2: Point, delay: Double, duration: Double, `type`: PropertyAnimationType): IPropertyAnimation = {
    val __obj = js.Dynamic.literal(control1 = control1.asInstanceOf[js.Any], control2 = control2.asInstanceOf[js.Any], delay = delay.asInstanceOf[js.Any], duration = duration.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[IPropertyAnimation]
  }
  @scala.inline
  implicit class IPropertyAnimationOps[Self <: IPropertyAnimation] (val x: Self) extends AnyVal {
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
    def setType(value: PropertyAnimationType): Self = this.set("type", value.asInstanceOf[js.Any])
  }
  
}


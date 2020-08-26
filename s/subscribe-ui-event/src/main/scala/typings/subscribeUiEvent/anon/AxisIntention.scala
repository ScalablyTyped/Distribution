package typings.subscribeUiEvent.anon

import typings.subscribeUiEvent.subscribeUiEventStrings._empty
import typings.subscribeUiEvent.subscribeUiEventStrings.x
import typings.subscribeUiEvent.subscribeUiEventStrings.y
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AxisIntention extends js.Object {
  var axisIntention: x | y | _empty = js.native
  var deltaX: Double = js.native
  var deltaY: Double = js.native
  var startX: Double = js.native
  var startY: Double = js.native
}

object AxisIntention {
  @scala.inline
  def apply(axisIntention: x | y | _empty, deltaX: Double, deltaY: Double, startX: Double, startY: Double): AxisIntention = {
    val __obj = js.Dynamic.literal(axisIntention = axisIntention.asInstanceOf[js.Any], deltaX = deltaX.asInstanceOf[js.Any], deltaY = deltaY.asInstanceOf[js.Any], startX = startX.asInstanceOf[js.Any], startY = startY.asInstanceOf[js.Any])
    __obj.asInstanceOf[AxisIntention]
  }
  @scala.inline
  implicit class AxisIntentionOps[Self <: AxisIntention] (val x: Self) extends AnyVal {
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
    def setAxisIntention(value: typings.subscribeUiEvent.subscribeUiEventStrings.x | y | _empty): Self = this.set("axisIntention", value.asInstanceOf[js.Any])
    @scala.inline
    def setDeltaX(value: Double): Self = this.set("deltaX", value.asInstanceOf[js.Any])
    @scala.inline
    def setDeltaY(value: Double): Self = this.set("deltaY", value.asInstanceOf[js.Any])
    @scala.inline
    def setStartX(value: Double): Self = this.set("startX", value.asInstanceOf[js.Any])
    @scala.inline
    def setStartY(value: Double): Self = this.set("startY", value.asInstanceOf[js.Any])
  }
  
}


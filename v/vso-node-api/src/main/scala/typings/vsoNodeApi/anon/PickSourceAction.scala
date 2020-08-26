package typings.vsoNodeApi.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PickSourceAction extends js.Object {
  var pickSourceAction: scala.Double = js.native
  var pickTargetAction: scala.Double = js.native
  var undecided: scala.Double = js.native
}

object PickSourceAction {
  @scala.inline
  def apply(pickSourceAction: scala.Double, pickTargetAction: scala.Double, undecided: scala.Double): PickSourceAction = {
    val __obj = js.Dynamic.literal(pickSourceAction = pickSourceAction.asInstanceOf[js.Any], pickTargetAction = pickTargetAction.asInstanceOf[js.Any], undecided = undecided.asInstanceOf[js.Any])
    __obj.asInstanceOf[PickSourceAction]
  }
  @scala.inline
  implicit class PickSourceActionOps[Self <: PickSourceAction] (val x: Self) extends AnyVal {
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
    def setPickSourceAction(value: scala.Double): Self = this.set("pickSourceAction", value.asInstanceOf[js.Any])
    @scala.inline
    def setPickTargetAction(value: scala.Double): Self = this.set("pickTargetAction", value.asInstanceOf[js.Any])
    @scala.inline
    def setUndecided(value: scala.Double): Self = this.set("undecided", value.asInstanceOf[js.Any])
  }
  
}


package typings.winrtUwp.Windows.ApplicationModel.Chat

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represents the actions to which the user can respond. */
@js.native
trait RcsEndUserMessageAction extends js.Object {
  /** Gets the label of the action. */
  var label: String = js.native
}

object RcsEndUserMessageAction {
  @scala.inline
  def apply(label: String): RcsEndUserMessageAction = {
    val __obj = js.Dynamic.literal(label = label.asInstanceOf[js.Any])
    __obj.asInstanceOf[RcsEndUserMessageAction]
  }
  @scala.inline
  implicit class RcsEndUserMessageActionOps[Self <: RcsEndUserMessageAction] (val x: Self) extends AnyVal {
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
    def setLabel(value: String): Self = this.set("label", value.asInstanceOf[js.Any])
  }
  
}


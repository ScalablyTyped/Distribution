package typings.uiGrid.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GroupPriority extends js.Object {
  /**
    * number, starts at 0, if less than 0 or undefined then we're aggregating in this column
    */
  var groupPriority: Double = js.native
}

object GroupPriority {
  @scala.inline
  def apply(groupPriority: Double): GroupPriority = {
    val __obj = js.Dynamic.literal(groupPriority = groupPriority.asInstanceOf[js.Any])
    __obj.asInstanceOf[GroupPriority]
  }
  @scala.inline
  implicit class GroupPriorityOps[Self <: GroupPriority] (val x: Self) extends AnyVal {
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
    def setGroupPriority(value: Double): Self = this.set("groupPriority", value.asInstanceOf[js.Any])
  }
  
}


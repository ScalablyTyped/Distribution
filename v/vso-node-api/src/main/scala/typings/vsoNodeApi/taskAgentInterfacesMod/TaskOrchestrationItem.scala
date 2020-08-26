package typings.vsoNodeApi.taskAgentInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TaskOrchestrationItem extends js.Object {
  var itemType: TaskOrchestrationItemType = js.native
}

object TaskOrchestrationItem {
  @scala.inline
  def apply(itemType: TaskOrchestrationItemType): TaskOrchestrationItem = {
    val __obj = js.Dynamic.literal(itemType = itemType.asInstanceOf[js.Any])
    __obj.asInstanceOf[TaskOrchestrationItem]
  }
  @scala.inline
  implicit class TaskOrchestrationItemOps[Self <: TaskOrchestrationItem] (val x: Self) extends AnyVal {
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
    def setItemType(value: TaskOrchestrationItemType): Self = this.set("itemType", value.asInstanceOf[js.Any])
  }
  
}


package typings.vsoNodeApi.taskAgentInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TaskOrchestrationItem extends js.Object {
  var itemType: TaskOrchestrationItemType
}

object TaskOrchestrationItem {
  @scala.inline
  def apply(itemType: TaskOrchestrationItemType): TaskOrchestrationItem = {
    val __obj = js.Dynamic.literal(itemType = itemType.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[TaskOrchestrationItem]
  }
}


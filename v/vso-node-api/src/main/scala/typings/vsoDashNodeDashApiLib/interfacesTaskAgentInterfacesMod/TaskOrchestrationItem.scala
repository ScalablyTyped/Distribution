package typings
package vsoDashNodeDashApiLib.interfacesTaskAgentInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TaskOrchestrationItem extends js.Object {
  var itemType: TaskOrchestrationItemType
}

object TaskOrchestrationItem {
  @scala.inline
  def apply(itemType: TaskOrchestrationItemType): TaskOrchestrationItem = {
    val __obj = js.Dynamic.literal(itemType = itemType)
  
    __obj.asInstanceOf[TaskOrchestrationItem]
  }
}


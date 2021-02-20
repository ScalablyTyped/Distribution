package typings.vsoNodeApi.taskAgentInterfacesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TaskOrchestrationItem extends StObject {
  
  var itemType: TaskOrchestrationItemType = js.native
}
object TaskOrchestrationItem {
  
  @scala.inline
  def apply(itemType: TaskOrchestrationItemType): TaskOrchestrationItem = {
    val __obj = js.Dynamic.literal(itemType = itemType.asInstanceOf[js.Any])
    __obj.asInstanceOf[TaskOrchestrationItem]
  }
  
  @scala.inline
  implicit class TaskOrchestrationItemMutableBuilder[Self <: TaskOrchestrationItem] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setItemType(value: TaskOrchestrationItemType): Self = StObject.set(x, "itemType", value.asInstanceOf[js.Any])
  }
}

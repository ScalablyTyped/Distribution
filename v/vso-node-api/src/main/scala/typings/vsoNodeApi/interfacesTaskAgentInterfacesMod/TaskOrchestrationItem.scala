package typings.vsoNodeApi.interfacesTaskAgentInterfacesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TaskOrchestrationItem extends StObject {
  
  var itemType: TaskOrchestrationItemType
}
object TaskOrchestrationItem {
  
  inline def apply(itemType: TaskOrchestrationItemType): TaskOrchestrationItem = {
    val __obj = js.Dynamic.literal(itemType = itemType.asInstanceOf[js.Any])
    __obj.asInstanceOf[TaskOrchestrationItem]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: TaskOrchestrationItem] (val x: Self) extends AnyVal {
    
    inline def setItemType(value: TaskOrchestrationItemType): Self = StObject.set(x, "itemType", value.asInstanceOf[js.Any])
  }
}

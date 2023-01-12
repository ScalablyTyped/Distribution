package typings.vsoNodeApi.interfacesTaskAgentInterfacesMod

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TaskOrchestrationContainer
  extends StObject
     with TaskOrchestrationItem {
  
  var children: js.Array[TaskOrchestrationItem]
  
  var continueOnError: Boolean
  
  var data: StringDictionary[String]
  
  var maxConcurrency: Double
  
  var parallel: Boolean
  
  var rollback: TaskOrchestrationContainer
}
object TaskOrchestrationContainer {
  
  inline def apply(
    children: js.Array[TaskOrchestrationItem],
    continueOnError: Boolean,
    data: StringDictionary[String],
    itemType: TaskOrchestrationItemType,
    maxConcurrency: Double,
    parallel: Boolean,
    rollback: TaskOrchestrationContainer
  ): TaskOrchestrationContainer = {
    val __obj = js.Dynamic.literal(children = children.asInstanceOf[js.Any], continueOnError = continueOnError.asInstanceOf[js.Any], data = data.asInstanceOf[js.Any], itemType = itemType.asInstanceOf[js.Any], maxConcurrency = maxConcurrency.asInstanceOf[js.Any], parallel = parallel.asInstanceOf[js.Any], rollback = rollback.asInstanceOf[js.Any])
    __obj.asInstanceOf[TaskOrchestrationContainer]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: TaskOrchestrationContainer] (val x: Self) extends AnyVal {
    
    inline def setChildren(value: js.Array[TaskOrchestrationItem]): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
    
    inline def setChildrenVarargs(value: TaskOrchestrationItem*): Self = StObject.set(x, "children", js.Array(value*))
    
    inline def setContinueOnError(value: Boolean): Self = StObject.set(x, "continueOnError", value.asInstanceOf[js.Any])
    
    inline def setData(value: StringDictionary[String]): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    
    inline def setMaxConcurrency(value: Double): Self = StObject.set(x, "maxConcurrency", value.asInstanceOf[js.Any])
    
    inline def setParallel(value: Boolean): Self = StObject.set(x, "parallel", value.asInstanceOf[js.Any])
    
    inline def setRollback(value: TaskOrchestrationContainer): Self = StObject.set(x, "rollback", value.asInstanceOf[js.Any])
  }
}

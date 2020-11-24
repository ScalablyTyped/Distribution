package typings.vsoNodeApi.taskAgentInterfacesMod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TaskOrchestrationContainer extends TaskOrchestrationItem {
  
  var children: js.Array[TaskOrchestrationItem] = js.native
  
  var continueOnError: Boolean = js.native
  
  var data: StringDictionary[String] = js.native
  
  var maxConcurrency: Double = js.native
  
  var parallel: Boolean = js.native
  
  var rollback: TaskOrchestrationContainer = js.native
}
object TaskOrchestrationContainer {
  
  @scala.inline
  def apply(
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
  implicit class TaskOrchestrationContainerOps[Self <: TaskOrchestrationContainer] (val x: Self) extends AnyVal {
    
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
    def setChildrenVarargs(value: TaskOrchestrationItem*): Self = this.set("children", js.Array(value :_*))
    
    @scala.inline
    def setChildren(value: js.Array[TaskOrchestrationItem]): Self = this.set("children", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setContinueOnError(value: Boolean): Self = this.set("continueOnError", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setData(value: StringDictionary[String]): Self = this.set("data", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxConcurrency(value: Double): Self = this.set("maxConcurrency", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParallel(value: Boolean): Self = this.set("parallel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRollback(value: TaskOrchestrationContainer): Self = this.set("rollback", value.asInstanceOf[js.Any])
  }
}

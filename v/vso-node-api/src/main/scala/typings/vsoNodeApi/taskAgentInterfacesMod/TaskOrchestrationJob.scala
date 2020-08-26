package typings.vsoNodeApi.taskAgentInterfacesMod

import org.scalablytyped.runtime.StringDictionary
import typings.vsoNodeApi.vssinterfacesMod.IdentityRef
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TaskOrchestrationJob extends TaskOrchestrationItem {
  var demands: js.Array[_] = js.native
  var executeAs: IdentityRef = js.native
  var executionMode: String = js.native
  var executionTimeout: js.Any = js.native
  var instanceId: String = js.native
  var name: String = js.native
  var tasks: js.Array[TaskInstance] = js.native
  var variables: StringDictionary[String] = js.native
}

object TaskOrchestrationJob {
  @scala.inline
  def apply(
    demands: js.Array[_],
    executeAs: IdentityRef,
    executionMode: String,
    executionTimeout: js.Any,
    instanceId: String,
    itemType: TaskOrchestrationItemType,
    name: String,
    tasks: js.Array[TaskInstance],
    variables: StringDictionary[String]
  ): TaskOrchestrationJob = {
    val __obj = js.Dynamic.literal(demands = demands.asInstanceOf[js.Any], executeAs = executeAs.asInstanceOf[js.Any], executionMode = executionMode.asInstanceOf[js.Any], executionTimeout = executionTimeout.asInstanceOf[js.Any], instanceId = instanceId.asInstanceOf[js.Any], itemType = itemType.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], tasks = tasks.asInstanceOf[js.Any], variables = variables.asInstanceOf[js.Any])
    __obj.asInstanceOf[TaskOrchestrationJob]
  }
  @scala.inline
  implicit class TaskOrchestrationJobOps[Self <: TaskOrchestrationJob] (val x: Self) extends AnyVal {
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
    def setDemandsVarargs(value: js.Any*): Self = this.set("demands", js.Array(value :_*))
    @scala.inline
    def setDemands(value: js.Array[_]): Self = this.set("demands", value.asInstanceOf[js.Any])
    @scala.inline
    def setExecuteAs(value: IdentityRef): Self = this.set("executeAs", value.asInstanceOf[js.Any])
    @scala.inline
    def setExecutionMode(value: String): Self = this.set("executionMode", value.asInstanceOf[js.Any])
    @scala.inline
    def setExecutionTimeout(value: js.Any): Self = this.set("executionTimeout", value.asInstanceOf[js.Any])
    @scala.inline
    def setInstanceId(value: String): Self = this.set("instanceId", value.asInstanceOf[js.Any])
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def setTasksVarargs(value: TaskInstance*): Self = this.set("tasks", js.Array(value :_*))
    @scala.inline
    def setTasks(value: js.Array[TaskInstance]): Self = this.set("tasks", value.asInstanceOf[js.Any])
    @scala.inline
    def setVariables(value: StringDictionary[String]): Self = this.set("variables", value.asInstanceOf[js.Any])
  }
  
}


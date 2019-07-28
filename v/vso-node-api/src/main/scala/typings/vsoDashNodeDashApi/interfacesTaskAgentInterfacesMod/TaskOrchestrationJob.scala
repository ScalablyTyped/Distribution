package typings.vsoDashNodeDashApi.interfacesTaskAgentInterfacesMod

import org.scalablytyped.runtime.StringDictionary
import typings.vsoDashNodeDashApi.interfacesCommonVSSInterfacesMod.IdentityRef
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TaskOrchestrationJob extends TaskOrchestrationItem {
  var demands: js.Array[_]
  var executeAs: IdentityRef
  var executionMode: String
  var executionTimeout: js.Any
  var instanceId: String
  var name: String
  var tasks: js.Array[TaskInstance]
  var variables: StringDictionary[String]
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
    val __obj = js.Dynamic.literal(demands = demands, executeAs = executeAs, executionMode = executionMode, executionTimeout = executionTimeout, instanceId = instanceId, itemType = itemType, name = name, tasks = tasks, variables = variables)
  
    __obj.asInstanceOf[TaskOrchestrationJob]
  }
}


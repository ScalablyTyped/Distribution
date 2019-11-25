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
    val __obj = js.Dynamic.literal(demands = demands.asInstanceOf[js.Any], executeAs = executeAs.asInstanceOf[js.Any], executionMode = executionMode.asInstanceOf[js.Any], executionTimeout = executionTimeout.asInstanceOf[js.Any], instanceId = instanceId.asInstanceOf[js.Any], itemType = itemType.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], tasks = tasks.asInstanceOf[js.Any], variables = variables.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[TaskOrchestrationJob]
  }
}


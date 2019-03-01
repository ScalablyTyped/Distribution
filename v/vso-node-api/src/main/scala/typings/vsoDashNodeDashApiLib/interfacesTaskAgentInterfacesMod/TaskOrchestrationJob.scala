package typings
package vsoDashNodeDashApiLib.interfacesTaskAgentInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TaskOrchestrationJob extends TaskOrchestrationItem {
  var demands: js.Array[_]
  var executeAs: vsoDashNodeDashApiLib.interfacesCommonVSSInterfacesMod.IdentityRef
  var executionMode: java.lang.String
  var executionTimeout: js.Any
  var instanceId: java.lang.String
  var name: java.lang.String
  var tasks: js.Array[TaskInstance]
  var variables: org.scalablytyped.runtime.StringDictionary[java.lang.String]
}

object TaskOrchestrationJob {
  @scala.inline
  def apply(
    demands: js.Array[_],
    executeAs: vsoDashNodeDashApiLib.interfacesCommonVSSInterfacesMod.IdentityRef,
    executionMode: java.lang.String,
    executionTimeout: js.Any,
    instanceId: java.lang.String,
    itemType: TaskOrchestrationItemType,
    name: java.lang.String,
    tasks: js.Array[TaskInstance],
    variables: org.scalablytyped.runtime.StringDictionary[java.lang.String]
  ): TaskOrchestrationJob = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("demands")(demands)
    __obj.updateDynamic("executeAs")(executeAs)
    __obj.updateDynamic("executionMode")(executionMode)
    __obj.updateDynamic("executionTimeout")(executionTimeout)
    __obj.updateDynamic("instanceId")(instanceId)
    __obj.updateDynamic("itemType")(itemType)
    __obj.updateDynamic("name")(name)
    __obj.updateDynamic("tasks")(tasks)
    __obj.updateDynamic("variables")(variables)
    __obj.asInstanceOf[TaskOrchestrationJob]
  }
}


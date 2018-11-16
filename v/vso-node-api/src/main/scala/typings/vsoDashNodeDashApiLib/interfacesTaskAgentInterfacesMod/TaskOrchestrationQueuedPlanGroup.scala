package typings
package vsoDashNodeDashApiLib.interfacesTaskAgentInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait TaskOrchestrationQueuedPlanGroup extends js.Object {
  var definition: TaskOrchestrationOwner
  var owner: TaskOrchestrationOwner
  var planGroup: java.lang.String
  var plans: js.Array[TaskOrchestrationQueuedPlan]
  var project: ProjectReference
  var queuePosition: scala.Double
}


package typings
package vsoDashNodeDashApiLib.interfacesReleaseInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TaskOrchestrationPlanGroupReference extends js.Object {
  var planGroup: java.lang.String
  var projectId: java.lang.String
}

object TaskOrchestrationPlanGroupReference {
  @scala.inline
  def apply(planGroup: java.lang.String, projectId: java.lang.String): TaskOrchestrationPlanGroupReference = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("planGroup")(planGroup)
    __obj.updateDynamic("projectId")(projectId)
    __obj.asInstanceOf[TaskOrchestrationPlanGroupReference]
  }
}


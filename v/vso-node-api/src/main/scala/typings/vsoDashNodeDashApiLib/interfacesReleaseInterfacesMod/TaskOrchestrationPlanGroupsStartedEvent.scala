package typings
package vsoDashNodeDashApiLib.interfacesReleaseInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TaskOrchestrationPlanGroupsStartedEvent extends js.Object {
  var planGroups: js.Array[TaskOrchestrationPlanGroupReference]
}

object TaskOrchestrationPlanGroupsStartedEvent {
  @scala.inline
  def apply(planGroups: js.Array[TaskOrchestrationPlanGroupReference]): TaskOrchestrationPlanGroupsStartedEvent = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("planGroups")(planGroups)
    __obj.asInstanceOf[TaskOrchestrationPlanGroupsStartedEvent]
  }
}


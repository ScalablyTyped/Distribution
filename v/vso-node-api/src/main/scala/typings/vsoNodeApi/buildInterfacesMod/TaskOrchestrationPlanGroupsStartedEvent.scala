package typings.vsoNodeApi.buildInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TaskOrchestrationPlanGroupsStartedEvent extends js.Object {
  var planGroups: js.Array[TaskOrchestrationPlanGroupReference] = js.native
}

object TaskOrchestrationPlanGroupsStartedEvent {
  @scala.inline
  def apply(planGroups: js.Array[TaskOrchestrationPlanGroupReference]): TaskOrchestrationPlanGroupsStartedEvent = {
    val __obj = js.Dynamic.literal(planGroups = planGroups.asInstanceOf[js.Any])
    __obj.asInstanceOf[TaskOrchestrationPlanGroupsStartedEvent]
  }
  @scala.inline
  implicit class TaskOrchestrationPlanGroupsStartedEventOps[Self <: TaskOrchestrationPlanGroupsStartedEvent] (val x: Self) extends AnyVal {
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
    def setPlanGroupsVarargs(value: TaskOrchestrationPlanGroupReference*): Self = this.set("planGroups", js.Array(value :_*))
    @scala.inline
    def setPlanGroups(value: js.Array[TaskOrchestrationPlanGroupReference]): Self = this.set("planGroups", value.asInstanceOf[js.Any])
  }
  
}


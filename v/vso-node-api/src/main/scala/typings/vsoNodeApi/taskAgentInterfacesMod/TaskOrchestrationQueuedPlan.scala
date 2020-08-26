package typings.vsoNodeApi.taskAgentInterfacesMod

import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TaskOrchestrationQueuedPlan extends js.Object {
  var assignTime: Date = js.native
  var definition: TaskOrchestrationOwner = js.native
  var owner: TaskOrchestrationOwner = js.native
  var planGroup: String = js.native
  var planId: String = js.native
  var poolId: Double = js.native
  var queuePosition: Double = js.native
  var queueTime: Date = js.native
  var scopeIdentifier: String = js.native
}

object TaskOrchestrationQueuedPlan {
  @scala.inline
  def apply(
    assignTime: Date,
    definition: TaskOrchestrationOwner,
    owner: TaskOrchestrationOwner,
    planGroup: String,
    planId: String,
    poolId: Double,
    queuePosition: Double,
    queueTime: Date,
    scopeIdentifier: String
  ): TaskOrchestrationQueuedPlan = {
    val __obj = js.Dynamic.literal(assignTime = assignTime.asInstanceOf[js.Any], definition = definition.asInstanceOf[js.Any], owner = owner.asInstanceOf[js.Any], planGroup = planGroup.asInstanceOf[js.Any], planId = planId.asInstanceOf[js.Any], poolId = poolId.asInstanceOf[js.Any], queuePosition = queuePosition.asInstanceOf[js.Any], queueTime = queueTime.asInstanceOf[js.Any], scopeIdentifier = scopeIdentifier.asInstanceOf[js.Any])
    __obj.asInstanceOf[TaskOrchestrationQueuedPlan]
  }
  @scala.inline
  implicit class TaskOrchestrationQueuedPlanOps[Self <: TaskOrchestrationQueuedPlan] (val x: Self) extends AnyVal {
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
    def setAssignTime(value: Date): Self = this.set("assignTime", value.asInstanceOf[js.Any])
    @scala.inline
    def setDefinition(value: TaskOrchestrationOwner): Self = this.set("definition", value.asInstanceOf[js.Any])
    @scala.inline
    def setOwner(value: TaskOrchestrationOwner): Self = this.set("owner", value.asInstanceOf[js.Any])
    @scala.inline
    def setPlanGroup(value: String): Self = this.set("planGroup", value.asInstanceOf[js.Any])
    @scala.inline
    def setPlanId(value: String): Self = this.set("planId", value.asInstanceOf[js.Any])
    @scala.inline
    def setPoolId(value: Double): Self = this.set("poolId", value.asInstanceOf[js.Any])
    @scala.inline
    def setQueuePosition(value: Double): Self = this.set("queuePosition", value.asInstanceOf[js.Any])
    @scala.inline
    def setQueueTime(value: Date): Self = this.set("queueTime", value.asInstanceOf[js.Any])
    @scala.inline
    def setScopeIdentifier(value: String): Self = this.set("scopeIdentifier", value.asInstanceOf[js.Any])
  }
  
}


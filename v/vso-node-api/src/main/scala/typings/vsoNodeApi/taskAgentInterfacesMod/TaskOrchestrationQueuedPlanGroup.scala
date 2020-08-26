package typings.vsoNodeApi.taskAgentInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TaskOrchestrationQueuedPlanGroup extends js.Object {
  var definition: TaskOrchestrationOwner = js.native
  var owner: TaskOrchestrationOwner = js.native
  var planGroup: String = js.native
  var plans: js.Array[TaskOrchestrationQueuedPlan] = js.native
  var project: ProjectReference = js.native
  var queuePosition: Double = js.native
}

object TaskOrchestrationQueuedPlanGroup {
  @scala.inline
  def apply(
    definition: TaskOrchestrationOwner,
    owner: TaskOrchestrationOwner,
    planGroup: String,
    plans: js.Array[TaskOrchestrationQueuedPlan],
    project: ProjectReference,
    queuePosition: Double
  ): TaskOrchestrationQueuedPlanGroup = {
    val __obj = js.Dynamic.literal(definition = definition.asInstanceOf[js.Any], owner = owner.asInstanceOf[js.Any], planGroup = planGroup.asInstanceOf[js.Any], plans = plans.asInstanceOf[js.Any], project = project.asInstanceOf[js.Any], queuePosition = queuePosition.asInstanceOf[js.Any])
    __obj.asInstanceOf[TaskOrchestrationQueuedPlanGroup]
  }
  @scala.inline
  implicit class TaskOrchestrationQueuedPlanGroupOps[Self <: TaskOrchestrationQueuedPlanGroup] (val x: Self) extends AnyVal {
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
    def setDefinition(value: TaskOrchestrationOwner): Self = this.set("definition", value.asInstanceOf[js.Any])
    @scala.inline
    def setOwner(value: TaskOrchestrationOwner): Self = this.set("owner", value.asInstanceOf[js.Any])
    @scala.inline
    def setPlanGroup(value: String): Self = this.set("planGroup", value.asInstanceOf[js.Any])
    @scala.inline
    def setPlansVarargs(value: TaskOrchestrationQueuedPlan*): Self = this.set("plans", js.Array(value :_*))
    @scala.inline
    def setPlans(value: js.Array[TaskOrchestrationQueuedPlan]): Self = this.set("plans", value.asInstanceOf[js.Any])
    @scala.inline
    def setProject(value: ProjectReference): Self = this.set("project", value.asInstanceOf[js.Any])
    @scala.inline
    def setQueuePosition(value: Double): Self = this.set("queuePosition", value.asInstanceOf[js.Any])
  }
  
}


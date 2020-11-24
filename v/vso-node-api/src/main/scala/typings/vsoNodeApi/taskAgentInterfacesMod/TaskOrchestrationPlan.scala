package typings.vsoNodeApi.taskAgentInterfacesMod

import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TaskOrchestrationPlan extends TaskOrchestrationPlanReference {
  
  var environment: PlanEnvironment = js.native
  
  var finishTime: Date = js.native
  
  var implementation: TaskOrchestrationContainer = js.native
  
  var planGroup: String = js.native
  
  var requestedById: String = js.native
  
  var requestedForId: String = js.native
  
  var result: TaskResult = js.native
  
  var resultCode: String = js.native
  
  var startTime: Date = js.native
  
  var state: TaskOrchestrationPlanState = js.native
  
  var timeline: TimelineReference = js.native
}
object TaskOrchestrationPlan {
  
  @scala.inline
  def apply(
    artifactLocation: String,
    artifactUri: String,
    definition: TaskOrchestrationOwner,
    environment: PlanEnvironment,
    finishTime: Date,
    implementation: TaskOrchestrationContainer,
    owner: TaskOrchestrationOwner,
    planGroup: String,
    planId: String,
    planType: String,
    requestedById: String,
    requestedForId: String,
    result: TaskResult,
    resultCode: String,
    scopeIdentifier: String,
    startTime: Date,
    state: TaskOrchestrationPlanState,
    timeline: TimelineReference,
    version: Double
  ): TaskOrchestrationPlan = {
    val __obj = js.Dynamic.literal(artifactLocation = artifactLocation.asInstanceOf[js.Any], artifactUri = artifactUri.asInstanceOf[js.Any], definition = definition.asInstanceOf[js.Any], environment = environment.asInstanceOf[js.Any], finishTime = finishTime.asInstanceOf[js.Any], implementation = implementation.asInstanceOf[js.Any], owner = owner.asInstanceOf[js.Any], planGroup = planGroup.asInstanceOf[js.Any], planId = planId.asInstanceOf[js.Any], planType = planType.asInstanceOf[js.Any], requestedById = requestedById.asInstanceOf[js.Any], requestedForId = requestedForId.asInstanceOf[js.Any], result = result.asInstanceOf[js.Any], resultCode = resultCode.asInstanceOf[js.Any], scopeIdentifier = scopeIdentifier.asInstanceOf[js.Any], startTime = startTime.asInstanceOf[js.Any], state = state.asInstanceOf[js.Any], timeline = timeline.asInstanceOf[js.Any], version = version.asInstanceOf[js.Any])
    __obj.asInstanceOf[TaskOrchestrationPlan]
  }
  
  @scala.inline
  implicit class TaskOrchestrationPlanOps[Self <: TaskOrchestrationPlan] (val x: Self) extends AnyVal {
    
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
    def setEnvironment(value: PlanEnvironment): Self = this.set("environment", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFinishTime(value: Date): Self = this.set("finishTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setImplementation(value: TaskOrchestrationContainer): Self = this.set("implementation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPlanGroup(value: String): Self = this.set("planGroup", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequestedById(value: String): Self = this.set("requestedById", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequestedForId(value: String): Self = this.set("requestedForId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResult(value: TaskResult): Self = this.set("result", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResultCode(value: String): Self = this.set("resultCode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStartTime(value: Date): Self = this.set("startTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setState(value: TaskOrchestrationPlanState): Self = this.set("state", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTimeline(value: TimelineReference): Self = this.set("timeline", value.asInstanceOf[js.Any])
  }
}

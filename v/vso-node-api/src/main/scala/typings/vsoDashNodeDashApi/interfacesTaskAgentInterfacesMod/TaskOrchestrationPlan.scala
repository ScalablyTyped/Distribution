package typings.vsoDashNodeDashApi.interfacesTaskAgentInterfacesMod

import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TaskOrchestrationPlan extends TaskOrchestrationPlanReference {
  var environment: PlanEnvironment
  var finishTime: Date
  var implementation: TaskOrchestrationContainer
  var planGroup: String
  var requestedById: String
  var requestedForId: String
  var result: TaskResult
  var resultCode: String
  var startTime: Date
  var state: TaskOrchestrationPlanState
  var timeline: TimelineReference
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
}


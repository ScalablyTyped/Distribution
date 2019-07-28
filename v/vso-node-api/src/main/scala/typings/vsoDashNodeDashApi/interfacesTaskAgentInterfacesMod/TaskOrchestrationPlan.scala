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
    val __obj = js.Dynamic.literal(artifactLocation = artifactLocation, artifactUri = artifactUri, definition = definition, environment = environment, finishTime = finishTime, implementation = implementation, owner = owner, planGroup = planGroup, planId = planId, planType = planType, requestedById = requestedById, requestedForId = requestedForId, result = result, resultCode = resultCode, scopeIdentifier = scopeIdentifier, startTime = startTime, state = state, timeline = timeline, version = version)
  
    __obj.asInstanceOf[TaskOrchestrationPlan]
  }
}


package typings
package vsoDashNodeDashApiLib.interfacesTaskAgentInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TaskOrchestrationPlan extends TaskOrchestrationPlanReference {
  var environment: PlanEnvironment
  var finishTime: stdLib.Date
  var implementation: TaskOrchestrationContainer
  var planGroup: java.lang.String
  var requestedById: java.lang.String
  var requestedForId: java.lang.String
  var result: TaskResult
  var resultCode: java.lang.String
  var startTime: stdLib.Date
  var state: TaskOrchestrationPlanState
  var timeline: TimelineReference
}

object TaskOrchestrationPlan {
  @scala.inline
  def apply(
    artifactLocation: java.lang.String,
    artifactUri: java.lang.String,
    definition: TaskOrchestrationOwner,
    environment: PlanEnvironment,
    finishTime: stdLib.Date,
    implementation: TaskOrchestrationContainer,
    owner: TaskOrchestrationOwner,
    planGroup: java.lang.String,
    planId: java.lang.String,
    planType: java.lang.String,
    requestedById: java.lang.String,
    requestedForId: java.lang.String,
    result: TaskResult,
    resultCode: java.lang.String,
    scopeIdentifier: java.lang.String,
    startTime: stdLib.Date,
    state: TaskOrchestrationPlanState,
    timeline: TimelineReference,
    version: scala.Double
  ): TaskOrchestrationPlan = {
    val __obj = js.Dynamic.literal(artifactLocation = artifactLocation, artifactUri = artifactUri, definition = definition, environment = environment, finishTime = finishTime, implementation = implementation, owner = owner, planGroup = planGroup, planId = planId, planType = planType, requestedById = requestedById, requestedForId = requestedForId, result = result, resultCode = resultCode, scopeIdentifier = scopeIdentifier, startTime = startTime, state = state, timeline = timeline, version = version)
  
    __obj.asInstanceOf[TaskOrchestrationPlan]
  }
}


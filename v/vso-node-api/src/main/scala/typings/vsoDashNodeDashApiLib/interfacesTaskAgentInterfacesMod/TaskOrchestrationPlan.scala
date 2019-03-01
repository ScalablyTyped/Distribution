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
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("artifactLocation")(artifactLocation)
    __obj.updateDynamic("artifactUri")(artifactUri)
    __obj.updateDynamic("definition")(definition)
    __obj.updateDynamic("environment")(environment)
    __obj.updateDynamic("finishTime")(finishTime)
    __obj.updateDynamic("implementation")(implementation)
    __obj.updateDynamic("owner")(owner)
    __obj.updateDynamic("planGroup")(planGroup)
    __obj.updateDynamic("planId")(planId)
    __obj.updateDynamic("planType")(planType)
    __obj.updateDynamic("requestedById")(requestedById)
    __obj.updateDynamic("requestedForId")(requestedForId)
    __obj.updateDynamic("result")(result)
    __obj.updateDynamic("resultCode")(resultCode)
    __obj.updateDynamic("scopeIdentifier")(scopeIdentifier)
    __obj.updateDynamic("startTime")(startTime)
    __obj.updateDynamic("state")(state)
    __obj.updateDynamic("timeline")(timeline)
    __obj.updateDynamic("version")(version)
    __obj.asInstanceOf[TaskOrchestrationPlan]
  }
}


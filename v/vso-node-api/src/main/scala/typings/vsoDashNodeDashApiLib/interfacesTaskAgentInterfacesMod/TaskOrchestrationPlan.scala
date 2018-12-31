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


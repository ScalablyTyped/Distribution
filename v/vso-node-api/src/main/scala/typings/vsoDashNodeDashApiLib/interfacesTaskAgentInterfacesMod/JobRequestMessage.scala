package typings
package vsoDashNodeDashApiLib.interfacesTaskAgentInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait JobRequestMessage extends js.Object {
  var environment: JobEnvironment
  var jobId: java.lang.String
  var jobName: java.lang.String
  var messageType: java.lang.String
  var plan: TaskOrchestrationPlanReference
  var timeline: TimelineReference
}

object JobRequestMessage {
  @scala.inline
  def apply(
    environment: JobEnvironment,
    jobId: java.lang.String,
    jobName: java.lang.String,
    messageType: java.lang.String,
    plan: TaskOrchestrationPlanReference,
    timeline: TimelineReference
  ): JobRequestMessage = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("environment")(environment)
    __obj.updateDynamic("jobId")(jobId)
    __obj.updateDynamic("jobName")(jobName)
    __obj.updateDynamic("messageType")(messageType)
    __obj.updateDynamic("plan")(plan)
    __obj.updateDynamic("timeline")(timeline)
    __obj.asInstanceOf[JobRequestMessage]
  }
}


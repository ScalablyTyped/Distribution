package typings.vsoDashNodeDashApi.interfacesTaskAgentInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait JobRequestMessage extends js.Object {
  var environment: JobEnvironment
  var jobId: String
  var jobName: String
  var messageType: String
  var plan: TaskOrchestrationPlanReference
  var timeline: TimelineReference
}

object JobRequestMessage {
  @scala.inline
  def apply(
    environment: JobEnvironment,
    jobId: String,
    jobName: String,
    messageType: String,
    plan: TaskOrchestrationPlanReference,
    timeline: TimelineReference
  ): JobRequestMessage = {
    val __obj = js.Dynamic.literal(environment = environment, jobId = jobId, jobName = jobName, messageType = messageType, plan = plan, timeline = timeline)
  
    __obj.asInstanceOf[JobRequestMessage]
  }
}


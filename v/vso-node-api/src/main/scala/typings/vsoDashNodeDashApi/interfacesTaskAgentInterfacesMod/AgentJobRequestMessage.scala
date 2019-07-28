package typings.vsoDashNodeDashApi.interfacesTaskAgentInterfacesMod

import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AgentJobRequestMessage extends JobRequestMessage {
  var lockToken: String
  var lockedUntil: Date
  var requestId: Double
  var tasks: js.Array[TaskInstance]
}

object AgentJobRequestMessage {
  @scala.inline
  def apply(
    environment: JobEnvironment,
    jobId: String,
    jobName: String,
    lockToken: String,
    lockedUntil: Date,
    messageType: String,
    plan: TaskOrchestrationPlanReference,
    requestId: Double,
    tasks: js.Array[TaskInstance],
    timeline: TimelineReference
  ): AgentJobRequestMessage = {
    val __obj = js.Dynamic.literal(environment = environment, jobId = jobId, jobName = jobName, lockToken = lockToken, lockedUntil = lockedUntil, messageType = messageType, plan = plan, requestId = requestId, tasks = tasks, timeline = timeline)
  
    __obj.asInstanceOf[AgentJobRequestMessage]
  }
}


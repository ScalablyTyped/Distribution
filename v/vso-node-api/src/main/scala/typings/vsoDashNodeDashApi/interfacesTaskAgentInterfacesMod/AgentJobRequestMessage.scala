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
    val __obj = js.Dynamic.literal(environment = environment.asInstanceOf[js.Any], jobId = jobId.asInstanceOf[js.Any], jobName = jobName.asInstanceOf[js.Any], lockToken = lockToken.asInstanceOf[js.Any], lockedUntil = lockedUntil.asInstanceOf[js.Any], messageType = messageType.asInstanceOf[js.Any], plan = plan.asInstanceOf[js.Any], requestId = requestId.asInstanceOf[js.Any], tasks = tasks.asInstanceOf[js.Any], timeline = timeline.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AgentJobRequestMessage]
  }
}


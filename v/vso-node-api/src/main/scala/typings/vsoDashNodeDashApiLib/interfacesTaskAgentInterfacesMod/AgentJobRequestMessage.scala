package typings
package vsoDashNodeDashApiLib.interfacesTaskAgentInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AgentJobRequestMessage extends JobRequestMessage {
  var lockToken: java.lang.String
  var lockedUntil: stdLib.Date
  var requestId: scala.Double
  var tasks: js.Array[TaskInstance]
}

object AgentJobRequestMessage {
  @scala.inline
  def apply(
    environment: JobEnvironment,
    jobId: java.lang.String,
    jobName: java.lang.String,
    lockToken: java.lang.String,
    lockedUntil: stdLib.Date,
    messageType: java.lang.String,
    plan: TaskOrchestrationPlanReference,
    requestId: scala.Double,
    tasks: js.Array[TaskInstance],
    timeline: TimelineReference
  ): AgentJobRequestMessage = {
    val __obj = js.Dynamic.literal(environment = environment, jobId = jobId, jobName = jobName, lockToken = lockToken, lockedUntil = lockedUntil, messageType = messageType, plan = plan, requestId = requestId, tasks = tasks, timeline = timeline)
  
    __obj.asInstanceOf[AgentJobRequestMessage]
  }
}


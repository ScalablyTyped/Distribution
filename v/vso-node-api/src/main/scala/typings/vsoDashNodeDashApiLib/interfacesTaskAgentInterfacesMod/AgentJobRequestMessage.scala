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
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("environment")(environment)
    __obj.updateDynamic("jobId")(jobId)
    __obj.updateDynamic("jobName")(jobName)
    __obj.updateDynamic("lockToken")(lockToken)
    __obj.updateDynamic("lockedUntil")(lockedUntil)
    __obj.updateDynamic("messageType")(messageType)
    __obj.updateDynamic("plan")(plan)
    __obj.updateDynamic("requestId")(requestId)
    __obj.updateDynamic("tasks")(tasks)
    __obj.updateDynamic("timeline")(timeline)
    __obj.asInstanceOf[AgentJobRequestMessage]
  }
}


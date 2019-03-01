package typings
package vsoDashNodeDashApiLib.interfacesTaskAgentInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ServerJobRequestMessage extends JobRequestMessage {
  var taskDefinition: TaskDefinition
  var taskInstance: TaskInstance
}

object ServerJobRequestMessage {
  @scala.inline
  def apply(
    environment: JobEnvironment,
    jobId: java.lang.String,
    jobName: java.lang.String,
    messageType: java.lang.String,
    plan: TaskOrchestrationPlanReference,
    taskDefinition: TaskDefinition,
    taskInstance: TaskInstance,
    timeline: TimelineReference
  ): ServerJobRequestMessage = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("environment")(environment)
    __obj.updateDynamic("jobId")(jobId)
    __obj.updateDynamic("jobName")(jobName)
    __obj.updateDynamic("messageType")(messageType)
    __obj.updateDynamic("plan")(plan)
    __obj.updateDynamic("taskDefinition")(taskDefinition)
    __obj.updateDynamic("taskInstance")(taskInstance)
    __obj.updateDynamic("timeline")(timeline)
    __obj.asInstanceOf[ServerJobRequestMessage]
  }
}


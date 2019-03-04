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
    val __obj = js.Dynamic.literal(environment = environment, jobId = jobId, jobName = jobName, messageType = messageType, plan = plan, taskDefinition = taskDefinition, taskInstance = taskInstance, timeline = timeline)
  
    __obj.asInstanceOf[ServerJobRequestMessage]
  }
}


package typings.vsoNodeApi.taskAgentInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ServerJobRequestMessage extends JobRequestMessage {
  var taskDefinition: TaskDefinition = js.native
  var taskInstance: TaskInstance = js.native
}

object ServerJobRequestMessage {
  @scala.inline
  def apply(
    environment: JobEnvironment,
    jobId: String,
    jobName: String,
    messageType: String,
    plan: TaskOrchestrationPlanReference,
    taskDefinition: TaskDefinition,
    taskInstance: TaskInstance,
    timeline: TimelineReference
  ): ServerJobRequestMessage = {
    val __obj = js.Dynamic.literal(environment = environment.asInstanceOf[js.Any], jobId = jobId.asInstanceOf[js.Any], jobName = jobName.asInstanceOf[js.Any], messageType = messageType.asInstanceOf[js.Any], plan = plan.asInstanceOf[js.Any], taskDefinition = taskDefinition.asInstanceOf[js.Any], taskInstance = taskInstance.asInstanceOf[js.Any], timeline = timeline.asInstanceOf[js.Any])
    __obj.asInstanceOf[ServerJobRequestMessage]
  }
  @scala.inline
  implicit class ServerJobRequestMessageOps[Self <: ServerJobRequestMessage] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setTaskDefinition(value: TaskDefinition): Self = this.set("taskDefinition", value.asInstanceOf[js.Any])
    @scala.inline
    def setTaskInstance(value: TaskInstance): Self = this.set("taskInstance", value.asInstanceOf[js.Any])
  }
  
}


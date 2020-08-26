package typings.vsoNodeApi.taskAgentInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait JobAssignedEvent extends JobEvent {
  var request: TaskAgentJobRequest = js.native
}

object JobAssignedEvent {
  @scala.inline
  def apply(jobId: String, name: String, request: TaskAgentJobRequest): JobAssignedEvent = {
    val __obj = js.Dynamic.literal(jobId = jobId.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any])
    __obj.asInstanceOf[JobAssignedEvent]
  }
  @scala.inline
  implicit class JobAssignedEventOps[Self <: JobAssignedEvent] (val x: Self) extends AnyVal {
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
    def setRequest(value: TaskAgentJobRequest): Self = this.set("request", value.asInstanceOf[js.Any])
  }
  
}


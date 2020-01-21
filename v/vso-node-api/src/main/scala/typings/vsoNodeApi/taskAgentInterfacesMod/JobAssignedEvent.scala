package typings.vsoNodeApi.taskAgentInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait JobAssignedEvent extends JobEvent {
  var request: TaskAgentJobRequest
}

object JobAssignedEvent {
  @scala.inline
  def apply(jobId: String, name: String, request: TaskAgentJobRequest): JobAssignedEvent = {
    val __obj = js.Dynamic.literal(jobId = jobId.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[JobAssignedEvent]
  }
}


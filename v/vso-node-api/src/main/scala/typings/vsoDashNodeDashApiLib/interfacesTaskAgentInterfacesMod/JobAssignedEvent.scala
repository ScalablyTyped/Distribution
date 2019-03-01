package typings
package vsoDashNodeDashApiLib.interfacesTaskAgentInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait JobAssignedEvent extends JobEvent {
  var request: TaskAgentJobRequest
}

object JobAssignedEvent {
  @scala.inline
  def apply(jobId: java.lang.String, name: java.lang.String, request: TaskAgentJobRequest): JobAssignedEvent = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("jobId")(jobId)
    __obj.updateDynamic("name")(name)
    __obj.updateDynamic("request")(request)
    __obj.asInstanceOf[JobAssignedEvent]
  }
}


package typings.vsoDashNodeDashApi.interfacesTaskAgentInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait JobCancelMessage extends js.Object {
  var jobId: String
  var timeout: js.Any
}

object JobCancelMessage {
  @scala.inline
  def apply(jobId: String, timeout: js.Any): JobCancelMessage = {
    val __obj = js.Dynamic.literal(jobId = jobId.asInstanceOf[js.Any], timeout = timeout.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[JobCancelMessage]
  }
}


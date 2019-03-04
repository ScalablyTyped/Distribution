package typings
package vsoDashNodeDashApiLib.interfacesTaskAgentInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait JobCancelMessage extends js.Object {
  var jobId: java.lang.String
  var timeout: js.Any
}

object JobCancelMessage {
  @scala.inline
  def apply(jobId: java.lang.String, timeout: js.Any): JobCancelMessage = {
    val __obj = js.Dynamic.literal(jobId = jobId, timeout = timeout)
  
    __obj.asInstanceOf[JobCancelMessage]
  }
}


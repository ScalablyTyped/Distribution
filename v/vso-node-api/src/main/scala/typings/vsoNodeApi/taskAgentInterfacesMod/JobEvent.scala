package typings.vsoNodeApi.taskAgentInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait JobEvent extends js.Object {
  var jobId: String
  var name: String
}

object JobEvent {
  @scala.inline
  def apply(jobId: String, name: String): JobEvent = {
    val __obj = js.Dynamic.literal(jobId = jobId.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[JobEvent]
  }
}


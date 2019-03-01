package typings
package vsoDashNodeDashApiLib.interfacesTaskAgentInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait JobEvent extends js.Object {
  var jobId: java.lang.String
  var name: java.lang.String
}

object JobEvent {
  @scala.inline
  def apply(jobId: java.lang.String, name: java.lang.String): JobEvent = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("jobId")(jobId)
    __obj.updateDynamic("name")(name)
    __obj.asInstanceOf[JobEvent]
  }
}


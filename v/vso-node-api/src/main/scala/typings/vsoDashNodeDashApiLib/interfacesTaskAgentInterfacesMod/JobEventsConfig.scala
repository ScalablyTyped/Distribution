package typings
package vsoDashNodeDashApiLib.interfacesTaskAgentInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait JobEventsConfig extends js.Object {
  var jobAssigned: JobEventConfig
  var jobCompleted: JobEventConfig
  var jobStarted: JobEventConfig
}

object JobEventsConfig {
  @scala.inline
  def apply(jobAssigned: JobEventConfig, jobCompleted: JobEventConfig, jobStarted: JobEventConfig): JobEventsConfig = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("jobAssigned")(jobAssigned)
    __obj.updateDynamic("jobCompleted")(jobCompleted)
    __obj.updateDynamic("jobStarted")(jobStarted)
    __obj.asInstanceOf[JobEventsConfig]
  }
}


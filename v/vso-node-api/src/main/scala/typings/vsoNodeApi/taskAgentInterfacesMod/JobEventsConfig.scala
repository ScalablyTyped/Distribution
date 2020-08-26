package typings.vsoNodeApi.taskAgentInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait JobEventsConfig extends js.Object {
  var jobAssigned: JobEventConfig = js.native
  var jobCompleted: JobEventConfig = js.native
  var jobStarted: JobEventConfig = js.native
}

object JobEventsConfig {
  @scala.inline
  def apply(jobAssigned: JobEventConfig, jobCompleted: JobEventConfig, jobStarted: JobEventConfig): JobEventsConfig = {
    val __obj = js.Dynamic.literal(jobAssigned = jobAssigned.asInstanceOf[js.Any], jobCompleted = jobCompleted.asInstanceOf[js.Any], jobStarted = jobStarted.asInstanceOf[js.Any])
    __obj.asInstanceOf[JobEventsConfig]
  }
  @scala.inline
  implicit class JobEventsConfigOps[Self <: JobEventsConfig] (val x: Self) extends AnyVal {
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
    def setJobAssigned(value: JobEventConfig): Self = this.set("jobAssigned", value.asInstanceOf[js.Any])
    @scala.inline
    def setJobCompleted(value: JobEventConfig): Self = this.set("jobCompleted", value.asInstanceOf[js.Any])
    @scala.inline
    def setJobStarted(value: JobEventConfig): Self = this.set("jobStarted", value.asInstanceOf[js.Any])
  }
  
}


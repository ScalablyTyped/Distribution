package typings.vsoNodeApi.taskAgentInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TaskAgentPoolMaintenanceOptions extends js.Object {
  /**
    * time to consider a System.DefaultWorkingDirectory is stale
    */
  var workingDirectoryExpirationInDays: Double = js.native
}

object TaskAgentPoolMaintenanceOptions {
  @scala.inline
  def apply(workingDirectoryExpirationInDays: Double): TaskAgentPoolMaintenanceOptions = {
    val __obj = js.Dynamic.literal(workingDirectoryExpirationInDays = workingDirectoryExpirationInDays.asInstanceOf[js.Any])
    __obj.asInstanceOf[TaskAgentPoolMaintenanceOptions]
  }
  @scala.inline
  implicit class TaskAgentPoolMaintenanceOptionsOps[Self <: TaskAgentPoolMaintenanceOptions] (val x: Self) extends AnyVal {
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
    def setWorkingDirectoryExpirationInDays(value: Double): Self = this.set("workingDirectoryExpirationInDays", value.asInstanceOf[js.Any])
  }
  
}


package typings.vsoNodeApi.taskAgentInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TaskAgentPoolMaintenanceRetentionPolicy extends js.Object {
  /**
    * Number of records to keep for maintenance job executed with this definition.
    */
  var numberOfHistoryRecordsToKeep: Double = js.native
}

object TaskAgentPoolMaintenanceRetentionPolicy {
  @scala.inline
  def apply(numberOfHistoryRecordsToKeep: Double): TaskAgentPoolMaintenanceRetentionPolicy = {
    val __obj = js.Dynamic.literal(numberOfHistoryRecordsToKeep = numberOfHistoryRecordsToKeep.asInstanceOf[js.Any])
    __obj.asInstanceOf[TaskAgentPoolMaintenanceRetentionPolicy]
  }
  @scala.inline
  implicit class TaskAgentPoolMaintenanceRetentionPolicyOps[Self <: TaskAgentPoolMaintenanceRetentionPolicy] (val x: Self) extends AnyVal {
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
    def setNumberOfHistoryRecordsToKeep(value: Double): Self = this.set("numberOfHistoryRecordsToKeep", value.asInstanceOf[js.Any])
  }
  
}


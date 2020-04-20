package typings.vsoNodeApi.taskAgentInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TaskAgentPoolMaintenanceRetentionPolicy extends js.Object {
  /**
    * Number of records to keep for maintenance job executed with this definition.
    */
  var numberOfHistoryRecordsToKeep: Double
}

object TaskAgentPoolMaintenanceRetentionPolicy {
  @scala.inline
  def apply(numberOfHistoryRecordsToKeep: Double): TaskAgentPoolMaintenanceRetentionPolicy = {
    val __obj = js.Dynamic.literal(numberOfHistoryRecordsToKeep = numberOfHistoryRecordsToKeep.asInstanceOf[js.Any])
    __obj.asInstanceOf[TaskAgentPoolMaintenanceRetentionPolicy]
  }
}


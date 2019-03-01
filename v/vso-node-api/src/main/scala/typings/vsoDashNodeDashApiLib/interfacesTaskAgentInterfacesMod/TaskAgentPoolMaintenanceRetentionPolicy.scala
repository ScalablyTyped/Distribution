package typings
package vsoDashNodeDashApiLib.interfacesTaskAgentInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TaskAgentPoolMaintenanceRetentionPolicy extends js.Object {
  /**
    * Number of records to keep for maintenance job executed with this definition.
    */
  var numberOfHistoryRecordsToKeep: scala.Double
}

object TaskAgentPoolMaintenanceRetentionPolicy {
  @scala.inline
  def apply(numberOfHistoryRecordsToKeep: scala.Double): TaskAgentPoolMaintenanceRetentionPolicy = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("numberOfHistoryRecordsToKeep")(numberOfHistoryRecordsToKeep)
    __obj.asInstanceOf[TaskAgentPoolMaintenanceRetentionPolicy]
  }
}


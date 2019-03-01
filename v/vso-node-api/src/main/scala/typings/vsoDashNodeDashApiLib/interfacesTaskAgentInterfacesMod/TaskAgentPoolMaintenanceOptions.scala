package typings
package vsoDashNodeDashApiLib.interfacesTaskAgentInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TaskAgentPoolMaintenanceOptions extends js.Object {
  /**
    * time to consider a System.DefaultWorkingDirectory is stale
    */
  var workingDirectoryExpirationInDays: scala.Double
}

object TaskAgentPoolMaintenanceOptions {
  @scala.inline
  def apply(workingDirectoryExpirationInDays: scala.Double): TaskAgentPoolMaintenanceOptions = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("workingDirectoryExpirationInDays")(workingDirectoryExpirationInDays)
    __obj.asInstanceOf[TaskAgentPoolMaintenanceOptions]
  }
}


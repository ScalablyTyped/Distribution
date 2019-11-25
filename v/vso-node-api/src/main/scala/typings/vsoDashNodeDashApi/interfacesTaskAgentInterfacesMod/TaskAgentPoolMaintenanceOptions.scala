package typings.vsoDashNodeDashApi.interfacesTaskAgentInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TaskAgentPoolMaintenanceOptions extends js.Object {
  /**
    * time to consider a System.DefaultWorkingDirectory is stale
    */
  var workingDirectoryExpirationInDays: Double
}

object TaskAgentPoolMaintenanceOptions {
  @scala.inline
  def apply(workingDirectoryExpirationInDays: Double): TaskAgentPoolMaintenanceOptions = {
    val __obj = js.Dynamic.literal(workingDirectoryExpirationInDays = workingDirectoryExpirationInDays.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[TaskAgentPoolMaintenanceOptions]
  }
}


package typings.vsoDashNodeDashApi.interfacesGitInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AsyncRefOperationProgressNotification extends AsyncRefOperationCommitLevelEventNotification {
  var progress: Double
}

object AsyncRefOperationProgressNotification {
  @scala.inline
  def apply(commitId: String, operationId: Double, progress: Double): AsyncRefOperationProgressNotification = {
    val __obj = js.Dynamic.literal(commitId = commitId.asInstanceOf[js.Any], operationId = operationId.asInstanceOf[js.Any], progress = progress.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AsyncRefOperationProgressNotification]
  }
}


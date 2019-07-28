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
    val __obj = js.Dynamic.literal(commitId = commitId, operationId = operationId, progress = progress)
  
    __obj.asInstanceOf[AsyncRefOperationProgressNotification]
  }
}


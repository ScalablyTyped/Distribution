package typings.vsoDashNodeDashApi.interfacesGitInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AsyncRefOperationCommitLevelEventNotification extends AsyncGitOperationNotification {
  var commitId: String
}

object AsyncRefOperationCommitLevelEventNotification {
  @scala.inline
  def apply(commitId: String, operationId: Double): AsyncRefOperationCommitLevelEventNotification = {
    val __obj = js.Dynamic.literal(commitId = commitId, operationId = operationId)
  
    __obj.asInstanceOf[AsyncRefOperationCommitLevelEventNotification]
  }
}


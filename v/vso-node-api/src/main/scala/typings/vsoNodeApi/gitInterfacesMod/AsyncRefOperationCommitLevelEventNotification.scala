package typings.vsoNodeApi.gitInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AsyncRefOperationCommitLevelEventNotification extends AsyncGitOperationNotification {
  var commitId: String
}

object AsyncRefOperationCommitLevelEventNotification {
  @scala.inline
  def apply(commitId: String, operationId: Double): AsyncRefOperationCommitLevelEventNotification = {
    val __obj = js.Dynamic.literal(commitId = commitId.asInstanceOf[js.Any], operationId = operationId.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AsyncRefOperationCommitLevelEventNotification]
  }
}


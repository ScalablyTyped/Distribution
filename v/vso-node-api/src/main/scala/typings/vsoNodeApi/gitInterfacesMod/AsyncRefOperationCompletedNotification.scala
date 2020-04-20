package typings.vsoNodeApi.gitInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AsyncRefOperationCompletedNotification extends AsyncGitOperationNotification {
  var newRefName: String
}

object AsyncRefOperationCompletedNotification {
  @scala.inline
  def apply(newRefName: String, operationId: Double): AsyncRefOperationCompletedNotification = {
    val __obj = js.Dynamic.literal(newRefName = newRefName.asInstanceOf[js.Any], operationId = operationId.asInstanceOf[js.Any])
    __obj.asInstanceOf[AsyncRefOperationCompletedNotification]
  }
}


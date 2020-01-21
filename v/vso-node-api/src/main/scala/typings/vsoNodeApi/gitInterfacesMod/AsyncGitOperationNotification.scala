package typings.vsoNodeApi.gitInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AsyncGitOperationNotification extends js.Object {
  var operationId: Double
}

object AsyncGitOperationNotification {
  @scala.inline
  def apply(operationId: Double): AsyncGitOperationNotification = {
    val __obj = js.Dynamic.literal(operationId = operationId.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AsyncGitOperationNotification]
  }
}


package typings.vsoDashNodeDashApi.interfacesGitInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AsyncRefOperationCompletedNotification extends AsyncGitOperationNotification {
  var newRefName: String
}

object AsyncRefOperationCompletedNotification {
  @scala.inline
  def apply(newRefName: String, operationId: Double): AsyncRefOperationCompletedNotification = {
    val __obj = js.Dynamic.literal(newRefName = newRefName, operationId = operationId)
  
    __obj.asInstanceOf[AsyncRefOperationCompletedNotification]
  }
}


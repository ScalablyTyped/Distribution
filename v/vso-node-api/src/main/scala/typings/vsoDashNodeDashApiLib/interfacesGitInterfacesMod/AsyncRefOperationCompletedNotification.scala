package typings
package vsoDashNodeDashApiLib.interfacesGitInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AsyncRefOperationCompletedNotification extends AsyncGitOperationNotification {
  var newRefName: java.lang.String
}

object AsyncRefOperationCompletedNotification {
  @scala.inline
  def apply(newRefName: java.lang.String, operationId: scala.Double): AsyncRefOperationCompletedNotification = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("newRefName")(newRefName)
    __obj.updateDynamic("operationId")(operationId)
    __obj.asInstanceOf[AsyncRefOperationCompletedNotification]
  }
}


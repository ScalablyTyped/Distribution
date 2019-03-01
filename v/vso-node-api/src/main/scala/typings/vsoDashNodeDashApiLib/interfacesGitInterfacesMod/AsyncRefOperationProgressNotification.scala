package typings
package vsoDashNodeDashApiLib.interfacesGitInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AsyncRefOperationProgressNotification extends AsyncRefOperationCommitLevelEventNotification {
  var progress: scala.Double
}

object AsyncRefOperationProgressNotification {
  @scala.inline
  def apply(commitId: java.lang.String, operationId: scala.Double, progress: scala.Double): AsyncRefOperationProgressNotification = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("commitId")(commitId)
    __obj.updateDynamic("operationId")(operationId)
    __obj.updateDynamic("progress")(progress)
    __obj.asInstanceOf[AsyncRefOperationProgressNotification]
  }
}


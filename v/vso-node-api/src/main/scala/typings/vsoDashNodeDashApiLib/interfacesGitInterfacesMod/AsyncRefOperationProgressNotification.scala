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
    val __obj = js.Dynamic.literal(commitId = commitId, operationId = operationId, progress = progress)
  
    __obj.asInstanceOf[AsyncRefOperationProgressNotification]
  }
}


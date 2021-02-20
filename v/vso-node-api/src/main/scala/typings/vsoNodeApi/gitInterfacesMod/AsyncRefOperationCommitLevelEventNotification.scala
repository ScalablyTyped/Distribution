package typings.vsoNodeApi.gitInterfacesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AsyncRefOperationCommitLevelEventNotification extends AsyncGitOperationNotification {
  
  var commitId: String = js.native
}
object AsyncRefOperationCommitLevelEventNotification {
  
  @scala.inline
  def apply(commitId: String, operationId: Double): AsyncRefOperationCommitLevelEventNotification = {
    val __obj = js.Dynamic.literal(commitId = commitId.asInstanceOf[js.Any], operationId = operationId.asInstanceOf[js.Any])
    __obj.asInstanceOf[AsyncRefOperationCommitLevelEventNotification]
  }
  
  @scala.inline
  implicit class AsyncRefOperationCommitLevelEventNotificationMutableBuilder[Self <: AsyncRefOperationCommitLevelEventNotification] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCommitId(value: String): Self = StObject.set(x, "commitId", value.asInstanceOf[js.Any])
  }
}

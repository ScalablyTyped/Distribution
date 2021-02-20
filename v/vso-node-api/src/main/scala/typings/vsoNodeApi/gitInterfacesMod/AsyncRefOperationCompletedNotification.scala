package typings.vsoNodeApi.gitInterfacesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AsyncRefOperationCompletedNotification extends AsyncGitOperationNotification {
  
  var newRefName: String = js.native
}
object AsyncRefOperationCompletedNotification {
  
  @scala.inline
  def apply(newRefName: String, operationId: Double): AsyncRefOperationCompletedNotification = {
    val __obj = js.Dynamic.literal(newRefName = newRefName.asInstanceOf[js.Any], operationId = operationId.asInstanceOf[js.Any])
    __obj.asInstanceOf[AsyncRefOperationCompletedNotification]
  }
  
  @scala.inline
  implicit class AsyncRefOperationCompletedNotificationMutableBuilder[Self <: AsyncRefOperationCompletedNotification] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setNewRefName(value: String): Self = StObject.set(x, "newRefName", value.asInstanceOf[js.Any])
  }
}

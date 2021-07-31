package typings.vsoNodeApi.gitInterfacesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AsyncGitOperationNotification extends StObject {
  
  var operationId: Double
}
object AsyncGitOperationNotification {
  
  @scala.inline
  def apply(operationId: Double): AsyncGitOperationNotification = {
    val __obj = js.Dynamic.literal(operationId = operationId.asInstanceOf[js.Any])
    __obj.asInstanceOf[AsyncGitOperationNotification]
  }
  
  @scala.inline
  implicit class AsyncGitOperationNotificationMutableBuilder[Self <: AsyncGitOperationNotification] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setOperationId(value: Double): Self = StObject.set(x, "operationId", value.asInstanceOf[js.Any])
  }
}

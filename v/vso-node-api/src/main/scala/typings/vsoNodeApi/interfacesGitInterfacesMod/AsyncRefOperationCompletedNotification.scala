package typings.vsoNodeApi.interfacesGitInterfacesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AsyncRefOperationCompletedNotification
  extends StObject
     with AsyncGitOperationNotification {
  
  var newRefName: String
}
object AsyncRefOperationCompletedNotification {
  
  inline def apply(newRefName: String, operationId: Double): AsyncRefOperationCompletedNotification = {
    val __obj = js.Dynamic.literal(newRefName = newRefName.asInstanceOf[js.Any], operationId = operationId.asInstanceOf[js.Any])
    __obj.asInstanceOf[AsyncRefOperationCompletedNotification]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: AsyncRefOperationCompletedNotification] (val x: Self) extends AnyVal {
    
    inline def setNewRefName(value: String): Self = StObject.set(x, "newRefName", value.asInstanceOf[js.Any])
  }
}

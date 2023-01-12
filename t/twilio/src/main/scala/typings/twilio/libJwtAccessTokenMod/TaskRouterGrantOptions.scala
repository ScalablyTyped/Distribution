package typings.twilio.libJwtAccessTokenMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TaskRouterGrantOptions extends StObject {
  
  var role: js.UndefOr[String] = js.undefined
  
  var workerSid: js.UndefOr[String] = js.undefined
  
  var workspaceSid: js.UndefOr[String] = js.undefined
}
object TaskRouterGrantOptions {
  
  inline def apply(): TaskRouterGrantOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TaskRouterGrantOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: TaskRouterGrantOptions] (val x: Self) extends AnyVal {
    
    inline def setRole(value: String): Self = StObject.set(x, "role", value.asInstanceOf[js.Any])
    
    inline def setRoleUndefined: Self = StObject.set(x, "role", js.undefined)
    
    inline def setWorkerSid(value: String): Self = StObject.set(x, "workerSid", value.asInstanceOf[js.Any])
    
    inline def setWorkerSidUndefined: Self = StObject.set(x, "workerSid", js.undefined)
    
    inline def setWorkspaceSid(value: String): Self = StObject.set(x, "workspaceSid", value.asInstanceOf[js.Any])
    
    inline def setWorkspaceSidUndefined: Self = StObject.set(x, "workspaceSid", js.undefined)
  }
}

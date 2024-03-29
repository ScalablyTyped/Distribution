package typings.twilio.libJwtAccessTokenMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TaskRouterGrantPayload extends StObject {
  
  var role: js.UndefOr[String] = js.undefined
  
  var worker_sid: js.UndefOr[String] = js.undefined
  
  var workspace_sid: js.UndefOr[String] = js.undefined
}
object TaskRouterGrantPayload {
  
  inline def apply(): TaskRouterGrantPayload = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TaskRouterGrantPayload]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: TaskRouterGrantPayload] (val x: Self) extends AnyVal {
    
    inline def setRole(value: String): Self = StObject.set(x, "role", value.asInstanceOf[js.Any])
    
    inline def setRoleUndefined: Self = StObject.set(x, "role", js.undefined)
    
    inline def setWorker_sid(value: String): Self = StObject.set(x, "worker_sid", value.asInstanceOf[js.Any])
    
    inline def setWorker_sidUndefined: Self = StObject.set(x, "worker_sid", js.undefined)
    
    inline def setWorkspace_sid(value: String): Self = StObject.set(x, "workspace_sid", value.asInstanceOf[js.Any])
    
    inline def setWorkspace_sidUndefined: Self = StObject.set(x, "workspace_sid", js.undefined)
  }
}

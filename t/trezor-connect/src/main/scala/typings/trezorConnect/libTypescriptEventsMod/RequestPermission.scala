package typings.trezorConnect.libTypescriptEventsMod

import typings.trezorConnect.anon.Permissions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RequestPermission
  extends StObject
     with _UiEvent {
  
  var payload: Permissions
  
  var `type`: /* "ui-request_permission" */ String
}
object RequestPermission {
  
  inline def apply(payload: Permissions, `type`: /* "ui-request_permission" */ String): RequestPermission = {
    val __obj = js.Dynamic.literal(payload = payload.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[RequestPermission]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: RequestPermission] (val x: Self) extends AnyVal {
    
    inline def setPayload(value: Permissions): Self = StObject.set(x, "payload", value.asInstanceOf[js.Any])
    
    inline def setType(value: /* "ui-request_permission" */ String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}

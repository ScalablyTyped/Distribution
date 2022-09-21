package typings.twilio.accessTokenMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SyncGrantPayload extends StObject {
  
  var endpoint_id: js.UndefOr[String] = js.undefined
  
  var service_sid: js.UndefOr[String] = js.undefined
}
object SyncGrantPayload {
  
  inline def apply(): SyncGrantPayload = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SyncGrantPayload]
  }
  
  extension [Self <: SyncGrantPayload](x: Self) {
    
    inline def setEndpoint_id(value: String): Self = StObject.set(x, "endpoint_id", value.asInstanceOf[js.Any])
    
    inline def setEndpoint_idUndefined: Self = StObject.set(x, "endpoint_id", js.undefined)
    
    inline def setService_sid(value: String): Self = StObject.set(x, "service_sid", value.asInstanceOf[js.Any])
    
    inline def setService_sidUndefined: Self = StObject.set(x, "service_sid", js.undefined)
  }
}

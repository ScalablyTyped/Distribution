package typings.twilio.libJwtAccessTokenMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SyncGrantOptions extends StObject {
  
  var endpointId: js.UndefOr[String] = js.undefined
  
  var serviceSid: js.UndefOr[String] = js.undefined
}
object SyncGrantOptions {
  
  inline def apply(): SyncGrantOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SyncGrantOptions]
  }
  
  extension [Self <: SyncGrantOptions](x: Self) {
    
    inline def setEndpointId(value: String): Self = StObject.set(x, "endpointId", value.asInstanceOf[js.Any])
    
    inline def setEndpointIdUndefined: Self = StObject.set(x, "endpointId", js.undefined)
    
    inline def setServiceSid(value: String): Self = StObject.set(x, "serviceSid", value.asInstanceOf[js.Any])
    
    inline def setServiceSidUndefined: Self = StObject.set(x, "serviceSid", js.undefined)
  }
}

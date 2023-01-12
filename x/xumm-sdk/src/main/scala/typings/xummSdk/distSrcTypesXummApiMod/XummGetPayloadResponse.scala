package typings.xummSdk.distSrcTypesXummApiMod

import typings.xummSdk.anon.Account
import typings.xummSdk.anon.Computed
import typings.xummSdk.anon.Description
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait XummGetPayloadResponse extends StObject {
  
  var application: Description
  
  var custom_meta: XummCustomMeta
  
  var meta: XummPayloadMeta
  
  var payload: Computed
  
  var response: Account
}
object XummGetPayloadResponse {
  
  inline def apply(
    application: Description,
    custom_meta: XummCustomMeta,
    meta: XummPayloadMeta,
    payload: Computed,
    response: Account
  ): XummGetPayloadResponse = {
    val __obj = js.Dynamic.literal(application = application.asInstanceOf[js.Any], custom_meta = custom_meta.asInstanceOf[js.Any], meta = meta.asInstanceOf[js.Any], payload = payload.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[XummGetPayloadResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: XummGetPayloadResponse] (val x: Self) extends AnyVal {
    
    inline def setApplication(value: Description): Self = StObject.set(x, "application", value.asInstanceOf[js.Any])
    
    inline def setCustom_meta(value: XummCustomMeta): Self = StObject.set(x, "custom_meta", value.asInstanceOf[js.Any])
    
    inline def setMeta(value: XummPayloadMeta): Self = StObject.set(x, "meta", value.asInstanceOf[js.Any])
    
    inline def setPayload(value: Computed): Self = StObject.set(x, "payload", value.asInstanceOf[js.Any])
    
    inline def setResponse(value: Account): Self = StObject.set(x, "response", value.asInstanceOf[js.Any])
  }
}

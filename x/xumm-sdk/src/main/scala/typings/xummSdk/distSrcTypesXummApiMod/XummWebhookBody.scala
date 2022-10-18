package typings.xummSdk.distSrcTypesXummApiMod

import typings.xummSdk.anon.Applicationuuidv4
import typings.xummSdk.anon.Payloaduuidv4
import typings.xummSdk.anon.Tokenexpiration
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait XummWebhookBody extends StObject {
  
  var custom_meta: XummCustomMeta
  
  var meta: Applicationuuidv4
  
  var payloadResponse: Payloaduuidv4
  
  var userToken: Tokenexpiration | Null
}
object XummWebhookBody {
  
  inline def apply(custom_meta: XummCustomMeta, meta: Applicationuuidv4, payloadResponse: Payloaduuidv4): XummWebhookBody = {
    val __obj = js.Dynamic.literal(custom_meta = custom_meta.asInstanceOf[js.Any], meta = meta.asInstanceOf[js.Any], payloadResponse = payloadResponse.asInstanceOf[js.Any], userToken = null)
    __obj.asInstanceOf[XummWebhookBody]
  }
  
  extension [Self <: XummWebhookBody](x: Self) {
    
    inline def setCustom_meta(value: XummCustomMeta): Self = StObject.set(x, "custom_meta", value.asInstanceOf[js.Any])
    
    inline def setMeta(value: Applicationuuidv4): Self = StObject.set(x, "meta", value.asInstanceOf[js.Any])
    
    inline def setPayloadResponse(value: Payloaduuidv4): Self = StObject.set(x, "payloadResponse", value.asInstanceOf[js.Any])
    
    inline def setUserToken(value: Tokenexpiration): Self = StObject.set(x, "userToken", value.asInstanceOf[js.Any])
    
    inline def setUserTokenNull: Self = StObject.set(x, "userToken", null)
  }
}

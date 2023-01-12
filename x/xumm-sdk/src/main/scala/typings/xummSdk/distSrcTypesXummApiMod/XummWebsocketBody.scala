package typings.xummSdk.distSrcTypesXummApiMod

import typings.xummSdk.anon.Web
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait XummWebsocketBody extends StObject {
  
  var custom_meta: XummCustomMeta
  
  var payload_uuidv4: String
  
  var reference_call_uuidv4: String
  
  var return_url: Web
  
  var signed: Boolean
  
  var txid: String
  
  var user_token: Boolean
}
object XummWebsocketBody {
  
  inline def apply(
    custom_meta: XummCustomMeta,
    payload_uuidv4: String,
    reference_call_uuidv4: String,
    return_url: Web,
    signed: Boolean,
    txid: String,
    user_token: Boolean
  ): XummWebsocketBody = {
    val __obj = js.Dynamic.literal(custom_meta = custom_meta.asInstanceOf[js.Any], payload_uuidv4 = payload_uuidv4.asInstanceOf[js.Any], reference_call_uuidv4 = reference_call_uuidv4.asInstanceOf[js.Any], return_url = return_url.asInstanceOf[js.Any], signed = signed.asInstanceOf[js.Any], txid = txid.asInstanceOf[js.Any], user_token = user_token.asInstanceOf[js.Any])
    __obj.asInstanceOf[XummWebsocketBody]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: XummWebsocketBody] (val x: Self) extends AnyVal {
    
    inline def setCustom_meta(value: XummCustomMeta): Self = StObject.set(x, "custom_meta", value.asInstanceOf[js.Any])
    
    inline def setPayload_uuidv4(value: String): Self = StObject.set(x, "payload_uuidv4", value.asInstanceOf[js.Any])
    
    inline def setReference_call_uuidv4(value: String): Self = StObject.set(x, "reference_call_uuidv4", value.asInstanceOf[js.Any])
    
    inline def setReturn_url(value: Web): Self = StObject.set(x, "return_url", value.asInstanceOf[js.Any])
    
    inline def setSigned(value: Boolean): Self = StObject.set(x, "signed", value.asInstanceOf[js.Any])
    
    inline def setTxid(value: String): Self = StObject.set(x, "txid", value.asInstanceOf[js.Any])
    
    inline def setUser_token(value: Boolean): Self = StObject.set(x, "user_token", value.asInstanceOf[js.Any])
  }
}

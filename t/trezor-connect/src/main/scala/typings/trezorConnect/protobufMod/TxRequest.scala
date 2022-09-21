package typings.trezorConnect.protobufMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TxRequest extends StObject {
  
  var details: TxRequestDetailsType
  
  var request_type: RequestType
  
  var serialized: js.UndefOr[TxRequestSerializedType] = js.undefined
}
object TxRequest {
  
  inline def apply(details: TxRequestDetailsType, request_type: RequestType): TxRequest = {
    val __obj = js.Dynamic.literal(details = details.asInstanceOf[js.Any], request_type = request_type.asInstanceOf[js.Any])
    __obj.asInstanceOf[TxRequest]
  }
  
  extension [Self <: TxRequest](x: Self) {
    
    inline def setDetails(value: TxRequestDetailsType): Self = StObject.set(x, "details", value.asInstanceOf[js.Any])
    
    inline def setRequest_type(value: RequestType): Self = StObject.set(x, "request_type", value.asInstanceOf[js.Any])
    
    inline def setSerialized(value: TxRequestSerializedType): Self = StObject.set(x, "serialized", value.asInstanceOf[js.Any])
    
    inline def setSerializedUndefined: Self = StObject.set(x, "serialized", js.undefined)
  }
}

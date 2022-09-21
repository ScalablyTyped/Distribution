package typings.trezorConnect.protobufMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TxRequestDetailsType extends StObject {
  
  var extra_data_len: js.UndefOr[Double] = js.undefined
  
  var extra_data_offset: js.UndefOr[Double] = js.undefined
  
  var request_index: Double
  
  var tx_hash: js.UndefOr[String] = js.undefined
}
object TxRequestDetailsType {
  
  inline def apply(request_index: Double): TxRequestDetailsType = {
    val __obj = js.Dynamic.literal(request_index = request_index.asInstanceOf[js.Any])
    __obj.asInstanceOf[TxRequestDetailsType]
  }
  
  extension [Self <: TxRequestDetailsType](x: Self) {
    
    inline def setExtra_data_len(value: Double): Self = StObject.set(x, "extra_data_len", value.asInstanceOf[js.Any])
    
    inline def setExtra_data_lenUndefined: Self = StObject.set(x, "extra_data_len", js.undefined)
    
    inline def setExtra_data_offset(value: Double): Self = StObject.set(x, "extra_data_offset", value.asInstanceOf[js.Any])
    
    inline def setExtra_data_offsetUndefined: Self = StObject.set(x, "extra_data_offset", js.undefined)
    
    inline def setRequest_index(value: Double): Self = StObject.set(x, "request_index", value.asInstanceOf[js.Any])
    
    inline def setTx_hash(value: String): Self = StObject.set(x, "tx_hash", value.asInstanceOf[js.Any])
    
    inline def setTx_hashUndefined: Self = StObject.set(x, "tx_hash", js.undefined)
  }
}

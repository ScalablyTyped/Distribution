package typings.trezorConnect.protobufMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EthereumTxRequest extends StObject {
  
  var data_length: js.UndefOr[Double] = js.undefined
  
  var signature_r: js.UndefOr[String] = js.undefined
  
  var signature_s: js.UndefOr[String] = js.undefined
  
  var signature_v: js.UndefOr[Double] = js.undefined
}
object EthereumTxRequest {
  
  inline def apply(): EthereumTxRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[EthereumTxRequest]
  }
  
  extension [Self <: EthereumTxRequest](x: Self) {
    
    inline def setData_length(value: Double): Self = StObject.set(x, "data_length", value.asInstanceOf[js.Any])
    
    inline def setData_lengthUndefined: Self = StObject.set(x, "data_length", js.undefined)
    
    inline def setSignature_r(value: String): Self = StObject.set(x, "signature_r", value.asInstanceOf[js.Any])
    
    inline def setSignature_rUndefined: Self = StObject.set(x, "signature_r", js.undefined)
    
    inline def setSignature_s(value: String): Self = StObject.set(x, "signature_s", value.asInstanceOf[js.Any])
    
    inline def setSignature_sUndefined: Self = StObject.set(x, "signature_s", js.undefined)
    
    inline def setSignature_v(value: Double): Self = StObject.set(x, "signature_v", value.asInstanceOf[js.Any])
    
    inline def setSignature_vUndefined: Self = StObject.set(x, "signature_v", js.undefined)
  }
}

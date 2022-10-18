package typings.trezorConnect.libTypescriptTrezorProtobufMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TxRequestSerializedType extends StObject {
  
  var serialized_tx: js.UndefOr[String] = js.undefined
  
  var signature: js.UndefOr[String] = js.undefined
  
  var signature_index: js.UndefOr[Double] = js.undefined
}
object TxRequestSerializedType {
  
  inline def apply(): TxRequestSerializedType = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TxRequestSerializedType]
  }
  
  extension [Self <: TxRequestSerializedType](x: Self) {
    
    inline def setSerialized_tx(value: String): Self = StObject.set(x, "serialized_tx", value.asInstanceOf[js.Any])
    
    inline def setSerialized_txUndefined: Self = StObject.set(x, "serialized_tx", js.undefined)
    
    inline def setSignature(value: String): Self = StObject.set(x, "signature", value.asInstanceOf[js.Any])
    
    inline def setSignatureUndefined: Self = StObject.set(x, "signature", js.undefined)
    
    inline def setSignature_index(value: Double): Self = StObject.set(x, "signature_index", value.asInstanceOf[js.Any])
    
    inline def setSignature_indexUndefined: Self = StObject.set(x, "signature_index", js.undefined)
  }
}

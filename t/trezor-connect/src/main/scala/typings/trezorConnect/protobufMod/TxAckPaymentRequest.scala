package typings.trezorConnect.protobufMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TxAckPaymentRequest extends StObject {
  
  var amount: js.UndefOr[UintType] = js.undefined
  
  var memos: js.UndefOr[js.Array[PaymentRequestMemo]] = js.undefined
  
  var nonce: js.UndefOr[String] = js.undefined
  
  var recipient_name: String
  
  var signature: String
}
object TxAckPaymentRequest {
  
  inline def apply(recipient_name: String, signature: String): TxAckPaymentRequest = {
    val __obj = js.Dynamic.literal(recipient_name = recipient_name.asInstanceOf[js.Any], signature = signature.asInstanceOf[js.Any])
    __obj.asInstanceOf[TxAckPaymentRequest]
  }
  
  extension [Self <: TxAckPaymentRequest](x: Self) {
    
    inline def setAmount(value: UintType): Self = StObject.set(x, "amount", value.asInstanceOf[js.Any])
    
    inline def setAmountUndefined: Self = StObject.set(x, "amount", js.undefined)
    
    inline def setMemos(value: js.Array[PaymentRequestMemo]): Self = StObject.set(x, "memos", value.asInstanceOf[js.Any])
    
    inline def setMemosUndefined: Self = StObject.set(x, "memos", js.undefined)
    
    inline def setMemosVarargs(value: PaymentRequestMemo*): Self = StObject.set(x, "memos", js.Array(value*))
    
    inline def setNonce(value: String): Self = StObject.set(x, "nonce", value.asInstanceOf[js.Any])
    
    inline def setNonceUndefined: Self = StObject.set(x, "nonce", js.undefined)
    
    inline def setRecipient_name(value: String): Self = StObject.set(x, "recipient_name", value.asInstanceOf[js.Any])
    
    inline def setSignature(value: String): Self = StObject.set(x, "signature", value.asInstanceOf[js.Any])
  }
}

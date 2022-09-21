package typings.trezorConnect.protobufMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PaymentRequestMemo extends StObject {
  
  var coin_purchase_memo: js.UndefOr[CoinPurchaseMemo] = js.undefined
  
  var refund_memo: js.UndefOr[RefundMemo] = js.undefined
  
  var text_memo: js.UndefOr[TextMemo] = js.undefined
}
object PaymentRequestMemo {
  
  inline def apply(): PaymentRequestMemo = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PaymentRequestMemo]
  }
  
  extension [Self <: PaymentRequestMemo](x: Self) {
    
    inline def setCoin_purchase_memo(value: CoinPurchaseMemo): Self = StObject.set(x, "coin_purchase_memo", value.asInstanceOf[js.Any])
    
    inline def setCoin_purchase_memoUndefined: Self = StObject.set(x, "coin_purchase_memo", js.undefined)
    
    inline def setRefund_memo(value: RefundMemo): Self = StObject.set(x, "refund_memo", value.asInstanceOf[js.Any])
    
    inline def setRefund_memoUndefined: Self = StObject.set(x, "refund_memo", js.undefined)
    
    inline def setText_memo(value: TextMemo): Self = StObject.set(x, "text_memo", value.asInstanceOf[js.Any])
    
    inline def setText_memoUndefined: Self = StObject.set(x, "text_memo", js.undefined)
  }
}

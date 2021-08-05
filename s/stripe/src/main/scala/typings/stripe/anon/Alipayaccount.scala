package typings.stripe.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Alipayaccount extends StObject {
  
  var alipay_account: js.UndefOr[Double] = js.undefined
  
  var bitcoin_receiver: js.UndefOr[Double] = js.undefined
  
  var card: Double
  
  var customer_bank_account: js.UndefOr[Double] = js.undefined
}
object Alipayaccount {
  
  inline def apply(card: Double): Alipayaccount = {
    val __obj = js.Dynamic.literal(card = card.asInstanceOf[js.Any])
    __obj.asInstanceOf[Alipayaccount]
  }
  
  extension [Self <: Alipayaccount](x: Self) {
    
    inline def setAlipay_account(value: Double): Self = StObject.set(x, "alipay_account", value.asInstanceOf[js.Any])
    
    inline def setAlipay_accountUndefined: Self = StObject.set(x, "alipay_account", js.undefined)
    
    inline def setBitcoin_receiver(value: Double): Self = StObject.set(x, "bitcoin_receiver", value.asInstanceOf[js.Any])
    
    inline def setBitcoin_receiverUndefined: Self = StObject.set(x, "bitcoin_receiver", js.undefined)
    
    inline def setCard(value: Double): Self = StObject.set(x, "card", value.asInstanceOf[js.Any])
    
    inline def setCustomer_bank_account(value: Double): Self = StObject.set(x, "customer_bank_account", value.asInstanceOf[js.Any])
    
    inline def setCustomer_bank_accountUndefined: Self = StObject.set(x, "customer_bank_account", js.undefined)
  }
}

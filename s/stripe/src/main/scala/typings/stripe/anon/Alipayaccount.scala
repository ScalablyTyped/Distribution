package typings.stripe.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Alipayaccount extends StObject {
  
  var alipay_account: js.UndefOr[Double] = js.native
  
  var bitcoin_receiver: js.UndefOr[Double] = js.native
  
  var card: Double = js.native
  
  var customer_bank_account: js.UndefOr[Double] = js.native
}
object Alipayaccount {
  
  @scala.inline
  def apply(card: Double): Alipayaccount = {
    val __obj = js.Dynamic.literal(card = card.asInstanceOf[js.Any])
    __obj.asInstanceOf[Alipayaccount]
  }
  
  @scala.inline
  implicit class AlipayaccountMutableBuilder[Self <: Alipayaccount] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAlipay_account(value: Double): Self = StObject.set(x, "alipay_account", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAlipay_accountUndefined: Self = StObject.set(x, "alipay_account", js.undefined)
    
    @scala.inline
    def setBitcoin_receiver(value: Double): Self = StObject.set(x, "bitcoin_receiver", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBitcoin_receiverUndefined: Self = StObject.set(x, "bitcoin_receiver", js.undefined)
    
    @scala.inline
    def setCard(value: Double): Self = StObject.set(x, "card", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCustomer_bank_account(value: Double): Self = StObject.set(x, "customer_bank_account", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCustomer_bank_accountUndefined: Self = StObject.set(x, "customer_bank_account", js.undefined)
  }
}

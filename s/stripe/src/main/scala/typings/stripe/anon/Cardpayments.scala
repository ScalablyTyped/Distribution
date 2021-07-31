package typings.stripe.anon

import typings.stripe.stripeStrings.active
import typings.stripe.stripeStrings.inactive
import typings.stripe.stripeStrings.pending
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Cardpayments extends StObject {
  
  /**
    * The status of the card payments capability of the account, or whether
    * the account can directly process credit and debit card charges.
    */
  var card_payments: js.UndefOr[active | inactive | pending] = js.undefined
  
  /**
    * The status of the legacy payments capability of the account.
    */
  var legacy_payments: js.UndefOr[active | inactive | pending] = js.undefined
  
  /**
    * The status of the transfers capability of the account, or whether your
    * platform can transfer funds to the account.
    */
  var transfers: js.UndefOr[active | inactive | pending] = js.undefined
}
object Cardpayments {
  
  @scala.inline
  def apply(): Cardpayments = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Cardpayments]
  }
  
  @scala.inline
  implicit class CardpaymentsMutableBuilder[Self <: Cardpayments] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCard_payments(value: active | inactive | pending): Self = StObject.set(x, "card_payments", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCard_paymentsUndefined: Self = StObject.set(x, "card_payments", js.undefined)
    
    @scala.inline
    def setLegacy_payments(value: active | inactive | pending): Self = StObject.set(x, "legacy_payments", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLegacy_paymentsUndefined: Self = StObject.set(x, "legacy_payments", js.undefined)
    
    @scala.inline
    def setTransfers(value: active | inactive | pending): Self = StObject.set(x, "transfers", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTransfersUndefined: Self = StObject.set(x, "transfers", js.undefined)
  }
}

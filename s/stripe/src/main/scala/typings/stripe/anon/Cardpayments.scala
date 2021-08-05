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
  
  inline def apply(): Cardpayments = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Cardpayments]
  }
  
  extension [Self <: Cardpayments](x: Self) {
    
    inline def setCard_payments(value: active | inactive | pending): Self = StObject.set(x, "card_payments", value.asInstanceOf[js.Any])
    
    inline def setCard_paymentsUndefined: Self = StObject.set(x, "card_payments", js.undefined)
    
    inline def setLegacy_payments(value: active | inactive | pending): Self = StObject.set(x, "legacy_payments", value.asInstanceOf[js.Any])
    
    inline def setLegacy_paymentsUndefined: Self = StObject.set(x, "legacy_payments", js.undefined)
    
    inline def setTransfers(value: active | inactive | pending): Self = StObject.set(x, "transfers", value.asInstanceOf[js.Any])
    
    inline def setTransfersUndefined: Self = StObject.set(x, "transfers", js.undefined)
  }
}

package typings.stripeV3.stripe

import typings.stripeV3.anon.Bank
import typings.stripeV3.anon.Iban
import typings.stripeV3.stripe.elements.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PaymentMethodData extends StObject {
  
  var billing_details: js.UndefOr[BillingDetails] = js.undefined
  
  var card: js.UndefOr[Element] = js.undefined
  
  var ideal: js.UndefOr[Element | Bank] = js.undefined
  
  var sepa_debit: js.UndefOr[Element | Iban] = js.undefined
  
  /**
    * Billing information associated with the PaymentMethod
    * that may be used or required by particular types of
    * payment methods.
    */
  var `type`: String
}
object PaymentMethodData {
  
  inline def apply(`type`: String): PaymentMethodData = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[PaymentMethodData]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PaymentMethodData] (val x: Self) extends AnyVal {
    
    inline def setBilling_details(value: BillingDetails): Self = StObject.set(x, "billing_details", value.asInstanceOf[js.Any])
    
    inline def setBilling_detailsUndefined: Self = StObject.set(x, "billing_details", js.undefined)
    
    inline def setCard(value: Element): Self = StObject.set(x, "card", value.asInstanceOf[js.Any])
    
    inline def setCardUndefined: Self = StObject.set(x, "card", js.undefined)
    
    inline def setIdeal(value: Element | Bank): Self = StObject.set(x, "ideal", value.asInstanceOf[js.Any])
    
    inline def setIdealUndefined: Self = StObject.set(x, "ideal", js.undefined)
    
    inline def setSepa_debit(value: Element | Iban): Self = StObject.set(x, "sepa_debit", value.asInstanceOf[js.Any])
    
    inline def setSepa_debitUndefined: Self = StObject.set(x, "sepa_debit", js.undefined)
    
    inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}

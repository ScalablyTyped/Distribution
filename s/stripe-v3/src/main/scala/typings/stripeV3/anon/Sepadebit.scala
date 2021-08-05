package typings.stripeV3.anon

import typings.stripeV3.stripe.elements.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Sepadebit extends StObject {
  
  /**
    * The customer's billing_details. name and email are required.
    */
  var billing_details: Email
  
  /**
    * An iban Element.
    */
  var sepa_debit: Element | Iban
}
object Sepadebit {
  
  inline def apply(billing_details: Email, sepa_debit: Element | Iban): Sepadebit = {
    val __obj = js.Dynamic.literal(billing_details = billing_details.asInstanceOf[js.Any], sepa_debit = sepa_debit.asInstanceOf[js.Any])
    __obj.asInstanceOf[Sepadebit]
  }
  
  extension [Self <: Sepadebit](x: Self) {
    
    inline def setBilling_details(value: Email): Self = StObject.set(x, "billing_details", value.asInstanceOf[js.Any])
    
    inline def setSepa_debit(value: Element | Iban): Self = StObject.set(x, "sepa_debit", value.asInstanceOf[js.Any])
  }
}

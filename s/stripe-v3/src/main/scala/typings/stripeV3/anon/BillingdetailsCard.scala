package typings.stripeV3.anon

import typings.stripeV3.stripe.BillingDetails
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BillingdetailsCard extends StObject {
  
  /**
    * The billing details associated with the card. [Recommended]
    */
  var billing_details: js.UndefOr[BillingDetails] = js.undefined
  
  var card: js.UndefOr[Token] = js.undefined
}
object BillingdetailsCard {
  
  inline def apply(): BillingdetailsCard = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BillingdetailsCard]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: BillingdetailsCard] (val x: Self) extends AnyVal {
    
    inline def setBilling_details(value: BillingDetails): Self = StObject.set(x, "billing_details", value.asInstanceOf[js.Any])
    
    inline def setBilling_detailsUndefined: Self = StObject.set(x, "billing_details", js.undefined)
    
    inline def setCard(value: Token): Self = StObject.set(x, "card", value.asInstanceOf[js.Any])
    
    inline def setCardUndefined: Self = StObject.set(x, "card", js.undefined)
  }
}

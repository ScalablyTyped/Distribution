package typings.stripeV3.anon

import typings.stripeV3.stripe.BillingDetails
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Billingdetails extends StObject {
  
  /**
    * The billing details associated with the card. [Recommended]
    */
  var billing_details: js.UndefOr[BillingDetails] = js.undefined
}
object Billingdetails {
  
  inline def apply(): Billingdetails = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Billingdetails]
  }
  
  extension [Self <: Billingdetails](x: Self) {
    
    inline def setBilling_details(value: BillingDetails): Self = StObject.set(x, "billing_details", value.asInstanceOf[js.Any])
    
    inline def setBilling_detailsUndefined: Self = StObject.set(x, "billing_details", js.undefined)
  }
}

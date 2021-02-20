package typings.stripeV3.anon

import typings.stripeV3.stripe.BillingDetails
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Billingdetails extends StObject {
  
  /**
    * The billing details associated with the card. [Recommended]
    */
  var billing_details: js.UndefOr[BillingDetails] = js.native
}
object Billingdetails {
  
  @scala.inline
  def apply(): Billingdetails = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Billingdetails]
  }
  
  @scala.inline
  implicit class BillingdetailsMutableBuilder[Self <: Billingdetails] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBilling_details(value: BillingDetails): Self = StObject.set(x, "billing_details", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBilling_detailsUndefined: Self = StObject.set(x, "billing_details", js.undefined)
  }
}

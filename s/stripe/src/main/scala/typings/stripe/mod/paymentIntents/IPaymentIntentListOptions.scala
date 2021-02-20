package typings.stripe.mod.paymentIntents

import typings.stripe.mod.IListOptionsCreated
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IPaymentIntentListOptions extends IListOptionsCreated {
  
  /**
    * Only return PaymentIntents for the customer specified by this customer ID.
    */
  var customer: js.UndefOr[String] = js.native
}
object IPaymentIntentListOptions {
  
  @scala.inline
  def apply(): IPaymentIntentListOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IPaymentIntentListOptions]
  }
  
  @scala.inline
  implicit class IPaymentIntentListOptionsMutableBuilder[Self <: IPaymentIntentListOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCustomer(value: String): Self = StObject.set(x, "customer", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCustomerUndefined: Self = StObject.set(x, "customer", js.undefined)
  }
}

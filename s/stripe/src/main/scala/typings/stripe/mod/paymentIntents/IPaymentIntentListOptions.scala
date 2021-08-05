package typings.stripe.mod.paymentIntents

import typings.stripe.mod.IListOptionsCreated
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IPaymentIntentListOptions
  extends StObject
     with IListOptionsCreated {
  
  /**
    * Only return PaymentIntents for the customer specified by this customer ID.
    */
  var customer: js.UndefOr[String] = js.undefined
}
object IPaymentIntentListOptions {
  
  inline def apply(): IPaymentIntentListOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IPaymentIntentListOptions]
  }
  
  extension [Self <: IPaymentIntentListOptions](x: Self) {
    
    inline def setCustomer(value: String): Self = StObject.set(x, "customer", value.asInstanceOf[js.Any])
    
    inline def setCustomerUndefined: Self = StObject.set(x, "customer", js.undefined)
  }
}

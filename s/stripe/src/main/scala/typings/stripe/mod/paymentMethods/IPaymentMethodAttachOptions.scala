package typings.stripe.mod.paymentMethods

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IPaymentMethodAttachOptions extends StObject {
  
  /** The ID of the customer to which to attach the PaymentMethod. */
  var customer: String
}
object IPaymentMethodAttachOptions {
  
  inline def apply(customer: String): IPaymentMethodAttachOptions = {
    val __obj = js.Dynamic.literal(customer = customer.asInstanceOf[js.Any])
    __obj.asInstanceOf[IPaymentMethodAttachOptions]
  }
  
  extension [Self <: IPaymentMethodAttachOptions](x: Self) {
    
    inline def setCustomer(value: String): Self = StObject.set(x, "customer", value.asInstanceOf[js.Any])
  }
}

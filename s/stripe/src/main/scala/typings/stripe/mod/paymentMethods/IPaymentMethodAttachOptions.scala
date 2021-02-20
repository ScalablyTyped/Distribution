package typings.stripe.mod.paymentMethods

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IPaymentMethodAttachOptions extends StObject {
  
  /** The ID of the customer to which to attach the PaymentMethod. */
  var customer: String = js.native
}
object IPaymentMethodAttachOptions {
  
  @scala.inline
  def apply(customer: String): IPaymentMethodAttachOptions = {
    val __obj = js.Dynamic.literal(customer = customer.asInstanceOf[js.Any])
    __obj.asInstanceOf[IPaymentMethodAttachOptions]
  }
  
  @scala.inline
  implicit class IPaymentMethodAttachOptionsMutableBuilder[Self <: IPaymentMethodAttachOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCustomer(value: String): Self = StObject.set(x, "customer", value.asInstanceOf[js.Any])
  }
}

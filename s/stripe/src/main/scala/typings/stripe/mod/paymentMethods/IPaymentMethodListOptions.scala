package typings.stripe.mod.paymentMethods

import typings.stripe.mod.IListOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IPaymentMethodListOptions[T /* <: IPaymentMethodType */] extends IListOptions {
  
  /** The ID of the customer whose PaymentMethods will be retrieved. */
  var customer: String = js.native
  
  /** A required filter on the list, based on the object type field. */
  var `type`: T = js.native
}
object IPaymentMethodListOptions {
  
  @scala.inline
  def apply[T /* <: IPaymentMethodType */](customer: String, `type`: T): IPaymentMethodListOptions[T] = {
    val __obj = js.Dynamic.literal(customer = customer.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[IPaymentMethodListOptions[T]]
  }
  
  @scala.inline
  implicit class IPaymentMethodListOptionsMutableBuilder[Self <: IPaymentMethodListOptions[_], T /* <: IPaymentMethodType */] (val x: Self with IPaymentMethodListOptions[T]) extends AnyVal {
    
    @scala.inline
    def setCustomer(value: String): Self = StObject.set(x, "customer", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: T): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}

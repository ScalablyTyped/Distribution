package typings.stripe.mod.paymentMethods

import typings.stripe.mod.IListOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IPaymentMethodListOptions[T /* <: IPaymentMethodType */]
  extends StObject
     with IListOptions {
  
  /** The ID of the customer whose PaymentMethods will be retrieved. */
  var customer: String
  
  /** A required filter on the list, based on the object type field. */
  var `type`: T
}
object IPaymentMethodListOptions {
  
  @scala.inline
  def apply[T /* <: IPaymentMethodType */](customer: String, `type`: T): IPaymentMethodListOptions[T] = {
    val __obj = js.Dynamic.literal(customer = customer.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[IPaymentMethodListOptions[T]]
  }
  
  @scala.inline
  implicit class IPaymentMethodListOptionsMutableBuilder[Self <: IPaymentMethodListOptions[?], T /* <: IPaymentMethodType */] (val x: Self & IPaymentMethodListOptions[T]) extends AnyVal {
    
    @scala.inline
    def setCustomer(value: String): Self = StObject.set(x, "customer", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: T): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}

package typings.stripe.mod.paymentMethods

import typings.stripe.mod.IListOptions
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
  implicit class IPaymentMethodListOptionsOps[Self <: IPaymentMethodListOptions[_], T /* <: IPaymentMethodType */] (val x: Self with IPaymentMethodListOptions[T]) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setCustomer(value: String): Self = this.set("customer", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: T): Self = this.set("type", value.asInstanceOf[js.Any])
  }
}

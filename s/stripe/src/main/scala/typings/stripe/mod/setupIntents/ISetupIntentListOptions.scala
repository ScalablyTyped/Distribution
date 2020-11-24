package typings.stripe.mod.setupIntents

import typings.stripe.mod.IListOptionsCreated
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ISetupIntentListOptions extends IListOptionsCreated {
  
  /**
    * Only return SetupIntents for the customer specified by this customer ID.
    */
  var customer: js.UndefOr[String] = js.native
  
  /**
    * Only return SetupIntents associated with the specified payment method.
    */
  var payment_method: js.UndefOr[String] = js.native
}
object ISetupIntentListOptions {
  
  @scala.inline
  def apply(): ISetupIntentListOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ISetupIntentListOptions]
  }
  
  @scala.inline
  implicit class ISetupIntentListOptionsOps[Self <: ISetupIntentListOptions] (val x: Self) extends AnyVal {
    
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
    def deleteCustomer: Self = this.set("customer", js.undefined)
    
    @scala.inline
    def setPayment_method(value: String): Self = this.set("payment_method", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePayment_method: Self = this.set("payment_method", js.undefined)
  }
}

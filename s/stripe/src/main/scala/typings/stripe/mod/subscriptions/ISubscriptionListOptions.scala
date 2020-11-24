package typings.stripe.mod.subscriptions

import typings.stripe.mod.IListOptionsCreated
import typings.stripe.stripeStrings.all
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ISubscriptionListOptions extends IListOptionsCreated {
  
  /**
    * The billing mode of the subscriptions to retrieve. Either "charge_automatically" or "send_invoice".
    */
  var billing: js.UndefOr[SubscriptionBilling] = js.native
  
  /**
    * The ID of the customer whose subscriptions will be retrieved
    */
  var customer: js.UndefOr[String] = js.native
  
  /**
    * The ID of the plan whose subscriptions will be retrieved
    */
  var plan: js.UndefOr[String] = js.native
  
  /**
    * The status of the subscriptions to retrieve.
    */
  var status: js.UndefOr[SubscriptionStatus | all] = js.native
}
object ISubscriptionListOptions {
  
  @scala.inline
  def apply(): ISubscriptionListOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ISubscriptionListOptions]
  }
  
  @scala.inline
  implicit class ISubscriptionListOptionsOps[Self <: ISubscriptionListOptions] (val x: Self) extends AnyVal {
    
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
    def setBilling(value: SubscriptionBilling): Self = this.set("billing", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBilling: Self = this.set("billing", js.undefined)
    
    @scala.inline
    def setCustomer(value: String): Self = this.set("customer", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCustomer: Self = this.set("customer", js.undefined)
    
    @scala.inline
    def setPlan(value: String): Self = this.set("plan", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePlan: Self = this.set("plan", js.undefined)
    
    @scala.inline
    def setStatus(value: SubscriptionStatus | all): Self = this.set("status", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStatus: Self = this.set("status", js.undefined)
  }
}

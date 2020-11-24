package typings.stripe.mod.subscriptions

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ISubscriptionCreationOptions extends ISubscriptionCustCreationOptions {
  
  /**
    * A timestamp at which the subscription should cancel. If set to a date before the current period ends
    * this will cause a proration if prorate=true.
    */
  var cancel_at: js.UndefOr[Double | Null] = js.native
  
  /**
    * Boolean indicating whether this subscription should cancel at the end of the current period.
    */
  var cancel_at_period_end: js.UndefOr[Boolean] = js.native
  
  /***
    * The identifier of the customer to subscribe.
    */
  var customer: String = js.native
}
object ISubscriptionCreationOptions {
  
  @scala.inline
  def apply(customer: String): ISubscriptionCreationOptions = {
    val __obj = js.Dynamic.literal(customer = customer.asInstanceOf[js.Any])
    __obj.asInstanceOf[ISubscriptionCreationOptions]
  }
  
  @scala.inline
  implicit class ISubscriptionCreationOptionsOps[Self <: ISubscriptionCreationOptions] (val x: Self) extends AnyVal {
    
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
    def setCancel_at(value: Double): Self = this.set("cancel_at", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCancel_at: Self = this.set("cancel_at", js.undefined)
    
    @scala.inline
    def setCancel_atNull: Self = this.set("cancel_at", null)
    
    @scala.inline
    def setCancel_at_period_end(value: Boolean): Self = this.set("cancel_at_period_end", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCancel_at_period_end: Self = this.set("cancel_at_period_end", js.undefined)
  }
}

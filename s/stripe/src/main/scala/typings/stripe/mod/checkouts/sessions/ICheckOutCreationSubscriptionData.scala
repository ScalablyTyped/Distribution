package typings.stripe.mod.checkouts.sessions

import typings.stripe.mod.IMetadata
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ICheckOutCreationSubscriptionData extends js.Object {
  
  /**
    * A non-negative decimal between 0 and 100, with at most two decimal places.
    * This represents the percentage of the subscription invoice subtotal that will be transferred to the application owner’s Stripe account.
    */
  var application_fee_percent: js.UndefOr[Double] = js.native
  
  /**
    * A list of items, each with an attached plan, that the customer is subscribing to. Use this parameter for subscriptions. To create one-time payments, use line_items.
    */
  var items: js.Array[ICheckOutCreationSubscriptionDataItem] = js.native
  
  /**
    * Set of key-value pairs that you can attach to an object. This can be useful for storing additional information about the object in a structured format.
    */
  var metadata: js.UndefOr[IMetadata] = js.native
  
  /**
    * Unix timestamp representing the end of the trial period the customer will get before being charged for the first time. Has to be at least 48 hours in the future.
    */
  var trial_end: js.UndefOr[Double] = js.native
  
  /**
    * Integer representing the number of trial period days before the customer is charged for the first time. Has to be at least 1.
    */
  var trial_period_days: js.UndefOr[Double] = js.native
}
object ICheckOutCreationSubscriptionData {
  
  @scala.inline
  def apply(items: js.Array[ICheckOutCreationSubscriptionDataItem]): ICheckOutCreationSubscriptionData = {
    val __obj = js.Dynamic.literal(items = items.asInstanceOf[js.Any])
    __obj.asInstanceOf[ICheckOutCreationSubscriptionData]
  }
  
  @scala.inline
  implicit class ICheckOutCreationSubscriptionDataOps[Self <: ICheckOutCreationSubscriptionData] (val x: Self) extends AnyVal {
    
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
    def setItemsVarargs(value: ICheckOutCreationSubscriptionDataItem*): Self = this.set("items", js.Array(value :_*))
    
    @scala.inline
    def setItems(value: js.Array[ICheckOutCreationSubscriptionDataItem]): Self = this.set("items", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setApplication_fee_percent(value: Double): Self = this.set("application_fee_percent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteApplication_fee_percent: Self = this.set("application_fee_percent", js.undefined)
    
    @scala.inline
    def setMetadata(value: IMetadata): Self = this.set("metadata", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMetadata: Self = this.set("metadata", js.undefined)
    
    @scala.inline
    def setTrial_end(value: Double): Self = this.set("trial_end", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTrial_end: Self = this.set("trial_end", js.undefined)
    
    @scala.inline
    def setTrial_period_days(value: Double): Self = this.set("trial_period_days", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTrial_period_days: Self = this.set("trial_period_days", js.undefined)
  }
}

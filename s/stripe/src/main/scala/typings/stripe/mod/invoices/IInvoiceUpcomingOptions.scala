package typings.stripe.mod.invoices

import typings.stripe.mod.IDataOptions
import typings.stripe.mod.subscriptions.ISubscriptionUpdateItem
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IInvoiceUpcomingOptions extends IDataOptions {
  
  /**
    * The code of the coupon to apply. If a subscription or subscription_plan is provided, the invoice returned will preview updating
    * or creating a subscription with that coupon. Otherwise, it will preview applying that coupon to the customer for the next upcoming
    * invoice from among the customer’s subscriptions.
    */
  var coupon: js.UndefOr[String] = js.native
  
  /**
    * The identifier of the customer whose upcoming invoice you’d like to retrieve. REQUIRED IF SUBSCRIPTION UNSET
    */
  var customer: js.UndefOr[String] = js.native
  
  /**
    * The identifier of the subscription for which you’d like to retrieve the upcoming invoice. If not provided, but a subscription_plan
    * is provided, you will preview creating a subscription to that plan. If neither subscription nor subscription_plan is provided, you
    * will retrieve the next upcoming invoice from among the customer’s subscriptions.
    */
  var subscription: js.UndefOr[String] = js.native
  
  /**
    * Boolean indicating whether this subscription should cancel at the end of the current period.
    */
  var subscription_cancel_at_period_end: js.UndefOr[Boolean] = js.native
  
  /**
    * List of subscription items, each with an attached plan.
    */
  var subscription_items: js.UndefOr[js.Array[ISubscriptionUpdateItem]] = js.native
  
  /**
    * If set, the invoice returned will preview updating the subscription given to this plan, or creating a new subscription to this plan
    * if no subscription is given.
    */
  var subscription_plan: js.UndefOr[String] = js.native
  
  /**
    * If previewing an update to a subscription, this decides whether the preview will show the result of applying prorations or not. If
    * set, one of subscription_plan or subscription, and one of subscription_plan, subscription_quantity or subscription_trial_end are
    * required.
    */
  var subscription_prorate: js.UndefOr[Boolean] = js.native
  
  /**
    * If previewing an update to a subscription, and doing proration, subscription_proration_date forces the proration to be calculated as
    * though the update was done at the specified time. The time given must be within the current subscription period, and cannot be
    * before the subscription was on its current plan.If set, subscription, and one of subscription_plan, subscription_quantity or
    * subscription_trial_end are required. Also, subscription_proration cannot be set to false.
    */
  var subscription_proration_date: js.UndefOr[Double] = js.native
  
  /**
    * If provided, the invoice returned will preview updating or creating a subscription with that quantity. If set, one of subscription_plan
    * or subscription is required.
    */
  var subscription_quantity: js.UndefOr[Double] = js.native
  
  /**
    * If provided, the invoice returned will preview updating or creating a subscription with that trial end. If set, one of subscription_plan
    * or subscription is required.
    */
  var subscription_trial_end: js.UndefOr[Double] = js.native
}
object IInvoiceUpcomingOptions {
  
  @scala.inline
  def apply(): IInvoiceUpcomingOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IInvoiceUpcomingOptions]
  }
  
  @scala.inline
  implicit class IInvoiceUpcomingOptionsMutableBuilder[Self <: IInvoiceUpcomingOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCoupon(value: String): Self = StObject.set(x, "coupon", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCouponUndefined: Self = StObject.set(x, "coupon", js.undefined)
    
    @scala.inline
    def setCustomer(value: String): Self = StObject.set(x, "customer", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCustomerUndefined: Self = StObject.set(x, "customer", js.undefined)
    
    @scala.inline
    def setSubscription(value: String): Self = StObject.set(x, "subscription", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSubscriptionUndefined: Self = StObject.set(x, "subscription", js.undefined)
    
    @scala.inline
    def setSubscription_cancel_at_period_end(value: Boolean): Self = StObject.set(x, "subscription_cancel_at_period_end", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSubscription_cancel_at_period_endUndefined: Self = StObject.set(x, "subscription_cancel_at_period_end", js.undefined)
    
    @scala.inline
    def setSubscription_items(value: js.Array[ISubscriptionUpdateItem]): Self = StObject.set(x, "subscription_items", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSubscription_itemsUndefined: Self = StObject.set(x, "subscription_items", js.undefined)
    
    @scala.inline
    def setSubscription_itemsVarargs(value: ISubscriptionUpdateItem*): Self = StObject.set(x, "subscription_items", js.Array(value :_*))
    
    @scala.inline
    def setSubscription_plan(value: String): Self = StObject.set(x, "subscription_plan", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSubscription_planUndefined: Self = StObject.set(x, "subscription_plan", js.undefined)
    
    @scala.inline
    def setSubscription_prorate(value: Boolean): Self = StObject.set(x, "subscription_prorate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSubscription_prorateUndefined: Self = StObject.set(x, "subscription_prorate", js.undefined)
    
    @scala.inline
    def setSubscription_proration_date(value: Double): Self = StObject.set(x, "subscription_proration_date", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSubscription_proration_dateUndefined: Self = StObject.set(x, "subscription_proration_date", js.undefined)
    
    @scala.inline
    def setSubscription_quantity(value: Double): Self = StObject.set(x, "subscription_quantity", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSubscription_quantityUndefined: Self = StObject.set(x, "subscription_quantity", js.undefined)
    
    @scala.inline
    def setSubscription_trial_end(value: Double): Self = StObject.set(x, "subscription_trial_end", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSubscription_trial_endUndefined: Self = StObject.set(x, "subscription_trial_end", js.undefined)
  }
}

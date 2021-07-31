package typings.stripe.mod.resources

import typings.stripe.mod.HeaderOptions
import typings.stripe.mod.IDeleteConfirmation
import typings.stripe.mod.IList
import typings.stripe.mod.IListPromise
import typings.stripe.mod.IResponseFn
import typings.stripe.mod.Stripe
import typings.stripe.mod.StripeResource
import typings.stripe.mod.subscriptions.ISubscription
import typings.stripe.mod.subscriptions.ISubscriptionCancellationOptions
import typings.stripe.mod.subscriptions.ISubscriptionListOptions
import typings.stripe.mod.subscriptions.ISubscriptionUpdateOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("stripe", "resources.SubscriptionsBase")
@js.native
class SubscriptionsBase protected () extends StripeResource {
  def this(stripe: Stripe, urlData: js.Any) = this()
  
  def del(subscriptionId: String): js.Promise[ISubscription] = js.native
  def del(subscriptionId: String, data: ISubscriptionCancellationOptions): js.Promise[ISubscription] = js.native
  /**
    * Cancels a customer's subscription. If you set the at_period_end parameter to true, the subscription will remain active until
    * the end of the period, at which point it will be canceled and not renewed. By default, the subscription is terminated
    * immediately. In either case, the customer will not be charged again for the subscription. Note, however, that any pending
    * invoice items that you've created will still be charged for at the end of the period unless manually deleted. If you've set
    * the subscription to cancel at period end, any pending prorations will also be left in place and collected at the end of the
    * period, but if the subscription is set to cancel immediately, pending prorations will be removed. By default, all unpaid
    * invoices for the customer will be closed upon subscription cancellation. We do this in order to prevent unexpected payment
    * retries once the customer has canceled a subscription. However, you can reopen the invoices manually after subscription
    * cancellation to have us proceed with automatic retries, or you could even re-attempt payment yourself on all unpaid invoices
    * before allowing the customer to cancel the subscription at all.
    *
    * @returns The canceled subscription object. Its subscription status will be set to "canceled" unless you've set at_period_end
    * to true when canceling, in which case the status will remain "active" but the cancel_at_period_end attribute will change to true.
    *
    * @param subscriptionId The ID of the subscription to cancel.
    * @param data Specify when to cancel the subscription
    */
  def del(subscriptionId: String, data: ISubscriptionCancellationOptions, options: HeaderOptions): js.Promise[ISubscription] = js.native
  def del(
    subscriptionId: String,
    data: ISubscriptionCancellationOptions,
    options: HeaderOptions,
    response: IResponseFn[ISubscription]
  ): js.Promise[ISubscription] = js.native
  def del(
    subscriptionId: String,
    data: ISubscriptionCancellationOptions,
    response: IResponseFn[ISubscription]
  ): js.Promise[ISubscription] = js.native
  def del(subscriptionId: String, options: HeaderOptions): js.Promise[ISubscription] = js.native
  def del(subscriptionId: String, options: HeaderOptions, response: IResponseFn[ISubscription]): js.Promise[ISubscription] = js.native
  def del(subscriptionId: String, response: IResponseFn[ISubscription]): js.Promise[ISubscription] = js.native
  
  def deleteDiscount(subscriptionId: String): js.Promise[IDeleteConfirmation] = js.native
  /**
    * Removes the currently applied discount on a subscription.
    *
    * @returns An object with a deleted flag set to true upon success. This call throws an error otherwise, such as if no
    * discount exists on this subscription.
    *
    * @param subscriptionId The ID of the subscription.
    */
  def deleteDiscount(subscriptionId: String, options: HeaderOptions): js.Promise[IDeleteConfirmation] = js.native
  def deleteDiscount(subscriptionId: String, options: HeaderOptions, response: IResponseFn[IDeleteConfirmation]): js.Promise[IDeleteConfirmation] = js.native
  def deleteDiscount(subscriptionId: String, response: IResponseFn[IDeleteConfirmation]): js.Promise[IDeleteConfirmation] = js.native
  
  def list(): IListPromise[ISubscription] = js.native
  def list(data: ISubscriptionListOptions): IListPromise[ISubscription] = js.native
  /**
    * You can see a list of the customer's active subscriptions. Note that the 10 most recent active subscriptions are always available
    * by default on the customer object. If you need more than those 10, you can use the limit and starting_after parameters to page
    * through additional subscriptions.
    *
    * @returns Returns a list of the customer's active subscriptions. You can optionally request that the response include the total
    * count of all subscriptions for the customer. To do so, specify include[]=total_count in your request.
    *
    * @param data Filtering options
    */
  def list(data: ISubscriptionListOptions, options: HeaderOptions): IListPromise[ISubscription] = js.native
  def list(
    data: ISubscriptionListOptions,
    options: HeaderOptions,
    response: IResponseFn[IList[ISubscription]]
  ): IListPromise[ISubscription] = js.native
  def list(data: ISubscriptionListOptions, response: IResponseFn[IList[ISubscription]]): IListPromise[ISubscription] = js.native
  def list(options: HeaderOptions): IListPromise[ISubscription] = js.native
  def list(options: HeaderOptions, response: IResponseFn[IList[ISubscription]]): IListPromise[ISubscription] = js.native
  def list(response: IResponseFn[IList[ISubscription]]): IListPromise[ISubscription] = js.native
  
  def retrieve(subscriptionId: String): js.Promise[ISubscription] = js.native
  /**
    * By default, you can see the 10 most recent active subscriptions stored on a customer directly on the customer
    * object, but you can also retrieve details about a specific active subscription for a customer.
    *
    * @returns Returns the subscription object.
    *
    * @param subscriptionId The ID of the subscription to retrieve
    */
  def retrieve(subscriptionId: String, options: HeaderOptions): js.Promise[ISubscription] = js.native
  def retrieve(subscriptionId: String, options: HeaderOptions, response: IResponseFn[ISubscription]): js.Promise[ISubscription] = js.native
  def retrieve(subscriptionId: String, response: IResponseFn[ISubscription]): js.Promise[ISubscription] = js.native
  
  def update(subscriptionId: String, data: ISubscriptionUpdateOptions): js.Promise[ISubscription] = js.native
  /**
    * Updates an existing subscription on a customer to match the specified parameters. When changing plans or quantities,
    * we will optionally prorate the price we charge next month to make up for any price changes.
    *
    * By default, we prorate subscription changes. For example, if a customer signs up on May 1 for a $10 plan, she'll be billed
    * $10 immediately. If she then switches to a $20 plan on May 15, on June 1 she'll be billed $25 ($20 for a renewal of her
    * subscription and a $5 prorating adjustment for the previous month). Similarly, a downgrade will generate a credit to be
    * applied to the next invoice. We also prorate when you make quantity changes. Switching plans does not change the billing
    * date or generate an immediate charge unless you're switching between different intervals (e.g. monthly to yearly), in which
    * case we apply a credit for the time unused on the old plan and charge for the new plan starting right away, resetting the
    * billing date. (Note that if we charge for the new plan, and that payment fails, the plan change will not go into effect). If
    * you'd like to charge for an upgrade immediately, just pass prorate as true as usual, and then invoice the customer as soon
    * as you make the subscription change. That'll collect the proration adjustments into a new invoice, and Stripe will automatically
    * attempt to pay the invoice. If you don't want to prorate at all, set the prorate option to false and the customer would be billed
    * $10 on May 1 and $20 on June 1. Similarly, if you set prorate to false when switching between different billing intervals
    * (monthly to yearly, for example), we won't generate any credits for the old subscription's unused time, although we will still
    * reset the billing date and bill immediately for the new subscription.
    *
    * @returns The newly updated subscription object if the call succeeded. If a charge is required for the update, and
    * the charge fails, this call raises throws an error, and the subscription update does not go into effect.
    *
    * @param subscriptionId The ID of the subscription to update.
    * @param data The fields to update
    */
  def update(subscriptionId: String, data: ISubscriptionUpdateOptions, options: HeaderOptions): js.Promise[ISubscription] = js.native
  def update(
    subscriptionId: String,
    data: ISubscriptionUpdateOptions,
    options: HeaderOptions,
    response: IResponseFn[ISubscription]
  ): js.Promise[ISubscription] = js.native
  def update(subscriptionId: String, data: ISubscriptionUpdateOptions, response: IResponseFn[ISubscription]): js.Promise[ISubscription] = js.native
}

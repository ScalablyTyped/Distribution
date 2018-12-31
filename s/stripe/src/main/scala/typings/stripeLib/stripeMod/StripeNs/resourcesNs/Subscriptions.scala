package typings
package stripeLib.stripeMod.StripeNs.resourcesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Subscriptions extends SubscriptionsBase {
  def create(data: stripeLib.stripeMod.StripeNs.subscriptionsNs.ISubscriptionCreationOptions): js.Promise[stripeLib.stripeMod.StripeNs.subscriptionsNs.ISubscription] = js.native
  /**
    * Creates a new subscription on an existing customer.
    *
    * @returns The newly created subscription object if the call succeeded. If the customer has no card or the
    * attempted charge fails, this call throws an error (unless the specified plan is free or has a trial
    * period).
    *
    * @param options The options for the new subscription
    */
  def create(
    data: stripeLib.stripeMod.StripeNs.subscriptionsNs.ISubscriptionCreationOptions,
    options: stripeLib.stripeMod.StripeNs.HeaderOptions
  ): js.Promise[stripeLib.stripeMod.StripeNs.subscriptionsNs.ISubscription] = js.native
  def create(
    data: stripeLib.stripeMod.StripeNs.subscriptionsNs.ISubscriptionCreationOptions,
    options: stripeLib.stripeMod.StripeNs.HeaderOptions,
    response: stripeLib.stripeMod.StripeNs.IResponseFn[stripeLib.stripeMod.StripeNs.subscriptionsNs.ISubscription]
  ): js.Promise[stripeLib.stripeMod.StripeNs.subscriptionsNs.ISubscription] = js.native
  def create(
    data: stripeLib.stripeMod.StripeNs.subscriptionsNs.ISubscriptionCreationOptions,
    response: stripeLib.stripeMod.StripeNs.IResponseFn[stripeLib.stripeMod.StripeNs.subscriptionsNs.ISubscription]
  ): js.Promise[stripeLib.stripeMod.StripeNs.subscriptionsNs.ISubscription] = js.native
}


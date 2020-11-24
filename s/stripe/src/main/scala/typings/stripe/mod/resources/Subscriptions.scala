package typings.stripe.mod.resources

import typings.stripe.mod.HeaderOptions
import typings.stripe.mod.IResponseFn
import typings.stripe.mod.subscriptions.ISubscription
import typings.stripe.mod.subscriptions.ISubscriptionCreationOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("stripe", "resources.Subscriptions")
@js.native
class Subscriptions () extends SubscriptionsBase {
  
  def create(data: ISubscriptionCreationOptions): js.Promise[ISubscription] = js.native
  /**
    * Creates a new subscription on an existing customer.
    *
    * @returns The newly created subscription object if the call succeeded. If the customer has no card or the
    * attempted charge fails, this call throws an error (unless the specified plan is free or has a trial
    * period).
    *
    * @param options The options for the new subscription
    */
  def create(data: ISubscriptionCreationOptions, options: HeaderOptions): js.Promise[ISubscription] = js.native
  def create(data: ISubscriptionCreationOptions, options: HeaderOptions, response: IResponseFn[ISubscription]): js.Promise[ISubscription] = js.native
  def create(data: ISubscriptionCreationOptions, response: IResponseFn[ISubscription]): js.Promise[ISubscription] = js.native
}

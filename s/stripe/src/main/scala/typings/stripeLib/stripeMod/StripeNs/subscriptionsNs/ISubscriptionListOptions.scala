package typings
package stripeLib.stripeMod.StripeNs.subscriptionsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ISubscriptionListOptions
  extends stripeLib.stripeMod.StripeNs.IListOptionsCreated {
  /**
    * The billing mode of the subscriptions to retrieve. Either "charge_automatically" or "send_invoice".
    */
  var billing: js.UndefOr[SubscriptionBilling] = js.undefined
  /**
    * The ID of the customer whose subscriptions will be retrieved
    */
  var customer: js.UndefOr[java.lang.String] = js.undefined
  /**
    * The ID of the plan whose subscriptions will be retrieved
    */
  var plan: js.UndefOr[java.lang.String] = js.undefined
  /**
    * The status of the subscriptions to retrieve.
    */
  var status: js.UndefOr[SubscriptionStatus | stripeLib.stripeLibStrings.all] = js.undefined
}


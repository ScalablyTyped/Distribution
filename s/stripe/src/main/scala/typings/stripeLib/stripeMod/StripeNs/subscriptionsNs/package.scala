package typings
package stripeLib.stripeMod.StripeNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object subscriptionsNs {
  type SubscriptionBilling = stripeLib.stripeLibStrings.charge_automatically | stripeLib.stripeLibStrings.send_invoice
  type SubscriptionStatus = stripeLib.stripeLibStrings.trialing | stripeLib.stripeLibStrings.active | stripeLib.stripeLibStrings.past_due | stripeLib.stripeLibStrings.canceled | stripeLib.stripeLibStrings.unpaid
}

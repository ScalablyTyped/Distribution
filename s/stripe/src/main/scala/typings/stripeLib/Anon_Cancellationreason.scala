package typings
package stripeLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Cancellationreason extends js.Object {
  var cancellation_reason: js.UndefOr[stripeLib.stripeMod.StripeNs.paymentIntentsNs.PaymentIntentCancelationReason] = js.undefined
}

object Anon_Cancellationreason {
  @scala.inline
  def apply(
    cancellation_reason: stripeLib.stripeMod.StripeNs.paymentIntentsNs.PaymentIntentCancelationReason = null
  ): Anon_Cancellationreason = {
    val __obj = js.Dynamic.literal()
    if (cancellation_reason != null) __obj.updateDynamic("cancellation_reason")(cancellation_reason)
    __obj.asInstanceOf[Anon_Cancellationreason]
  }
}


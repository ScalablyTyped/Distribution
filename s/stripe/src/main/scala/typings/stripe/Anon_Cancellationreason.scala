package typings.stripe

import typings.stripe.stripeMod.paymentIntents.PaymentIntentUserProvidedCancellationReason
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Cancellationreason extends js.Object {
  var cancellation_reason: js.UndefOr[PaymentIntentUserProvidedCancellationReason] = js.undefined
}

object Anon_Cancellationreason {
  @scala.inline
  def apply(cancellation_reason: PaymentIntentUserProvidedCancellationReason = null): Anon_Cancellationreason = {
    val __obj = js.Dynamic.literal()
    if (cancellation_reason != null) __obj.updateDynamic("cancellation_reason")(cancellation_reason)
    __obj.asInstanceOf[Anon_Cancellationreason]
  }
}


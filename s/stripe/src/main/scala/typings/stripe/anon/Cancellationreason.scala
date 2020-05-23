package typings.stripe.anon

import typings.stripe.mod.paymentIntents.PaymentIntentUserProvidedCancellationReason
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Cancellationreason extends js.Object {
  var cancellation_reason: js.UndefOr[PaymentIntentUserProvidedCancellationReason] = js.undefined
}

object Cancellationreason {
  @scala.inline
  def apply(cancellation_reason: PaymentIntentUserProvidedCancellationReason = null): Cancellationreason = {
    val __obj = js.Dynamic.literal()
    if (cancellation_reason != null) __obj.updateDynamic("cancellation_reason")(cancellation_reason.asInstanceOf[js.Any])
    __obj.asInstanceOf[Cancellationreason]
  }
}


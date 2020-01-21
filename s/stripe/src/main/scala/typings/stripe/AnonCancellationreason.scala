package typings.stripe

import typings.stripe.mod.paymentIntents.PaymentIntentUserProvidedCancellationReason
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonCancellationreason extends js.Object {
  var cancellation_reason: js.UndefOr[PaymentIntentUserProvidedCancellationReason] = js.undefined
}

object AnonCancellationreason {
  @scala.inline
  def apply(cancellation_reason: PaymentIntentUserProvidedCancellationReason = null): AnonCancellationreason = {
    val __obj = js.Dynamic.literal()
    if (cancellation_reason != null) __obj.updateDynamic("cancellation_reason")(cancellation_reason.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonCancellationreason]
  }
}


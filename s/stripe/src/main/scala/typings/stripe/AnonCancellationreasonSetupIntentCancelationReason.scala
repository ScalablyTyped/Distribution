package typings.stripe

import typings.stripe.mod.setupIntents.SetupIntentCancelationReason
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonCancellationreasonSetupIntentCancelationReason extends js.Object {
  var cancellation_reason: js.UndefOr[SetupIntentCancelationReason] = js.undefined
}

object AnonCancellationreasonSetupIntentCancelationReason {
  @scala.inline
  def apply(cancellation_reason: SetupIntentCancelationReason = null): AnonCancellationreasonSetupIntentCancelationReason = {
    val __obj = js.Dynamic.literal()
    if (cancellation_reason != null) __obj.updateDynamic("cancellation_reason")(cancellation_reason.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonCancellationreasonSetupIntentCancelationReason]
  }
}


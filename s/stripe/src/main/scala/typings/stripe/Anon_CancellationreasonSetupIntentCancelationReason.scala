package typings.stripe

import typings.stripe.stripeMod.setupIntentsNs.SetupIntentCancelationReason
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_CancellationreasonSetupIntentCancelationReason extends js.Object {
  var cancellation_reason: js.UndefOr[SetupIntentCancelationReason] = js.undefined
}

object Anon_CancellationreasonSetupIntentCancelationReason {
  @scala.inline
  def apply(cancellation_reason: SetupIntentCancelationReason = null): Anon_CancellationreasonSetupIntentCancelationReason = {
    val __obj = js.Dynamic.literal()
    if (cancellation_reason != null) __obj.updateDynamic("cancellation_reason")(cancellation_reason)
    __obj.asInstanceOf[Anon_CancellationreasonSetupIntentCancelationReason]
  }
}


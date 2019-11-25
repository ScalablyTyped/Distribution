package typings.stripe.stripeMod.paymentIntents

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IPaymentIntentDataTransferDataOptions extends js.Object {
  /**
    * A positive integer representing how much to charge in the smallest currency unit.
    */
  var amount: js.UndefOr[Double] = js.undefined
  /**
    * The account (if any) the payment will be attributed to for tax reporting, and where funds from the payment will be transferred to upon payment success.
    */
  var destination: js.UndefOr[String] = js.undefined
}

object IPaymentIntentDataTransferDataOptions {
  @scala.inline
  def apply(amount: Int | Double = null, destination: String = null): IPaymentIntentDataTransferDataOptions = {
    val __obj = js.Dynamic.literal()
    if (amount != null) __obj.updateDynamic("amount")(amount.asInstanceOf[js.Any])
    if (destination != null) __obj.updateDynamic("destination")(destination.asInstanceOf[js.Any])
    __obj.asInstanceOf[IPaymentIntentDataTransferDataOptions]
  }
}


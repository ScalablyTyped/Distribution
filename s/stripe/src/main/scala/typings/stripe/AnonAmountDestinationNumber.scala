package typings.stripe

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonAmountDestinationNumber extends js.Object {
  /**
    * The amount transferred to the destination account, if specified.
    * By default, the entire charge amount is transferred to the destination account.
    */
  var amount: js.UndefOr[Double] = js.undefined
  /**
    * ID of an existing, connected Stripe account.
    */
  var destination: String
}

object AnonAmountDestinationNumber {
  @scala.inline
  def apply(destination: String, amount: Int | Double = null): AnonAmountDestinationNumber = {
    val __obj = js.Dynamic.literal(destination = destination.asInstanceOf[js.Any])
    if (amount != null) __obj.updateDynamic("amount")(amount.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonAmountDestinationNumber]
  }
}


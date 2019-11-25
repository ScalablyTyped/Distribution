package typings.stripe.stripeMod.paymentMethods

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TokenizedWallet extends js.Object {
  /** (For tokenized numbers only.) The last four digits of the device account number. */
  var dynamic_last4: js.UndefOr[String] = js.undefined
}

object TokenizedWallet {
  @scala.inline
  def apply(dynamic_last4: String = null): TokenizedWallet = {
    val __obj = js.Dynamic.literal()
    if (dynamic_last4 != null) __obj.updateDynamic("dynamic_last4")(dynamic_last4.asInstanceOf[js.Any])
    __obj.asInstanceOf[TokenizedWallet]
  }
}


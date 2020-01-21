package typings.stripe.mod.paymentMethods

import typings.stripe.stripeStrings.samsung_pay
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SamsungPayWallet
  extends TokenizedWallet
     with CardWallet {
  var `type`: samsung_pay
}

object SamsungPayWallet {
  @scala.inline
  def apply(`type`: samsung_pay, dynamic_last4: String = null): SamsungPayWallet = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (dynamic_last4 != null) __obj.updateDynamic("dynamic_last4")(dynamic_last4.asInstanceOf[js.Any])
    __obj.asInstanceOf[SamsungPayWallet]
  }
}


package typings.stripe.stripeMod.paymentMethodsNs

import typings.stripe.stripeStrings.apple_pay
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ApplePayWallet
  extends TokenizedWallet
     with CardWallet {
  var `type`: apple_pay
}

object ApplePayWallet {
  @scala.inline
  def apply(`type`: apple_pay, dynamic_last4: String = null): ApplePayWallet = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`)
    if (dynamic_last4 != null) __obj.updateDynamic("dynamic_last4")(dynamic_last4)
    __obj.asInstanceOf[ApplePayWallet]
  }
}


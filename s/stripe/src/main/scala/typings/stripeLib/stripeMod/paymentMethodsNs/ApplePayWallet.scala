package typings
package stripeLib.stripeMod.paymentMethodsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ApplePayWallet
  extends TokenizedWallet
     with CardWallet {
  var `type`: stripeLib.stripeLibStrings.apple_pay
}

object ApplePayWallet {
  @scala.inline
  def apply(`type`: stripeLib.stripeLibStrings.apple_pay, dynamic_last4: java.lang.String = null): ApplePayWallet = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`)
    if (dynamic_last4 != null) __obj.updateDynamic("dynamic_last4")(dynamic_last4)
    __obj.asInstanceOf[ApplePayWallet]
  }
}


package typings
package stripeLib.stripeMod.paymentMethodsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SamsungPayWallet
  extends TokenizedWallet
     with CardWallet {
  var `type`: stripeLib.stripeLibStrings.samsung_pay
}

object SamsungPayWallet {
  @scala.inline
  def apply(`type`: stripeLib.stripeLibStrings.samsung_pay, dynamic_last4: java.lang.String = null): SamsungPayWallet = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`)
    if (dynamic_last4 != null) __obj.updateDynamic("dynamic_last4")(dynamic_last4)
    __obj.asInstanceOf[SamsungPayWallet]
  }
}


package typings
package stripeLib.stripeMod.paymentMethodsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// There are currently no child attributes for these wallet types in the documentation. See https://stripe.com/docs/api/payment_methods/object#payment_method_object-card-wallet.
trait AmericanExpressWallet extends CardWallet {
  var `type`: stripeLib.stripeLibStrings.amex_express_checkout
}

object AmericanExpressWallet {
  @scala.inline
  def apply(`type`: stripeLib.stripeLibStrings.amex_express_checkout): AmericanExpressWallet = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[AmericanExpressWallet]
  }
}


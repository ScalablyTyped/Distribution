package typings.stripe.stripeMod.charges

import typings.stripe.stripeStrings.sofort
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ISofortPaymentMethodDetails extends IPaymentMethodDetails {
  var `type`: sofort
}

object ISofortPaymentMethodDetails {
  @scala.inline
  def apply(`type`: sofort): ISofortPaymentMethodDetails = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[ISofortPaymentMethodDetails]
  }
}


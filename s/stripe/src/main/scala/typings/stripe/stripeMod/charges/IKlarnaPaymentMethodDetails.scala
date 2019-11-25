package typings.stripe.stripeMod.charges

import typings.stripe.stripeStrings.klarna
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IKlarnaPaymentMethodDetails extends IPaymentMethodDetails {
  var `type`: klarna
}

object IKlarnaPaymentMethodDetails {
  @scala.inline
  def apply(`type`: klarna): IKlarnaPaymentMethodDetails = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[IKlarnaPaymentMethodDetails]
  }
}


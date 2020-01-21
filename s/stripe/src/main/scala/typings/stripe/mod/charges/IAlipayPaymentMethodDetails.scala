package typings.stripe.mod.charges

import typings.stripe.stripeStrings.alipay
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IAlipayPaymentMethodDetails extends IPaymentMethodDetails {
  var `type`: alipay
}

object IAlipayPaymentMethodDetails {
  @scala.inline
  def apply(`type`: alipay): IAlipayPaymentMethodDetails = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[IAlipayPaymentMethodDetails]
  }
}


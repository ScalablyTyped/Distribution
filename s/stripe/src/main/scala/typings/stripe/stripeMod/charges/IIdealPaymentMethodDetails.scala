package typings.stripe.stripeMod.charges

import typings.stripe.stripeStrings.ideal
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IIdealPaymentMethodDetails extends IPaymentMethodDetails {
  var `type`: ideal
}

object IIdealPaymentMethodDetails {
  @scala.inline
  def apply(`type`: ideal): IIdealPaymentMethodDetails = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[IIdealPaymentMethodDetails]
  }
}


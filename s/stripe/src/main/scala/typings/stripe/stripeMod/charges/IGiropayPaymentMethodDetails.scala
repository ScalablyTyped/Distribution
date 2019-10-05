package typings.stripe.stripeMod.charges

import typings.stripe.stripeStrings.giropay
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IGiropayPaymentMethodDetails extends IPaymentMethodDetails {
  var `type`: giropay
}

object IGiropayPaymentMethodDetails {
  @scala.inline
  def apply(`type`: giropay): IGiropayPaymentMethodDetails = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[IGiropayPaymentMethodDetails]
  }
}


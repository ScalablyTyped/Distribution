package typings.stripe.mod.charges

import typings.stripe.stripeStrings.bancontact
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IBancontactPaymentMethodDetails extends IPaymentMethodDetails {
  var `type`: bancontact
}

object IBancontactPaymentMethodDetails {
  @scala.inline
  def apply(`type`: bancontact): IBancontactPaymentMethodDetails = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[IBancontactPaymentMethodDetails]
  }
}


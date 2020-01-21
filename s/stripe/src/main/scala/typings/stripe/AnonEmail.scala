package typings.stripe

import typings.stripe.stripeStrings.email
import typings.stripe.stripeStrings.manual
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonEmail extends js.Object {
  var refund_attributes_method: js.UndefOr[email | manual] = js.undefined
}

object AnonEmail {
  @scala.inline
  def apply(refund_attributes_method: email | manual = null): AnonEmail = {
    val __obj = js.Dynamic.literal()
    if (refund_attributes_method != null) __obj.updateDynamic("refund_attributes_method")(refund_attributes_method.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonEmail]
  }
}


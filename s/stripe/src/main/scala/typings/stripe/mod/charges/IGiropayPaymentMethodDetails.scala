package typings.stripe.mod.charges

import typings.stripe.stripeStrings.giropay
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IGiropayPaymentMethodDetails extends IPaymentMethodDetails {
  var `type`: giropay = js.native
}

object IGiropayPaymentMethodDetails {
  @scala.inline
  def apply(`type`: giropay): IGiropayPaymentMethodDetails = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[IGiropayPaymentMethodDetails]
  }
  @scala.inline
  implicit class IGiropayPaymentMethodDetailsOps[Self <: IGiropayPaymentMethodDetails] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setType(value: giropay): Self = this.set("type", value.asInstanceOf[js.Any])
  }
  
}


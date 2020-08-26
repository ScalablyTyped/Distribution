package typings.stripeV3.stripe.paymentMethod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait EpsDetails extends js.Object {
  var verified_name: String = js.native
}

object EpsDetails {
  @scala.inline
  def apply(verified_name: String): EpsDetails = {
    val __obj = js.Dynamic.literal(verified_name = verified_name.asInstanceOf[js.Any])
    __obj.asInstanceOf[EpsDetails]
  }
  @scala.inline
  implicit class EpsDetailsOps[Self <: EpsDetails] (val x: Self) extends AnyVal {
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
    def setVerified_name(value: String): Self = this.set("verified_name", value.asInstanceOf[js.Any])
  }
  
}


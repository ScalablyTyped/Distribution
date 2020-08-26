package typings.stripeV3.stripe.paymentMethod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait P24Details extends js.Object {
  var reference: String = js.native
  var verified_name: String = js.native
}

object P24Details {
  @scala.inline
  def apply(reference: String, verified_name: String): P24Details = {
    val __obj = js.Dynamic.literal(reference = reference.asInstanceOf[js.Any], verified_name = verified_name.asInstanceOf[js.Any])
    __obj.asInstanceOf[P24Details]
  }
  @scala.inline
  implicit class P24DetailsOps[Self <: P24Details] (val x: Self) extends AnyVal {
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
    def setReference(value: String): Self = this.set("reference", value.asInstanceOf[js.Any])
    @scala.inline
    def setVerified_name(value: String): Self = this.set("verified_name", value.asInstanceOf[js.Any])
  }
  
}


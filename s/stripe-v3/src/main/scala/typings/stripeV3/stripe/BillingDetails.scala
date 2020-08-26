package typings.stripeV3.stripe

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BillingDetails extends js.Object {
  var address: js.UndefOr[BillingDetailsAddress | Null] = js.native
  var email: js.UndefOr[String | Null] = js.native
  var name: js.UndefOr[String | Null] = js.native
  var phone: js.UndefOr[String | Null] = js.native
}

object BillingDetails {
  @scala.inline
  def apply(): BillingDetails = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BillingDetails]
  }
  @scala.inline
  implicit class BillingDetailsOps[Self <: BillingDetails] (val x: Self) extends AnyVal {
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
    def setAddress(value: BillingDetailsAddress): Self = this.set("address", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAddress: Self = this.set("address", js.undefined)
    @scala.inline
    def setAddressNull: Self = this.set("address", null)
    @scala.inline
    def setEmail(value: String): Self = this.set("email", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEmail: Self = this.set("email", js.undefined)
    @scala.inline
    def setEmailNull: Self = this.set("email", null)
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    @scala.inline
    def setNameNull: Self = this.set("name", null)
    @scala.inline
    def setPhone(value: String): Self = this.set("phone", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePhone: Self = this.set("phone", js.undefined)
    @scala.inline
    def setPhoneNull: Self = this.set("phone", null)
  }
  
}


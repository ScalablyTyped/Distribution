package typings.stripeV3.anon

import typings.stripeV3.stripe.OwnerAddress
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Address extends js.Object {
  var address: OwnerAddress | Null = js.native
  var email: String | Null = js.native
  var name: String | Null = js.native
  var phone: String | Null = js.native
  var verified_address: String | Null = js.native
  var verified_email: String | Null = js.native
  var verified_name: String | Null = js.native
  var verified_phone: String | Null = js.native
}

object Address {
  @scala.inline
  def apply(): Address = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Address]
  }
  @scala.inline
  implicit class AddressOps[Self <: Address] (val x: Self) extends AnyVal {
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
    def setAddress(value: OwnerAddress): Self = this.set("address", value.asInstanceOf[js.Any])
    @scala.inline
    def setAddressNull: Self = this.set("address", null)
    @scala.inline
    def setEmail(value: String): Self = this.set("email", value.asInstanceOf[js.Any])
    @scala.inline
    def setEmailNull: Self = this.set("email", null)
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def setNameNull: Self = this.set("name", null)
    @scala.inline
    def setPhone(value: String): Self = this.set("phone", value.asInstanceOf[js.Any])
    @scala.inline
    def setPhoneNull: Self = this.set("phone", null)
    @scala.inline
    def setVerified_address(value: String): Self = this.set("verified_address", value.asInstanceOf[js.Any])
    @scala.inline
    def setVerified_addressNull: Self = this.set("verified_address", null)
    @scala.inline
    def setVerified_email(value: String): Self = this.set("verified_email", value.asInstanceOf[js.Any])
    @scala.inline
    def setVerified_emailNull: Self = this.set("verified_email", null)
    @scala.inline
    def setVerified_name(value: String): Self = this.set("verified_name", value.asInstanceOf[js.Any])
    @scala.inline
    def setVerified_nameNull: Self = this.set("verified_name", null)
    @scala.inline
    def setVerified_phone(value: String): Self = this.set("verified_phone", value.asInstanceOf[js.Any])
    @scala.inline
    def setVerified_phoneNull: Self = this.set("verified_phone", null)
  }
  
}


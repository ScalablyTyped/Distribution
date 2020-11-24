package typings.stripe.anon

import typings.stripe.mod.IAddress
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Phone extends js.Object {
  
  var address: js.UndefOr[IAddress | Null] = js.native
  
  var email: js.UndefOr[String | Null] = js.native
  
  var name: js.UndefOr[String | Null] = js.native
  
  var phone: js.UndefOr[String | Null] = js.native
  
  var verified_address: js.UndefOr[IAddress | Null] = js.native
  
  var verified_email: js.UndefOr[String | Null] = js.native
  
  var verified_name: js.UndefOr[String | Null] = js.native
  
  var verified_phone: js.UndefOr[String | Null] = js.native
}
object Phone {
  
  @scala.inline
  def apply(): Phone = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Phone]
  }
  
  @scala.inline
  implicit class PhoneOps[Self <: Phone] (val x: Self) extends AnyVal {
    
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
    def setAddress(value: IAddress): Self = this.set("address", value.asInstanceOf[js.Any])
    
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
    
    @scala.inline
    def setVerified_address(value: IAddress): Self = this.set("verified_address", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteVerified_address: Self = this.set("verified_address", js.undefined)
    
    @scala.inline
    def setVerified_addressNull: Self = this.set("verified_address", null)
    
    @scala.inline
    def setVerified_email(value: String): Self = this.set("verified_email", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteVerified_email: Self = this.set("verified_email", js.undefined)
    
    @scala.inline
    def setVerified_emailNull: Self = this.set("verified_email", null)
    
    @scala.inline
    def setVerified_name(value: String): Self = this.set("verified_name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteVerified_name: Self = this.set("verified_name", js.undefined)
    
    @scala.inline
    def setVerified_nameNull: Self = this.set("verified_name", null)
    
    @scala.inline
    def setVerified_phone(value: String): Self = this.set("verified_phone", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteVerified_phone: Self = this.set("verified_phone", js.undefined)
    
    @scala.inline
    def setVerified_phoneNull: Self = this.set("verified_phone", null)
  }
}

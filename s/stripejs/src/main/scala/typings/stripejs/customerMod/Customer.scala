package typings.stripejs.customerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Customer extends js.Object {
  
  /**
    * The Address of the customer
    */
  var address: Address = js.native
  
  /**
    * The email address of the customer
    */
  var email: String = js.native
  
  /**
    * The full name of the owner
    */
  var name: String = js.native
  
  /**
    * The phone number of the customer
    * NOTE: This includes the extension
    */
  var phone: String = js.native
  
  /**
    * Verified customer’s address
    */
  val verified_address: Address = js.native
  
  /**
    * Verified customer’s email address
    */
  val verified_email: String = js.native
  
  /**
    * Verified customer’s full name
    */
  val verified_name: String = js.native
  
  /**
    * Verified customer’s phone number
    */
  val verified_phone: String = js.native
}
object Customer {
  
  @scala.inline
  def apply(
    address: Address,
    email: String,
    name: String,
    phone: String,
    verified_address: Address,
    verified_email: String,
    verified_name: String,
    verified_phone: String
  ): Customer = {
    val __obj = js.Dynamic.literal(address = address.asInstanceOf[js.Any], email = email.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], phone = phone.asInstanceOf[js.Any], verified_address = verified_address.asInstanceOf[js.Any], verified_email = verified_email.asInstanceOf[js.Any], verified_name = verified_name.asInstanceOf[js.Any], verified_phone = verified_phone.asInstanceOf[js.Any])
    __obj.asInstanceOf[Customer]
  }
  
  @scala.inline
  implicit class CustomerOps[Self <: Customer] (val x: Self) extends AnyVal {
    
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
    def setAddress(value: Address): Self = this.set("address", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEmail(value: String): Self = this.set("email", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPhone(value: String): Self = this.set("phone", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVerified_address(value: Address): Self = this.set("verified_address", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVerified_email(value: String): Self = this.set("verified_email", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVerified_name(value: String): Self = this.set("verified_name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVerified_phone(value: String): Self = this.set("verified_phone", value.asInstanceOf[js.Any])
  }
}

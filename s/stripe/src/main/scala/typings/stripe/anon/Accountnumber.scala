package typings.stripe.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Accountnumber extends js.Object {
  
  /**
    * Account number to transfer funds to.
    */
  var account_number: String = js.native
  
  /**
    * Name of the bank associated with the routing number.
    */
  var bank_name: String = js.native
  
  /**
    * Routing transit number for the bank account to transfer funds to.
    */
  var routing_number: String = js.native
  
  /**
    * SWIFT code of the bank associated with the routing number.
    */
  var swift_code: String = js.native
}
object Accountnumber {
  
  @scala.inline
  def apply(account_number: String, bank_name: String, routing_number: String, swift_code: String): Accountnumber = {
    val __obj = js.Dynamic.literal(account_number = account_number.asInstanceOf[js.Any], bank_name = bank_name.asInstanceOf[js.Any], routing_number = routing_number.asInstanceOf[js.Any], swift_code = swift_code.asInstanceOf[js.Any])
    __obj.asInstanceOf[Accountnumber]
  }
  
  @scala.inline
  implicit class AccountnumberOps[Self <: Accountnumber] (val x: Self) extends AnyVal {
    
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
    def setAccount_number(value: String): Self = this.set("account_number", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBank_name(value: String): Self = this.set("bank_name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRouting_number(value: String): Self = this.set("routing_number", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSwift_code(value: String): Self = this.set("swift_code", value.asInstanceOf[js.Any])
  }
}

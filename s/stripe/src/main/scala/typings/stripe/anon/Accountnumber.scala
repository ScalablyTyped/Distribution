package typings.stripe.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Accountnumber extends StObject {
  
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
  implicit class AccountnumberMutableBuilder[Self <: Accountnumber] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAccount_number(value: String): Self = StObject.set(x, "account_number", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBank_name(value: String): Self = StObject.set(x, "bank_name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRouting_number(value: String): Self = StObject.set(x, "routing_number", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSwift_code(value: String): Self = StObject.set(x, "swift_code", value.asInstanceOf[js.Any])
  }
}

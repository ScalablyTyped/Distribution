package typings.stripe.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Bankname extends StObject {
  
  var account_number: String
  
  var bank_name: String
  
  var fingerprint: String
  
  var refund_account_holder_name: js.UndefOr[String | Null] = js.undefined
  
  var refund_account_holder_type: js.UndefOr[String | Null] = js.undefined
  
  var refund_routing_number: js.UndefOr[String | Null] = js.undefined
  
  var routing_number: String
  
  var swift_code: String
}
object Bankname {
  
  @scala.inline
  def apply(
    account_number: String,
    bank_name: String,
    fingerprint: String,
    routing_number: String,
    swift_code: String
  ): Bankname = {
    val __obj = js.Dynamic.literal(account_number = account_number.asInstanceOf[js.Any], bank_name = bank_name.asInstanceOf[js.Any], fingerprint = fingerprint.asInstanceOf[js.Any], routing_number = routing_number.asInstanceOf[js.Any], swift_code = swift_code.asInstanceOf[js.Any])
    __obj.asInstanceOf[Bankname]
  }
  
  @scala.inline
  implicit class BanknameMutableBuilder[Self <: Bankname] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAccount_number(value: String): Self = StObject.set(x, "account_number", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBank_name(value: String): Self = StObject.set(x, "bank_name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFingerprint(value: String): Self = StObject.set(x, "fingerprint", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRefund_account_holder_name(value: String): Self = StObject.set(x, "refund_account_holder_name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRefund_account_holder_nameNull: Self = StObject.set(x, "refund_account_holder_name", null)
    
    @scala.inline
    def setRefund_account_holder_nameUndefined: Self = StObject.set(x, "refund_account_holder_name", js.undefined)
    
    @scala.inline
    def setRefund_account_holder_type(value: String): Self = StObject.set(x, "refund_account_holder_type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRefund_account_holder_typeNull: Self = StObject.set(x, "refund_account_holder_type", null)
    
    @scala.inline
    def setRefund_account_holder_typeUndefined: Self = StObject.set(x, "refund_account_holder_type", js.undefined)
    
    @scala.inline
    def setRefund_routing_number(value: String): Self = StObject.set(x, "refund_routing_number", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRefund_routing_numberNull: Self = StObject.set(x, "refund_routing_number", null)
    
    @scala.inline
    def setRefund_routing_numberUndefined: Self = StObject.set(x, "refund_routing_number", js.undefined)
    
    @scala.inline
    def setRouting_number(value: String): Self = StObject.set(x, "routing_number", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSwift_code(value: String): Self = StObject.set(x, "swift_code", value.asInstanceOf[js.Any])
  }
}

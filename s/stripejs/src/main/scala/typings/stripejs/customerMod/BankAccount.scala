package typings.stripejs.customerMod

import org.scalablytyped.runtime.StringDictionary
import typings.stripejs.stripejsStrings.`new`
import typings.stripejs.stripejsStrings.bank_account
import typings.stripejs.stripejsStrings.company
import typings.stripejs.stripejsStrings.errored
import typings.stripejs.stripejsStrings.individual
import typings.stripejs.stripejsStrings.validated
import typings.stripejs.stripejsStrings.verification_failed
import typings.stripejs.stripejsStrings.verified
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BankAccount extends js.Object {
  
  /**
    * The name of the person or business that owns the bank account.
    */
  var account_holder_name: String = js.native
  
  /**
    * The type of entity that holds the account.
    */
  var account_holder_type: individual | company = js.native
  
  /**
    * Name of the bank associated with the routing number
    * @example 'STRIPE TEST BANK'
    */
  var bank_name: String = js.native
  
  /**
    * Two-letter ISO code representing the country the bank account is located in
    * @example 'US'
    */
  var country: String = js.native
  
  /**
    * Three-letter ISO code for the currency paid out to the bank account
    * @example 'usd'
    */
  var currency: String = js.native
  
  var customer: String = js.native
  
  /**
    * Uniquely identifies this particular bank account.
    * NOTE: You can use this attribute to check whether two bank accounts are the same
    */
  var fingerprint: String = js.native
  
  /**
    * The unique identifier of the bank account
    */
  var id: String = js.native
  
  /**
    * The last 4 digits of the bank number
    */
  var last4: String = js.native
  
  /**
    * Your own saved information with this bank account
    */
  var metadata: StringDictionary[String] = js.native
  
  var `object`: bank_account = js.native
  
  /**
    * The routing transit number for the bank account
    */
  var routing_number: String = js.native
  
  /**
    * The status of the bank account
    * @see https://stripe.com/docs/api#customer_bank_account_object-status
    */
  var status: `new` | validated | verified | verification_failed | errored = js.native
}
object BankAccount {
  
  @scala.inline
  def apply(
    account_holder_name: String,
    account_holder_type: individual | company,
    bank_name: String,
    country: String,
    currency: String,
    customer: String,
    fingerprint: String,
    id: String,
    last4: String,
    metadata: StringDictionary[String],
    `object`: bank_account,
    routing_number: String,
    status: `new` | validated | verified | verification_failed | errored
  ): BankAccount = {
    val __obj = js.Dynamic.literal(account_holder_name = account_holder_name.asInstanceOf[js.Any], account_holder_type = account_holder_type.asInstanceOf[js.Any], bank_name = bank_name.asInstanceOf[js.Any], country = country.asInstanceOf[js.Any], currency = currency.asInstanceOf[js.Any], customer = customer.asInstanceOf[js.Any], fingerprint = fingerprint.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], last4 = last4.asInstanceOf[js.Any], metadata = metadata.asInstanceOf[js.Any], routing_number = routing_number.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any])
    __obj.updateDynamic("object")(`object`.asInstanceOf[js.Any])
    __obj.asInstanceOf[BankAccount]
  }
  
  @scala.inline
  implicit class BankAccountOps[Self <: BankAccount] (val x: Self) extends AnyVal {
    
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
    def setAccount_holder_name(value: String): Self = this.set("account_holder_name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAccount_holder_type(value: individual | company): Self = this.set("account_holder_type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBank_name(value: String): Self = this.set("bank_name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCountry(value: String): Self = this.set("country", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCurrency(value: String): Self = this.set("currency", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCustomer(value: String): Self = this.set("customer", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFingerprint(value: String): Self = this.set("fingerprint", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setId(value: String): Self = this.set("id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLast4(value: String): Self = this.set("last4", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMetadata(value: StringDictionary[String]): Self = this.set("metadata", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setObject(value: bank_account): Self = this.set("object", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRouting_number(value: String): Self = this.set("routing_number", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStatus(value: `new` | validated | verified | verification_failed | errored): Self = this.set("status", value.asInstanceOf[js.Any])
  }
}

package typings.stripe.mod.bankAccounts

import typings.stripe.mod.IResourceObject
import typings.stripe.stripeStrings.`new`
import typings.stripe.stripeStrings.bank_account
import typings.stripe.stripeStrings.company
import typings.stripe.stripeStrings.errored
import typings.stripe.stripeStrings.individual
import typings.stripe.stripeStrings.validated
import typings.stripe.stripeStrings.verification_failed
import typings.stripe.stripeStrings.verified
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IBankAccountHash extends IResourceObject {
  /**
    * The name of the person or business that owns the bank account.
    */
  var account_holder_name: String | Null = js.native
  /**
    * The type of entity that holds the account. This can be either
    * "individual"" or "company".
    */
  var account_holder_type: individual | company | Null = js.native
  /**
    * Name of the bank associated with the routing number, e.g. WELLS FARGO.
    */
  var bank_name: String = js.native
  /**
    * Two-letter ISO code representing the country the bank account is located in.
    */
  var country: String = js.native
  /**
    * Three-letter ISO currency code representing the currency paid out to the bank account.
    */
  var currency: String = js.native
  var customer: js.UndefOr[String] = js.native
  /**
    * Uniquely identifies this particular bank account. You can use this attribute
    * to check whether two bank accounts are the same.
    */
  var fingerprint: String = js.native
  var last4: String = js.native
  /**
    * value is "bank_account"
    */
  @JSName("object")
  var object_IBankAccountHash: bank_account = js.native
  /**
    * The routing transit number for the bank account.
    */
  var routing_number: String = js.native
  /**
    * Possible values are "new", "validated", "verified", "verification_failed",
    * or "errored". A bank account that hasn’t had any activity or validation
    * performed is "new". If Stripe can determine that the bank account exists, its
    * status will be "validated". Note that there often isn’t enough information
    * to know (e.g. for smaller credit unions), and the validation is not always
    * run. If customer bank account verification has succeeded, the bank
    * account status will be "verified". If the verification failed for any reason,
    * such as microdeposit failure, the status will be "verification_failed". If a
    * transfer sent to this bank account fails, we’ll set the status to "errored""
    * and will not continue to send transfers until the bank details are updated.
    */
  var status: `new` | validated | verified | verification_failed | errored = js.native
}

object IBankAccountHash {
  @scala.inline
  def apply(
    bank_name: String,
    country: String,
    currency: String,
    fingerprint: String,
    id: String,
    last4: String,
    `object`: bank_account,
    routing_number: String,
    status: `new` | validated | verified | verification_failed | errored
  ): IBankAccountHash = {
    val __obj = js.Dynamic.literal(bank_name = bank_name.asInstanceOf[js.Any], country = country.asInstanceOf[js.Any], currency = currency.asInstanceOf[js.Any], fingerprint = fingerprint.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], last4 = last4.asInstanceOf[js.Any], routing_number = routing_number.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any])
    __obj.updateDynamic("object")(`object`.asInstanceOf[js.Any])
    __obj.asInstanceOf[IBankAccountHash]
  }
  @scala.inline
  implicit class IBankAccountHashOps[Self <: IBankAccountHash] (val x: Self) extends AnyVal {
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
    def setBank_name(value: String): Self = this.set("bank_name", value.asInstanceOf[js.Any])
    @scala.inline
    def setCountry(value: String): Self = this.set("country", value.asInstanceOf[js.Any])
    @scala.inline
    def setCurrency(value: String): Self = this.set("currency", value.asInstanceOf[js.Any])
    @scala.inline
    def setFingerprint(value: String): Self = this.set("fingerprint", value.asInstanceOf[js.Any])
    @scala.inline
    def setLast4(value: String): Self = this.set("last4", value.asInstanceOf[js.Any])
    @scala.inline
    def setObject(value: bank_account): Self = this.set("object", value.asInstanceOf[js.Any])
    @scala.inline
    def setRouting_number(value: String): Self = this.set("routing_number", value.asInstanceOf[js.Any])
    @scala.inline
    def setStatus(value: `new` | validated | verified | verification_failed | errored): Self = this.set("status", value.asInstanceOf[js.Any])
    @scala.inline
    def setAccount_holder_name(value: String): Self = this.set("account_holder_name", value.asInstanceOf[js.Any])
    @scala.inline
    def setAccount_holder_nameNull: Self = this.set("account_holder_name", null)
    @scala.inline
    def setAccount_holder_type(value: individual | company): Self = this.set("account_holder_type", value.asInstanceOf[js.Any])
    @scala.inline
    def setAccount_holder_typeNull: Self = this.set("account_holder_type", null)
    @scala.inline
    def setCustomer(value: String): Self = this.set("customer", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCustomer: Self = this.set("customer", js.undefined)
  }
  
}


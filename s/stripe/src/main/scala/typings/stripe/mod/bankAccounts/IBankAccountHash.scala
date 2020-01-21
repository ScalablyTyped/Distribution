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

trait IBankAccountHash extends IResourceObject {
  /**
    * The name of the person or business that owns the bank account.
    */
  var account_holder_name: String | Null
  /**
    * The type of entity that holds the account. This can be either
    * "individual"" or "company".
    */
  var account_holder_type: individual | company | Null
  /**
    * Name of the bank associated with the routing number, e.g. WELLS FARGO.
    */
  var bank_name: String
  /**
    * Two-letter ISO code representing the country the bank account is located in.
    */
  var country: String
  /**
    * Three-letter ISO currency code representing the currency paid out to the bank account.
    */
  var currency: String
  var customer: js.UndefOr[String] = js.undefined
  /**
    * Uniquely identifies this particular bank account. You can use this attribute
    * to check whether two bank accounts are the same.
    */
  var fingerprint: String
  var last4: String
  /**
    * value is "bank_account"
    */
  @JSName("object")
  var object_IBankAccountHash: bank_account
  /**
    * The routing transit number for the bank account.
    */
  var routing_number: String
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
  var status: `new` | validated | verified | verification_failed | errored
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
    status: `new` | validated | verified | verification_failed | errored,
    account_holder_name: String = null,
    account_holder_type: individual | company = null,
    customer: String = null
  ): IBankAccountHash = {
    val __obj = js.Dynamic.literal(bank_name = bank_name.asInstanceOf[js.Any], country = country.asInstanceOf[js.Any], currency = currency.asInstanceOf[js.Any], fingerprint = fingerprint.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], last4 = last4.asInstanceOf[js.Any], routing_number = routing_number.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any])
    __obj.updateDynamic("object")(`object`.asInstanceOf[js.Any])
    if (account_holder_name != null) __obj.updateDynamic("account_holder_name")(account_holder_name.asInstanceOf[js.Any])
    if (account_holder_type != null) __obj.updateDynamic("account_holder_type")(account_holder_type.asInstanceOf[js.Any])
    if (customer != null) __obj.updateDynamic("customer")(customer.asInstanceOf[js.Any])
    __obj.asInstanceOf[IBankAccountHash]
  }
}


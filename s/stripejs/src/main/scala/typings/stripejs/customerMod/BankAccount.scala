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
import scala.scalajs.js.annotation._

trait BankAccount extends js.Object {
  /**
    * The name of the person or business that owns the bank account.
    */
  var account_holder_name: String
  /**
    * The type of entity that holds the account.
    */
  var account_holder_type: individual | company
  /**
    * Name of the bank associated with the routing number
    * @example 'STRIPE TEST BANK'
    */
  var bank_name: String
  /**
    * Two-letter ISO code representing the country the bank account is located in
    * @example 'US'
    */
  var country: String
  /**
    * Three-letter ISO code for the currency paid out to the bank account
    * @example 'usd'
    */
  var currency: String
  var customer: String
  /**
    * Uniquely identifies this particular bank account.
    * NOTE: You can use this attribute to check whether two bank accounts are the same
    */
  var fingerprint: String
  /**
    * The unique identifier of the bank account
    */
  var id: String
  /**
    * The last 4 digits of the bank number
    */
  var last4: String
  /**
    * Your own saved information with this bank account
    */
  var metadata: StringDictionary[String]
  var `object`: bank_account
  /**
    * The routing transit number for the bank account
    */
  var routing_number: String
  /**
    * The status of the bank account
    * @see https://stripe.com/docs/api#customer_bank_account_object-status
    */
  var status: `new` | validated | verified | verification_failed | errored
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
    val __obj = js.Dynamic.literal(account_holder_name = account_holder_name, account_holder_type = account_holder_type.asInstanceOf[js.Any], bank_name = bank_name, country = country, currency = currency, customer = customer, fingerprint = fingerprint, id = id, last4 = last4, metadata = metadata, routing_number = routing_number, status = status.asInstanceOf[js.Any])
    __obj.updateDynamic("object")(`object`)
    __obj.asInstanceOf[BankAccount]
  }
}


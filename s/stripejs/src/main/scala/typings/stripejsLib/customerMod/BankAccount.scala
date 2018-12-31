package typings
package stripejsLib.customerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BankAccount extends js.Object {
  /**
    * The name of the person or business that owns the bank account.
    */
  var account_holder_name: java.lang.String
  /**
    * The type of entity that holds the account.
    */
  var account_holder_type: stripejsLib.stripejsLibStrings.individual | stripejsLib.stripejsLibStrings.company
  /**
    * Name of the bank associated with the routing number
    * @example 'STRIPE TEST BANK'
    */
  var bank_name: java.lang.String
  /**
    * Two-letter ISO code representing the country the bank account is located in
    * @example 'US'
    */
  var country: java.lang.String
  /**
    * Three-letter ISO code for the currency paid out to the bank account
    * @example 'usd'
    */
  var currency: java.lang.String
  var customer: java.lang.String
  /**
    * Uniquely identifies this particular bank account.
    * NOTE: You can use this attribute to check whether two bank accounts are the same
    */
  var fingerprint: java.lang.String
  /**
    * The unique identifier of the bank account
    */
  var id: java.lang.String
  /**
    * The last 4 digits of the bank number
    */
  var last4: java.lang.String
  /**
    * Your own saved information with this bank account
    */
  var metadata: org.scalablytyped.runtime.StringDictionary[java.lang.String]
  var `object`: stripejsLib.stripejsLibStrings.bank_account
  /**
    * The routing transit number for the bank account
    */
  var routing_number: java.lang.String
  /**
    * The status of the bank account
    * @see https://stripe.com/docs/api#customer_bank_account_object-status
    */
  var status: stripejsLib.stripejsLibStrings.`new` | stripejsLib.stripejsLibStrings.validated | stripejsLib.stripejsLibStrings.verified | stripejsLib.stripejsLibStrings.verification_failed | stripejsLib.stripejsLibStrings.errored
}


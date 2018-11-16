package typings
package stripeLib.stripeMod.StripeNs.bankAccountsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait IBankAccountHash
  extends stripeLib.stripeMod.StripeNs.IResourceObject {
  /**
               * The name of the person or business that owns the bank account.
               */
  var account_holder_name: java.lang.String | scala.Null
  /**
               * The type of entity that holds the account. This can be either
               * "individual"" or "company".
               */
  var account_holder_type: stripeLib.stripeLibStrings.individual | stripeLib.stripeLibStrings.company | scala.Null
  /**
               * Name of the bank associated with the routing number, e.g. WELLS FARGO.
               */
  var bank_name: java.lang.String
  /**
               * Two-letter ISO code representing the country the bank account is located in.
               */
  var country: java.lang.String
  /**
               * Three-letter ISO currency code representing the currency paid out to the bank account.
               */
  var currency: java.lang.String
  var customer: js.UndefOr[java.lang.String] = js.undefined
  /**
               * Uniquely identifies this particular bank account. You can use this attribute
               * to check whether two bank accounts are the same.
               */
  var fingerprint: java.lang.String
  var last4: java.lang.String
  /**
               * value is "bank_account"
               */
  @JSName("object")
  var object_IBankAccountHash: stripeLib.stripeLibStrings.bank_account
  /**
               * The routing transit number for the bank account.
               */
  var routing_number: java.lang.String
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
  var status: stripeLib.stripeLibStrings.`new` | stripeLib.stripeLibStrings.validated | stripeLib.stripeLibStrings.verified | stripeLib.stripeLibStrings.verification_failed | stripeLib.stripeLibStrings.errored
}


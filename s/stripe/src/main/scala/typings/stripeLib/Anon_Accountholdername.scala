package typings
package stripeLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Accountholdername extends js.Object {
  /**
    * The name of the person or business that owns the bank account. This
    * field is required when attaching the bank account to a customer object.
    */
  var account_holder_name: js.UndefOr[java.lang.String] = js.undefined
  /**
    * The type of entity that holds the account. This can be either
    * "individual" or "company". This field is required when attaching the
    * bank account to a customer object.
    */
  var account_holder_type: js.UndefOr[
    stripeLib.stripeLibStrings.individual | stripeLib.stripeLibStrings.company | scala.Null
  ] = js.undefined
  /**
    * The account number for the bank account in string form. Must be a
    * checking account.
    */
  var account_number: java.lang.String
  /**
    * The country the bank account is in.
    */
  var country: java.lang.String
  /**
    * The currency the bank account is in. This must be a country/currency
    * pairing that Stripe supports.
    */
  var currency: java.lang.String
  /**
    * The type of external account. Should be "bank_account".
    */
  var `object`: java.lang.String
  /**
    * The routing number, sort code, or other country-appropriate institution
    * number for the bank account. For US bank accounts, this is required
    * and should be the ACH routing number, not the wire routing number. If
    * you are providing an IBAN for account_number, this field is not
    * required.
    */
  var routing_number: js.UndefOr[java.lang.String] = js.undefined
}


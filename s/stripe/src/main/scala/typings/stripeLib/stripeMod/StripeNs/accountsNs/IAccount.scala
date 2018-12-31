package typings
package stripeLib.stripeMod.StripeNs.accountsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IAccount
  extends stripeLib.stripeMod.StripeNs.IResourceObject
     with IAccountShared {
  /**
    * Whether or not the account can create live charges
    */
  var charges_enabled: scala.Boolean
  /**
    * The country of the account
    */
  var country: java.lang.String
  /**
    * Whether or not account details have been submitted yet. Standalone
    * accounts cannot receive transfers before this is true.
    */
  var details_submitted: scala.Boolean
  /**
    * The display name for this account. This is used on the Stripe dashboard to
    * help you differentiate between accounts.
    */
  var display_name: java.lang.String
  /**
    * Whether or not Stripe will send automatic transfers for this account. This
    * is only false when Stripe is waiting for additional information from the
    * account holder.
    */
  var payouts_enabled: scala.Boolean
  /**
    * The state of the account’s information requests, including what
    * information is needed and by when it must be provided.
    */
  var verification: stripeLib.Anon_Fieldsneeded
}


package typings
package stripeLib.stripeMod.StripeNs.accountsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IAccountShared extends js.Object {
  var business_logo: js.UndefOr[java.lang.String] = js.undefined
  /**
    * The publicly sharable name for this account
    */
  var business_name: js.UndefOr[java.lang.String] = js.undefined
  /**
    * A CSS hex color value representing the primary branding color for this
    * account
    */
  var business_primary_color: js.UndefOr[java.lang.String] = js.undefined
  /**
    * The URL that best shows the service or product provided for this account
    */
  var business_url: js.UndefOr[java.lang.String] = js.undefined
  /**
    * A boolean for whether or not Stripe should try to reclaim negative
    * balances from the account holder’s bank account. See our managed
    * account bank transfer guide for more information
    */
  var debit_negative_balances: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Account-level settings to automatically decline certain types of charges
    * regardless of the bank’s decision.
    */
  var decline_charge_on: js.UndefOr[stripeLib.Anon_Avsfailure] = js.undefined
  /**
    * Three-letter ISO currency code representing the default currency for the
    * account. This must be a currency that Stripe supports in the account’s
    * country.
    */
  var default_currency: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Email address of the account holder. For standalone accounts, this is used
    * to email them asking them to claim their Stripe account. For managed
    * accounts, this is only to make the account easier to identify to you: Stripe
    * will not email the account holder.
    */
  var email: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Information about the holder of this account, i.e. the user receiving funds
    * from this account
    */
  var legal_entity: js.UndefOr[js.Object] = js.undefined
   // TODO: Implement this type definition.
  /**
    * A set of key/value pairs that you can attach to an account object. It can be
    * useful for storing additional information about the account in a structured
    * format. This can be unset by updating the value to null and then saving.
    */
  var metadata: js.UndefOr[stripeLib.stripeMod.StripeNs.IMetadata] = js.undefined
  /**
    * Details on when funds from charges are available,
    * and when they are paid out to an external account.
    * See our Setting Bank and Debit Card Payouts documentation for details.
    */
  var payout_schedule: js.UndefOr[stripeLib.Anon_Monthlyanchor] = js.undefined
  /**
    * The text that appears on the bank account statement for payouts.
    * If not set, this defaults to the platform’s bank descriptor as set in the Dashboard.
    */
  var payout_statement_descriptor: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Internal-only description of the product being sold or service being
    * provided by this account. It’s used by Stripe for risk and underwriting
    * purposes.
    */
  var product_description: js.UndefOr[java.lang.String] = js.undefined
  /**
    * The text that will appear on credit card statements by default if a charge is
    * being made directly on the account.
    */
  var statement_descriptor: js.UndefOr[java.lang.String] = js.undefined
  /**
    * A publicly shareable email address that can be reached for support for this
    * account
    */
  var support_email: js.UndefOr[java.lang.String] = js.undefined
  /**
    * A publicly shareable phone number that can be reached for support for
    * this account
    */
  var support_phone: js.UndefOr[java.lang.String] = js.undefined
  /**
    * A publicly shareable URL that can be reached for support for this account
    */
  var support_url: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Details on who accepted the Stripe terms of service, and when they
    * accepted it. See our updating managed accounts guide for more
    * information
    */
  var tos_acceptance: js.UndefOr[stripeLib.Anon_DateIp] = js.undefined
}


package typings
package stripeLib.stripeMod.accountsNs

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
    * Optional information related to the business.
    */
  var business_profile: js.UndefOr[stripeLib.Anon_Mcc] = js.undefined
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
  var metadata: js.UndefOr[stripeLib.stripeMod.IMetadata] = js.undefined
  /**
    * Details on when funds from charges are available,
    * and when they are paid out to an external account.
    * See our Setting Bank and Debit Card Payouts documentation for details.
    */
  var payout_schedule: js.UndefOr[stripeLib.Anon_Daily] = js.undefined
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
    * Account options for customizing how the account functions within Stripe.
    */
  var settings: js.UndefOr[stripeLib.Anon_Branding] = js.undefined
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
  var tos_acceptance: js.UndefOr[stripeLib.Anon_Date] = js.undefined
}

object IAccountShared {
  @scala.inline
  def apply(
    business_logo: java.lang.String = null,
    business_name: java.lang.String = null,
    business_primary_color: java.lang.String = null,
    business_profile: stripeLib.Anon_Mcc = null,
    business_url: java.lang.String = null,
    debit_negative_balances: js.UndefOr[scala.Boolean] = js.undefined,
    decline_charge_on: stripeLib.Anon_Avsfailure = null,
    default_currency: java.lang.String = null,
    email: java.lang.String = null,
    legal_entity: js.Object = null,
    metadata: stripeLib.stripeMod.IMetadata = null,
    payout_schedule: stripeLib.Anon_Daily = null,
    payout_statement_descriptor: java.lang.String = null,
    product_description: java.lang.String = null,
    settings: stripeLib.Anon_Branding = null,
    statement_descriptor: java.lang.String = null,
    support_email: java.lang.String = null,
    support_phone: java.lang.String = null,
    support_url: java.lang.String = null,
    tos_acceptance: stripeLib.Anon_Date = null
  ): IAccountShared = {
    val __obj = js.Dynamic.literal()
    if (business_logo != null) __obj.updateDynamic("business_logo")(business_logo)
    if (business_name != null) __obj.updateDynamic("business_name")(business_name)
    if (business_primary_color != null) __obj.updateDynamic("business_primary_color")(business_primary_color)
    if (business_profile != null) __obj.updateDynamic("business_profile")(business_profile)
    if (business_url != null) __obj.updateDynamic("business_url")(business_url)
    if (!js.isUndefined(debit_negative_balances)) __obj.updateDynamic("debit_negative_balances")(debit_negative_balances)
    if (decline_charge_on != null) __obj.updateDynamic("decline_charge_on")(decline_charge_on)
    if (default_currency != null) __obj.updateDynamic("default_currency")(default_currency)
    if (email != null) __obj.updateDynamic("email")(email)
    if (legal_entity != null) __obj.updateDynamic("legal_entity")(legal_entity)
    if (metadata != null) __obj.updateDynamic("metadata")(metadata)
    if (payout_schedule != null) __obj.updateDynamic("payout_schedule")(payout_schedule)
    if (payout_statement_descriptor != null) __obj.updateDynamic("payout_statement_descriptor")(payout_statement_descriptor)
    if (product_description != null) __obj.updateDynamic("product_description")(product_description)
    if (settings != null) __obj.updateDynamic("settings")(settings)
    if (statement_descriptor != null) __obj.updateDynamic("statement_descriptor")(statement_descriptor)
    if (support_email != null) __obj.updateDynamic("support_email")(support_email)
    if (support_phone != null) __obj.updateDynamic("support_phone")(support_phone)
    if (support_url != null) __obj.updateDynamic("support_url")(support_url)
    if (tos_acceptance != null) __obj.updateDynamic("tos_acceptance")(tos_acceptance)
    __obj.asInstanceOf[IAccountShared]
  }
}


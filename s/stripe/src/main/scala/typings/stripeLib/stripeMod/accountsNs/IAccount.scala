package typings
package stripeLib.stripeMod.accountsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IAccount
  extends stripeLib.stripeMod.IResourceObject
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
  var verification: stripeLib.Anon_Disabledreason
}

object IAccount {
  @scala.inline
  def apply(
    charges_enabled: scala.Boolean,
    country: java.lang.String,
    details_submitted: scala.Boolean,
    display_name: java.lang.String,
    id: java.lang.String,
    `object`: java.lang.String,
    payouts_enabled: scala.Boolean,
    verification: stripeLib.Anon_Disabledreason,
    business_logo: java.lang.String = null,
    business_name: java.lang.String = null,
    business_primary_color: java.lang.String = null,
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
    statement_descriptor: java.lang.String = null,
    support_email: java.lang.String = null,
    support_phone: java.lang.String = null,
    support_url: java.lang.String = null,
    tos_acceptance: stripeLib.Anon_Date = null
  ): IAccount = {
    val __obj = js.Dynamic.literal(charges_enabled = charges_enabled, country = country, details_submitted = details_submitted, display_name = display_name, id = id, payouts_enabled = payouts_enabled, verification = verification)
    __obj.updateDynamic("object")(`object`)
    if (business_logo != null) __obj.updateDynamic("business_logo")(business_logo)
    if (business_name != null) __obj.updateDynamic("business_name")(business_name)
    if (business_primary_color != null) __obj.updateDynamic("business_primary_color")(business_primary_color)
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
    if (statement_descriptor != null) __obj.updateDynamic("statement_descriptor")(statement_descriptor)
    if (support_email != null) __obj.updateDynamic("support_email")(support_email)
    if (support_phone != null) __obj.updateDynamic("support_phone")(support_phone)
    if (support_url != null) __obj.updateDynamic("support_url")(support_url)
    if (tos_acceptance != null) __obj.updateDynamic("tos_acceptance")(tos_acceptance)
    __obj.asInstanceOf[IAccount]
  }
}


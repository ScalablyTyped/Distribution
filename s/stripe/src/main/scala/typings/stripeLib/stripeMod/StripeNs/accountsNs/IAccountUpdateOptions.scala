package typings
package stripeLib.stripeMod.StripeNs.accountsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IAccountUpdateOptions
  extends stripeLib.stripeMod.StripeNs.IDataOptions
     with IAccountShared {
  /**
    * A card or bank account to attach to the account. You can provide either a
    * token, like the ones returned by Stripe.js, or a dictionary as documented in
    * the external_account parameter for either card or bank account creation.
    *
    * This will create a new external account object, make it the new default
    * external account for its currency, and delete the old default if one exists. If
    * you want to add additional external accounts instead of replacing the
    * existing default for this currency, use the bank account or card creation
    * API.
    */
  var external_account: js.UndefOr[stripeLib.Anon_Accountholdername] = js.undefined
}

object IAccountUpdateOptions {
  @scala.inline
  def apply(
    business_logo: java.lang.String = null,
    business_name: java.lang.String = null,
    business_primary_color: java.lang.String = null,
    business_url: java.lang.String = null,
    debit_negative_balances: js.UndefOr[scala.Boolean] = js.undefined,
    decline_charge_on: stripeLib.Anon_Avsfailure = null,
    default_currency: java.lang.String = null,
    email: java.lang.String = null,
    expand: js.Array[java.lang.String] = null,
    external_account: stripeLib.Anon_Accountholdername = null,
    include: js.Array[java.lang.String] = null,
    legal_entity: js.Object = null,
    metadata: stripeLib.stripeMod.StripeNs.IMetadata = null,
    payout_schedule: stripeLib.Anon_Daily = null,
    payout_statement_descriptor: java.lang.String = null,
    product_description: java.lang.String = null,
    statement_descriptor: java.lang.String = null,
    support_email: java.lang.String = null,
    support_phone: java.lang.String = null,
    support_url: java.lang.String = null,
    tos_acceptance: stripeLib.Anon_Date = null
  ): IAccountUpdateOptions = {
    val __obj = js.Dynamic.literal()
    if (business_logo != null) __obj.updateDynamic("business_logo")(business_logo)
    if (business_name != null) __obj.updateDynamic("business_name")(business_name)
    if (business_primary_color != null) __obj.updateDynamic("business_primary_color")(business_primary_color)
    if (business_url != null) __obj.updateDynamic("business_url")(business_url)
    if (!js.isUndefined(debit_negative_balances)) __obj.updateDynamic("debit_negative_balances")(debit_negative_balances)
    if (decline_charge_on != null) __obj.updateDynamic("decline_charge_on")(decline_charge_on)
    if (default_currency != null) __obj.updateDynamic("default_currency")(default_currency)
    if (email != null) __obj.updateDynamic("email")(email)
    if (expand != null) __obj.updateDynamic("expand")(expand)
    if (external_account != null) __obj.updateDynamic("external_account")(external_account)
    if (include != null) __obj.updateDynamic("include")(include)
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
    __obj.asInstanceOf[IAccountUpdateOptions]
  }
}


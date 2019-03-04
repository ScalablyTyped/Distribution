package typings
package stripeLib.stripeMod.StripeNs.accountsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IAccountCreationOptions extends IAccountUpdateOptions {
  /**
    * The country the account holder resides in or that the business is legally
    * established in. For example, if you are in the United States and the
    * business you’re creating an account for is legally represented in Canada,
    * you would use “CA” as the country for the account being created.
    *
    * optional, default is your own country
    */
  var country: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Whether you'd like to create a Custom or Standard account. Custom
    * accounts have extra parameters available to them, and require that you,
    * the platform, handle all communication with the account holder.
    * Standard accounts are normal Stripe accounts: Stripe will email the
    * account holder to setup a username and password, and handle all account
    * management directly with them. Possible values are custom and standard.
    */
  var `type`: stripeLib.stripeLibStrings.custom | stripeLib.stripeLibStrings.standard
}

object IAccountCreationOptions {
  @scala.inline
  def apply(
    `type`: stripeLib.stripeLibStrings.custom | stripeLib.stripeLibStrings.standard,
    business_logo: java.lang.String = null,
    business_name: java.lang.String = null,
    business_primary_color: java.lang.String = null,
    business_url: java.lang.String = null,
    country: java.lang.String = null,
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
  ): IAccountCreationOptions = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (business_logo != null) __obj.updateDynamic("business_logo")(business_logo)
    if (business_name != null) __obj.updateDynamic("business_name")(business_name)
    if (business_primary_color != null) __obj.updateDynamic("business_primary_color")(business_primary_color)
    if (business_url != null) __obj.updateDynamic("business_url")(business_url)
    if (country != null) __obj.updateDynamic("country")(country)
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
    __obj.asInstanceOf[IAccountCreationOptions]
  }
}


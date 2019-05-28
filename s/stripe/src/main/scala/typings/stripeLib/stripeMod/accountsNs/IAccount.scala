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
    * Information about the company or business.
    * This field is null unless business_type is set to company.
    */
  var company: js.UndefOr[ICompany] = js.undefined
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
    * Information about the person represented by the account.
    * This field is null unless business_type is set to individual.
    */
  var individual: js.UndefOr[IIndividual] = js.undefined
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
    business_profile: stripeLib.Anon_Mcc = null,
    business_type: stripeLib.stripeLibStrings.individual | stripeLib.stripeLibStrings.company = null,
    company: ICompany = null,
    default_currency: java.lang.String = null,
    email: java.lang.String = null,
    individual: IIndividual = null,
    metadata: stripeLib.stripeMod.IMetadata = null,
    product_description: java.lang.String = null,
    settings: stripeLib.Anon_Branding = null,
    tos_acceptance: stripeLib.Anon_Date = null
  ): IAccount = {
    val __obj = js.Dynamic.literal(charges_enabled = charges_enabled, country = country, details_submitted = details_submitted, display_name = display_name, id = id, payouts_enabled = payouts_enabled, verification = verification)
    __obj.updateDynamic("object")(`object`)
    if (business_profile != null) __obj.updateDynamic("business_profile")(business_profile)
    if (business_type != null) __obj.updateDynamic("business_type")(business_type.asInstanceOf[js.Any])
    if (company != null) __obj.updateDynamic("company")(company)
    if (default_currency != null) __obj.updateDynamic("default_currency")(default_currency)
    if (email != null) __obj.updateDynamic("email")(email)
    if (individual != null) __obj.updateDynamic("individual")(individual)
    if (metadata != null) __obj.updateDynamic("metadata")(metadata)
    if (product_description != null) __obj.updateDynamic("product_description")(product_description)
    if (settings != null) __obj.updateDynamic("settings")(settings)
    if (tos_acceptance != null) __obj.updateDynamic("tos_acceptance")(tos_acceptance)
    __obj.asInstanceOf[IAccount]
  }
}


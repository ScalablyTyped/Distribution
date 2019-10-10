package typings.stripe.stripeMod.accounts

import typings.stripe.Anon_Accountholdername
import typings.stripe.Anon_Branding
import typings.stripe.Anon_Date
import typings.stripe.Anon_Mcc
import typings.stripe.stripeMod.IDataOptionsWithMetadata
import typings.stripe.stripeMod.IOptionsMetadata
import typings.stripe.stripeStrings.company
import typings.stripe.stripeStrings.individual
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IAccountUpdateOptions
  extends IDataOptionsWithMetadata
     with IAccountShared {
  /**
    * An account token, used to securely provide details to the account.
    */
  var account_token: js.UndefOr[String] = js.undefined
  /**
    * Information about the company or business.
    * This field is null unless business_type is set to company.
    */
  var company: js.UndefOr[ICompanyCreateUpdateOptions] = js.undefined
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
  var external_account: js.UndefOr[Anon_Accountholdername] = js.undefined
  /**
    * Information about the person represented by the account.
    * This field is null unless business_type is set to individual.
    */
  var individual: js.UndefOr[IIndividualCreateUpdateOptions] = js.undefined
}

object IAccountUpdateOptions {
  @scala.inline
  def apply(
    account_token: String = null,
    business_profile: Anon_Mcc = null,
    business_type: individual | company = null,
    company: ICompanyCreateUpdateOptions = null,
    default_currency: String = null,
    email: String = null,
    expand: js.Array[String] = null,
    external_account: Anon_Accountholdername = null,
    include: js.Array[String] = null,
    individual: IIndividualCreateUpdateOptions = null,
    metadata: IOptionsMetadata = null,
    product_description: String = null,
    requested_capabilities: js.Array[String] = null,
    settings: Anon_Branding = null,
    tos_acceptance: Anon_Date = null
  ): IAccountUpdateOptions = {
    val __obj = js.Dynamic.literal()
    if (account_token != null) __obj.updateDynamic("account_token")(account_token)
    if (business_profile != null) __obj.updateDynamic("business_profile")(business_profile)
    if (business_type != null) __obj.updateDynamic("business_type")(business_type.asInstanceOf[js.Any])
    if (company != null) __obj.updateDynamic("company")(company)
    if (default_currency != null) __obj.updateDynamic("default_currency")(default_currency)
    if (email != null) __obj.updateDynamic("email")(email)
    if (expand != null) __obj.updateDynamic("expand")(expand)
    if (external_account != null) __obj.updateDynamic("external_account")(external_account)
    if (include != null) __obj.updateDynamic("include")(include)
    if (individual != null) __obj.updateDynamic("individual")(individual)
    if (metadata != null) __obj.updateDynamic("metadata")(metadata)
    if (product_description != null) __obj.updateDynamic("product_description")(product_description)
    if (requested_capabilities != null) __obj.updateDynamic("requested_capabilities")(requested_capabilities)
    if (settings != null) __obj.updateDynamic("settings")(settings)
    if (tos_acceptance != null) __obj.updateDynamic("tos_acceptance")(tos_acceptance)
    __obj.asInstanceOf[IAccountUpdateOptions]
  }
}


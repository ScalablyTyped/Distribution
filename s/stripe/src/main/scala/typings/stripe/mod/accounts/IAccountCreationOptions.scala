package typings.stripe.mod.accounts

import typings.stripe.anon.Accountholdername
import typings.stripe.anon.Branding
import typings.stripe.anon.Date
import typings.stripe.anon.Mcc
import typings.stripe.mod.IOptionsMetadata
import typings.stripe.stripeStrings.company
import typings.stripe.stripeStrings.custom
import typings.stripe.stripeStrings.individual
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
  var country: js.UndefOr[String] = js.undefined
  /**
    * The type of Stripe account to create. Currently must be custom, as only Custom
    * accounts may be created via the API.
    */
  var `type`: custom
}

object IAccountCreationOptions {
  @scala.inline
  def apply(
    `type`: custom,
    account_token: String = null,
    business_profile: Mcc = null,
    business_type: individual | company = null,
    company: ICompanyCreateUpdateOptions = null,
    country: String = null,
    default_currency: String = null,
    email: String = null,
    expand: js.Array[String] = null,
    external_account: Accountholdername = null,
    include: js.Array[String] = null,
    individual: IIndividualCreateUpdateOptions = null,
    metadata: IOptionsMetadata = null,
    product_description: String = null,
    requested_capabilities: js.Array[String] = null,
    settings: Branding = null,
    tos_acceptance: Date = null
  ): IAccountCreationOptions = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (account_token != null) __obj.updateDynamic("account_token")(account_token.asInstanceOf[js.Any])
    if (business_profile != null) __obj.updateDynamic("business_profile")(business_profile.asInstanceOf[js.Any])
    if (business_type != null) __obj.updateDynamic("business_type")(business_type.asInstanceOf[js.Any])
    if (company != null) __obj.updateDynamic("company")(company.asInstanceOf[js.Any])
    if (country != null) __obj.updateDynamic("country")(country.asInstanceOf[js.Any])
    if (default_currency != null) __obj.updateDynamic("default_currency")(default_currency.asInstanceOf[js.Any])
    if (email != null) __obj.updateDynamic("email")(email.asInstanceOf[js.Any])
    if (expand != null) __obj.updateDynamic("expand")(expand.asInstanceOf[js.Any])
    if (external_account != null) __obj.updateDynamic("external_account")(external_account.asInstanceOf[js.Any])
    if (include != null) __obj.updateDynamic("include")(include.asInstanceOf[js.Any])
    if (individual != null) __obj.updateDynamic("individual")(individual.asInstanceOf[js.Any])
    if (metadata != null) __obj.updateDynamic("metadata")(metadata.asInstanceOf[js.Any])
    if (product_description != null) __obj.updateDynamic("product_description")(product_description.asInstanceOf[js.Any])
    if (requested_capabilities != null) __obj.updateDynamic("requested_capabilities")(requested_capabilities.asInstanceOf[js.Any])
    if (settings != null) __obj.updateDynamic("settings")(settings.asInstanceOf[js.Any])
    if (tos_acceptance != null) __obj.updateDynamic("tos_acceptance")(tos_acceptance.asInstanceOf[js.Any])
    __obj.asInstanceOf[IAccountCreationOptions]
  }
}


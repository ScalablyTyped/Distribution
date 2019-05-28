package typings
package stripeLib.stripeMod.accountsNs

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
    account_token: java.lang.String = null,
    business_profile: stripeLib.Anon_Mcc = null,
    business_type: stripeLib.stripeLibStrings.individual | stripeLib.stripeLibStrings.company = null,
    company: ICompanyCreateUpdateOptions = null,
    country: java.lang.String = null,
    default_currency: java.lang.String = null,
    email: java.lang.String = null,
    expand: js.Array[java.lang.String] = null,
    external_account: stripeLib.Anon_Accountholdername = null,
    include: js.Array[java.lang.String] = null,
    individual: IIndividualCreateUpdateOptions = null,
    metadata: stripeLib.stripeMod.IMetadata = null,
    product_description: java.lang.String = null,
    settings: stripeLib.Anon_Branding = null,
    tos_acceptance: stripeLib.Anon_Date = null
  ): IAccountCreationOptions = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (account_token != null) __obj.updateDynamic("account_token")(account_token)
    if (business_profile != null) __obj.updateDynamic("business_profile")(business_profile)
    if (business_type != null) __obj.updateDynamic("business_type")(business_type.asInstanceOf[js.Any])
    if (company != null) __obj.updateDynamic("company")(company)
    if (country != null) __obj.updateDynamic("country")(country)
    if (default_currency != null) __obj.updateDynamic("default_currency")(default_currency)
    if (email != null) __obj.updateDynamic("email")(email)
    if (expand != null) __obj.updateDynamic("expand")(expand)
    if (external_account != null) __obj.updateDynamic("external_account")(external_account)
    if (include != null) __obj.updateDynamic("include")(include)
    if (individual != null) __obj.updateDynamic("individual")(individual)
    if (metadata != null) __obj.updateDynamic("metadata")(metadata)
    if (product_description != null) __obj.updateDynamic("product_description")(product_description)
    if (settings != null) __obj.updateDynamic("settings")(settings)
    if (tos_acceptance != null) __obj.updateDynamic("tos_acceptance")(tos_acceptance)
    __obj.asInstanceOf[IAccountCreationOptions]
  }
}


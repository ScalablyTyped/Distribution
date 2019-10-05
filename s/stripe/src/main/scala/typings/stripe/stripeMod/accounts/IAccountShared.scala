package typings.stripe.stripeMod.accounts

import typings.stripe.Anon_Branding
import typings.stripe.Anon_Date
import typings.stripe.Anon_Mcc
import typings.stripe.stripeMod.IMetadata
import typings.stripe.stripeStrings.company
import typings.stripe.stripeStrings.individual
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IAccountShared extends js.Object {
  /**
    * Optional information related to the business.
    */
  var business_profile: js.UndefOr[Anon_Mcc] = js.undefined
  /**
    * The business type. Can be individual or company.
    */
  var business_type: js.UndefOr[individual | company] = js.undefined
  /**
    * Three-letter ISO currency code representing the default currency for the
    * account. This must be a currency that Stripe supports in the account’s
    * country.
    */
  var default_currency: js.UndefOr[String] = js.undefined
  /**
    * Email address of the account holder. For standalone accounts, this is used
    * to email them asking them to claim their Stripe account. For managed
    * accounts, this is only to make the account easier to identify to you: Stripe
    * will not email the account holder.
    */
  var email: js.UndefOr[String] = js.undefined
  /**
    * A set of key/value pairs that you can attach to an account object. It can be
    * useful for storing additional information about the account in a structured
    * format. This can be unset by updating the value to null and then saving.
    */
  var metadata: js.UndefOr[IMetadata] = js.undefined
  /**
    * Internal-only description of the product being sold or service being
    * provided by this account. It’s used by Stripe for risk and underwriting
    * purposes.
    */
  var product_description: js.UndefOr[String] = js.undefined
  /**
    * Account options for customizing how the account functions within Stripe.
    */
  var settings: js.UndefOr[Anon_Branding] = js.undefined
  /**
    * Details on who accepted the Stripe terms of service, and when they
    * accepted it. See our updating managed accounts guide for more
    * information
    */
  var tos_acceptance: js.UndefOr[Anon_Date] = js.undefined
}

object IAccountShared {
  @scala.inline
  def apply(
    business_profile: Anon_Mcc = null,
    business_type: individual | company = null,
    default_currency: String = null,
    email: String = null,
    metadata: IMetadata = null,
    product_description: String = null,
    settings: Anon_Branding = null,
    tos_acceptance: Anon_Date = null
  ): IAccountShared = {
    val __obj = js.Dynamic.literal()
    if (business_profile != null) __obj.updateDynamic("business_profile")(business_profile)
    if (business_type != null) __obj.updateDynamic("business_type")(business_type.asInstanceOf[js.Any])
    if (default_currency != null) __obj.updateDynamic("default_currency")(default_currency)
    if (email != null) __obj.updateDynamic("email")(email)
    if (metadata != null) __obj.updateDynamic("metadata")(metadata)
    if (product_description != null) __obj.updateDynamic("product_description")(product_description)
    if (settings != null) __obj.updateDynamic("settings")(settings)
    if (tos_acceptance != null) __obj.updateDynamic("tos_acceptance")(tos_acceptance)
    __obj.asInstanceOf[IAccountShared]
  }
}


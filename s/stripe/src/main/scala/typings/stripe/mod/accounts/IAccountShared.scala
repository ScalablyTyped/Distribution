package typings.stripe.mod.accounts

import typings.stripe.anon.Branding
import typings.stripe.anon.Date
import typings.stripe.anon.Mcc
import typings.stripe.stripeStrings.company
import typings.stripe.stripeStrings.individual
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IAccountShared extends js.Object {
  /**
    * Optional information related to the business.
    */
  var business_profile: js.UndefOr[Mcc] = js.undefined
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
    * Internal-only description of the product being sold or service being
    * provided by this account. It’s used by Stripe for risk and underwriting
    * purposes.
    */
  var product_description: js.UndefOr[String] = js.undefined
  /**
    * The set of capabilities you want to unlock for this account (US only).
    * Each capability will be inactive until you have provided its specific
    * requirements and Stripe has verified them. An account may have some of
    * its requested capabilities be active and some be inactive.
    */
  var requested_capabilities: js.UndefOr[js.Array[String]] = js.undefined
  /**
    * Account options for customizing how the account functions within Stripe.
    */
  var settings: js.UndefOr[Branding] = js.undefined
  /**
    * Details on who accepted the Stripe terms of service, and when they
    * accepted it. See our updating managed accounts guide for more
    * information
    */
  var tos_acceptance: js.UndefOr[Date] = js.undefined
}

object IAccountShared {
  @scala.inline
  def apply(
    business_profile: Mcc = null,
    business_type: individual | company = null,
    default_currency: String = null,
    email: String = null,
    product_description: String = null,
    requested_capabilities: js.Array[String] = null,
    settings: Branding = null,
    tos_acceptance: Date = null
  ): IAccountShared = {
    val __obj = js.Dynamic.literal()
    if (business_profile != null) __obj.updateDynamic("business_profile")(business_profile.asInstanceOf[js.Any])
    if (business_type != null) __obj.updateDynamic("business_type")(business_type.asInstanceOf[js.Any])
    if (default_currency != null) __obj.updateDynamic("default_currency")(default_currency.asInstanceOf[js.Any])
    if (email != null) __obj.updateDynamic("email")(email.asInstanceOf[js.Any])
    if (product_description != null) __obj.updateDynamic("product_description")(product_description.asInstanceOf[js.Any])
    if (requested_capabilities != null) __obj.updateDynamic("requested_capabilities")(requested_capabilities.asInstanceOf[js.Any])
    if (settings != null) __obj.updateDynamic("settings")(settings.asInstanceOf[js.Any])
    if (tos_acceptance != null) __obj.updateDynamic("tos_acceptance")(tos_acceptance.asInstanceOf[js.Any])
    __obj.asInstanceOf[IAccountShared]
  }
}


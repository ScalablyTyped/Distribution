package typings.stripe.stripeMod.accounts

import typings.stripe.Anon_Active
import typings.stripe.Anon_Branding
import typings.stripe.Anon_Date
import typings.stripe.Anon_Disabledreason
import typings.stripe.Anon_Mcc
import typings.stripe.stripeMod.IList
import typings.stripe.stripeMod.IMetadata
import typings.stripe.stripeMod.IResourceObject
import typings.stripe.stripeStrings.account
import typings.stripe.stripeStrings.company
import typings.stripe.stripeStrings.custom
import typings.stripe.stripeStrings.express
import typings.stripe.stripeStrings.individual
import typings.stripe.stripeStrings.standard
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IAccount
  extends IResourceObject
     with IAccountShared {
  /**
    * A hash containing the set of capabilities that was requested for this
    * account and their associatedstates. Keys are names of capabilities.
    * You can see the full list here. Values may be active, inactive, or pending.
    */
  var capabilities: js.UndefOr[Anon_Active] = js.undefined
  /**
    * Whether or not the account can create live charges
    */
  var charges_enabled: Boolean
  /**
    * Information about the company or business.
    * This field is null unless business_type is set to company.
    */
  var company: js.UndefOr[ICompany] = js.undefined
  /**
    * The country of the account
    */
  var country: String
  /**
    * Time at which the object was created. Measured in seconds since the Unix epoch.
    */
  var created: js.UndefOr[Double] = js.undefined
  /**
    * Whether or not account details have been submitted yet. Standalone
    * accounts cannot receive transfers before this is true.
    */
  var details_submitted: Boolean
  /**
    * The display name for this account. This is used on the Stripe dashboard to
    * help you differentiate between accounts.
    */
  var display_name: String
  /**
    * External accounts (bank accounts and debit cards) currently
    * attached to this account
    */
  var external_accounts: js.UndefOr[IList[IExternalAccount]] = js.undefined
  /**
    * Information about the person represented by the account.
    * This field is null unless business_type is set to individual.
    */
  var individual: js.UndefOr[IIndividual] = js.undefined
  /**
    * Set of key-value pairs that you can attach to an object. This can be useful
    * for storing additional information about the object in a structured format.
    */
  var metadata: js.UndefOr[IMetadata] = js.undefined
  /**
    * Value is "account"
    */
  @JSName("object")
  var object_IAccount: account
  /**
    * Whether or not Stripe will send automatic transfers for this account. This
    * is only false when Stripe is waiting for additional information from the
    * account holder.
    */
  var payouts_enabled: Boolean
  /**
    * Information about the requirements for the account, including what information
    * needs to be collected, and by when.
    */
  var requirements: js.UndefOr[IAccountRequirements] = js.undefined
  /**
    * The Stripe account type. Can be standard, express, or custom.
    */
  var `type`: standard | express | custom
  /**
    * The state of the account’s information requests, including what
    * information is needed and by when it must be provided.
    * @deprecated
    */
  var verification: js.UndefOr[Anon_Disabledreason] = js.undefined
}

object IAccount {
  @scala.inline
  def apply(
    charges_enabled: Boolean,
    country: String,
    details_submitted: Boolean,
    display_name: String,
    id: String,
    `object`: account,
    payouts_enabled: Boolean,
    `type`: standard | express | custom,
    business_profile: Anon_Mcc = null,
    business_type: individual | company = null,
    capabilities: Anon_Active = null,
    company: ICompany = null,
    created: Int | Double = null,
    default_currency: String = null,
    email: String = null,
    external_accounts: IList[IExternalAccount] = null,
    individual: IIndividual = null,
    metadata: IMetadata = null,
    product_description: String = null,
    requested_capabilities: js.Array[String] = null,
    requirements: IAccountRequirements = null,
    settings: Anon_Branding = null,
    tos_acceptance: Anon_Date = null,
    verification: Anon_Disabledreason = null
  ): IAccount = {
    val __obj = js.Dynamic.literal(charges_enabled = charges_enabled, country = country, details_submitted = details_submitted, display_name = display_name, id = id, payouts_enabled = payouts_enabled)
    __obj.updateDynamic("object")(`object`)
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (business_profile != null) __obj.updateDynamic("business_profile")(business_profile)
    if (business_type != null) __obj.updateDynamic("business_type")(business_type.asInstanceOf[js.Any])
    if (capabilities != null) __obj.updateDynamic("capabilities")(capabilities)
    if (company != null) __obj.updateDynamic("company")(company)
    if (created != null) __obj.updateDynamic("created")(created.asInstanceOf[js.Any])
    if (default_currency != null) __obj.updateDynamic("default_currency")(default_currency)
    if (email != null) __obj.updateDynamic("email")(email)
    if (external_accounts != null) __obj.updateDynamic("external_accounts")(external_accounts)
    if (individual != null) __obj.updateDynamic("individual")(individual)
    if (metadata != null) __obj.updateDynamic("metadata")(metadata)
    if (product_description != null) __obj.updateDynamic("product_description")(product_description)
    if (requested_capabilities != null) __obj.updateDynamic("requested_capabilities")(requested_capabilities)
    if (requirements != null) __obj.updateDynamic("requirements")(requirements)
    if (settings != null) __obj.updateDynamic("settings")(settings)
    if (tos_acceptance != null) __obj.updateDynamic("tos_acceptance")(tos_acceptance)
    if (verification != null) __obj.updateDynamic("verification")(verification)
    __obj.asInstanceOf[IAccount]
  }
}


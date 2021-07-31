package typings.stripe.mod.accounts

import typings.stripe.anon.Cardpayments
import typings.stripe.anon.Disabledreason
import typings.stripe.mod.IList
import typings.stripe.mod.IMetadata
import typings.stripe.mod.IResourceObject
import typings.stripe.stripeStrings.account
import typings.stripe.stripeStrings.custom
import typings.stripe.stripeStrings.express
import typings.stripe.stripeStrings.standard
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IAccount
  extends StObject
     with IResourceObject
     with IAccountShared {
  
  /**
    * A hash containing the set of capabilities that was requested for this
    * account and their associatedstates. Keys are names of capabilities.
    * You can see the full list here. Values may be active, inactive, or pending.
    */
  var capabilities: js.UndefOr[Cardpayments] = js.undefined
  
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
  var verification: js.UndefOr[Disabledreason] = js.undefined
}
object IAccount {
  
  @scala.inline
  def apply(
    charges_enabled: Boolean,
    country: String,
    details_submitted: Boolean,
    display_name: String,
    id: String,
    payouts_enabled: Boolean,
    `type`: standard | express | custom
  ): IAccount = {
    val __obj = js.Dynamic.literal(charges_enabled = charges_enabled.asInstanceOf[js.Any], country = country.asInstanceOf[js.Any], details_submitted = details_submitted.asInstanceOf[js.Any], display_name = display_name.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], payouts_enabled = payouts_enabled.asInstanceOf[js.Any])
    __obj.updateDynamic("object")("account")
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[IAccount]
  }
  
  @scala.inline
  implicit class IAccountMutableBuilder[Self <: IAccount] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCapabilities(value: Cardpayments): Self = StObject.set(x, "capabilities", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCapabilitiesUndefined: Self = StObject.set(x, "capabilities", js.undefined)
    
    @scala.inline
    def setCharges_enabled(value: Boolean): Self = StObject.set(x, "charges_enabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCompany(value: ICompany): Self = StObject.set(x, "company", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCompanyUndefined: Self = StObject.set(x, "company", js.undefined)
    
    @scala.inline
    def setCountry(value: String): Self = StObject.set(x, "country", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCreated(value: Double): Self = StObject.set(x, "created", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCreatedUndefined: Self = StObject.set(x, "created", js.undefined)
    
    @scala.inline
    def setDetails_submitted(value: Boolean): Self = StObject.set(x, "details_submitted", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDisplay_name(value: String): Self = StObject.set(x, "display_name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExternal_accounts(value: IList[IExternalAccount]): Self = StObject.set(x, "external_accounts", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExternal_accountsUndefined: Self = StObject.set(x, "external_accounts", js.undefined)
    
    @scala.inline
    def setIndividual(value: IIndividual): Self = StObject.set(x, "individual", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIndividualUndefined: Self = StObject.set(x, "individual", js.undefined)
    
    @scala.inline
    def setMetadata(value: IMetadata): Self = StObject.set(x, "metadata", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMetadataUndefined: Self = StObject.set(x, "metadata", js.undefined)
    
    @scala.inline
    def setObject(value: account): Self = StObject.set(x, "object", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPayouts_enabled(value: Boolean): Self = StObject.set(x, "payouts_enabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequirements(value: IAccountRequirements): Self = StObject.set(x, "requirements", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequirementsUndefined: Self = StObject.set(x, "requirements", js.undefined)
    
    @scala.inline
    def setType(value: standard | express | custom): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVerification(value: Disabledreason): Self = StObject.set(x, "verification", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVerificationUndefined: Self = StObject.set(x, "verification", js.undefined)
  }
}

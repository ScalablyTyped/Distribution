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
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IAccount
  extends IResourceObject
     with IAccountShared {
  
  /**
    * A hash containing the set of capabilities that was requested for this
    * account and their associatedstates. Keys are names of capabilities.
    * You can see the full list here. Values may be active, inactive, or pending.
    */
  var capabilities: js.UndefOr[Cardpayments] = js.native
  
  /**
    * Whether or not the account can create live charges
    */
  var charges_enabled: Boolean = js.native
  
  /**
    * Information about the company or business.
    * This field is null unless business_type is set to company.
    */
  var company: js.UndefOr[ICompany] = js.native
  
  /**
    * The country of the account
    */
  var country: String = js.native
  
  /**
    * Time at which the object was created. Measured in seconds since the Unix epoch.
    */
  var created: js.UndefOr[Double] = js.native
  
  /**
    * Whether or not account details have been submitted yet. Standalone
    * accounts cannot receive transfers before this is true.
    */
  var details_submitted: Boolean = js.native
  
  /**
    * The display name for this account. This is used on the Stripe dashboard to
    * help you differentiate between accounts.
    */
  var display_name: String = js.native
  
  /**
    * External accounts (bank accounts and debit cards) currently
    * attached to this account
    */
  var external_accounts: js.UndefOr[IList[IExternalAccount]] = js.native
  
  /**
    * Information about the person represented by the account.
    * This field is null unless business_type is set to individual.
    */
  var individual: js.UndefOr[IIndividual] = js.native
  
  /**
    * Set of key-value pairs that you can attach to an object. This can be useful
    * for storing additional information about the object in a structured format.
    */
  var metadata: js.UndefOr[IMetadata] = js.native
  
  /**
    * Value is "account"
    */
  @JSName("object")
  var object_IAccount: account = js.native
  
  /**
    * Whether or not Stripe will send automatic transfers for this account. This
    * is only false when Stripe is waiting for additional information from the
    * account holder.
    */
  var payouts_enabled: Boolean = js.native
  
  /**
    * Information about the requirements for the account, including what information
    * needs to be collected, and by when.
    */
  var requirements: js.UndefOr[IAccountRequirements] = js.native
  
  /**
    * The Stripe account type. Can be standard, express, or custom.
    */
  var `type`: standard | express | custom = js.native
  
  /**
    * The state of the account’s information requests, including what
    * information is needed and by when it must be provided.
    * @deprecated
    */
  var verification: js.UndefOr[Disabledreason] = js.native
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
    `type`: standard | express | custom
  ): IAccount = {
    val __obj = js.Dynamic.literal(charges_enabled = charges_enabled.asInstanceOf[js.Any], country = country.asInstanceOf[js.Any], details_submitted = details_submitted.asInstanceOf[js.Any], display_name = display_name.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], payouts_enabled = payouts_enabled.asInstanceOf[js.Any])
    __obj.updateDynamic("object")(`object`.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[IAccount]
  }
  
  @scala.inline
  implicit class IAccountOps[Self <: IAccount] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setCharges_enabled(value: Boolean): Self = this.set("charges_enabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCountry(value: String): Self = this.set("country", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDetails_submitted(value: Boolean): Self = this.set("details_submitted", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDisplay_name(value: String): Self = this.set("display_name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setObject(value: account): Self = this.set("object", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPayouts_enabled(value: Boolean): Self = this.set("payouts_enabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: standard | express | custom): Self = this.set("type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCapabilities(value: Cardpayments): Self = this.set("capabilities", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCapabilities: Self = this.set("capabilities", js.undefined)
    
    @scala.inline
    def setCompany(value: ICompany): Self = this.set("company", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCompany: Self = this.set("company", js.undefined)
    
    @scala.inline
    def setCreated(value: Double): Self = this.set("created", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCreated: Self = this.set("created", js.undefined)
    
    @scala.inline
    def setExternal_accounts(value: IList[IExternalAccount]): Self = this.set("external_accounts", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteExternal_accounts: Self = this.set("external_accounts", js.undefined)
    
    @scala.inline
    def setIndividual(value: IIndividual): Self = this.set("individual", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIndividual: Self = this.set("individual", js.undefined)
    
    @scala.inline
    def setMetadata(value: IMetadata): Self = this.set("metadata", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMetadata: Self = this.set("metadata", js.undefined)
    
    @scala.inline
    def setRequirements(value: IAccountRequirements): Self = this.set("requirements", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRequirements: Self = this.set("requirements", js.undefined)
    
    @scala.inline
    def setVerification(value: Disabledreason): Self = this.set("verification", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteVerification: Self = this.set("verification", js.undefined)
  }
}

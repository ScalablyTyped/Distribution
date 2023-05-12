package typings.stripe.anon

import typings.stripe.mod.Stripe.Account.BusinessProfile
import typings.stripe.mod.Stripe.Account.BusinessType
import typings.stripe.mod.Stripe.Account.Capabilities
import typings.stripe.mod.Stripe.Account.Company
import typings.stripe.mod.Stripe.Account.Controller
import typings.stripe.mod.Stripe.Account.FutureRequirements
import typings.stripe.mod.Stripe.Account.Requirements
import typings.stripe.mod.Stripe.Account.Settings
import typings.stripe.mod.Stripe.Account.TosAcceptance
import typings.stripe.mod.Stripe.ApiList
import typings.stripe.mod.Stripe.BankAccount
import typings.stripe.mod.Stripe.Card
import typings.stripe.mod.Stripe.Metadata
import typings.stripe.mod.Stripe.Person
import typings.stripe.stripeStrings.account
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined stripe.stripe.Stripe.Response<stripe.stripe.Stripe.Account> */
trait ResponseAccount extends StObject {
  
  /**
    * Business information about the account.
    */
  var business_profile: js.UndefOr[BusinessProfile | Null] = js.undefined
  
  /**
    * The business type.
    */
  var business_type: js.UndefOr[BusinessType | Null] = js.undefined
  
  var capabilities: js.UndefOr[Capabilities] = js.undefined
  
  /**
    * Whether the account can create live charges.
    */
  var charges_enabled: Boolean
  
  var company: js.UndefOr[Company] = js.undefined
  
  var controller: js.UndefOr[Controller] = js.undefined
  
  /**
    * The account's country.
    */
  var country: js.UndefOr[String] = js.undefined
  
  /**
    * Time at which the account was connected. Measured in seconds since the Unix epoch.
    */
  var created: js.UndefOr[Double] = js.undefined
  
  /**
    * Three-letter ISO currency code representing the default currency for the account. This must be a currency that [Stripe supports in the account's country](https://stripe.com/docs/payouts).
    */
  var default_currency: js.UndefOr[String] = js.undefined
  
  var deleted: js.UndefOr[Unit] = js.undefined
  
  /**
    * Whether account details have been submitted. Standard accounts cannot receive payouts before this is true.
    */
  var details_submitted: Boolean
  
  /**
    * An email address associated with the account. You can treat this as metadata: it is not used for authentication or messaging account holders.
    */
  var email: String | Null
  
  /**
    * External accounts (bank accounts and debit cards) currently attached to this account
    */
  var external_accounts: js.UndefOr[ApiList[BankAccount | Card]] = js.undefined
  
  var future_requirements: js.UndefOr[FutureRequirements] = js.undefined
  
  /**
    * Unique identifier for the object.
    */
  var id: String
  
  /**
    * This is an object representing a person associated with a Stripe account.
    *
    * A platform cannot access a Standard or Express account's persons after the account starts onboarding, such as after generating an account link for the account.
    * See the [Standard onboarding](https://stripe.com/docs/connect/standard-accounts) or [Express onboarding documentation](https://stripe.com/docs/connect/express-accounts) for information about platform pre-filling and account onboarding steps.
    *
    * Related guide: [Handling Identity Verification with the API](https://stripe.com/docs/connect/identity-verification-api#person-information).
    */
  var individual: js.UndefOr[Person] = js.undefined
  
  var lastResponse: ApiVersion
  
  /**
    * Set of [key-value pairs](https://stripe.com/docs/api/metadata) that you can attach to an object. This can be useful for storing additional information about the object in a structured format.
    */
  var metadata: js.UndefOr[Metadata] = js.undefined
  
  /**
    * String representing the object's type. Objects of the same type share the same value.
    */
  var `object`: account
  
  /**
    * Whether Stripe can send payouts to this account.
    */
  var payouts_enabled: Boolean
  
  var requirements: js.UndefOr[Requirements] = js.undefined
  
  /**
    * Options for customizing how the account functions within Stripe.
    */
  var settings: js.UndefOr[Settings | Null] = js.undefined
  
  var tos_acceptance: js.UndefOr[TosAcceptance] = js.undefined
  
  /**
    * The Stripe account type. Can be `standard`, `express`, or `custom`.
    */
  var `type`: typings.stripe.mod.Stripe.Account.Type
}
object ResponseAccount {
  
  inline def apply(
    charges_enabled: Boolean,
    details_submitted: Boolean,
    id: String,
    lastResponse: ApiVersion,
    payouts_enabled: Boolean,
    `type`: typings.stripe.mod.Stripe.Account.Type
  ): ResponseAccount = {
    val __obj = js.Dynamic.literal(charges_enabled = charges_enabled.asInstanceOf[js.Any], details_submitted = details_submitted.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], lastResponse = lastResponse.asInstanceOf[js.Any], payouts_enabled = payouts_enabled.asInstanceOf[js.Any], email = null)
    __obj.updateDynamic("object")("account")
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ResponseAccount]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ResponseAccount] (val x: Self) extends AnyVal {
    
    inline def setBusiness_profile(value: BusinessProfile): Self = StObject.set(x, "business_profile", value.asInstanceOf[js.Any])
    
    inline def setBusiness_profileNull: Self = StObject.set(x, "business_profile", null)
    
    inline def setBusiness_profileUndefined: Self = StObject.set(x, "business_profile", js.undefined)
    
    inline def setBusiness_type(value: BusinessType): Self = StObject.set(x, "business_type", value.asInstanceOf[js.Any])
    
    inline def setBusiness_typeNull: Self = StObject.set(x, "business_type", null)
    
    inline def setBusiness_typeUndefined: Self = StObject.set(x, "business_type", js.undefined)
    
    inline def setCapabilities(value: Capabilities): Self = StObject.set(x, "capabilities", value.asInstanceOf[js.Any])
    
    inline def setCapabilitiesUndefined: Self = StObject.set(x, "capabilities", js.undefined)
    
    inline def setCharges_enabled(value: Boolean): Self = StObject.set(x, "charges_enabled", value.asInstanceOf[js.Any])
    
    inline def setCompany(value: Company): Self = StObject.set(x, "company", value.asInstanceOf[js.Any])
    
    inline def setCompanyUndefined: Self = StObject.set(x, "company", js.undefined)
    
    inline def setController(value: Controller): Self = StObject.set(x, "controller", value.asInstanceOf[js.Any])
    
    inline def setControllerUndefined: Self = StObject.set(x, "controller", js.undefined)
    
    inline def setCountry(value: String): Self = StObject.set(x, "country", value.asInstanceOf[js.Any])
    
    inline def setCountryUndefined: Self = StObject.set(x, "country", js.undefined)
    
    inline def setCreated(value: Double): Self = StObject.set(x, "created", value.asInstanceOf[js.Any])
    
    inline def setCreatedUndefined: Self = StObject.set(x, "created", js.undefined)
    
    inline def setDefault_currency(value: String): Self = StObject.set(x, "default_currency", value.asInstanceOf[js.Any])
    
    inline def setDefault_currencyUndefined: Self = StObject.set(x, "default_currency", js.undefined)
    
    inline def setDeleted(value: Unit): Self = StObject.set(x, "deleted", value.asInstanceOf[js.Any])
    
    inline def setDeletedUndefined: Self = StObject.set(x, "deleted", js.undefined)
    
    inline def setDetails_submitted(value: Boolean): Self = StObject.set(x, "details_submitted", value.asInstanceOf[js.Any])
    
    inline def setEmail(value: String): Self = StObject.set(x, "email", value.asInstanceOf[js.Any])
    
    inline def setEmailNull: Self = StObject.set(x, "email", null)
    
    inline def setExternal_accounts(value: ApiList[BankAccount | Card]): Self = StObject.set(x, "external_accounts", value.asInstanceOf[js.Any])
    
    inline def setExternal_accountsUndefined: Self = StObject.set(x, "external_accounts", js.undefined)
    
    inline def setFuture_requirements(value: FutureRequirements): Self = StObject.set(x, "future_requirements", value.asInstanceOf[js.Any])
    
    inline def setFuture_requirementsUndefined: Self = StObject.set(x, "future_requirements", js.undefined)
    
    inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setIndividual(value: Person): Self = StObject.set(x, "individual", value.asInstanceOf[js.Any])
    
    inline def setIndividualUndefined: Self = StObject.set(x, "individual", js.undefined)
    
    inline def setLastResponse(value: ApiVersion): Self = StObject.set(x, "lastResponse", value.asInstanceOf[js.Any])
    
    inline def setMetadata(value: Metadata): Self = StObject.set(x, "metadata", value.asInstanceOf[js.Any])
    
    inline def setMetadataUndefined: Self = StObject.set(x, "metadata", js.undefined)
    
    inline def setObject(value: account): Self = StObject.set(x, "object", value.asInstanceOf[js.Any])
    
    inline def setPayouts_enabled(value: Boolean): Self = StObject.set(x, "payouts_enabled", value.asInstanceOf[js.Any])
    
    inline def setRequirements(value: Requirements): Self = StObject.set(x, "requirements", value.asInstanceOf[js.Any])
    
    inline def setRequirementsUndefined: Self = StObject.set(x, "requirements", js.undefined)
    
    inline def setSettings(value: Settings): Self = StObject.set(x, "settings", value.asInstanceOf[js.Any])
    
    inline def setSettingsNull: Self = StObject.set(x, "settings", null)
    
    inline def setSettingsUndefined: Self = StObject.set(x, "settings", js.undefined)
    
    inline def setTos_acceptance(value: TosAcceptance): Self = StObject.set(x, "tos_acceptance", value.asInstanceOf[js.Any])
    
    inline def setTos_acceptanceUndefined: Self = StObject.set(x, "tos_acceptance", js.undefined)
    
    inline def setType(value: typings.stripe.mod.Stripe.Account.Type): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}

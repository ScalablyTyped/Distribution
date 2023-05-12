package typings.stripe.anon

import typings.stripe.mod.Stripe.Metadata
import typings.stripe.mod.Stripe.Treasury.FinancialAccount.ActiveFeature
import typings.stripe.mod.Stripe.Treasury.FinancialAccount.Balance
import typings.stripe.mod.Stripe.Treasury.FinancialAccount.FinancialAddress
import typings.stripe.mod.Stripe.Treasury.FinancialAccount.PendingFeature
import typings.stripe.mod.Stripe.Treasury.FinancialAccount.PlatformRestrictions
import typings.stripe.mod.Stripe.Treasury.FinancialAccount.RestrictedFeature
import typings.stripe.mod.Stripe.Treasury.FinancialAccount.Status
import typings.stripe.mod.Stripe.Treasury.FinancialAccount.StatusDetails
import typings.stripe.mod.Stripe.Treasury.FinancialAccountFeatures
import typings.stripe.stripeStrings.treasuryDotfinancial_account
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined stripe.stripe.Stripe.Response<stripe.stripe.Stripe.Treasury.FinancialAccount> */
trait ResponseFinancialAccount extends StObject {
  
  /**
    * The array of paths to active Features in the Features hash.
    */
  var active_features: js.UndefOr[js.Array[ActiveFeature]] = js.undefined
  
  /**
    * Balance information for the FinancialAccount
    */
  var balance: Balance
  
  /**
    * Two-letter country code ([ISO 3166-1 alpha-2](https://en.wikipedia.org/wiki/ISO_3166-1_alpha-2)).
    */
  var country: String
  
  /**
    * Time at which the object was created. Measured in seconds since the Unix epoch.
    */
  var created: Double
  
  /**
    * Encodes whether a FinancialAccount has access to a particular Feature, with a `status` enum and associated `status_details`.
    * Stripe or the platform can control Features via the requested field.
    */
  var features: js.UndefOr[FinancialAccountFeatures] = js.undefined
  
  /**
    * The set of credentials that resolve to a FinancialAccount.
    */
  var financial_addresses: js.Array[FinancialAddress]
  
  /**
    * Unique identifier for the object.
    */
  var id: String
  
  var lastResponse: ApiVersion
  
  /**
    * Has the value `true` if the object exists in live mode or the value `false` if the object exists in test mode.
    */
  var livemode: Boolean
  
  /**
    * Set of [key-value pairs](https://stripe.com/docs/api/metadata) that you can attach to an object. This can be useful for storing additional information about the object in a structured format.
    */
  var metadata: Metadata | Null
  
  /**
    * String representing the object's type. Objects of the same type share the same value.
    */
  var `object`: treasuryDotfinancial_account
  
  /**
    * The array of paths to pending Features in the Features hash.
    */
  var pending_features: js.UndefOr[js.Array[PendingFeature]] = js.undefined
  
  /**
    * The set of functionalities that the platform can restrict on the FinancialAccount.
    */
  var platform_restrictions: js.UndefOr[PlatformRestrictions | Null] = js.undefined
  
  /**
    * The array of paths to restricted Features in the Features hash.
    */
  var restricted_features: js.UndefOr[js.Array[RestrictedFeature]] = js.undefined
  
  /**
    * The enum specifying what state the account is in.
    */
  var status: Status
  
  var status_details: StatusDetails
  
  /**
    * The currencies the FinancialAccount can hold a balance in. Three-letter [ISO currency code](https://www.iso.org/iso-4217-currency-codes.html), in lowercase.
    */
  var supported_currencies: js.Array[String]
}
object ResponseFinancialAccount {
  
  inline def apply(
    balance: Balance,
    country: String,
    created: Double,
    financial_addresses: js.Array[FinancialAddress],
    id: String,
    lastResponse: ApiVersion,
    livemode: Boolean,
    status: Status,
    status_details: StatusDetails,
    supported_currencies: js.Array[String]
  ): ResponseFinancialAccount = {
    val __obj = js.Dynamic.literal(balance = balance.asInstanceOf[js.Any], country = country.asInstanceOf[js.Any], created = created.asInstanceOf[js.Any], financial_addresses = financial_addresses.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], lastResponse = lastResponse.asInstanceOf[js.Any], livemode = livemode.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any], status_details = status_details.asInstanceOf[js.Any], supported_currencies = supported_currencies.asInstanceOf[js.Any], metadata = null)
    __obj.updateDynamic("object")("treasury.financial_account")
    __obj.asInstanceOf[ResponseFinancialAccount]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ResponseFinancialAccount] (val x: Self) extends AnyVal {
    
    inline def setActive_features(value: js.Array[ActiveFeature]): Self = StObject.set(x, "active_features", value.asInstanceOf[js.Any])
    
    inline def setActive_featuresUndefined: Self = StObject.set(x, "active_features", js.undefined)
    
    inline def setActive_featuresVarargs(value: ActiveFeature*): Self = StObject.set(x, "active_features", js.Array(value*))
    
    inline def setBalance(value: Balance): Self = StObject.set(x, "balance", value.asInstanceOf[js.Any])
    
    inline def setCountry(value: String): Self = StObject.set(x, "country", value.asInstanceOf[js.Any])
    
    inline def setCreated(value: Double): Self = StObject.set(x, "created", value.asInstanceOf[js.Any])
    
    inline def setFeatures(value: FinancialAccountFeatures): Self = StObject.set(x, "features", value.asInstanceOf[js.Any])
    
    inline def setFeaturesUndefined: Self = StObject.set(x, "features", js.undefined)
    
    inline def setFinancial_addresses(value: js.Array[FinancialAddress]): Self = StObject.set(x, "financial_addresses", value.asInstanceOf[js.Any])
    
    inline def setFinancial_addressesVarargs(value: FinancialAddress*): Self = StObject.set(x, "financial_addresses", js.Array(value*))
    
    inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setLastResponse(value: ApiVersion): Self = StObject.set(x, "lastResponse", value.asInstanceOf[js.Any])
    
    inline def setLivemode(value: Boolean): Self = StObject.set(x, "livemode", value.asInstanceOf[js.Any])
    
    inline def setMetadata(value: Metadata): Self = StObject.set(x, "metadata", value.asInstanceOf[js.Any])
    
    inline def setMetadataNull: Self = StObject.set(x, "metadata", null)
    
    inline def setObject(value: treasuryDotfinancial_account): Self = StObject.set(x, "object", value.asInstanceOf[js.Any])
    
    inline def setPending_features(value: js.Array[PendingFeature]): Self = StObject.set(x, "pending_features", value.asInstanceOf[js.Any])
    
    inline def setPending_featuresUndefined: Self = StObject.set(x, "pending_features", js.undefined)
    
    inline def setPending_featuresVarargs(value: PendingFeature*): Self = StObject.set(x, "pending_features", js.Array(value*))
    
    inline def setPlatform_restrictions(value: PlatformRestrictions): Self = StObject.set(x, "platform_restrictions", value.asInstanceOf[js.Any])
    
    inline def setPlatform_restrictionsNull: Self = StObject.set(x, "platform_restrictions", null)
    
    inline def setPlatform_restrictionsUndefined: Self = StObject.set(x, "platform_restrictions", js.undefined)
    
    inline def setRestricted_features(value: js.Array[RestrictedFeature]): Self = StObject.set(x, "restricted_features", value.asInstanceOf[js.Any])
    
    inline def setRestricted_featuresUndefined: Self = StObject.set(x, "restricted_features", js.undefined)
    
    inline def setRestricted_featuresVarargs(value: RestrictedFeature*): Self = StObject.set(x, "restricted_features", js.Array(value*))
    
    inline def setStatus(value: Status): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    inline def setStatus_details(value: StatusDetails): Self = StObject.set(x, "status_details", value.asInstanceOf[js.Any])
    
    inline def setSupported_currencies(value: js.Array[String]): Self = StObject.set(x, "supported_currencies", value.asInstanceOf[js.Any])
    
    inline def setSupported_currenciesVarargs(value: String*): Self = StObject.set(x, "supported_currencies", js.Array(value*))
  }
}

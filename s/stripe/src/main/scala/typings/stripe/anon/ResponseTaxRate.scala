package typings.stripe.anon

import typings.stripe.mod.Stripe.Metadata
import typings.stripe.mod.Stripe.TaxRate.TaxType
import typings.stripe.stripeStrings.tax_rate
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined stripe.stripe.Stripe.Response<stripe.stripe.Stripe.TaxRate> */
trait ResponseTaxRate extends StObject {
  
  /**
    * Defaults to `true`. When set to `false`, this tax rate cannot be used with new applications or Checkout Sessions, but will still work for subscriptions and invoices that already have it set.
    */
  var active: Boolean
  
  /**
    * Two-letter country code ([ISO 3166-1 alpha-2](https://en.wikipedia.org/wiki/ISO_3166-1_alpha-2)).
    */
  var country: String | Null
  
  /**
    * Time at which the object was created. Measured in seconds since the Unix epoch.
    */
  var created: Double
  
  /**
    * An arbitrary string attached to the tax rate for your internal use only. It will not be visible to your customers.
    */
  var description: String | Null
  
  /**
    * The display name of the tax rates as it will appear to your customer on their receipt email, PDF, and the hosted invoice page.
    */
  var display_name: String
  
  /**
    * Actual/effective tax rate percentage out of 100. For tax calculations with automatic_tax[enabled]=true, this percentage does not include the statutory tax rate of non-taxable jurisdictions.
    */
  var effective_percentage: Double | Null
  
  /**
    * Unique identifier for the object.
    */
  var id: String
  
  /**
    * This specifies if the tax rate is inclusive or exclusive.
    */
  var inclusive: Boolean
  
  /**
    * The jurisdiction for the tax rate. You can use this label field for tax reporting purposes. It also appears on your customer's invoice.
    */
  var jurisdiction: String | Null
  
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
  var `object`: tax_rate
  
  /**
    * Tax rate percentage out of 100. For tax calculations with automatic_tax[enabled]=true, this percentage includes the statutory tax rate of non-taxable jurisdictions.
    */
  var percentage: Double
  
  /**
    * [ISO 3166-2 subdivision code](https://en.wikipedia.org/wiki/ISO_3166-2:US), without country prefix. For example, "NY" for New York, United States.
    */
  var state: String | Null
  
  /**
    * The high-level tax type, such as `vat` or `sales_tax`.
    */
  var tax_type: TaxType | Null
}
object ResponseTaxRate {
  
  inline def apply(
    active: Boolean,
    created: Double,
    display_name: String,
    id: String,
    inclusive: Boolean,
    lastResponse: ApiVersion,
    livemode: Boolean,
    percentage: Double
  ): ResponseTaxRate = {
    val __obj = js.Dynamic.literal(active = active.asInstanceOf[js.Any], created = created.asInstanceOf[js.Any], display_name = display_name.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], inclusive = inclusive.asInstanceOf[js.Any], lastResponse = lastResponse.asInstanceOf[js.Any], livemode = livemode.asInstanceOf[js.Any], percentage = percentage.asInstanceOf[js.Any], country = null, description = null, effective_percentage = null, jurisdiction = null, metadata = null, state = null, tax_type = null)
    __obj.updateDynamic("object")("tax_rate")
    __obj.asInstanceOf[ResponseTaxRate]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ResponseTaxRate] (val x: Self) extends AnyVal {
    
    inline def setActive(value: Boolean): Self = StObject.set(x, "active", value.asInstanceOf[js.Any])
    
    inline def setCountry(value: String): Self = StObject.set(x, "country", value.asInstanceOf[js.Any])
    
    inline def setCountryNull: Self = StObject.set(x, "country", null)
    
    inline def setCreated(value: Double): Self = StObject.set(x, "created", value.asInstanceOf[js.Any])
    
    inline def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionNull: Self = StObject.set(x, "description", null)
    
    inline def setDisplay_name(value: String): Self = StObject.set(x, "display_name", value.asInstanceOf[js.Any])
    
    inline def setEffective_percentage(value: Double): Self = StObject.set(x, "effective_percentage", value.asInstanceOf[js.Any])
    
    inline def setEffective_percentageNull: Self = StObject.set(x, "effective_percentage", null)
    
    inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setInclusive(value: Boolean): Self = StObject.set(x, "inclusive", value.asInstanceOf[js.Any])
    
    inline def setJurisdiction(value: String): Self = StObject.set(x, "jurisdiction", value.asInstanceOf[js.Any])
    
    inline def setJurisdictionNull: Self = StObject.set(x, "jurisdiction", null)
    
    inline def setLastResponse(value: ApiVersion): Self = StObject.set(x, "lastResponse", value.asInstanceOf[js.Any])
    
    inline def setLivemode(value: Boolean): Self = StObject.set(x, "livemode", value.asInstanceOf[js.Any])
    
    inline def setMetadata(value: Metadata): Self = StObject.set(x, "metadata", value.asInstanceOf[js.Any])
    
    inline def setMetadataNull: Self = StObject.set(x, "metadata", null)
    
    inline def setObject(value: tax_rate): Self = StObject.set(x, "object", value.asInstanceOf[js.Any])
    
    inline def setPercentage(value: Double): Self = StObject.set(x, "percentage", value.asInstanceOf[js.Any])
    
    inline def setState(value: String): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
    
    inline def setStateNull: Self = StObject.set(x, "state", null)
    
    inline def setTax_type(value: TaxType): Self = StObject.set(x, "tax_type", value.asInstanceOf[js.Any])
    
    inline def setTax_typeNull: Self = StObject.set(x, "tax_type", null)
  }
}

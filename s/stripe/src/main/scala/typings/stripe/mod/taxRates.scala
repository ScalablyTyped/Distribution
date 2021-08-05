package typings.stripe.mod

import typings.stripe.stripeStrings.tax_rate
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object taxRates {
  
  trait ITaxAmount extends StObject {
    
    /**
      * The amount, in cents, of the tax.
      */
    var amount: Double
    
    /**
      * Whether this tax amount is inclusive or exclusive.
      */
    var inclusive: Boolean
    
    /**
      * The tax rate that was applied to get this tax amount.
      */
    var tax_rate: String | ITaxRate
  }
  object ITaxAmount {
    
    inline def apply(amount: Double, inclusive: Boolean, tax_rate: String | ITaxRate): ITaxAmount = {
      val __obj = js.Dynamic.literal(amount = amount.asInstanceOf[js.Any], inclusive = inclusive.asInstanceOf[js.Any], tax_rate = tax_rate.asInstanceOf[js.Any])
      __obj.asInstanceOf[ITaxAmount]
    }
    
    extension [Self <: ITaxAmount](x: Self) {
      
      inline def setAmount(value: Double): Self = StObject.set(x, "amount", value.asInstanceOf[js.Any])
      
      inline def setInclusive(value: Boolean): Self = StObject.set(x, "inclusive", value.asInstanceOf[js.Any])
      
      inline def setTax_rate(value: String | ITaxRate): Self = StObject.set(x, "tax_rate", value.asInstanceOf[js.Any])
    }
  }
  
  /**
    * Tax rates can be applied to invoices and subscriptions to collect tax.
    */
  trait ITaxRate
    extends StObject
       with IResourceObject {
    
    /**
      * Defaults to true. When set to false, this tax rate cannot be applied to objects in the API, but will still be applied to subscriptions and invoices that already have it set.
      */
    var active: Boolean
    
    /**
      * Time at which the object was created. Measured in seconds since the Unix epoch.
      */
    var created: Double | Null
    
    /**
      * An arbitrary string attached to the tax rate for your internal use only. It will not be visible to your customers.
      */
    var description: String | Null
    
    /**
      * The display name of the tax rates as it will appear to your customer on their receipt email, PDF, and the hosted invoice page.
      */
    var display_name: String | Null
    
    /**
      * This specifies if the tax rate is inclusive or exclusive.
      */
    var inclusive: Boolean
    
    /**
      * The jurisdiction for the tax rate.
      */
    var jurisdiction: String | Null
    
    /**
      * Has the value true if the object exists in live mode or the value false if the object exists in test mode.
      */
    var livemode: Boolean
    
    /**
      * Set of key-value pairs that you can attach to an object. This can be useful for storing additional information about the object in a structured format.
      */
    var metadata: IMetadata
    
    /**
      * String representing the object’s type. Objects of the same type share the same value.
      */
    @JSName("object")
    var object_ITaxRate: tax_rate
    
    /**
      * This represents the tax rate percent out of 100.
      */
    var percentage: Double | Null
  }
  object ITaxRate {
    
    inline def apply(active: Boolean, id: String, inclusive: Boolean, livemode: Boolean, metadata: IMetadata): ITaxRate = {
      val __obj = js.Dynamic.literal(active = active.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], inclusive = inclusive.asInstanceOf[js.Any], livemode = livemode.asInstanceOf[js.Any], metadata = metadata.asInstanceOf[js.Any], created = null, description = null, display_name = null, jurisdiction = null, percentage = null)
      __obj.updateDynamic("object")("tax_rate")
      __obj.asInstanceOf[ITaxRate]
    }
    
    extension [Self <: ITaxRate](x: Self) {
      
      inline def setActive(value: Boolean): Self = StObject.set(x, "active", value.asInstanceOf[js.Any])
      
      inline def setCreated(value: Double): Self = StObject.set(x, "created", value.asInstanceOf[js.Any])
      
      inline def setCreatedNull: Self = StObject.set(x, "created", null)
      
      inline def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
      
      inline def setDescriptionNull: Self = StObject.set(x, "description", null)
      
      inline def setDisplay_name(value: String): Self = StObject.set(x, "display_name", value.asInstanceOf[js.Any])
      
      inline def setDisplay_nameNull: Self = StObject.set(x, "display_name", null)
      
      inline def setInclusive(value: Boolean): Self = StObject.set(x, "inclusive", value.asInstanceOf[js.Any])
      
      inline def setJurisdiction(value: String): Self = StObject.set(x, "jurisdiction", value.asInstanceOf[js.Any])
      
      inline def setJurisdictionNull: Self = StObject.set(x, "jurisdiction", null)
      
      inline def setLivemode(value: Boolean): Self = StObject.set(x, "livemode", value.asInstanceOf[js.Any])
      
      inline def setMetadata(value: IMetadata): Self = StObject.set(x, "metadata", value.asInstanceOf[js.Any])
      
      inline def setObject(value: tax_rate): Self = StObject.set(x, "object", value.asInstanceOf[js.Any])
      
      inline def setPercentage(value: Double): Self = StObject.set(x, "percentage", value.asInstanceOf[js.Any])
      
      inline def setPercentageNull: Self = StObject.set(x, "percentage", null)
    }
  }
  
  trait ITaxRateCreationOptions extends StObject {
    
    /**
      * Flag determining whether the tax rate is active or inactive. Inactive tax rates continue to work where they are currently applied however they cannot be used for new applications.
      */
    var active: js.UndefOr[Boolean] = js.undefined
    
    /**
      * An arbitrary string attached to the tax rate for your internal use only. It will not be visible to your customers.
      */
    var description: js.UndefOr[String] = js.undefined
    
    /**
      * The display name of the tax rate, which will be shown to users.
      */
    var display_name: String
    
    /**
      * This specifies if the tax rate is inclusive or exclusive.
      */
    var inclusive: Boolean
    
    /**
      * The jurisdiction for the tax rate.
      */
    var jurisdiction: js.UndefOr[String] = js.undefined
    
    /**
      * Set of key-value pairs that you can attach to an object. This can be useful for storing additional information about the object in a structured format.
      * Individual keys can be unset by posting an empty value to them. All keys can be unset by posting an empty value to metadata.
      */
    var metadata: js.UndefOr[IOptionsMetadata] = js.undefined
    
    /**
      * This represents the tax rate percent out of 100.
      */
    var percentage: Double
  }
  object ITaxRateCreationOptions {
    
    inline def apply(display_name: String, inclusive: Boolean, percentage: Double): ITaxRateCreationOptions = {
      val __obj = js.Dynamic.literal(display_name = display_name.asInstanceOf[js.Any], inclusive = inclusive.asInstanceOf[js.Any], percentage = percentage.asInstanceOf[js.Any])
      __obj.asInstanceOf[ITaxRateCreationOptions]
    }
    
    extension [Self <: ITaxRateCreationOptions](x: Self) {
      
      inline def setActive(value: Boolean): Self = StObject.set(x, "active", value.asInstanceOf[js.Any])
      
      inline def setActiveUndefined: Self = StObject.set(x, "active", js.undefined)
      
      inline def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
      
      inline def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
      
      inline def setDisplay_name(value: String): Self = StObject.set(x, "display_name", value.asInstanceOf[js.Any])
      
      inline def setInclusive(value: Boolean): Self = StObject.set(x, "inclusive", value.asInstanceOf[js.Any])
      
      inline def setJurisdiction(value: String): Self = StObject.set(x, "jurisdiction", value.asInstanceOf[js.Any])
      
      inline def setJurisdictionUndefined: Self = StObject.set(x, "jurisdiction", js.undefined)
      
      inline def setMetadata(value: IOptionsMetadata): Self = StObject.set(x, "metadata", value.asInstanceOf[js.Any])
      
      inline def setMetadataUndefined: Self = StObject.set(x, "metadata", js.undefined)
      
      inline def setPercentage(value: Double): Self = StObject.set(x, "percentage", value.asInstanceOf[js.Any])
    }
  }
  
  trait ITaxRateUpdateOptions extends StObject {
    
    /**
      * Flag determining whether the tax rate is active or inactive. Inactive tax rates continue to work where they are currently applied however they cannot be used for new applications.
      */
    var active: js.UndefOr[Boolean] = js.undefined
    
    /**
      * An arbitrary string attached to the tax rate for your internal use only. It will not be visible to your customers.
      */
    var description: js.UndefOr[String] = js.undefined
    
    /**
      * The display name of the tax rate, which will be shown to users.
      */
    var display_name: js.UndefOr[String] = js.undefined
    
    /**
      * The jurisdiction for the tax rate.
      */
    var jurisdiction: js.UndefOr[String] = js.undefined
    
    /**
      * Set of key-value pairs that you can attach to an object. This can be useful for storing additional information about the object in a structured format.
      * Individual keys can be unset by posting an empty value to them. All keys can be unset by posting an empty value to metadata.
      */
    var metadata: js.UndefOr[IOptionsMetadata] = js.undefined
  }
  object ITaxRateUpdateOptions {
    
    inline def apply(): ITaxRateUpdateOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ITaxRateUpdateOptions]
    }
    
    extension [Self <: ITaxRateUpdateOptions](x: Self) {
      
      inline def setActive(value: Boolean): Self = StObject.set(x, "active", value.asInstanceOf[js.Any])
      
      inline def setActiveUndefined: Self = StObject.set(x, "active", js.undefined)
      
      inline def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
      
      inline def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
      
      inline def setDisplay_name(value: String): Self = StObject.set(x, "display_name", value.asInstanceOf[js.Any])
      
      inline def setDisplay_nameUndefined: Self = StObject.set(x, "display_name", js.undefined)
      
      inline def setJurisdiction(value: String): Self = StObject.set(x, "jurisdiction", value.asInstanceOf[js.Any])
      
      inline def setJurisdictionUndefined: Self = StObject.set(x, "jurisdiction", js.undefined)
      
      inline def setMetadata(value: IOptionsMetadata): Self = StObject.set(x, "metadata", value.asInstanceOf[js.Any])
      
      inline def setMetadataUndefined: Self = StObject.set(x, "metadata", js.undefined)
    }
  }
  
  trait ItaxRateSearchOptions
    extends StObject
       with IListOptions {
    
    /**
      * Optional flag to filter by tax rates that are either active or not active (archived)
      */
    var active: js.UndefOr[Boolean] = js.undefined
    
    /**
      * A filter on the list based on the object created field.
      */
    var created: js.UndefOr[String | IDateFilter] = js.undefined
    
    /**
      * A cursor for use in pagination. ending_before is an object ID that defines your place in the list. For instance, if you make
      * a list request and receive 100 objects, starting with obj_bar, your subsequent call can include ending_before=obj_bar in
      * order to fetch the previous page of the list.
      */
    var inclusive: js.UndefOr[Boolean] = js.undefined
    
    /**
      * A limit on the number of objects to be returned. Limit can range between 1 and 100, and the default is 10.
      */
    @JSName("limit")
    var limit_ItaxRateSearchOptions: Double
  }
  object ItaxRateSearchOptions {
    
    inline def apply(limit: Double): ItaxRateSearchOptions = {
      val __obj = js.Dynamic.literal(limit = limit.asInstanceOf[js.Any])
      __obj.asInstanceOf[ItaxRateSearchOptions]
    }
    
    extension [Self <: ItaxRateSearchOptions](x: Self) {
      
      inline def setActive(value: Boolean): Self = StObject.set(x, "active", value.asInstanceOf[js.Any])
      
      inline def setActiveUndefined: Self = StObject.set(x, "active", js.undefined)
      
      inline def setCreated(value: String | IDateFilter): Self = StObject.set(x, "created", value.asInstanceOf[js.Any])
      
      inline def setCreatedUndefined: Self = StObject.set(x, "created", js.undefined)
      
      inline def setInclusive(value: Boolean): Self = StObject.set(x, "inclusive", value.asInstanceOf[js.Any])
      
      inline def setInclusiveUndefined: Self = StObject.set(x, "inclusive", js.undefined)
      
      inline def setLimit(value: Double): Self = StObject.set(x, "limit", value.asInstanceOf[js.Any])
    }
  }
}

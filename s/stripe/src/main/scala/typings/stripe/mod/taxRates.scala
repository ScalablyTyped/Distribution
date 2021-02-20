package typings.stripe.mod

import typings.stripe.stripeStrings.tax_rate
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object taxRates {
  
  @js.native
  trait ITaxAmount extends StObject {
    
    /**
      * The amount, in cents, of the tax.
      */
    var amount: Double = js.native
    
    /**
      * Whether this tax amount is inclusive or exclusive.
      */
    var inclusive: Boolean = js.native
    
    /**
      * The tax rate that was applied to get this tax amount.
      */
    var tax_rate: String | ITaxRate = js.native
  }
  object ITaxAmount {
    
    @scala.inline
    def apply(amount: Double, inclusive: Boolean, tax_rate: String | ITaxRate): ITaxAmount = {
      val __obj = js.Dynamic.literal(amount = amount.asInstanceOf[js.Any], inclusive = inclusive.asInstanceOf[js.Any], tax_rate = tax_rate.asInstanceOf[js.Any])
      __obj.asInstanceOf[ITaxAmount]
    }
    
    @scala.inline
    implicit class ITaxAmountMutableBuilder[Self <: ITaxAmount] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAmount(value: Double): Self = StObject.set(x, "amount", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setInclusive(value: Boolean): Self = StObject.set(x, "inclusive", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTax_rate(value: String | ITaxRate): Self = StObject.set(x, "tax_rate", value.asInstanceOf[js.Any])
    }
  }
  
  /**
    * Tax rates can be applied to invoices and subscriptions to collect tax.
    */
  @js.native
  trait ITaxRate extends IResourceObject {
    
    /**
      * Defaults to true. When set to false, this tax rate cannot be applied to objects in the API, but will still be applied to subscriptions and invoices that already have it set.
      */
    var active: Boolean = js.native
    
    /**
      * Time at which the object was created. Measured in seconds since the Unix epoch.
      */
    var created: Double | Null = js.native
    
    /**
      * An arbitrary string attached to the tax rate for your internal use only. It will not be visible to your customers.
      */
    var description: String | Null = js.native
    
    /**
      * The display name of the tax rates as it will appear to your customer on their receipt email, PDF, and the hosted invoice page.
      */
    var display_name: String | Null = js.native
    
    /**
      * This specifies if the tax rate is inclusive or exclusive.
      */
    var inclusive: Boolean = js.native
    
    /**
      * The jurisdiction for the tax rate.
      */
    var jurisdiction: String | Null = js.native
    
    /**
      * Has the value true if the object exists in live mode or the value false if the object exists in test mode.
      */
    var livemode: Boolean = js.native
    
    /**
      * Set of key-value pairs that you can attach to an object. This can be useful for storing additional information about the object in a structured format.
      */
    var metadata: IMetadata = js.native
    
    /**
      * String representing the object’s type. Objects of the same type share the same value.
      */
    @JSName("object")
    var object_ITaxRate: tax_rate = js.native
    
    /**
      * This represents the tax rate percent out of 100.
      */
    var percentage: Double | Null = js.native
  }
  object ITaxRate {
    
    @scala.inline
    def apply(
      active: Boolean,
      id: String,
      inclusive: Boolean,
      livemode: Boolean,
      metadata: IMetadata,
      `object`: tax_rate
    ): ITaxRate = {
      val __obj = js.Dynamic.literal(active = active.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], inclusive = inclusive.asInstanceOf[js.Any], livemode = livemode.asInstanceOf[js.Any], metadata = metadata.asInstanceOf[js.Any])
      __obj.updateDynamic("object")(`object`.asInstanceOf[js.Any])
      __obj.asInstanceOf[ITaxRate]
    }
    
    @scala.inline
    implicit class ITaxRateMutableBuilder[Self <: ITaxRate] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setActive(value: Boolean): Self = StObject.set(x, "active", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCreated(value: Double): Self = StObject.set(x, "created", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCreatedNull: Self = StObject.set(x, "created", null)
      
      @scala.inline
      def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDescriptionNull: Self = StObject.set(x, "description", null)
      
      @scala.inline
      def setDisplay_name(value: String): Self = StObject.set(x, "display_name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDisplay_nameNull: Self = StObject.set(x, "display_name", null)
      
      @scala.inline
      def setInclusive(value: Boolean): Self = StObject.set(x, "inclusive", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setJurisdiction(value: String): Self = StObject.set(x, "jurisdiction", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setJurisdictionNull: Self = StObject.set(x, "jurisdiction", null)
      
      @scala.inline
      def setLivemode(value: Boolean): Self = StObject.set(x, "livemode", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMetadata(value: IMetadata): Self = StObject.set(x, "metadata", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setObject(value: tax_rate): Self = StObject.set(x, "object", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPercentage(value: Double): Self = StObject.set(x, "percentage", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPercentageNull: Self = StObject.set(x, "percentage", null)
    }
  }
  
  @js.native
  trait ITaxRateCreationOptions extends StObject {
    
    /**
      * Flag determining whether the tax rate is active or inactive. Inactive tax rates continue to work where they are currently applied however they cannot be used for new applications.
      */
    var active: js.UndefOr[Boolean] = js.native
    
    /**
      * An arbitrary string attached to the tax rate for your internal use only. It will not be visible to your customers.
      */
    var description: js.UndefOr[String] = js.native
    
    /**
      * The display name of the tax rate, which will be shown to users.
      */
    var display_name: String = js.native
    
    /**
      * This specifies if the tax rate is inclusive or exclusive.
      */
    var inclusive: Boolean = js.native
    
    /**
      * The jurisdiction for the tax rate.
      */
    var jurisdiction: js.UndefOr[String] = js.native
    
    /**
      * Set of key-value pairs that you can attach to an object. This can be useful for storing additional information about the object in a structured format.
      * Individual keys can be unset by posting an empty value to them. All keys can be unset by posting an empty value to metadata.
      */
    var metadata: js.UndefOr[IOptionsMetadata] = js.native
    
    /**
      * This represents the tax rate percent out of 100.
      */
    var percentage: Double = js.native
  }
  object ITaxRateCreationOptions {
    
    @scala.inline
    def apply(display_name: String, inclusive: Boolean, percentage: Double): ITaxRateCreationOptions = {
      val __obj = js.Dynamic.literal(display_name = display_name.asInstanceOf[js.Any], inclusive = inclusive.asInstanceOf[js.Any], percentage = percentage.asInstanceOf[js.Any])
      __obj.asInstanceOf[ITaxRateCreationOptions]
    }
    
    @scala.inline
    implicit class ITaxRateCreationOptionsMutableBuilder[Self <: ITaxRateCreationOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setActive(value: Boolean): Self = StObject.set(x, "active", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setActiveUndefined: Self = StObject.set(x, "active", js.undefined)
      
      @scala.inline
      def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
      
      @scala.inline
      def setDisplay_name(value: String): Self = StObject.set(x, "display_name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setInclusive(value: Boolean): Self = StObject.set(x, "inclusive", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setJurisdiction(value: String): Self = StObject.set(x, "jurisdiction", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setJurisdictionUndefined: Self = StObject.set(x, "jurisdiction", js.undefined)
      
      @scala.inline
      def setMetadata(value: IOptionsMetadata): Self = StObject.set(x, "metadata", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMetadataUndefined: Self = StObject.set(x, "metadata", js.undefined)
      
      @scala.inline
      def setPercentage(value: Double): Self = StObject.set(x, "percentage", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait ITaxRateUpdateOptions extends StObject {
    
    /**
      * Flag determining whether the tax rate is active or inactive. Inactive tax rates continue to work where they are currently applied however they cannot be used for new applications.
      */
    var active: js.UndefOr[Boolean] = js.native
    
    /**
      * An arbitrary string attached to the tax rate for your internal use only. It will not be visible to your customers.
      */
    var description: js.UndefOr[String] = js.native
    
    /**
      * The display name of the tax rate, which will be shown to users.
      */
    var display_name: js.UndefOr[String] = js.native
    
    /**
      * The jurisdiction for the tax rate.
      */
    var jurisdiction: js.UndefOr[String] = js.native
    
    /**
      * Set of key-value pairs that you can attach to an object. This can be useful for storing additional information about the object in a structured format.
      * Individual keys can be unset by posting an empty value to them. All keys can be unset by posting an empty value to metadata.
      */
    var metadata: js.UndefOr[IOptionsMetadata] = js.native
  }
  object ITaxRateUpdateOptions {
    
    @scala.inline
    def apply(): ITaxRateUpdateOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ITaxRateUpdateOptions]
    }
    
    @scala.inline
    implicit class ITaxRateUpdateOptionsMutableBuilder[Self <: ITaxRateUpdateOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setActive(value: Boolean): Self = StObject.set(x, "active", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setActiveUndefined: Self = StObject.set(x, "active", js.undefined)
      
      @scala.inline
      def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
      
      @scala.inline
      def setDisplay_name(value: String): Self = StObject.set(x, "display_name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDisplay_nameUndefined: Self = StObject.set(x, "display_name", js.undefined)
      
      @scala.inline
      def setJurisdiction(value: String): Self = StObject.set(x, "jurisdiction", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setJurisdictionUndefined: Self = StObject.set(x, "jurisdiction", js.undefined)
      
      @scala.inline
      def setMetadata(value: IOptionsMetadata): Self = StObject.set(x, "metadata", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMetadataUndefined: Self = StObject.set(x, "metadata", js.undefined)
    }
  }
  
  @js.native
  trait ItaxRateSearchOptions extends IListOptions {
    
    /**
      * Optional flag to filter by tax rates that are either active or not active (archived)
      */
    var active: js.UndefOr[Boolean] = js.native
    
    /**
      * A filter on the list based on the object created field.
      */
    var created: js.UndefOr[String | IDateFilter] = js.native
    
    /**
      * A cursor for use in pagination. ending_before is an object ID that defines your place in the list. For instance, if you make
      * a list request and receive 100 objects, starting with obj_bar, your subsequent call can include ending_before=obj_bar in
      * order to fetch the previous page of the list.
      */
    var inclusive: js.UndefOr[Boolean] = js.native
    
    /**
      * A limit on the number of objects to be returned. Limit can range between 1 and 100, and the default is 10.
      */
    @JSName("limit")
    var limit_ItaxRateSearchOptions: Double = js.native
  }
  object ItaxRateSearchOptions {
    
    @scala.inline
    def apply(limit: Double): ItaxRateSearchOptions = {
      val __obj = js.Dynamic.literal(limit = limit.asInstanceOf[js.Any])
      __obj.asInstanceOf[ItaxRateSearchOptions]
    }
    
    @scala.inline
    implicit class ItaxRateSearchOptionsMutableBuilder[Self <: ItaxRateSearchOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setActive(value: Boolean): Self = StObject.set(x, "active", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setActiveUndefined: Self = StObject.set(x, "active", js.undefined)
      
      @scala.inline
      def setCreated(value: String | IDateFilter): Self = StObject.set(x, "created", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCreatedUndefined: Self = StObject.set(x, "created", js.undefined)
      
      @scala.inline
      def setInclusive(value: Boolean): Self = StObject.set(x, "inclusive", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setInclusiveUndefined: Self = StObject.set(x, "inclusive", js.undefined)
      
      @scala.inline
      def setLimit(value: Double): Self = StObject.set(x, "limit", value.asInstanceOf[js.Any])
    }
  }
}

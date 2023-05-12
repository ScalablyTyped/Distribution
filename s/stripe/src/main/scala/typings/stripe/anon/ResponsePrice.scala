package typings.stripe.anon

import org.scalablytyped.runtime.StringDictionary
import typings.stripe.mod.Stripe.DeletedProduct
import typings.stripe.mod.Stripe.Metadata
import typings.stripe.mod.Stripe.Price.BillingScheme
import typings.stripe.mod.Stripe.Price.CurrencyOptions
import typings.stripe.mod.Stripe.Price.CustomUnitAmount
import typings.stripe.mod.Stripe.Price.Recurring
import typings.stripe.mod.Stripe.Price.TaxBehavior
import typings.stripe.mod.Stripe.Price.Tier
import typings.stripe.mod.Stripe.Price.TiersMode
import typings.stripe.mod.Stripe.Price.TransformQuantity
import typings.stripe.mod.Stripe.Product
import typings.stripe.stripeStrings.price
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined stripe.stripe.Stripe.Response<stripe.stripe.Stripe.Price> */
trait ResponsePrice extends StObject {
  
  /**
    * Whether the price can be used for new purchases.
    */
  var active: Boolean
  
  /**
    * Describes how to compute the price per period. Either `per_unit` or `tiered`. `per_unit` indicates that the fixed amount (specified in `unit_amount` or `unit_amount_decimal`) will be charged per unit in `quantity` (for prices with `usage_type=licensed`), or per unit of total usage (for prices with `usage_type=metered`). `tiered` indicates that the unit pricing will be computed using a tiering strategy as defined using the `tiers` and `tiers_mode` attributes.
    */
  var billing_scheme: BillingScheme
  
  /**
    * Time at which the object was created. Measured in seconds since the Unix epoch.
    */
  var created: Double
  
  /**
    * Three-letter [ISO currency code](https://www.iso.org/iso-4217-currency-codes.html), in lowercase. Must be a [supported currency](https://stripe.com/docs/currencies).
    */
  var currency: String
  
  /**
    * Prices defined in each available currency option. Each key must be a three-letter [ISO currency code](https://www.iso.org/iso-4217-currency-codes.html) and a [supported currency](https://stripe.com/docs/currencies).
    */
  var currency_options: js.UndefOr[StringDictionary[CurrencyOptions]] = js.undefined
  
  /**
    * When set, provides configuration for the amount to be adjusted by the customer during Checkout Sessions and Payment Links.
    */
  var custom_unit_amount: CustomUnitAmount | Null
  
  var deleted: js.UndefOr[Unit] = js.undefined
  
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
    * A lookup key used to retrieve prices dynamically from a static string. This may be up to 200 characters.
    */
  var lookup_key: String | Null
  
  /**
    * Set of [key-value pairs](https://stripe.com/docs/api/metadata) that you can attach to an object. This can be useful for storing additional information about the object in a structured format.
    */
  var metadata: Metadata
  
  /**
    * A brief description of the price, hidden from customers.
    */
  var nickname: String | Null
  
  /**
    * String representing the object's type. Objects of the same type share the same value.
    */
  var `object`: price
  
  /**
    * The ID of the product this price is associated with.
    */
  var product: String | Product | DeletedProduct
  
  /**
    * The recurring components of a price such as `interval` and `usage_type`.
    */
  var recurring: Recurring | Null
  
  /**
    * Only required if a [default tax behavior](https://stripe.com/docs/tax/products-prices-tax-categories-tax-behavior#setting-a-default-tax-behavior-(recommended)) was not provided in the Stripe Tax settings. Specifies whether the price is considered inclusive of taxes or exclusive of taxes. One of `inclusive`, `exclusive`, or `unspecified`. Once specified as either `inclusive` or `exclusive`, it cannot be changed.
    */
  var tax_behavior: TaxBehavior | Null
  
  /**
    * Each element represents a pricing tier. This parameter requires `billing_scheme` to be set to `tiered`. See also the documentation for `billing_scheme`.
    */
  var tiers: js.UndefOr[js.Array[Tier]] = js.undefined
  
  /**
    * Defines if the tiering price should be `graduated` or `volume` based. In `volume`-based tiering, the maximum quantity within a period determines the per unit price. In `graduated` tiering, pricing can change as the quantity grows.
    */
  var tiers_mode: TiersMode | Null
  
  /**
    * Apply a transformation to the reported usage or set quantity before computing the amount billed. Cannot be combined with `tiers`.
    */
  var transform_quantity: TransformQuantity | Null
  
  /**
    * One of `one_time` or `recurring` depending on whether the price is for a one-time purchase or a recurring (subscription) purchase.
    */
  var `type`: typings.stripe.mod.Stripe.Price.Type
  
  /**
    * The unit amount in %s to be charged, represented as a whole integer if possible. Only set if `billing_scheme=per_unit`.
    */
  var unit_amount: Double | Null
  
  /**
    * The unit amount in %s to be charged, represented as a decimal string with at most 12 decimal places. Only set if `billing_scheme=per_unit`.
    */
  var unit_amount_decimal: String | Null
}
object ResponsePrice {
  
  inline def apply(
    active: Boolean,
    billing_scheme: BillingScheme,
    created: Double,
    currency: String,
    id: String,
    lastResponse: ApiVersion,
    livemode: Boolean,
    metadata: Metadata,
    product: String | Product | DeletedProduct,
    `type`: typings.stripe.mod.Stripe.Price.Type
  ): ResponsePrice = {
    val __obj = js.Dynamic.literal(active = active.asInstanceOf[js.Any], billing_scheme = billing_scheme.asInstanceOf[js.Any], created = created.asInstanceOf[js.Any], currency = currency.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], lastResponse = lastResponse.asInstanceOf[js.Any], livemode = livemode.asInstanceOf[js.Any], metadata = metadata.asInstanceOf[js.Any], product = product.asInstanceOf[js.Any], custom_unit_amount = null, lookup_key = null, nickname = null, recurring = null, tax_behavior = null, tiers_mode = null, transform_quantity = null, unit_amount = null, unit_amount_decimal = null)
    __obj.updateDynamic("object")("price")
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ResponsePrice]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ResponsePrice] (val x: Self) extends AnyVal {
    
    inline def setActive(value: Boolean): Self = StObject.set(x, "active", value.asInstanceOf[js.Any])
    
    inline def setBilling_scheme(value: BillingScheme): Self = StObject.set(x, "billing_scheme", value.asInstanceOf[js.Any])
    
    inline def setCreated(value: Double): Self = StObject.set(x, "created", value.asInstanceOf[js.Any])
    
    inline def setCurrency(value: String): Self = StObject.set(x, "currency", value.asInstanceOf[js.Any])
    
    inline def setCurrency_options(value: StringDictionary[CurrencyOptions]): Self = StObject.set(x, "currency_options", value.asInstanceOf[js.Any])
    
    inline def setCurrency_optionsUndefined: Self = StObject.set(x, "currency_options", js.undefined)
    
    inline def setCustom_unit_amount(value: CustomUnitAmount): Self = StObject.set(x, "custom_unit_amount", value.asInstanceOf[js.Any])
    
    inline def setCustom_unit_amountNull: Self = StObject.set(x, "custom_unit_amount", null)
    
    inline def setDeleted(value: Unit): Self = StObject.set(x, "deleted", value.asInstanceOf[js.Any])
    
    inline def setDeletedUndefined: Self = StObject.set(x, "deleted", js.undefined)
    
    inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setLastResponse(value: ApiVersion): Self = StObject.set(x, "lastResponse", value.asInstanceOf[js.Any])
    
    inline def setLivemode(value: Boolean): Self = StObject.set(x, "livemode", value.asInstanceOf[js.Any])
    
    inline def setLookup_key(value: String): Self = StObject.set(x, "lookup_key", value.asInstanceOf[js.Any])
    
    inline def setLookup_keyNull: Self = StObject.set(x, "lookup_key", null)
    
    inline def setMetadata(value: Metadata): Self = StObject.set(x, "metadata", value.asInstanceOf[js.Any])
    
    inline def setNickname(value: String): Self = StObject.set(x, "nickname", value.asInstanceOf[js.Any])
    
    inline def setNicknameNull: Self = StObject.set(x, "nickname", null)
    
    inline def setObject(value: price): Self = StObject.set(x, "object", value.asInstanceOf[js.Any])
    
    inline def setProduct(value: String | Product | DeletedProduct): Self = StObject.set(x, "product", value.asInstanceOf[js.Any])
    
    inline def setRecurring(value: Recurring): Self = StObject.set(x, "recurring", value.asInstanceOf[js.Any])
    
    inline def setRecurringNull: Self = StObject.set(x, "recurring", null)
    
    inline def setTax_behavior(value: TaxBehavior): Self = StObject.set(x, "tax_behavior", value.asInstanceOf[js.Any])
    
    inline def setTax_behaviorNull: Self = StObject.set(x, "tax_behavior", null)
    
    inline def setTiers(value: js.Array[Tier]): Self = StObject.set(x, "tiers", value.asInstanceOf[js.Any])
    
    inline def setTiersUndefined: Self = StObject.set(x, "tiers", js.undefined)
    
    inline def setTiersVarargs(value: Tier*): Self = StObject.set(x, "tiers", js.Array(value*))
    
    inline def setTiers_mode(value: TiersMode): Self = StObject.set(x, "tiers_mode", value.asInstanceOf[js.Any])
    
    inline def setTiers_modeNull: Self = StObject.set(x, "tiers_mode", null)
    
    inline def setTransform_quantity(value: TransformQuantity): Self = StObject.set(x, "transform_quantity", value.asInstanceOf[js.Any])
    
    inline def setTransform_quantityNull: Self = StObject.set(x, "transform_quantity", null)
    
    inline def setType(value: typings.stripe.mod.Stripe.Price.Type): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setUnit_amount(value: Double): Self = StObject.set(x, "unit_amount", value.asInstanceOf[js.Any])
    
    inline def setUnit_amountNull: Self = StObject.set(x, "unit_amount", null)
    
    inline def setUnit_amount_decimal(value: String): Self = StObject.set(x, "unit_amount_decimal", value.asInstanceOf[js.Any])
    
    inline def setUnit_amount_decimalNull: Self = StObject.set(x, "unit_amount_decimal", null)
  }
}

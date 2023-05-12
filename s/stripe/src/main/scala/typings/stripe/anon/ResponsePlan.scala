package typings.stripe.anon

import typings.stripe.mod.Stripe.DeletedProduct
import typings.stripe.mod.Stripe.Metadata
import typings.stripe.mod.Stripe.Plan.AggregateUsage
import typings.stripe.mod.Stripe.Plan.BillingScheme
import typings.stripe.mod.Stripe.Plan.Interval
import typings.stripe.mod.Stripe.Plan.Tier
import typings.stripe.mod.Stripe.Plan.TiersMode
import typings.stripe.mod.Stripe.Plan.TransformUsage
import typings.stripe.mod.Stripe.Plan.UsageType
import typings.stripe.mod.Stripe.Product
import typings.stripe.stripeStrings.plan
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined stripe.stripe.Stripe.Response<stripe.stripe.Stripe.Plan> */
trait ResponsePlan extends StObject {
  
  /**
    * Whether the plan can be used for new purchases.
    */
  var active: Boolean
  
  /**
    * Specifies a usage aggregation strategy for plans of `usage_type=metered`. Allowed values are `sum` for summing up all usage during a period, `last_during_period` for using the last usage record reported within a period, `last_ever` for using the last usage record ever (across period bounds) or `max` which uses the usage record with the maximum reported usage during a period. Defaults to `sum`.
    */
  var aggregate_usage: AggregateUsage | Null
  
  /**
    * The unit amount in %s to be charged, represented as a whole integer if possible. Only set if `billing_scheme=per_unit`.
    */
  var amount: Double | Null
  
  /**
    * The unit amount in %s to be charged, represented as a decimal string with at most 12 decimal places. Only set if `billing_scheme=per_unit`.
    */
  var amount_decimal: String | Null
  
  /**
    * Describes how to compute the price per period. Either `per_unit` or `tiered`. `per_unit` indicates that the fixed amount (specified in `amount`) will be charged per unit in `quantity` (for plans with `usage_type=licensed`), or per unit of total usage (for plans with `usage_type=metered`). `tiered` indicates that the unit pricing will be computed using a tiering strategy as defined using the `tiers` and `tiers_mode` attributes.
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
  
  var deleted: js.UndefOr[Unit] = js.undefined
  
  /**
    * Unique identifier for the object.
    */
  var id: String
  
  /**
    * The frequency at which a subscription is billed. One of `day`, `week`, `month` or `year`.
    */
  var interval: Interval
  
  /**
    * The number of intervals (specified in the `interval` attribute) between subscription billings. For example, `interval=month` and `interval_count=3` bills every 3 months.
    */
  var interval_count: Double
  
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
    * A brief description of the plan, hidden from customers.
    */
  var nickname: String | Null
  
  /**
    * String representing the object's type. Objects of the same type share the same value.
    */
  var `object`: plan
  
  /**
    * The product whose pricing this plan determines.
    */
  var product: String | Product | DeletedProduct | Null
  
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
  var transform_usage: TransformUsage | Null
  
  /**
    * Default number of trial days when subscribing a customer to this plan using [`trial_from_plan=true`](https://stripe.com/docs/api#create_subscription-trial_from_plan).
    */
  var trial_period_days: Double | Null
  
  /**
    * Configures how the quantity per period should be determined. Can be either `metered` or `licensed`. `licensed` automatically bills the `quantity` set when adding it to a subscription. `metered` aggregates the total usage based on usage records. Defaults to `licensed`.
    */
  var usage_type: UsageType
}
object ResponsePlan {
  
  inline def apply(
    active: Boolean,
    billing_scheme: BillingScheme,
    created: Double,
    currency: String,
    id: String,
    interval: Interval,
    interval_count: Double,
    lastResponse: ApiVersion,
    livemode: Boolean,
    usage_type: UsageType
  ): ResponsePlan = {
    val __obj = js.Dynamic.literal(active = active.asInstanceOf[js.Any], billing_scheme = billing_scheme.asInstanceOf[js.Any], created = created.asInstanceOf[js.Any], currency = currency.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], interval = interval.asInstanceOf[js.Any], interval_count = interval_count.asInstanceOf[js.Any], lastResponse = lastResponse.asInstanceOf[js.Any], livemode = livemode.asInstanceOf[js.Any], usage_type = usage_type.asInstanceOf[js.Any], aggregate_usage = null, amount = null, amount_decimal = null, metadata = null, nickname = null, product = null, tiers_mode = null, transform_usage = null, trial_period_days = null)
    __obj.updateDynamic("object")("plan")
    __obj.asInstanceOf[ResponsePlan]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ResponsePlan] (val x: Self) extends AnyVal {
    
    inline def setActive(value: Boolean): Self = StObject.set(x, "active", value.asInstanceOf[js.Any])
    
    inline def setAggregate_usage(value: AggregateUsage): Self = StObject.set(x, "aggregate_usage", value.asInstanceOf[js.Any])
    
    inline def setAggregate_usageNull: Self = StObject.set(x, "aggregate_usage", null)
    
    inline def setAmount(value: Double): Self = StObject.set(x, "amount", value.asInstanceOf[js.Any])
    
    inline def setAmountNull: Self = StObject.set(x, "amount", null)
    
    inline def setAmount_decimal(value: String): Self = StObject.set(x, "amount_decimal", value.asInstanceOf[js.Any])
    
    inline def setAmount_decimalNull: Self = StObject.set(x, "amount_decimal", null)
    
    inline def setBilling_scheme(value: BillingScheme): Self = StObject.set(x, "billing_scheme", value.asInstanceOf[js.Any])
    
    inline def setCreated(value: Double): Self = StObject.set(x, "created", value.asInstanceOf[js.Any])
    
    inline def setCurrency(value: String): Self = StObject.set(x, "currency", value.asInstanceOf[js.Any])
    
    inline def setDeleted(value: Unit): Self = StObject.set(x, "deleted", value.asInstanceOf[js.Any])
    
    inline def setDeletedUndefined: Self = StObject.set(x, "deleted", js.undefined)
    
    inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setInterval(value: Interval): Self = StObject.set(x, "interval", value.asInstanceOf[js.Any])
    
    inline def setInterval_count(value: Double): Self = StObject.set(x, "interval_count", value.asInstanceOf[js.Any])
    
    inline def setLastResponse(value: ApiVersion): Self = StObject.set(x, "lastResponse", value.asInstanceOf[js.Any])
    
    inline def setLivemode(value: Boolean): Self = StObject.set(x, "livemode", value.asInstanceOf[js.Any])
    
    inline def setMetadata(value: Metadata): Self = StObject.set(x, "metadata", value.asInstanceOf[js.Any])
    
    inline def setMetadataNull: Self = StObject.set(x, "metadata", null)
    
    inline def setNickname(value: String): Self = StObject.set(x, "nickname", value.asInstanceOf[js.Any])
    
    inline def setNicknameNull: Self = StObject.set(x, "nickname", null)
    
    inline def setObject(value: plan): Self = StObject.set(x, "object", value.asInstanceOf[js.Any])
    
    inline def setProduct(value: String | Product | DeletedProduct): Self = StObject.set(x, "product", value.asInstanceOf[js.Any])
    
    inline def setProductNull: Self = StObject.set(x, "product", null)
    
    inline def setTiers(value: js.Array[Tier]): Self = StObject.set(x, "tiers", value.asInstanceOf[js.Any])
    
    inline def setTiersUndefined: Self = StObject.set(x, "tiers", js.undefined)
    
    inline def setTiersVarargs(value: Tier*): Self = StObject.set(x, "tiers", js.Array(value*))
    
    inline def setTiers_mode(value: TiersMode): Self = StObject.set(x, "tiers_mode", value.asInstanceOf[js.Any])
    
    inline def setTiers_modeNull: Self = StObject.set(x, "tiers_mode", null)
    
    inline def setTransform_usage(value: TransformUsage): Self = StObject.set(x, "transform_usage", value.asInstanceOf[js.Any])
    
    inline def setTransform_usageNull: Self = StObject.set(x, "transform_usage", null)
    
    inline def setTrial_period_days(value: Double): Self = StObject.set(x, "trial_period_days", value.asInstanceOf[js.Any])
    
    inline def setTrial_period_daysNull: Self = StObject.set(x, "trial_period_days", null)
    
    inline def setUsage_type(value: UsageType): Self = StObject.set(x, "usage_type", value.asInstanceOf[js.Any])
  }
}

package typings
package stripeLib.stripeMod.StripeNs.plansNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A subscription plan contains the pricing information for different products and feature levels on your site.
  * For example, you might have a $10/month plan for basic features and a different $20/month plan for premium features.
  */
trait IPlan
  extends stripeLib.stripeMod.StripeNs.IResourceObject {
  /**
    * Whether the plan is currently available for new subscriptions.
    */
  var active: scala.Boolean
  /**
    * Specifies a usage aggregation strategy for plans of `usage_type=metered`. Allowed values are `sum` for summing up all usage during a period, `last_during_period` for picking the last usage record reported within a period, `last_ever` for picking the last usage record ever (across period bounds) or `max` which picks the usage record with the maximum reported usage during a period. Defaults to `sum`.
    */
  var aggregate_usage: stripeLib.stripeLibStrings.sum | stripeLib.stripeLibStrings.last_during_period | stripeLib.stripeLibStrings.last_ever | stripeLib.stripeLibStrings.max | scala.Null
  /**
    * The amount in cents to be charged on the interval specified
    */
  var amount: scala.Double
  /**
    * Describes how to compute the price per period. Either `per_unit` or `tiered`. `per_unit` indicates that the fixed amount (specified in `amount`) will be charged per unit in `quantity` (for plans with `usage_type=licensed`), or per unit of total usage (for plans with `usage_type=metered`). `tiered` indicates that the unit pricing will be computed using a tiering strategy as defined using the `tiers` and `tiers_mode` attributes.
    */
  var billing_scheme: stripeLib.stripeLibStrings.per_unit | stripeLib.stripeLibStrings.tiered
  /**
    * Time at which the object was created. Measured in seconds since the Unix epoch.
    */
  var created: scala.Double
  /**
    * Three-letter ISO currency code, in lowercase. Must be a supported currency.
    */
  var currency: java.lang.String
  /**
    * One of `day`, `week`, `month` or `year`. The frequency with which a subscription should be billed.
    */
  var interval: IntervalUnit
  /**
    * The number of intervals (specified in the `interval` property) between subscription billings. For example, `interval=month` and `interval_count=3` bills every 3 months.
    */
  var interval_count: scala.Double
  /**
    * Has the value `true` if the object exists in live mode or the value `false` if the object exists in test mode.
    */
  var livemode: scala.Boolean
  /**
    * Set of key-value pairs that you can attach to an object. This can be useful for storing additional information about the object in a structured format.
    */
  var metadata: stripeLib.stripeMod.StripeNs.IMetadata
  /**
    * A brief description of the plan, hidden from customers.
    */
  var nickname: java.lang.String | scala.Null
  /**
    * Value is "plan"
    */
  @JSName("object")
  var object_IPlan: stripeLib.stripeLibStrings.plan
  /**
    * The product whose pricing this plan determines. [Expandable]
    */
  var product: js.UndefOr[java.lang.String | stripeLib.stripeMod.StripeNs.productsNs.IProduct] = js.undefined
  /**
    * Each element represents a pricing tier. This parameter requires `billing_scheme` to be set to `tiered`. See also the documentation for `billing_scheme`.
    */
  var tiers: js.Array[ITier] | scala.Null
  /**
    * Defines if the tiering price should be `graduated` or `volume` based. In `volume`-based tiering, the maximum quantity within a period determines the per unit price, in `graduated` tiering pricing can successively change as the quantity grows.
    */
  var tiers_mode: stripeLib.stripeLibStrings.graduated | stripeLib.stripeLibStrings.volume | scala.Null
  /**
    * Apply a transformation to the reported usage or set quantity before computing the billed price. Cannot be combined with `tiers`.
    */
  var transform_usage: ITransformUsage | scala.Null
  /**
    * Default number of trial days when subscribing a customer to this plan using `trial_from_plan=true`.
    */
  var trial_period_days: scala.Double
  /**
    * Configures how the quantity per period should be determined, can be either `metered` or `licensed`. `licensed` will automatically bill the `quantity` set for a plan when adding it to a subscription, `metered` will aggregate the total usage based on usage records. Defaults to `licensed`.
    */
  var usage_type: stripeLib.stripeLibStrings.metered | stripeLib.stripeLibStrings.licensed
}


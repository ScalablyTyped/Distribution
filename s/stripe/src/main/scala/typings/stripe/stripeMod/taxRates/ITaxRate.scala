package typings.stripe.stripeMod.taxRates

import typings.stripe.stripeMod.IMetadata
import typings.stripe.stripeMod.IResourceObject
import typings.stripe.stripeStrings.tax_rate
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Tax rates can be applied to invoices and subscriptions to collect tax.
  */
trait ITaxRate extends IResourceObject {
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
  @scala.inline
  def apply(
    active: Boolean,
    id: String,
    inclusive: Boolean,
    livemode: Boolean,
    metadata: IMetadata,
    `object`: tax_rate,
    created: Int | Double = null,
    description: String = null,
    display_name: String = null,
    jurisdiction: String = null,
    percentage: Int | Double = null
  ): ITaxRate = {
    val __obj = js.Dynamic.literal(active = active, id = id, inclusive = inclusive, livemode = livemode, metadata = metadata)
    __obj.updateDynamic("object")(`object`)
    if (created != null) __obj.updateDynamic("created")(created.asInstanceOf[js.Any])
    if (description != null) __obj.updateDynamic("description")(description)
    if (display_name != null) __obj.updateDynamic("display_name")(display_name)
    if (jurisdiction != null) __obj.updateDynamic("jurisdiction")(jurisdiction)
    if (percentage != null) __obj.updateDynamic("percentage")(percentage.asInstanceOf[js.Any])
    __obj.asInstanceOf[ITaxRate]
  }
}


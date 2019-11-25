package typings.stripe.stripeMod.taxRates

import typings.stripe.stripeMod.IOptionsMetadata
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ITaxRateCreationOptions extends js.Object {
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
  @scala.inline
  def apply(
    display_name: String,
    inclusive: Boolean,
    percentage: Double,
    active: js.UndefOr[Boolean] = js.undefined,
    description: String = null,
    jurisdiction: String = null,
    metadata: IOptionsMetadata = null
  ): ITaxRateCreationOptions = {
    val __obj = js.Dynamic.literal(display_name = display_name.asInstanceOf[js.Any], inclusive = inclusive.asInstanceOf[js.Any], percentage = percentage.asInstanceOf[js.Any])
    if (!js.isUndefined(active)) __obj.updateDynamic("active")(active.asInstanceOf[js.Any])
    if (description != null) __obj.updateDynamic("description")(description.asInstanceOf[js.Any])
    if (jurisdiction != null) __obj.updateDynamic("jurisdiction")(jurisdiction.asInstanceOf[js.Any])
    if (metadata != null) __obj.updateDynamic("metadata")(metadata.asInstanceOf[js.Any])
    __obj.asInstanceOf[ITaxRateCreationOptions]
  }
}


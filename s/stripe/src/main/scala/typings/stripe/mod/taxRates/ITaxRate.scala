package typings.stripe.mod.taxRates

import typings.stripe.mod.IMetadata
import typings.stripe.mod.IResourceObject
import typings.stripe.stripeStrings.tax_rate
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

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
  implicit class ITaxRateOps[Self <: ITaxRate] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setActive(value: Boolean): Self = this.set("active", value.asInstanceOf[js.Any])
    @scala.inline
    def setInclusive(value: Boolean): Self = this.set("inclusive", value.asInstanceOf[js.Any])
    @scala.inline
    def setLivemode(value: Boolean): Self = this.set("livemode", value.asInstanceOf[js.Any])
    @scala.inline
    def setMetadata(value: IMetadata): Self = this.set("metadata", value.asInstanceOf[js.Any])
    @scala.inline
    def setObject(value: tax_rate): Self = this.set("object", value.asInstanceOf[js.Any])
    @scala.inline
    def setCreated(value: Double): Self = this.set("created", value.asInstanceOf[js.Any])
    @scala.inline
    def setCreatedNull: Self = this.set("created", null)
    @scala.inline
    def setDescription(value: String): Self = this.set("description", value.asInstanceOf[js.Any])
    @scala.inline
    def setDescriptionNull: Self = this.set("description", null)
    @scala.inline
    def setDisplay_name(value: String): Self = this.set("display_name", value.asInstanceOf[js.Any])
    @scala.inline
    def setDisplay_nameNull: Self = this.set("display_name", null)
    @scala.inline
    def setJurisdiction(value: String): Self = this.set("jurisdiction", value.asInstanceOf[js.Any])
    @scala.inline
    def setJurisdictionNull: Self = this.set("jurisdiction", null)
    @scala.inline
    def setPercentage(value: Double): Self = this.set("percentage", value.asInstanceOf[js.Any])
    @scala.inline
    def setPercentageNull: Self = this.set("percentage", null)
  }
  
}


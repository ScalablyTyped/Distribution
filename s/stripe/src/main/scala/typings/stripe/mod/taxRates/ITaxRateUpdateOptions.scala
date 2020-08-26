package typings.stripe.mod.taxRates

import typings.stripe.mod.IOptionsMetadata
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ITaxRateUpdateOptions extends js.Object {
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
  implicit class ITaxRateUpdateOptionsOps[Self <: ITaxRateUpdateOptions] (val x: Self) extends AnyVal {
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
    def deleteActive: Self = this.set("active", js.undefined)
    @scala.inline
    def setDescription(value: String): Self = this.set("description", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDescription: Self = this.set("description", js.undefined)
    @scala.inline
    def setDisplay_name(value: String): Self = this.set("display_name", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDisplay_name: Self = this.set("display_name", js.undefined)
    @scala.inline
    def setJurisdiction(value: String): Self = this.set("jurisdiction", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteJurisdiction: Self = this.set("jurisdiction", js.undefined)
    @scala.inline
    def setMetadata(value: IOptionsMetadata): Self = this.set("metadata", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMetadata: Self = this.set("metadata", js.undefined)
  }
  
}


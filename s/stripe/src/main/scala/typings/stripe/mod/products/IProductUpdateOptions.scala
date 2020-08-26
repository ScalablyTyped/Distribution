package typings.stripe.mod.products

import typings.stripe.mod.IDataOptionsWithMetadata
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IProductUpdateOptions extends IDataOptionsWithMetadata {
  /**
    * Whether or not the product is available for purchase. Setting this to false also deactivates any active, related SKUs. Setting this to
    * true does not automatically activate any deactivated, related SKUs.
    */
  var active: js.UndefOr[Boolean] = js.native
  /**
    * A short one-line description of the product, meant to be displayable to the customer.
    */
  var caption: js.UndefOr[String] = js.native
  /**
    * An array of Connect application names or identifiers that should not be able to order the SKUs for this product. This can be unset
    * by updating the value to null and then saving.
    */
  var deactivate_on: js.UndefOr[js.Array[String]] = js.native
  /**
    * The product’s description, meant to be displayable to the customer.
    */
  var description: js.UndefOr[String] = js.native
  /**
    * A list of up to 8 URLs of images for this product, meant to be displayable to the customer. This can be unset by updating the value to
    * null and then saving.
    */
  var images: js.UndefOr[js.Array[String]] = js.native
  /**
    * The product’s name, meant to be displayable to the customer.
    */
  var name: js.UndefOr[String] = js.native
  /**
    * The dimensions of this product for shipping purposes. A SKU associated with this product can override this value by having its own
    * package_dimensions.
    */
  var package_dimensions: js.UndefOr[IPackageDimensions] = js.native
  /**
    * Whether this product is shipped (i.e. physical goods). Defaults to true.
    */
  var shippable: js.UndefOr[Boolean] = js.native
  /**
    * An arbitrary string to be displayed on your customer’s credit card statement. This may be up to 22 characters. The statement description
    * may not include <>”’ characters, and will appear on your customer’s statement in capital letters. Non-ASCII characters are automatically
    * stripped. While most banks display this information consistently, some may display it incorrectly or not at all.
    * May only be set if type=service.
    */
  var statement_descriptor: js.UndefOr[String] = js.native
  /**
    * A URL of a publicly-accessible webpage for this product.
    */
  var url: js.UndefOr[String] = js.native
}

object IProductUpdateOptions {
  @scala.inline
  def apply(): IProductUpdateOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IProductUpdateOptions]
  }
  @scala.inline
  implicit class IProductUpdateOptionsOps[Self <: IProductUpdateOptions] (val x: Self) extends AnyVal {
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
    def setCaption(value: String): Self = this.set("caption", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCaption: Self = this.set("caption", js.undefined)
    @scala.inline
    def setDeactivate_onVarargs(value: String*): Self = this.set("deactivate_on", js.Array(value :_*))
    @scala.inline
    def setDeactivate_on(value: js.Array[String]): Self = this.set("deactivate_on", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDeactivate_on: Self = this.set("deactivate_on", js.undefined)
    @scala.inline
    def setDescription(value: String): Self = this.set("description", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDescription: Self = this.set("description", js.undefined)
    @scala.inline
    def setImagesVarargs(value: String*): Self = this.set("images", js.Array(value :_*))
    @scala.inline
    def setImages(value: js.Array[String]): Self = this.set("images", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteImages: Self = this.set("images", js.undefined)
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    @scala.inline
    def setPackage_dimensions(value: IPackageDimensions): Self = this.set("package_dimensions", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePackage_dimensions: Self = this.set("package_dimensions", js.undefined)
    @scala.inline
    def setShippable(value: Boolean): Self = this.set("shippable", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteShippable: Self = this.set("shippable", js.undefined)
    @scala.inline
    def setStatement_descriptor(value: String): Self = this.set("statement_descriptor", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStatement_descriptor: Self = this.set("statement_descriptor", js.undefined)
    @scala.inline
    def setUrl(value: String): Self = this.set("url", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUrl: Self = this.set("url", js.undefined)
  }
  
}


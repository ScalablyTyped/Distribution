package typings.stripe.mod.products

import typings.stripe.mod.IDataOptionsWithMetadata
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IProductCreationOptions extends IDataOptionsWithMetadata {
  
  /**
    * Whether or not the product is currently available for purchase. Defaults to true. May only be set if type=good.
    */
  var active: js.UndefOr[Boolean] = js.native
  
  /**
    * A list of up to 5 alphanumeric attributes that each SKU can provide values for (e.g. ["color", "size"]).
    * Applicable to both service and good types.
    */
  var attributes: js.UndefOr[js.Array[String]] = js.native
  
  /**
    * A short one-line description of the product, meant to be displayable to the customer. May only be set if type=good.
    */
  var caption: js.UndefOr[String] = js.native
  
  /**
    * An array of Connect application names or identifiers that should not be able to order the SKUs for this product.
    * May only be set if type=good.
    */
  var deactivate_on: js.UndefOr[js.Array[String]] = js.native
  
  /**
    * The product’s description, meant to be displayable to the customer. May only be set if type=good.
    */
  var description: js.UndefOr[String] = js.native
  
  /**
    * The identifier for the product. Must be unique. If not provided, an identifier will be randomly generated.
    * Applicable to both service and good types.
    */
  var id: js.UndefOr[String] = js.native
  
  /**
    * A list of up to 8 URLs of images for this product, meant to be displayable to the customer. May only be set if type=good.
    */
  var images: js.UndefOr[js.Array[String]] = js.native
  
  /**
    * The product’s name, meant to be displayable to the customer.
    * Applicable to both service and good types.
    */
  var name: String = js.native
  
  /**
    * The dimensions of this product for shipping purposes. A SKU associated with this product can override this value by having its own
    * package_dimensions. May only be set if type=good.
    */
  var package_dimensions: js.UndefOr[IPackageDimensions] = js.native
  
  /**
    * Whether this product is shipped (i.e. physical goods). Defaults to true. May only be set if type=good.
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
    * The type of the product. Defaults to `service` if not explicitly specified, enabling use of this product
    * withSubscriptions and Plans. Set this parameter to `good` to use this product with Orders and SKUs. On API
    * versions before `2018-02-05`, this field defaults to `good` for compatibility reasons.
    */
  var `type`: js.UndefOr[ProductType] = js.native
  
  /**
    * A label that represents units of this product, such as seat(s), in Stripe and on customers’ receipts and invoices.
    * Only available on products of type=service.
    */
  var unit_label: js.UndefOr[String] = js.native
  
  /**
    * A URL of a publicly-accessible webpage for this product. May only be set if type=good.
    */
  var url: js.UndefOr[String] = js.native
}
object IProductCreationOptions {
  
  @scala.inline
  def apply(name: String): IProductCreationOptions = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[IProductCreationOptions]
  }
  
  @scala.inline
  implicit class IProductCreationOptionsOps[Self <: IProductCreationOptions] (val x: Self) extends AnyVal {
    
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
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setActive(value: Boolean): Self = this.set("active", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteActive: Self = this.set("active", js.undefined)
    
    @scala.inline
    def setAttributesVarargs(value: String*): Self = this.set("attributes", js.Array(value :_*))
    
    @scala.inline
    def setAttributes(value: js.Array[String]): Self = this.set("attributes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAttributes: Self = this.set("attributes", js.undefined)
    
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
    def setId(value: String): Self = this.set("id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteId: Self = this.set("id", js.undefined)
    
    @scala.inline
    def setImagesVarargs(value: String*): Self = this.set("images", js.Array(value :_*))
    
    @scala.inline
    def setImages(value: js.Array[String]): Self = this.set("images", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteImages: Self = this.set("images", js.undefined)
    
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
    def setType(value: ProductType): Self = this.set("type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteType: Self = this.set("type", js.undefined)
    
    @scala.inline
    def setUnit_label(value: String): Self = this.set("unit_label", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUnit_label: Self = this.set("unit_label", js.undefined)
    
    @scala.inline
    def setUrl(value: String): Self = this.set("url", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUrl: Self = this.set("url", js.undefined)
  }
}

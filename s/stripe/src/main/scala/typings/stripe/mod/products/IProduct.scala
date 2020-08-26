package typings.stripe.mod.products

import typings.stripe.mod.IList
import typings.stripe.mod.IMetadata
import typings.stripe.mod.IResourceObject
import typings.stripe.mod.skus.ISku
import typings.stripe.stripeStrings.product
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IProduct extends IResourceObject {
  /**
    * Whether or not the product is currently available for purchase.
    */
  var active: Boolean = js.native
  /**
    * A list of up to 5 attributes that each SKU can provide values for (e.g. ["color", "size"]).
    */
  var attributes: js.Array[String] = js.native
  /**
    * A short one-line description of the product, meant to be displayable to the customer.
    */
  var caption: String = js.native
  /**
    * Time at which the object was created. Measured in seconds since the Unix epoch.
    */
  var created: Double = js.native
  /**
    * An array of connect application identifiers that cannot purchase this product.
    */
  var deactivated_on: js.Array[String] = js.native
  /**
    * The product’s description, meant to be displayable to the customer.
    */
  var description: String = js.native
  /**
    * A list of up to 8 URLs of images for this product, meant to be displayable to the customer.
    */
  var images: js.Array[String] = js.native
  var livemode: Boolean = js.native
  var metadata: IMetadata = js.native
  /**
    * The product’s name, meant to be displayable to the customer.
    */
  var name: String = js.native
  /**
    * Value is "product"
    */
  @JSName("object")
  var object_IProduct: product = js.native
  var package_dimensions: IPackageDimensions = js.native
  /**
    * Whether this product is a shipped good.
    */
  var shippable: Boolean = js.native
  /**
    * A sublist of active SKUs associated with this product.
    */
  var skus: IList[ISku] = js.native
  /**
    * Extra information about a product which will appear on your customer’s credit card statement. In the case that multiple products are billed
    * at once, the first statement descriptor will be used. Only available on products of type=service.
    */
  var statement_descriptor: String = js.native
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
  var updated: Double = js.native
  /**
    * A URL of a publicly-accessible webpage for this product.
    */
  var url: String = js.native
}

object IProduct {
  @scala.inline
  def apply(
    active: Boolean,
    attributes: js.Array[String],
    caption: String,
    created: Double,
    deactivated_on: js.Array[String],
    description: String,
    id: String,
    images: js.Array[String],
    livemode: Boolean,
    metadata: IMetadata,
    name: String,
    `object`: product,
    package_dimensions: IPackageDimensions,
    shippable: Boolean,
    skus: IList[ISku],
    statement_descriptor: String,
    updated: Double,
    url: String
  ): IProduct = {
    val __obj = js.Dynamic.literal(active = active.asInstanceOf[js.Any], attributes = attributes.asInstanceOf[js.Any], caption = caption.asInstanceOf[js.Any], created = created.asInstanceOf[js.Any], deactivated_on = deactivated_on.asInstanceOf[js.Any], description = description.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], images = images.asInstanceOf[js.Any], livemode = livemode.asInstanceOf[js.Any], metadata = metadata.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], package_dimensions = package_dimensions.asInstanceOf[js.Any], shippable = shippable.asInstanceOf[js.Any], skus = skus.asInstanceOf[js.Any], statement_descriptor = statement_descriptor.asInstanceOf[js.Any], updated = updated.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
    __obj.updateDynamic("object")(`object`.asInstanceOf[js.Any])
    __obj.asInstanceOf[IProduct]
  }
  @scala.inline
  implicit class IProductOps[Self <: IProduct] (val x: Self) extends AnyVal {
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
    def setAttributesVarargs(value: String*): Self = this.set("attributes", js.Array(value :_*))
    @scala.inline
    def setAttributes(value: js.Array[String]): Self = this.set("attributes", value.asInstanceOf[js.Any])
    @scala.inline
    def setCaption(value: String): Self = this.set("caption", value.asInstanceOf[js.Any])
    @scala.inline
    def setCreated(value: Double): Self = this.set("created", value.asInstanceOf[js.Any])
    @scala.inline
    def setDeactivated_onVarargs(value: String*): Self = this.set("deactivated_on", js.Array(value :_*))
    @scala.inline
    def setDeactivated_on(value: js.Array[String]): Self = this.set("deactivated_on", value.asInstanceOf[js.Any])
    @scala.inline
    def setDescription(value: String): Self = this.set("description", value.asInstanceOf[js.Any])
    @scala.inline
    def setImagesVarargs(value: String*): Self = this.set("images", js.Array(value :_*))
    @scala.inline
    def setImages(value: js.Array[String]): Self = this.set("images", value.asInstanceOf[js.Any])
    @scala.inline
    def setLivemode(value: Boolean): Self = this.set("livemode", value.asInstanceOf[js.Any])
    @scala.inline
    def setMetadata(value: IMetadata): Self = this.set("metadata", value.asInstanceOf[js.Any])
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def setObject(value: product): Self = this.set("object", value.asInstanceOf[js.Any])
    @scala.inline
    def setPackage_dimensions(value: IPackageDimensions): Self = this.set("package_dimensions", value.asInstanceOf[js.Any])
    @scala.inline
    def setShippable(value: Boolean): Self = this.set("shippable", value.asInstanceOf[js.Any])
    @scala.inline
    def setSkus(value: IList[ISku]): Self = this.set("skus", value.asInstanceOf[js.Any])
    @scala.inline
    def setStatement_descriptor(value: String): Self = this.set("statement_descriptor", value.asInstanceOf[js.Any])
    @scala.inline
    def setUpdated(value: Double): Self = this.set("updated", value.asInstanceOf[js.Any])
    @scala.inline
    def setUrl(value: String): Self = this.set("url", value.asInstanceOf[js.Any])
    @scala.inline
    def setType(value: ProductType): Self = this.set("type", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteType: Self = this.set("type", js.undefined)
    @scala.inline
    def setUnit_label(value: String): Self = this.set("unit_label", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUnit_label: Self = this.set("unit_label", js.undefined)
  }
  
}


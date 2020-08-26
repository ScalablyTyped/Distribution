package typings.stripe.mod.skus

import typings.stripe.mod.IMetadata
import typings.stripe.mod.IResourceObject
import typings.stripe.mod.products.IPackageDimensions
import typings.stripe.mod.products.IProduct
import typings.stripe.stripeStrings.sku
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ISku extends IResourceObject {
  /**
    * Whether or not the SKU is available for purchase.
    */
  var active: Boolean = js.native
  var attributes: ISkuAttributes = js.native
  var created: Double = js.native
  /**
    * 3-letter ISO code for currency.
    */
  var currency: String = js.native
  /**
    * The URL of an image for this SKU, meant to be displayable to the customer.
    */
  var image: String = js.native
  var inventory: IInventory = js.native
  var livemode: Boolean = js.native
  var metadata: IMetadata = js.native
  /**
    * Value is "sku"
    */
  @JSName("object")
  var object_ISku: sku = js.native
  /**
    * The dimensions of this SKU for shipping purposes.
    */
  var package_dimensions: IPackageDimensions = js.native
  /**
    * The cost of the item as a positive integer in the smallest currency unit (that is, 100 cents to charge $1.00, or 1 to charge ¥1,
    * Japanese Yen being a 0-decimal currency).
    */
  var price: Double = js.native
  /**
    * The ID of the product this SKU is associated with. The product must be currently active. [Expandable]
    */
  var product: String | IProduct = js.native
  var updated: Double = js.native
}

object ISku {
  @scala.inline
  def apply(
    active: Boolean,
    attributes: ISkuAttributes,
    created: Double,
    currency: String,
    id: String,
    image: String,
    inventory: IInventory,
    livemode: Boolean,
    metadata: IMetadata,
    `object`: sku,
    package_dimensions: IPackageDimensions,
    price: Double,
    product: String | IProduct,
    updated: Double
  ): ISku = {
    val __obj = js.Dynamic.literal(active = active.asInstanceOf[js.Any], attributes = attributes.asInstanceOf[js.Any], created = created.asInstanceOf[js.Any], currency = currency.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], image = image.asInstanceOf[js.Any], inventory = inventory.asInstanceOf[js.Any], livemode = livemode.asInstanceOf[js.Any], metadata = metadata.asInstanceOf[js.Any], package_dimensions = package_dimensions.asInstanceOf[js.Any], price = price.asInstanceOf[js.Any], product = product.asInstanceOf[js.Any], updated = updated.asInstanceOf[js.Any])
    __obj.updateDynamic("object")(`object`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ISku]
  }
  @scala.inline
  implicit class ISkuOps[Self <: ISku] (val x: Self) extends AnyVal {
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
    def setAttributes(value: ISkuAttributes): Self = this.set("attributes", value.asInstanceOf[js.Any])
    @scala.inline
    def setCreated(value: Double): Self = this.set("created", value.asInstanceOf[js.Any])
    @scala.inline
    def setCurrency(value: String): Self = this.set("currency", value.asInstanceOf[js.Any])
    @scala.inline
    def setImage(value: String): Self = this.set("image", value.asInstanceOf[js.Any])
    @scala.inline
    def setInventory(value: IInventory): Self = this.set("inventory", value.asInstanceOf[js.Any])
    @scala.inline
    def setLivemode(value: Boolean): Self = this.set("livemode", value.asInstanceOf[js.Any])
    @scala.inline
    def setMetadata(value: IMetadata): Self = this.set("metadata", value.asInstanceOf[js.Any])
    @scala.inline
    def setObject(value: sku): Self = this.set("object", value.asInstanceOf[js.Any])
    @scala.inline
    def setPackage_dimensions(value: IPackageDimensions): Self = this.set("package_dimensions", value.asInstanceOf[js.Any])
    @scala.inline
    def setPrice(value: Double): Self = this.set("price", value.asInstanceOf[js.Any])
    @scala.inline
    def setProduct(value: String | IProduct): Self = this.set("product", value.asInstanceOf[js.Any])
    @scala.inline
    def setUpdated(value: Double): Self = this.set("updated", value.asInstanceOf[js.Any])
  }
  
}


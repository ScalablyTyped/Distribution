package typings.stripe.stripeMod.skusNs

import typings.stripe.stripeMod.IMetadata
import typings.stripe.stripeMod.IResourceObject
import typings.stripe.stripeMod.productsNs.IPackageDimensions
import typings.stripe.stripeMod.productsNs.IProduct
import typings.stripe.stripeStrings.sku
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ISku extends IResourceObject {
  /**
    * Whether or not the SKU is available for purchase.
    */
  var active: Boolean
  var attributes: ISkuAttributes
  var created: Double
  /**
    * 3-letter ISO code for currency.
    */
  var currency: String
  /**
    * The URL of an image for this SKU, meant to be displayable to the customer.
    */
  var image: String
  var inventory: IInventory
  var livemode: Boolean
  var metadata: IMetadata
  /**
    * Value is "sku"
    */
  @JSName("object")
  var object_ISku: sku
  /**
    * The dimensions of this SKU for shipping purposes.
    */
  var package_dimensions: IPackageDimensions
  /**
    * The cost of the item as a positive integer in the smallest currency unit (that is, 100 cents to charge $1.00, or 1 to charge ¥1,
    * Japanese Yen being a 0-decimal currency).
    */
  var price: Double
  /**
    * The ID of the product this SKU is associated with. The product must be currently active. [Expandable]
    */
  var product: String | IProduct
  var updated: Double
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
    val __obj = js.Dynamic.literal(active = active, attributes = attributes, created = created, currency = currency, id = id, image = image, inventory = inventory, livemode = livemode, metadata = metadata, package_dimensions = package_dimensions, price = price, product = product.asInstanceOf[js.Any], updated = updated)
    __obj.updateDynamic("object")(`object`)
    __obj.asInstanceOf[ISku]
  }
}


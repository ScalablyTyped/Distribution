package typings
package stripeLib.stripeMod.StripeNs.skusNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ISku
  extends stripeLib.stripeMod.StripeNs.IResourceObject {
  /**
    * Whether or not the SKU is available for purchase.
    */
  var active: scala.Boolean
  var attributes: ISkuAttributes
  var created: scala.Double
  /**
    * 3-letter ISO code for currency.
    */
  var currency: java.lang.String
  /**
    * The URL of an image for this SKU, meant to be displayable to the customer.
    */
  var image: java.lang.String
  var inventory: IInventory
  var livemode: scala.Boolean
  var metadata: stripeLib.stripeMod.StripeNs.IMetadata
  /**
    * Value is "sku"
    */
  @JSName("object")
  var object_ISku: stripeLib.stripeLibStrings.sku
  /**
    * The dimensions of this SKU for shipping purposes.
    */
  var package_dimensions: stripeLib.stripeMod.StripeNs.productsNs.IPackageDimensions
  /**
    * The cost of the item as a positive integer in the smallest currency unit (that is, 100 cents to charge $1.00, or 1 to charge ¥1,
    * Japanese Yen being a 0-decimal currency).
    */
  var price: scala.Double
  /**
    * The ID of the product this SKU is associated with. The product must be currently active. [Expandable]
    */
  var product: java.lang.String | stripeLib.stripeMod.StripeNs.productsNs.IProduct
  var updated: scala.Double
}

object ISku {
  @scala.inline
  def apply(
    active: scala.Boolean,
    attributes: ISkuAttributes,
    created: scala.Double,
    currency: java.lang.String,
    id: java.lang.String,
    image: java.lang.String,
    inventory: IInventory,
    livemode: scala.Boolean,
    metadata: stripeLib.stripeMod.StripeNs.IMetadata,
    `object`: stripeLib.stripeLibStrings.sku,
    package_dimensions: stripeLib.stripeMod.StripeNs.productsNs.IPackageDimensions,
    price: scala.Double,
    product: java.lang.String | stripeLib.stripeMod.StripeNs.productsNs.IProduct,
    updated: scala.Double
  ): ISku = {
    val __obj = js.Dynamic.literal(active = active, attributes = attributes, created = created, currency = currency, id = id, image = image, inventory = inventory, livemode = livemode, metadata = metadata, package_dimensions = package_dimensions, price = price, product = product.asInstanceOf[js.Any], updated = updated)
    __obj.updateDynamic("object")(`object`)
    __obj.asInstanceOf[ISku]
  }
}


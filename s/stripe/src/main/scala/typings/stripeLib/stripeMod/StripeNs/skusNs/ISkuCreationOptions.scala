package typings
package stripeLib.stripeMod.StripeNs.skusNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ISkuCreationOptions
  extends stripeLib.stripeMod.StripeNs.IDataOptionsWithMetadata {
  /**
    * Whether or not the SKU is available for purchase. Default to true.
    */
  var active: js.UndefOr[scala.Boolean] = js.undefined
  var attributes: js.UndefOr[ISkuAttributes] = js.undefined
  /**
    * 3-letter ISO code for currency.
    */
  var currency: java.lang.String
  /**
    * The identifier for the SKU. Must be unique. If not provided, an identifier will be randomly generated.
    */
  var id: js.UndefOr[java.lang.String] = js.undefined
  /**
    * The URL of an image for this SKU, meant to be displayable to the customer.
    */
  var image: js.UndefOr[java.lang.String] = js.undefined
  var inventory: IInventory
  /**
    * The dimensions of this SKU for shipping purposes.
    */
  var package_dimensions: js.UndefOr[stripeLib.stripeMod.StripeNs.productsNs.IPackageDimensions] = js.undefined
  /**
    * The cost of the item as a nonnegative integer in the smallest currency unit (that is, 100 cents to charge $1.00, or 1 to charge ¥1,
    * Japanese Yen being a 0-decimal currency).
    */
  var price: scala.Double
  /**
    * The ID of the product this SKU is associated with.
    */
  var product: java.lang.String
}

object ISkuCreationOptions {
  @scala.inline
  def apply(
    currency: java.lang.String,
    inventory: IInventory,
    price: scala.Double,
    product: java.lang.String,
    active: js.UndefOr[scala.Boolean] = js.undefined,
    attributes: ISkuAttributes = null,
    expand: js.Array[java.lang.String] = null,
    id: java.lang.String = null,
    image: java.lang.String = null,
    include: js.Array[java.lang.String] = null,
    metadata: stripeLib.stripeMod.StripeNs.IOptionsMetadata = null,
    package_dimensions: stripeLib.stripeMod.StripeNs.productsNs.IPackageDimensions = null
  ): ISkuCreationOptions = {
    val __obj = js.Dynamic.literal(currency = currency, inventory = inventory, price = price, product = product)
    if (!js.isUndefined(active)) __obj.updateDynamic("active")(active)
    if (attributes != null) __obj.updateDynamic("attributes")(attributes)
    if (expand != null) __obj.updateDynamic("expand")(expand)
    if (id != null) __obj.updateDynamic("id")(id)
    if (image != null) __obj.updateDynamic("image")(image)
    if (include != null) __obj.updateDynamic("include")(include)
    if (metadata != null) __obj.updateDynamic("metadata")(metadata)
    if (package_dimensions != null) __obj.updateDynamic("package_dimensions")(package_dimensions)
    __obj.asInstanceOf[ISkuCreationOptions]
  }
}


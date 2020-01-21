package typings.stripe.mod.skus

import typings.stripe.mod.IDataOptionsWithMetadata
import typings.stripe.mod.IOptionsMetadata
import typings.stripe.mod.products.IPackageDimensions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ISkuUpdateOptions extends IDataOptionsWithMetadata {
  /**
    * Whether or not the SKU is available for purchase.
    */
  var active: js.UndefOr[Boolean] = js.undefined
  /**
    * 3-letter ISO code for currency.
    */
  var currency: js.UndefOr[String] = js.undefined
  /**
    * The URL of an image for this SKU, meant to be displayable to the customer.
    * This can be unset by updating the value to null and then saving.
    */
  var image: js.UndefOr[String] = js.undefined
  var inventory: js.UndefOr[IInventory] = js.undefined
  /**
    * The dimensions of this SKU for shipping purposes.
    */
  var package_dimensions: js.UndefOr[IPackageDimensions] = js.undefined
  /**
    * The cost of the item as a nonnegative integer in the smallest currency unit (that is, 100 cents to charge $1.00, or 1 to charge ¥1,
    * Japanese Yen being a 0-decimal currency).
    */
  var price: js.UndefOr[Double] = js.undefined
  /**
    * The ID of the product this SKU is associated with.
    */
  var product: js.UndefOr[String] = js.undefined
}

object ISkuUpdateOptions {
  @scala.inline
  def apply(
    active: js.UndefOr[Boolean] = js.undefined,
    currency: String = null,
    expand: js.Array[String] = null,
    image: String = null,
    include: js.Array[String] = null,
    inventory: IInventory = null,
    metadata: IOptionsMetadata = null,
    package_dimensions: IPackageDimensions = null,
    price: Int | Double = null,
    product: String = null
  ): ISkuUpdateOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(active)) __obj.updateDynamic("active")(active.asInstanceOf[js.Any])
    if (currency != null) __obj.updateDynamic("currency")(currency.asInstanceOf[js.Any])
    if (expand != null) __obj.updateDynamic("expand")(expand.asInstanceOf[js.Any])
    if (image != null) __obj.updateDynamic("image")(image.asInstanceOf[js.Any])
    if (include != null) __obj.updateDynamic("include")(include.asInstanceOf[js.Any])
    if (inventory != null) __obj.updateDynamic("inventory")(inventory.asInstanceOf[js.Any])
    if (metadata != null) __obj.updateDynamic("metadata")(metadata.asInstanceOf[js.Any])
    if (package_dimensions != null) __obj.updateDynamic("package_dimensions")(package_dimensions.asInstanceOf[js.Any])
    if (price != null) __obj.updateDynamic("price")(price.asInstanceOf[js.Any])
    if (product != null) __obj.updateDynamic("product")(product.asInstanceOf[js.Any])
    __obj.asInstanceOf[ISkuUpdateOptions]
  }
}


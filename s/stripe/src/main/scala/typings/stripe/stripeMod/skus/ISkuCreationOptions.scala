package typings.stripe.stripeMod.skus

import typings.stripe.stripeMod.IDataOptionsWithMetadata
import typings.stripe.stripeMod.IOptionsMetadata
import typings.stripe.stripeMod.products.IPackageDimensions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ISkuCreationOptions extends IDataOptionsWithMetadata {
  /**
    * Whether or not the SKU is available for purchase. Default to true.
    */
  var active: js.UndefOr[Boolean] = js.undefined
  var attributes: js.UndefOr[ISkuAttributes] = js.undefined
  /**
    * 3-letter ISO code for currency.
    */
  var currency: String
  /**
    * The identifier for the SKU. Must be unique. If not provided, an identifier will be randomly generated.
    */
  var id: js.UndefOr[String] = js.undefined
  /**
    * The URL of an image for this SKU, meant to be displayable to the customer.
    */
  var image: js.UndefOr[String] = js.undefined
  var inventory: IInventory
  /**
    * The dimensions of this SKU for shipping purposes.
    */
  var package_dimensions: js.UndefOr[IPackageDimensions] = js.undefined
  /**
    * The cost of the item as a nonnegative integer in the smallest currency unit (that is, 100 cents to charge $1.00, or 1 to charge ¥1,
    * Japanese Yen being a 0-decimal currency).
    */
  var price: Double
  /**
    * The ID of the product this SKU is associated with.
    */
  var product: String
}

object ISkuCreationOptions {
  @scala.inline
  def apply(
    currency: String,
    inventory: IInventory,
    price: Double,
    product: String,
    active: js.UndefOr[Boolean] = js.undefined,
    attributes: ISkuAttributes = null,
    expand: js.Array[String] = null,
    id: String = null,
    image: String = null,
    include: js.Array[String] = null,
    metadata: IOptionsMetadata = null,
    package_dimensions: IPackageDimensions = null
  ): ISkuCreationOptions = {
    val __obj = js.Dynamic.literal(currency = currency.asInstanceOf[js.Any], inventory = inventory.asInstanceOf[js.Any], price = price.asInstanceOf[js.Any], product = product.asInstanceOf[js.Any])
    if (!js.isUndefined(active)) __obj.updateDynamic("active")(active.asInstanceOf[js.Any])
    if (attributes != null) __obj.updateDynamic("attributes")(attributes.asInstanceOf[js.Any])
    if (expand != null) __obj.updateDynamic("expand")(expand.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (image != null) __obj.updateDynamic("image")(image.asInstanceOf[js.Any])
    if (include != null) __obj.updateDynamic("include")(include.asInstanceOf[js.Any])
    if (metadata != null) __obj.updateDynamic("metadata")(metadata.asInstanceOf[js.Any])
    if (package_dimensions != null) __obj.updateDynamic("package_dimensions")(package_dimensions.asInstanceOf[js.Any])
    __obj.asInstanceOf[ISkuCreationOptions]
  }
}


package typings.stripe.stripeMod.productsNs

import typings.stripe.stripeMod.IDataOptionsWithMetadata
import typings.stripe.stripeMod.IOptionsMetadata
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IProductUpdateOptions extends IDataOptionsWithMetadata {
  /**
    * Whether or not the product is available for purchase. Setting this to false also deactivates any active, related SKUs. Setting this to
    * true does not automatically activate any deactivated, related SKUs.
    */
  var active: js.UndefOr[Boolean] = js.undefined
  /**
    * A short one-line description of the product, meant to be displayable to the customer.
    */
  var caption: js.UndefOr[String] = js.undefined
  /**
    * An array of Connect application names or identifiers that should not be able to order the SKUs for this product. This can be unset
    * by updating the value to null and then saving.
    */
  var deactivate_on: js.UndefOr[js.Array[String]] = js.undefined
  /**
    * The product’s description, meant to be displayable to the customer.
    */
  var description: js.UndefOr[String] = js.undefined
  /**
    * A list of up to 8 URLs of images for this product, meant to be displayable to the customer. This can be unset by updating the value to
    * null and then saving.
    */
  var images: js.UndefOr[js.Array[String]] = js.undefined
  /**
    * The product’s name, meant to be displayable to the customer.
    */
  var name: js.UndefOr[String] = js.undefined
  /**
    * The dimensions of this product for shipping purposes. A SKU associated with this product can override this value by having its own
    * package_dimensions.
    */
  var package_dimensions: js.UndefOr[IPackageDimensions] = js.undefined
  /**
    * Whether this product is shipped (i.e. physical goods). Defaults to true.
    */
  var shippable: js.UndefOr[Boolean] = js.undefined
  /**
    * An arbitrary string to be displayed on your customer’s credit card statement. This may be up to 22 characters. The statement description
    * may not include <>”’ characters, and will appear on your customer’s statement in capital letters. Non-ASCII characters are automatically
    * stripped. While most banks display this information consistently, some may display it incorrectly or not at all.
    * May only be set if type=service.
    */
  var statement_descriptor: js.UndefOr[String] = js.undefined
  /**
    * A URL of a publicly-accessible webpage for this product.
    */
  var url: js.UndefOr[String] = js.undefined
}

object IProductUpdateOptions {
  @scala.inline
  def apply(
    active: js.UndefOr[Boolean] = js.undefined,
    caption: String = null,
    deactivate_on: js.Array[String] = null,
    description: String = null,
    expand: js.Array[String] = null,
    images: js.Array[String] = null,
    include: js.Array[String] = null,
    metadata: IOptionsMetadata = null,
    name: String = null,
    package_dimensions: IPackageDimensions = null,
    shippable: js.UndefOr[Boolean] = js.undefined,
    statement_descriptor: String = null,
    url: String = null
  ): IProductUpdateOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(active)) __obj.updateDynamic("active")(active)
    if (caption != null) __obj.updateDynamic("caption")(caption)
    if (deactivate_on != null) __obj.updateDynamic("deactivate_on")(deactivate_on)
    if (description != null) __obj.updateDynamic("description")(description)
    if (expand != null) __obj.updateDynamic("expand")(expand)
    if (images != null) __obj.updateDynamic("images")(images)
    if (include != null) __obj.updateDynamic("include")(include)
    if (metadata != null) __obj.updateDynamic("metadata")(metadata)
    if (name != null) __obj.updateDynamic("name")(name)
    if (package_dimensions != null) __obj.updateDynamic("package_dimensions")(package_dimensions)
    if (!js.isUndefined(shippable)) __obj.updateDynamic("shippable")(shippable)
    if (statement_descriptor != null) __obj.updateDynamic("statement_descriptor")(statement_descriptor)
    if (url != null) __obj.updateDynamic("url")(url)
    __obj.asInstanceOf[IProductUpdateOptions]
  }
}


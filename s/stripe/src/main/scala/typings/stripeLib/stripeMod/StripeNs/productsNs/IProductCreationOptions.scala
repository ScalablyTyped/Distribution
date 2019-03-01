package typings
package stripeLib.stripeMod.StripeNs.productsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IProductCreationOptions
  extends stripeLib.stripeMod.StripeNs.IDataOptionsWithMetadata {
  /**
    * Whether or not the product is currently available for purchase. Defaults to true. May only be set if type=good.
    */
  var active: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * A list of up to 5 alphanumeric attributes that each SKU can provide values for (e.g. ["color", "size"]).
    * Applicable to both service and good types.
    */
  var attributes: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  /**
    * A short one-line description of the product, meant to be displayable to the customer. May only be set if type=good.
    */
  var caption: js.UndefOr[java.lang.String] = js.undefined
  /**
    * An array of Connect application names or identifiers that should not be able to order the SKUs for this product.
    * May only be set if type=good.
    */
  var deactivate_on: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  /**
    * The product’s description, meant to be displayable to the customer. May only be set if type=good.
    */
  var description: js.UndefOr[java.lang.String] = js.undefined
  /**
    * The identifier for the product. Must be unique. If not provided, an identifier will be randomly generated.
    * Applicable to both service and good types.
    */
  var id: js.UndefOr[java.lang.String] = js.undefined
  /**
    * A list of up to 8 URLs of images for this product, meant to be displayable to the customer. May only be set if type=good.
    */
  var images: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  /**
    * The product’s name, meant to be displayable to the customer.
    * Applicable to both service and good types.
    */
  var name: java.lang.String
  /**
    * The dimensions of this product for shipping purposes. A SKU associated with this product can override this value by having its own
    * package_dimensions. May only be set if type=good.
    */
  var package_dimensions: js.UndefOr[IPackageDimensions] = js.undefined
  /**
    * Whether this product is shipped (i.e. physical goods). Defaults to true. May only be set if type=good.
    */
  var shippable: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * An arbitrary string to be displayed on your customer’s credit card statement. This may be up to 22 characters. The statement description
    * may not include <>”’ characters, and will appear on your customer’s statement in capital letters. Non-ASCII characters are automatically
    * stripped. While most banks display this information consistently, some may display it incorrectly or not at all.
    * May only be set if type=service.
    */
  var statement_descriptor: js.UndefOr[java.lang.String] = js.undefined
  /**
    * The type of the product. The product is either of type service, which is eligible for use with Subscriptions
    * and Plans or good, which is eligible for use with Orders and SKUs.
    */
  var `type`: ProductType
  /**
    * A label that represents units of this product, such as seat(s), in Stripe and on customers’ receipts and invoices.
    * Only available on products of type=service.
    */
  var unit_label: js.UndefOr[java.lang.String] = js.undefined
  /**
    * A URL of a publicly-accessible webpage for this product. May only be set if type=good.
    */
  var url: js.UndefOr[java.lang.String] = js.undefined
}

object IProductCreationOptions {
  @scala.inline
  def apply(
    name: java.lang.String,
    `type`: ProductType,
    active: js.UndefOr[scala.Boolean] = js.undefined,
    attributes: js.Array[java.lang.String] = null,
    caption: java.lang.String = null,
    deactivate_on: js.Array[java.lang.String] = null,
    description: java.lang.String = null,
    expand: js.Array[java.lang.String] = null,
    id: java.lang.String = null,
    images: js.Array[java.lang.String] = null,
    include: js.Array[java.lang.String] = null,
    metadata: stripeLib.stripeMod.StripeNs.IOptionsMetadata = null,
    package_dimensions: IPackageDimensions = null,
    shippable: js.UndefOr[scala.Boolean] = js.undefined,
    statement_descriptor: java.lang.String = null,
    unit_label: java.lang.String = null,
    url: java.lang.String = null
  ): IProductCreationOptions = {
    val __obj = js.Dynamic.literal(`type` = `type`)
    __obj.updateDynamic("name")(name)
    if (!js.isUndefined(active)) __obj.updateDynamic("active")(active)
    if (attributes != null) __obj.updateDynamic("attributes")(attributes)
    if (caption != null) __obj.updateDynamic("caption")(caption)
    if (deactivate_on != null) __obj.updateDynamic("deactivate_on")(deactivate_on)
    if (description != null) __obj.updateDynamic("description")(description)
    if (expand != null) __obj.updateDynamic("expand")(expand)
    if (id != null) __obj.updateDynamic("id")(id)
    if (images != null) __obj.updateDynamic("images")(images)
    if (include != null) __obj.updateDynamic("include")(include)
    if (metadata != null) __obj.updateDynamic("metadata")(metadata)
    if (package_dimensions != null) __obj.updateDynamic("package_dimensions")(package_dimensions)
    if (!js.isUndefined(shippable)) __obj.updateDynamic("shippable")(shippable)
    if (statement_descriptor != null) __obj.updateDynamic("statement_descriptor")(statement_descriptor)
    if (unit_label != null) __obj.updateDynamic("unit_label")(unit_label)
    if (url != null) __obj.updateDynamic("url")(url)
    __obj.asInstanceOf[IProductCreationOptions]
  }
}


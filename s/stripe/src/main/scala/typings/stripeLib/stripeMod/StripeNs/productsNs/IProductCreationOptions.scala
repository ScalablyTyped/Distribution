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
               * A URL of a publicly-accessible webpage for this product. May only be set if type=good.
               */
  var url: js.UndefOr[java.lang.String] = js.undefined
}


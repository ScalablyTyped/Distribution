package typings
package stripeLib.stripeMod.StripeNs.productsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait IProductUpdateOptions
  extends stripeLib.stripeMod.StripeNs.IDataOptionsWithMetadata {
  /**
               * Whether or not the product is available for purchase. Setting this to false also deactivates any active, related SKUs. Setting this to
               * true does not automatically activate any deactivated, related SKUs.
               */
  var active: js.UndefOr[scala.Boolean] = js.undefined
  /**
               * A short one-line description of the product, meant to be displayable to the customer.
               */
  var caption: js.UndefOr[java.lang.String] = js.undefined
  /**
               * An array of Connect application names or identifiers that should not be able to order the SKUs for this product. This can be unset
               * by updating the value to null and then saving.
               */
  var deactivate_on: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  /**
               * The product’s description, meant to be displayable to the customer.
               */
  var description: js.UndefOr[java.lang.String] = js.undefined
  /**
               * A list of up to 8 URLs of images for this product, meant to be displayable to the customer. This can be unset by updating the value to
               * null and then saving.
               */
  var images: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  /**
               * The product’s name, meant to be displayable to the customer.
               */
  var name: js.UndefOr[java.lang.String] = js.undefined
  /**
               * The dimensions of this product for shipping purposes. A SKU associated with this product can override this value by having its own
               * package_dimensions.
               */
  var package_dimensions: js.UndefOr[IPackageDimensions] = js.undefined
  /**
               * Whether this product is shipped (i.e. physical goods). Defaults to true.
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
               * A URL of a publicly-accessible webpage for this product.
               */
  var url: js.UndefOr[java.lang.String] = js.undefined
}


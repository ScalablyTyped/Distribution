package typings
package stripeLib.stripeMod.StripeNs.productsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait IProduct
  extends stripeLib.stripeMod.StripeNs.IResourceObject {
  /**
               * Whether or not the product is currently available for purchase.
               */
  var active: scala.Boolean
  /**
               * A list of up to 5 attributes that each SKU can provide values for (e.g. ["color", "size"]).
               */
  var attributes: js.Array[java.lang.String]
  /**
               * A short one-line description of the product, meant to be displayable to the customer.
               */
  var caption: java.lang.String
  /**
               * Time at which the object was created. Measured in seconds since the Unix epoch.
               */
  var created: scala.Double
  /**
               * An array of connect application identifiers that cannot purchase this product.
               */
  var deactivated_on: js.Array[java.lang.String]
  /**
               * The product’s description, meant to be displayable to the customer.
               */
  var description: java.lang.String
  /**
               * A list of up to 8 URLs of images for this product, meant to be displayable to the customer.
               */
  var images: js.Array[java.lang.String]
  var livemode: scala.Boolean
  var metadata: stripeLib.stripeMod.StripeNs.IMetadata
  /**
               * The product’s name, meant to be displayable to the customer.
               */
  var name: java.lang.String
  /**
               * Value is "product"
               */
  @JSName("object")
  var object_IProduct: stripeLib.stripeLibStrings.product
  var package_dimensions: IPackageDimensions
  /**
               * Whether this product is a shipped good.
               */
  var shippable: scala.Boolean
  /**
               * A sublist of active SKUs associated with this product.
               */
  var skus: stripeLib.stripeMod.StripeNs.IList[stripeLib.stripeMod.StripeNs.skusNs.ISku]
  /**
               * Extra information about a product which will appear on your customer’s credit card statement. In the case that multiple products are billed
               * at once, the first statement descriptor will be used. Only available on products of type=service.
               */
  var statement_descriptor: java.lang.String
  /**
               * The type of the product. The product is either of type good, which is eligible for use with Orders and SKUs, or service, which is eligible for
               * use with Subscriptions and Plans.
               */
  var `type`: ProductType
  var updated: scala.Double
  /**
               * A URL of a publicly-accessible webpage for this product.
               */
  var url: java.lang.String
}


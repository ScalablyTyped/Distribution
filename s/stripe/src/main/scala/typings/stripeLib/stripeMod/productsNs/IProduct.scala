package typings
package stripeLib.stripeMod.productsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IProduct
  extends stripeLib.stripeMod.IResourceObject {
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
  var metadata: stripeLib.stripeMod.IMetadata
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
  var skus: stripeLib.stripeMod.IList[stripeLib.stripeMod.skusNs.ISku]
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

object IProduct {
  @scala.inline
  def apply(
    active: scala.Boolean,
    attributes: js.Array[java.lang.String],
    caption: java.lang.String,
    created: scala.Double,
    deactivated_on: js.Array[java.lang.String],
    description: java.lang.String,
    id: java.lang.String,
    images: js.Array[java.lang.String],
    livemode: scala.Boolean,
    metadata: stripeLib.stripeMod.IMetadata,
    name: java.lang.String,
    `object`: stripeLib.stripeLibStrings.product,
    package_dimensions: IPackageDimensions,
    shippable: scala.Boolean,
    skus: stripeLib.stripeMod.IList[stripeLib.stripeMod.skusNs.ISku],
    statement_descriptor: java.lang.String,
    `type`: ProductType,
    updated: scala.Double,
    url: java.lang.String
  ): IProduct = {
    val __obj = js.Dynamic.literal(active = active, attributes = attributes, caption = caption, created = created, deactivated_on = deactivated_on, description = description, id = id, images = images, livemode = livemode, metadata = metadata, name = name, package_dimensions = package_dimensions, shippable = shippable, skus = skus, statement_descriptor = statement_descriptor, updated = updated, url = url)
    __obj.updateDynamic("object")(`object`)
    __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[IProduct]
  }
}


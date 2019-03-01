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
    metadata: stripeLib.stripeMod.StripeNs.IMetadata,
    name: java.lang.String,
    `object`: stripeLib.stripeLibStrings.product,
    package_dimensions: IPackageDimensions,
    shippable: scala.Boolean,
    skus: stripeLib.stripeMod.StripeNs.IList[stripeLib.stripeMod.StripeNs.skusNs.ISku],
    statement_descriptor: java.lang.String,
    `type`: ProductType,
    updated: scala.Double,
    url: java.lang.String
  ): IProduct = {
    val __obj = js.Dynamic.literal(`object` = `object`, `type` = `type`)
    __obj.updateDynamic("active")(active)
    __obj.updateDynamic("attributes")(attributes)
    __obj.updateDynamic("caption")(caption)
    __obj.updateDynamic("created")(created)
    __obj.updateDynamic("deactivated_on")(deactivated_on)
    __obj.updateDynamic("description")(description)
    __obj.updateDynamic("id")(id)
    __obj.updateDynamic("images")(images)
    __obj.updateDynamic("livemode")(livemode)
    __obj.updateDynamic("metadata")(metadata)
    __obj.updateDynamic("name")(name)
    __obj.updateDynamic("package_dimensions")(package_dimensions)
    __obj.updateDynamic("shippable")(shippable)
    __obj.updateDynamic("skus")(skus)
    __obj.updateDynamic("statement_descriptor")(statement_descriptor)
    __obj.updateDynamic("updated")(updated)
    __obj.updateDynamic("url")(url)
    __obj.asInstanceOf[IProduct]
  }
}


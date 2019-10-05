package typings.stripe.stripeMod.products

import typings.stripe.stripeMod.IList
import typings.stripe.stripeMod.IMetadata
import typings.stripe.stripeMod.IResourceObject
import typings.stripe.stripeMod.skus.ISku
import typings.stripe.stripeStrings.product
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IProduct extends IResourceObject {
  /**
    * Whether or not the product is currently available for purchase.
    */
  var active: Boolean
  /**
    * A list of up to 5 attributes that each SKU can provide values for (e.g. ["color", "size"]).
    */
  var attributes: js.Array[String]
  /**
    * A short one-line description of the product, meant to be displayable to the customer.
    */
  var caption: String
  /**
    * Time at which the object was created. Measured in seconds since the Unix epoch.
    */
  var created: Double
  /**
    * An array of connect application identifiers that cannot purchase this product.
    */
  var deactivated_on: js.Array[String]
  /**
    * The product’s description, meant to be displayable to the customer.
    */
  var description: String
  /**
    * A list of up to 8 URLs of images for this product, meant to be displayable to the customer.
    */
  var images: js.Array[String]
  var livemode: Boolean
  var metadata: IMetadata
  /**
    * The product’s name, meant to be displayable to the customer.
    */
  var name: String
  /**
    * Value is "product"
    */
  @JSName("object")
  var object_IProduct: product
  var package_dimensions: IPackageDimensions
  /**
    * Whether this product is a shipped good.
    */
  var shippable: Boolean
  /**
    * A sublist of active SKUs associated with this product.
    */
  var skus: IList[ISku]
  /**
    * Extra information about a product which will appear on your customer’s credit card statement. In the case that multiple products are billed
    * at once, the first statement descriptor will be used. Only available on products of type=service.
    */
  var statement_descriptor: String
  /**
    * The type of the product. The product is either of type good, which is eligible for use with Orders and SKUs, or service, which is eligible for
    * use with Subscriptions and Plans.
    */
  var `type`: ProductType
  /**
    * A label that represents units of this product, such as seat(s), in Stripe and on customers’ receipts and invoices.
    * Only available on products of type=service.
    */
  var unit_label: js.UndefOr[String] = js.undefined
  var updated: Double
  /**
    * A URL of a publicly-accessible webpage for this product.
    */
  var url: String
}

object IProduct {
  @scala.inline
  def apply(
    active: Boolean,
    attributes: js.Array[String],
    caption: String,
    created: Double,
    deactivated_on: js.Array[String],
    description: String,
    id: String,
    images: js.Array[String],
    livemode: Boolean,
    metadata: IMetadata,
    name: String,
    `object`: product,
    package_dimensions: IPackageDimensions,
    shippable: Boolean,
    skus: IList[ISku],
    statement_descriptor: String,
    `type`: ProductType,
    updated: Double,
    url: String,
    unit_label: String = null
  ): IProduct = {
    val __obj = js.Dynamic.literal(active = active, attributes = attributes, caption = caption, created = created, deactivated_on = deactivated_on, description = description, id = id, images = images, livemode = livemode, metadata = metadata, name = name, package_dimensions = package_dimensions, shippable = shippable, skus = skus, statement_descriptor = statement_descriptor, updated = updated, url = url)
    __obj.updateDynamic("object")(`object`)
    __obj.updateDynamic("type")(`type`)
    if (unit_label != null) __obj.updateDynamic("unit_label")(unit_label)
    __obj.asInstanceOf[IProduct]
  }
}


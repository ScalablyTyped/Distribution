package typings.stripe.mod.products

import typings.stripe.mod.IList
import typings.stripe.mod.IMetadata
import typings.stripe.mod.IResourceObject
import typings.stripe.mod.skus.ISku
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
    * The type of the product. Defaults to `service` if not explicitly specified, enabling use of this product
    * withSubscriptions and Plans. Set this parameter to `good` to use this product with Orders and SKUs. On API
    * versions before `2018-02-05`, this field defaults to `good` for compatibility reasons.
    */
  var `type`: js.UndefOr[ProductType] = js.undefined
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
    updated: Double,
    url: String,
    `type`: ProductType = null,
    unit_label: String = null
  ): IProduct = {
    val __obj = js.Dynamic.literal(active = active.asInstanceOf[js.Any], attributes = attributes.asInstanceOf[js.Any], caption = caption.asInstanceOf[js.Any], created = created.asInstanceOf[js.Any], deactivated_on = deactivated_on.asInstanceOf[js.Any], description = description.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], images = images.asInstanceOf[js.Any], livemode = livemode.asInstanceOf[js.Any], metadata = metadata.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], package_dimensions = package_dimensions.asInstanceOf[js.Any], shippable = shippable.asInstanceOf[js.Any], skus = skus.asInstanceOf[js.Any], statement_descriptor = statement_descriptor.asInstanceOf[js.Any], updated = updated.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
    __obj.updateDynamic("object")(`object`.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (unit_label != null) __obj.updateDynamic("unit_label")(unit_label.asInstanceOf[js.Any])
    __obj.asInstanceOf[IProduct]
  }
}


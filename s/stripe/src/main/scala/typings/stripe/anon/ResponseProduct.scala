package typings.stripe.anon

import typings.stripe.mod.Stripe.Metadata
import typings.stripe.mod.Stripe.Price
import typings.stripe.mod.Stripe.Product.PackageDimensions
import typings.stripe.mod.Stripe.TaxCode
import typings.stripe.stripeStrings.product
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined stripe.stripe.Stripe.Response<stripe.stripe.Stripe.Product> */
trait ResponseProduct extends StObject {
  
  /**
    * Whether the product is currently available for purchase.
    */
  var active: Boolean
  
  /**
    * A list of up to 5 attributes that each SKU can provide values for (e.g., `["color", "size"]`).
    */
  var attributes: js.Array[String] | Null
  
  /**
    * A short one-line description of the product, meant to be displayable to the customer. Only applicable to products of `type=good`.
    */
  var caption: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Time at which the object was created. Measured in seconds since the Unix epoch.
    */
  var created: Double
  
  /**
    * An array of connect application identifiers that cannot purchase this product. Only applicable to products of `type=good`.
    */
  var deactivate_on: js.UndefOr[js.Array[String]] = js.undefined
  
  /**
    * The ID of the [Price](https://stripe.com/docs/api/prices) object that is the default price for this product.
    */
  var default_price: js.UndefOr[String | Price | Null] = js.undefined
  
  var deleted: js.UndefOr[Unit] = js.undefined
  
  /**
    * The product's description, meant to be displayable to the customer. Use this field to optionally store a long form explanation of the product being sold for your own rendering purposes.
    */
  var description: String | Null
  
  /**
    * Unique identifier for the object.
    */
  var id: String
  
  /**
    * A list of up to 8 URLs of images for this product, meant to be displayable to the customer.
    */
  var images: js.Array[String]
  
  var lastResponse: ApiVersion
  
  /**
    * Has the value `true` if the object exists in live mode or the value `false` if the object exists in test mode.
    */
  var livemode: Boolean
  
  /**
    * Set of [key-value pairs](https://stripe.com/docs/api/metadata) that you can attach to an object. This can be useful for storing additional information about the object in a structured format.
    */
  var metadata: Metadata
  
  /**
    * The product's name, meant to be displayable to the customer.
    */
  var name: String
  
  /**
    * String representing the object's type. Objects of the same type share the same value.
    */
  var `object`: product
  
  /**
    * The dimensions of this product for shipping purposes.
    */
  var package_dimensions: PackageDimensions | Null
  
  /**
    * Whether this product is shipped (i.e., physical goods).
    */
  var shippable: Boolean | Null
  
  /**
    * Extra information about a product which will appear on your customer's credit card statement. In the case that multiple products are billed at once, the first statement descriptor will be used.
    */
  var statement_descriptor: js.UndefOr[String | Null] = js.undefined
  
  /**
    * A [tax code](https://stripe.com/docs/tax/tax-categories) ID.
    */
  var tax_code: String | TaxCode | Null
  
  /**
    * The type of the product. The product is either of type `good`, which is eligible for use with Orders and SKUs, or `service`, which is eligible for use with Subscriptions and Plans.
    */
  var `type`: typings.stripe.mod.Stripe.Product.Type
  
  /**
    * A label that represents units of this product. When set, this will be included in customers' receipts, invoices, Checkout, and the customer portal.
    */
  var unit_label: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Time at which the object was last updated. Measured in seconds since the Unix epoch.
    */
  var updated: Double
  
  /**
    * A URL of a publicly-accessible webpage for this product.
    */
  var url: String | Null
}
object ResponseProduct {
  
  inline def apply(
    active: Boolean,
    created: Double,
    id: String,
    images: js.Array[String],
    lastResponse: ApiVersion,
    livemode: Boolean,
    metadata: Metadata,
    name: String,
    `type`: typings.stripe.mod.Stripe.Product.Type,
    updated: Double
  ): ResponseProduct = {
    val __obj = js.Dynamic.literal(active = active.asInstanceOf[js.Any], created = created.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], images = images.asInstanceOf[js.Any], lastResponse = lastResponse.asInstanceOf[js.Any], livemode = livemode.asInstanceOf[js.Any], metadata = metadata.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], updated = updated.asInstanceOf[js.Any], attributes = null, description = null, package_dimensions = null, shippable = null, tax_code = null, url = null)
    __obj.updateDynamic("object")("product")
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ResponseProduct]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ResponseProduct] (val x: Self) extends AnyVal {
    
    inline def setActive(value: Boolean): Self = StObject.set(x, "active", value.asInstanceOf[js.Any])
    
    inline def setAttributes(value: js.Array[String]): Self = StObject.set(x, "attributes", value.asInstanceOf[js.Any])
    
    inline def setAttributesNull: Self = StObject.set(x, "attributes", null)
    
    inline def setAttributesVarargs(value: String*): Self = StObject.set(x, "attributes", js.Array(value*))
    
    inline def setCaption(value: String): Self = StObject.set(x, "caption", value.asInstanceOf[js.Any])
    
    inline def setCaptionNull: Self = StObject.set(x, "caption", null)
    
    inline def setCaptionUndefined: Self = StObject.set(x, "caption", js.undefined)
    
    inline def setCreated(value: Double): Self = StObject.set(x, "created", value.asInstanceOf[js.Any])
    
    inline def setDeactivate_on(value: js.Array[String]): Self = StObject.set(x, "deactivate_on", value.asInstanceOf[js.Any])
    
    inline def setDeactivate_onUndefined: Self = StObject.set(x, "deactivate_on", js.undefined)
    
    inline def setDeactivate_onVarargs(value: String*): Self = StObject.set(x, "deactivate_on", js.Array(value*))
    
    inline def setDefault_price(value: String | Price): Self = StObject.set(x, "default_price", value.asInstanceOf[js.Any])
    
    inline def setDefault_priceNull: Self = StObject.set(x, "default_price", null)
    
    inline def setDefault_priceUndefined: Self = StObject.set(x, "default_price", js.undefined)
    
    inline def setDeleted(value: Unit): Self = StObject.set(x, "deleted", value.asInstanceOf[js.Any])
    
    inline def setDeletedUndefined: Self = StObject.set(x, "deleted", js.undefined)
    
    inline def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionNull: Self = StObject.set(x, "description", null)
    
    inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setImages(value: js.Array[String]): Self = StObject.set(x, "images", value.asInstanceOf[js.Any])
    
    inline def setImagesVarargs(value: String*): Self = StObject.set(x, "images", js.Array(value*))
    
    inline def setLastResponse(value: ApiVersion): Self = StObject.set(x, "lastResponse", value.asInstanceOf[js.Any])
    
    inline def setLivemode(value: Boolean): Self = StObject.set(x, "livemode", value.asInstanceOf[js.Any])
    
    inline def setMetadata(value: Metadata): Self = StObject.set(x, "metadata", value.asInstanceOf[js.Any])
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setObject(value: product): Self = StObject.set(x, "object", value.asInstanceOf[js.Any])
    
    inline def setPackage_dimensions(value: PackageDimensions): Self = StObject.set(x, "package_dimensions", value.asInstanceOf[js.Any])
    
    inline def setPackage_dimensionsNull: Self = StObject.set(x, "package_dimensions", null)
    
    inline def setShippable(value: Boolean): Self = StObject.set(x, "shippable", value.asInstanceOf[js.Any])
    
    inline def setShippableNull: Self = StObject.set(x, "shippable", null)
    
    inline def setStatement_descriptor(value: String): Self = StObject.set(x, "statement_descriptor", value.asInstanceOf[js.Any])
    
    inline def setStatement_descriptorNull: Self = StObject.set(x, "statement_descriptor", null)
    
    inline def setStatement_descriptorUndefined: Self = StObject.set(x, "statement_descriptor", js.undefined)
    
    inline def setTax_code(value: String | TaxCode): Self = StObject.set(x, "tax_code", value.asInstanceOf[js.Any])
    
    inline def setTax_codeNull: Self = StObject.set(x, "tax_code", null)
    
    inline def setType(value: typings.stripe.mod.Stripe.Product.Type): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setUnit_label(value: String): Self = StObject.set(x, "unit_label", value.asInstanceOf[js.Any])
    
    inline def setUnit_labelNull: Self = StObject.set(x, "unit_label", null)
    
    inline def setUnit_labelUndefined: Self = StObject.set(x, "unit_label", js.undefined)
    
    inline def setUpdated(value: Double): Self = StObject.set(x, "updated", value.asInstanceOf[js.Any])
    
    inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
    
    inline def setUrlNull: Self = StObject.set(x, "url", null)
  }
}

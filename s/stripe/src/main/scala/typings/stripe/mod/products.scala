package typings.stripe.mod

import typings.stripe.mod.skus.ISku
import typings.stripe.stripeStrings.product
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object products {
  
  /**
    * The dimensions of this product for shipping purposes. A SKU associated with this product can override this value by having its
    * own package_dimensions
    */
  trait IPackageDimensions extends StObject {
    
    /**
      * Height, in inches. Maximum precision is 2 decimal places.
      */
    var height: Double
    
    /**
      * Length, in inches. Maximum precision is 2 decimal places.
      */
    var length: Double
    
    /**
      * Weight, in ounces. Maximum precision is 2 decimal places.
      */
    var weight: Double
    
    /**
      * Width, in inches. Maximum precision is 2 decimal places.
      */
    var width: Double
  }
  object IPackageDimensions {
    
    @scala.inline
    def apply(height: Double, length: Double, weight: Double, width: Double): IPackageDimensions = {
      val __obj = js.Dynamic.literal(height = height.asInstanceOf[js.Any], length = length.asInstanceOf[js.Any], weight = weight.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
      __obj.asInstanceOf[IPackageDimensions]
    }
    
    @scala.inline
    implicit class IPackageDimensionsMutableBuilder[Self <: IPackageDimensions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLength(value: Double): Self = StObject.set(x, "length", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWeight(value: Double): Self = StObject.set(x, "weight", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
    }
  }
  
  trait IProduct
    extends StObject
       with IResourceObject {
    
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
      package_dimensions: IPackageDimensions,
      shippable: Boolean,
      skus: IList[ISku],
      statement_descriptor: String,
      updated: Double,
      url: String
    ): IProduct = {
      val __obj = js.Dynamic.literal(active = active.asInstanceOf[js.Any], attributes = attributes.asInstanceOf[js.Any], caption = caption.asInstanceOf[js.Any], created = created.asInstanceOf[js.Any], deactivated_on = deactivated_on.asInstanceOf[js.Any], description = description.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], images = images.asInstanceOf[js.Any], livemode = livemode.asInstanceOf[js.Any], metadata = metadata.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], package_dimensions = package_dimensions.asInstanceOf[js.Any], shippable = shippable.asInstanceOf[js.Any], skus = skus.asInstanceOf[js.Any], statement_descriptor = statement_descriptor.asInstanceOf[js.Any], updated = updated.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
      __obj.updateDynamic("object")("product")
      __obj.asInstanceOf[IProduct]
    }
    
    @scala.inline
    implicit class IProductMutableBuilder[Self <: IProduct] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setActive(value: Boolean): Self = StObject.set(x, "active", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAttributes(value: js.Array[String]): Self = StObject.set(x, "attributes", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAttributesVarargs(value: String*): Self = StObject.set(x, "attributes", js.Array(value :_*))
      
      @scala.inline
      def setCaption(value: String): Self = StObject.set(x, "caption", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCreated(value: Double): Self = StObject.set(x, "created", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDeactivated_on(value: js.Array[String]): Self = StObject.set(x, "deactivated_on", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDeactivated_onVarargs(value: String*): Self = StObject.set(x, "deactivated_on", js.Array(value :_*))
      
      @scala.inline
      def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setImages(value: js.Array[String]): Self = StObject.set(x, "images", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setImagesVarargs(value: String*): Self = StObject.set(x, "images", js.Array(value :_*))
      
      @scala.inline
      def setLivemode(value: Boolean): Self = StObject.set(x, "livemode", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMetadata(value: IMetadata): Self = StObject.set(x, "metadata", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setObject(value: product): Self = StObject.set(x, "object", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPackage_dimensions(value: IPackageDimensions): Self = StObject.set(x, "package_dimensions", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setShippable(value: Boolean): Self = StObject.set(x, "shippable", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSkus(value: IList[ISku]): Self = StObject.set(x, "skus", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStatement_descriptor(value: String): Self = StObject.set(x, "statement_descriptor", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setType(value: ProductType): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
      
      @scala.inline
      def setUnit_label(value: String): Self = StObject.set(x, "unit_label", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUnit_labelUndefined: Self = StObject.set(x, "unit_label", js.undefined)
      
      @scala.inline
      def setUpdated(value: Double): Self = StObject.set(x, "updated", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
    }
  }
  
  trait IProductCreationOptions
    extends StObject
       with IDataOptionsWithMetadata {
    
    /**
      * Whether or not the product is currently available for purchase. Defaults to true. May only be set if type=good.
      */
    var active: js.UndefOr[Boolean] = js.undefined
    
    /**
      * A list of up to 5 alphanumeric attributes that each SKU can provide values for (e.g. ["color", "size"]).
      * Applicable to both service and good types.
      */
    var attributes: js.UndefOr[js.Array[String]] = js.undefined
    
    /**
      * A short one-line description of the product, meant to be displayable to the customer. May only be set if type=good.
      */
    var caption: js.UndefOr[String] = js.undefined
    
    /**
      * An array of Connect application names or identifiers that should not be able to order the SKUs for this product.
      * May only be set if type=good.
      */
    var deactivate_on: js.UndefOr[js.Array[String]] = js.undefined
    
    /**
      * The product’s description, meant to be displayable to the customer. May only be set if type=good.
      */
    var description: js.UndefOr[String] = js.undefined
    
    /**
      * The identifier for the product. Must be unique. If not provided, an identifier will be randomly generated.
      * Applicable to both service and good types.
      */
    var id: js.UndefOr[String] = js.undefined
    
    /**
      * A list of up to 8 URLs of images for this product, meant to be displayable to the customer. May only be set if type=good.
      */
    var images: js.UndefOr[js.Array[String]] = js.undefined
    
    /**
      * The product’s name, meant to be displayable to the customer.
      * Applicable to both service and good types.
      */
    var name: String
    
    /**
      * The dimensions of this product for shipping purposes. A SKU associated with this product can override this value by having its own
      * package_dimensions. May only be set if type=good.
      */
    var package_dimensions: js.UndefOr[IPackageDimensions] = js.undefined
    
    /**
      * Whether this product is shipped (i.e. physical goods). Defaults to true. May only be set if type=good.
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
    
    /**
      * A URL of a publicly-accessible webpage for this product. May only be set if type=good.
      */
    var url: js.UndefOr[String] = js.undefined
  }
  object IProductCreationOptions {
    
    @scala.inline
    def apply(name: String): IProductCreationOptions = {
      val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
      __obj.asInstanceOf[IProductCreationOptions]
    }
    
    @scala.inline
    implicit class IProductCreationOptionsMutableBuilder[Self <: IProductCreationOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setActive(value: Boolean): Self = StObject.set(x, "active", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setActiveUndefined: Self = StObject.set(x, "active", js.undefined)
      
      @scala.inline
      def setAttributes(value: js.Array[String]): Self = StObject.set(x, "attributes", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAttributesUndefined: Self = StObject.set(x, "attributes", js.undefined)
      
      @scala.inline
      def setAttributesVarargs(value: String*): Self = StObject.set(x, "attributes", js.Array(value :_*))
      
      @scala.inline
      def setCaption(value: String): Self = StObject.set(x, "caption", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCaptionUndefined: Self = StObject.set(x, "caption", js.undefined)
      
      @scala.inline
      def setDeactivate_on(value: js.Array[String]): Self = StObject.set(x, "deactivate_on", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDeactivate_onUndefined: Self = StObject.set(x, "deactivate_on", js.undefined)
      
      @scala.inline
      def setDeactivate_onVarargs(value: String*): Self = StObject.set(x, "deactivate_on", js.Array(value :_*))
      
      @scala.inline
      def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
      
      @scala.inline
      def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
      
      @scala.inline
      def setImages(value: js.Array[String]): Self = StObject.set(x, "images", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setImagesUndefined: Self = StObject.set(x, "images", js.undefined)
      
      @scala.inline
      def setImagesVarargs(value: String*): Self = StObject.set(x, "images", js.Array(value :_*))
      
      @scala.inline
      def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPackage_dimensions(value: IPackageDimensions): Self = StObject.set(x, "package_dimensions", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPackage_dimensionsUndefined: Self = StObject.set(x, "package_dimensions", js.undefined)
      
      @scala.inline
      def setShippable(value: Boolean): Self = StObject.set(x, "shippable", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setShippableUndefined: Self = StObject.set(x, "shippable", js.undefined)
      
      @scala.inline
      def setStatement_descriptor(value: String): Self = StObject.set(x, "statement_descriptor", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStatement_descriptorUndefined: Self = StObject.set(x, "statement_descriptor", js.undefined)
      
      @scala.inline
      def setType(value: ProductType): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
      
      @scala.inline
      def setUnit_label(value: String): Self = StObject.set(x, "unit_label", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUnit_labelUndefined: Self = StObject.set(x, "unit_label", js.undefined)
      
      @scala.inline
      def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUrlUndefined: Self = StObject.set(x, "url", js.undefined)
    }
  }
  
  trait IProductListOptions
    extends StObject
       with IListOptions {
    
    /**
      * Only return products that are active or inactive (e.g. pass false to list all inactive products).
      */
    var active: js.UndefOr[Boolean] = js.undefined
    
    /**
      * A filter on the list based on the object created field. The value can be a string with an integer Unix timestamp,
      * or it can be a dictionary with the following options:
      */
    var created: js.UndefOr[IDateFilter] = js.undefined
    
    /**
      * Only return products with the given IDs.
      */
    var ids: js.UndefOr[js.Array[String]] = js.undefined
    
    /**
      * Only return products that can be shipped (i.e., physical, not digital products).
      */
    var shippable: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Only return products of this type
      */
    var `type`: js.UndefOr[String] = js.undefined
    
    /**
      * Only return products with the given url
      */
    var url: js.UndefOr[String] = js.undefined
  }
  object IProductListOptions {
    
    @scala.inline
    def apply(): IProductListOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[IProductListOptions]
    }
    
    @scala.inline
    implicit class IProductListOptionsMutableBuilder[Self <: IProductListOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setActive(value: Boolean): Self = StObject.set(x, "active", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setActiveUndefined: Self = StObject.set(x, "active", js.undefined)
      
      @scala.inline
      def setCreated(value: IDateFilter): Self = StObject.set(x, "created", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCreatedUndefined: Self = StObject.set(x, "created", js.undefined)
      
      @scala.inline
      def setIds(value: js.Array[String]): Self = StObject.set(x, "ids", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIdsUndefined: Self = StObject.set(x, "ids", js.undefined)
      
      @scala.inline
      def setIdsVarargs(value: String*): Self = StObject.set(x, "ids", js.Array(value :_*))
      
      @scala.inline
      def setShippable(value: Boolean): Self = StObject.set(x, "shippable", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setShippableUndefined: Self = StObject.set(x, "shippable", js.undefined)
      
      @scala.inline
      def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
      
      @scala.inline
      def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUrlUndefined: Self = StObject.set(x, "url", js.undefined)
    }
  }
  
  trait IProductUpdateOptions
    extends StObject
       with IDataOptionsWithMetadata {
    
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
    def apply(): IProductUpdateOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[IProductUpdateOptions]
    }
    
    @scala.inline
    implicit class IProductUpdateOptionsMutableBuilder[Self <: IProductUpdateOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setActive(value: Boolean): Self = StObject.set(x, "active", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setActiveUndefined: Self = StObject.set(x, "active", js.undefined)
      
      @scala.inline
      def setCaption(value: String): Self = StObject.set(x, "caption", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCaptionUndefined: Self = StObject.set(x, "caption", js.undefined)
      
      @scala.inline
      def setDeactivate_on(value: js.Array[String]): Self = StObject.set(x, "deactivate_on", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDeactivate_onUndefined: Self = StObject.set(x, "deactivate_on", js.undefined)
      
      @scala.inline
      def setDeactivate_onVarargs(value: String*): Self = StObject.set(x, "deactivate_on", js.Array(value :_*))
      
      @scala.inline
      def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
      
      @scala.inline
      def setImages(value: js.Array[String]): Self = StObject.set(x, "images", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setImagesUndefined: Self = StObject.set(x, "images", js.undefined)
      
      @scala.inline
      def setImagesVarargs(value: String*): Self = StObject.set(x, "images", js.Array(value :_*))
      
      @scala.inline
      def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
      
      @scala.inline
      def setPackage_dimensions(value: IPackageDimensions): Self = StObject.set(x, "package_dimensions", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPackage_dimensionsUndefined: Self = StObject.set(x, "package_dimensions", js.undefined)
      
      @scala.inline
      def setShippable(value: Boolean): Self = StObject.set(x, "shippable", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setShippableUndefined: Self = StObject.set(x, "shippable", js.undefined)
      
      @scala.inline
      def setStatement_descriptor(value: String): Self = StObject.set(x, "statement_descriptor", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStatement_descriptorUndefined: Self = StObject.set(x, "statement_descriptor", js.undefined)
      
      @scala.inline
      def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUrlUndefined: Self = StObject.set(x, "url", js.undefined)
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.stripe.stripeStrings.service
    - typings.stripe.stripeStrings.good
  */
  trait ProductType extends StObject
  object ProductType {
    
    @scala.inline
    def good: typings.stripe.stripeStrings.good = "good".asInstanceOf[typings.stripe.stripeStrings.good]
    
    @scala.inline
    def service: typings.stripe.stripeStrings.service = "service".asInstanceOf[typings.stripe.stripeStrings.service]
  }
}

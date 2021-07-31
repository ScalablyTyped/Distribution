package typings.stripe.mod

import org.scalablytyped.runtime.StringDictionary
import typings.stripe.mod.products.IPackageDimensions
import typings.stripe.mod.products.IProduct
import typings.stripe.stripeStrings.bucket
import typings.stripe.stripeStrings.finite
import typings.stripe.stripeStrings.in_stock
import typings.stripe.stripeStrings.infinite
import typings.stripe.stripeStrings.limited
import typings.stripe.stripeStrings.out_of_stock
import typings.stripe.stripeStrings.sku
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object skus {
  
  /**
    * Description of the SKU’s inventory.
    */
  trait IInventory extends StObject {
    
    /**
      * The count of inventory available. Will be present if and only if type is "finite".
      *
      * Positive integer or zero
      */
    var quantity: js.UndefOr[Double] = js.undefined
    
    /**
      * Inventory type. Possible values are "finite", "bucket"" (not quantified), and "infinite".
      */
    var `type`: finite | bucket | infinite
    
    /**
      * An indicator of the inventory available. Possible values are "in_stock", "limited", and "out_of_stock".
      * Will be present if and only if type is "bucket".
      */
    var value: js.UndefOr[in_stock | limited | out_of_stock] = js.undefined
  }
  object IInventory {
    
    @scala.inline
    def apply(`type`: finite | bucket | infinite): IInventory = {
      val __obj = js.Dynamic.literal()
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[IInventory]
    }
    
    @scala.inline
    implicit class IInventoryMutableBuilder[Self <: IInventory] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setQuantity(value: Double): Self = StObject.set(x, "quantity", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setQuantityUndefined: Self = StObject.set(x, "quantity", js.undefined)
      
      @scala.inline
      def setType(value: finite | bucket | infinite): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setValue(value: in_stock | limited | out_of_stock): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
    }
  }
  
  trait ISku
    extends StObject
       with IResourceObject {
    
    /**
      * Whether or not the SKU is available for purchase.
      */
    var active: Boolean
    
    var attributes: ISkuAttributes
    
    var created: Double
    
    /**
      * 3-letter ISO code for currency.
      */
    var currency: String
    
    /**
      * The URL of an image for this SKU, meant to be displayable to the customer.
      */
    var image: String
    
    var inventory: IInventory
    
    var livemode: Boolean
    
    var metadata: IMetadata
    
    /**
      * Value is "sku"
      */
    @JSName("object")
    var object_ISku: sku
    
    /**
      * The dimensions of this SKU for shipping purposes.
      */
    var package_dimensions: IPackageDimensions
    
    /**
      * The cost of the item as a positive integer in the smallest currency unit (that is, 100 cents to charge $1.00, or 1 to charge ¥1,
      * Japanese Yen being a 0-decimal currency).
      */
    var price: Double
    
    /**
      * The ID of the product this SKU is associated with. The product must be currently active. [Expandable]
      */
    var product: String | IProduct
    
    var updated: Double
  }
  object ISku {
    
    @scala.inline
    def apply(
      active: Boolean,
      attributes: ISkuAttributes,
      created: Double,
      currency: String,
      id: String,
      image: String,
      inventory: IInventory,
      livemode: Boolean,
      metadata: IMetadata,
      package_dimensions: IPackageDimensions,
      price: Double,
      product: String | IProduct,
      updated: Double
    ): ISku = {
      val __obj = js.Dynamic.literal(active = active.asInstanceOf[js.Any], attributes = attributes.asInstanceOf[js.Any], created = created.asInstanceOf[js.Any], currency = currency.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], image = image.asInstanceOf[js.Any], inventory = inventory.asInstanceOf[js.Any], livemode = livemode.asInstanceOf[js.Any], metadata = metadata.asInstanceOf[js.Any], package_dimensions = package_dimensions.asInstanceOf[js.Any], price = price.asInstanceOf[js.Any], product = product.asInstanceOf[js.Any], updated = updated.asInstanceOf[js.Any])
      __obj.updateDynamic("object")("sku")
      __obj.asInstanceOf[ISku]
    }
    
    @scala.inline
    implicit class ISkuMutableBuilder[Self <: ISku] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setActive(value: Boolean): Self = StObject.set(x, "active", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAttributes(value: ISkuAttributes): Self = StObject.set(x, "attributes", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCreated(value: Double): Self = StObject.set(x, "created", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCurrency(value: String): Self = StObject.set(x, "currency", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setImage(value: String): Self = StObject.set(x, "image", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setInventory(value: IInventory): Self = StObject.set(x, "inventory", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLivemode(value: Boolean): Self = StObject.set(x, "livemode", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMetadata(value: IMetadata): Self = StObject.set(x, "metadata", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setObject(value: sku): Self = StObject.set(x, "object", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPackage_dimensions(value: IPackageDimensions): Self = StObject.set(x, "package_dimensions", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPrice(value: Double): Self = StObject.set(x, "price", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setProduct(value: String | IProduct): Self = StObject.set(x, "product", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUpdated(value: Double): Self = StObject.set(x, "updated", value.asInstanceOf[js.Any])
    }
  }
  
  /**
    * A dictionary of attributes and values for the attributes defined by the product.
    * If, for example, a product’s attributes are ["size", "gender"],
    * a valid SKU has the following dictionary of attributes: {"size": "Medium", "gender": "Unisex"}.
    */
  type ISkuAttributes = StringDictionary[String]
  
  trait ISkuCreationOptions
    extends StObject
       with IDataOptionsWithMetadata {
    
    /**
      * Whether or not the SKU is available for purchase. Default to true.
      */
    var active: js.UndefOr[Boolean] = js.undefined
    
    var attributes: js.UndefOr[ISkuAttributes] = js.undefined
    
    /**
      * 3-letter ISO code for currency.
      */
    var currency: String
    
    /**
      * The identifier for the SKU. Must be unique. If not provided, an identifier will be randomly generated.
      */
    var id: js.UndefOr[String] = js.undefined
    
    /**
      * The URL of an image for this SKU, meant to be displayable to the customer.
      */
    var image: js.UndefOr[String] = js.undefined
    
    var inventory: IInventory
    
    /**
      * The dimensions of this SKU for shipping purposes.
      */
    var package_dimensions: js.UndefOr[IPackageDimensions] = js.undefined
    
    /**
      * The cost of the item as a nonnegative integer in the smallest currency unit (that is, 100 cents to charge $1.00, or 1 to charge ¥1,
      * Japanese Yen being a 0-decimal currency).
      */
    var price: Double
    
    /**
      * The ID of the product this SKU is associated with.
      */
    var product: String
  }
  object ISkuCreationOptions {
    
    @scala.inline
    def apply(currency: String, inventory: IInventory, price: Double, product: String): ISkuCreationOptions = {
      val __obj = js.Dynamic.literal(currency = currency.asInstanceOf[js.Any], inventory = inventory.asInstanceOf[js.Any], price = price.asInstanceOf[js.Any], product = product.asInstanceOf[js.Any])
      __obj.asInstanceOf[ISkuCreationOptions]
    }
    
    @scala.inline
    implicit class ISkuCreationOptionsMutableBuilder[Self <: ISkuCreationOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setActive(value: Boolean): Self = StObject.set(x, "active", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setActiveUndefined: Self = StObject.set(x, "active", js.undefined)
      
      @scala.inline
      def setAttributes(value: ISkuAttributes): Self = StObject.set(x, "attributes", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAttributesUndefined: Self = StObject.set(x, "attributes", js.undefined)
      
      @scala.inline
      def setCurrency(value: String): Self = StObject.set(x, "currency", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
      
      @scala.inline
      def setImage(value: String): Self = StObject.set(x, "image", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setImageUndefined: Self = StObject.set(x, "image", js.undefined)
      
      @scala.inline
      def setInventory(value: IInventory): Self = StObject.set(x, "inventory", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPackage_dimensions(value: IPackageDimensions): Self = StObject.set(x, "package_dimensions", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPackage_dimensionsUndefined: Self = StObject.set(x, "package_dimensions", js.undefined)
      
      @scala.inline
      def setPrice(value: Double): Self = StObject.set(x, "price", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setProduct(value: String): Self = StObject.set(x, "product", value.asInstanceOf[js.Any])
    }
  }
  
  trait ISkuListOptions
    extends StObject
       with IListOptions {
    
    /**
      * Only return SKUs that are active or inactive (e.g. pass false to list all inactive products).
      */
    var active: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Only return SKUs that have the specified key/value pairs in this partially constructed dictionary.
      * Can be specified only if product is also supplied. For instance, if the associated product has
      * attributes ["color", "size"], passing in attributes[color]=red returns all the SKUs for this product
      * that have color set to red.
      */
    var attributes: js.UndefOr[ISkuAttributes] = js.undefined
    
    /**
      * Only return SKUs with the given IDs.
      */
    var ids: js.UndefOr[js.Array[String]] = js.undefined
    
    /**
      * Only return SKUs that are either in stock or out of stock (e.g. pass false to list all SKUs that are out of stock).
      * If no value is provided, all SKUs are returned.
      */
    var in_stock: js.UndefOr[Boolean] = js.undefined
    
    /**
      * The ID of the product whose SKUs will be retrieved.
      */
    var product: js.UndefOr[String] = js.undefined
  }
  object ISkuListOptions {
    
    @scala.inline
    def apply(): ISkuListOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ISkuListOptions]
    }
    
    @scala.inline
    implicit class ISkuListOptionsMutableBuilder[Self <: ISkuListOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setActive(value: Boolean): Self = StObject.set(x, "active", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setActiveUndefined: Self = StObject.set(x, "active", js.undefined)
      
      @scala.inline
      def setAttributes(value: ISkuAttributes): Self = StObject.set(x, "attributes", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAttributesUndefined: Self = StObject.set(x, "attributes", js.undefined)
      
      @scala.inline
      def setIds(value: js.Array[String]): Self = StObject.set(x, "ids", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIdsUndefined: Self = StObject.set(x, "ids", js.undefined)
      
      @scala.inline
      def setIdsVarargs(value: String*): Self = StObject.set(x, "ids", js.Array(value :_*))
      
      @scala.inline
      def setIn_stock(value: Boolean): Self = StObject.set(x, "in_stock", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIn_stockUndefined: Self = StObject.set(x, "in_stock", js.undefined)
      
      @scala.inline
      def setProduct(value: String): Self = StObject.set(x, "product", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setProductUndefined: Self = StObject.set(x, "product", js.undefined)
    }
  }
  
  trait ISkuUpdateOptions
    extends StObject
       with IDataOptionsWithMetadata {
    
    /**
      * Whether or not the SKU is available for purchase.
      */
    var active: js.UndefOr[Boolean] = js.undefined
    
    /**
      * 3-letter ISO code for currency.
      */
    var currency: js.UndefOr[String] = js.undefined
    
    /**
      * The URL of an image for this SKU, meant to be displayable to the customer.
      * This can be unset by updating the value to null and then saving.
      */
    var image: js.UndefOr[String] = js.undefined
    
    var inventory: js.UndefOr[IInventory] = js.undefined
    
    /**
      * The dimensions of this SKU for shipping purposes.
      */
    var package_dimensions: js.UndefOr[IPackageDimensions] = js.undefined
    
    /**
      * The cost of the item as a nonnegative integer in the smallest currency unit (that is, 100 cents to charge $1.00, or 1 to charge ¥1,
      * Japanese Yen being a 0-decimal currency).
      */
    var price: js.UndefOr[Double] = js.undefined
    
    /**
      * The ID of the product this SKU is associated with.
      */
    var product: js.UndefOr[String] = js.undefined
  }
  object ISkuUpdateOptions {
    
    @scala.inline
    def apply(): ISkuUpdateOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ISkuUpdateOptions]
    }
    
    @scala.inline
    implicit class ISkuUpdateOptionsMutableBuilder[Self <: ISkuUpdateOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setActive(value: Boolean): Self = StObject.set(x, "active", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setActiveUndefined: Self = StObject.set(x, "active", js.undefined)
      
      @scala.inline
      def setCurrency(value: String): Self = StObject.set(x, "currency", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCurrencyUndefined: Self = StObject.set(x, "currency", js.undefined)
      
      @scala.inline
      def setImage(value: String): Self = StObject.set(x, "image", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setImageUndefined: Self = StObject.set(x, "image", js.undefined)
      
      @scala.inline
      def setInventory(value: IInventory): Self = StObject.set(x, "inventory", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setInventoryUndefined: Self = StObject.set(x, "inventory", js.undefined)
      
      @scala.inline
      def setPackage_dimensions(value: IPackageDimensions): Self = StObject.set(x, "package_dimensions", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPackage_dimensionsUndefined: Self = StObject.set(x, "package_dimensions", js.undefined)
      
      @scala.inline
      def setPrice(value: Double): Self = StObject.set(x, "price", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPriceUndefined: Self = StObject.set(x, "price", js.undefined)
      
      @scala.inline
      def setProduct(value: String): Self = StObject.set(x, "product", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setProductUndefined: Self = StObject.set(x, "product", js.undefined)
    }
  }
}

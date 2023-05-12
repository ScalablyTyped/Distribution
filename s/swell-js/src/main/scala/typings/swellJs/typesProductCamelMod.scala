package typings.swellJs

import typings.swellJs.anon.Contenttype
import typings.swellJs.anon.Height
import typings.swellJs.anon.Id
import typings.swellJs.swellJsStrings.`null`
import typings.swellJs.swellJsStrings.backorder
import typings.swellJs.swellJsStrings.daily
import typings.swellJs.swellJsStrings.discontinued
import typings.swellJs.swellJsStrings.file
import typings.swellJs.swellJsStrings.giftcard
import typings.swellJs.swellJsStrings.in_stock
import typings.swellJs.swellJsStrings.monthly
import typings.swellJs.swellJsStrings.multi_select
import typings.swellJs.swellJsStrings.muti_file
import typings.swellJs.swellJsStrings.out_of_stock
import typings.swellJs.swellJsStrings.preorder
import typings.swellJs.swellJsStrings.select
import typings.swellJs.swellJsStrings.shipment
import typings.swellJs.swellJsStrings.subscription
import typings.swellJs.swellJsStrings.text
import typings.swellJs.swellJsStrings.textarea
import typings.swellJs.swellJsStrings.weekly
import typings.swellJs.swellJsStrings.yearly
import typings.swellJs.typesAttributeMod.Attribute
import typings.swellJs.typesProductMod.Bundle
import typings.swellJs.typesProductMod.CrossSell
import typings.swellJs.typesProductMod.Image
import typings.swellJs.typesProductMod.Price
import typings.swellJs.typesProductMod.ProductOption
import typings.swellJs.typesProductMod.PurchaseOption
import typings.swellJs.typesProductMod.Upsell
import typings.swellJs.typesProductMod.Variant
import typings.swellJs.typesProductSnakeMod.ContentObject
import typings.swellJs.typesProductSnakeMod.ImageSnake
import typings.swellJs.typesProductSnakeMod.OptionValueSnake
import typings.swellJs.typesProductSnakeMod.PriceSnake
import typings.swellJs.typesProductSnakeMod.ProductSnake
import typings.swellJs.typesProductSnakeMod.VariantSnake
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesProductCamelMod {
  
  /* Inlined {[ K in keyof swell-js.swell-js/types/product/snake.BundleSnake as swell-js.swell-js.SnakeToCamelCase<K> ]: swell-js.swell-js/types/product/snake.BundleSnake[K]} */
  trait BundleCamel extends StObject {
    
    var id: js.UndefOr[String] = js.undefined
    
    var product: js.UndefOr[ProductSnake] = js.undefined
    
    var product_id: js.UndefOr[String] = js.undefined
    
    var product_name: js.UndefOr[String] = js.undefined
    
    var quantity: js.UndefOr[Double] = js.undefined
    
    var variant: js.UndefOr[VariantSnake] = js.undefined
    
    var variant_id: js.UndefOr[String] = js.undefined
  }
  object BundleCamel {
    
    inline def apply(): BundleCamel = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[BundleCamel]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: BundleCamel] (val x: Self) extends AnyVal {
      
      inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
      
      inline def setProduct(value: ProductSnake): Self = StObject.set(x, "product", value.asInstanceOf[js.Any])
      
      inline def setProductUndefined: Self = StObject.set(x, "product", js.undefined)
      
      inline def setProduct_id(value: String): Self = StObject.set(x, "product_id", value.asInstanceOf[js.Any])
      
      inline def setProduct_idUndefined: Self = StObject.set(x, "product_id", js.undefined)
      
      inline def setProduct_name(value: String): Self = StObject.set(x, "product_name", value.asInstanceOf[js.Any])
      
      inline def setProduct_nameUndefined: Self = StObject.set(x, "product_name", js.undefined)
      
      inline def setQuantity(value: Double): Self = StObject.set(x, "quantity", value.asInstanceOf[js.Any])
      
      inline def setQuantityUndefined: Self = StObject.set(x, "quantity", js.undefined)
      
      inline def setVariant(value: VariantSnake): Self = StObject.set(x, "variant", value.asInstanceOf[js.Any])
      
      inline def setVariantUndefined: Self = StObject.set(x, "variant", js.undefined)
      
      inline def setVariant_id(value: String): Self = StObject.set(x, "variant_id", value.asInstanceOf[js.Any])
      
      inline def setVariant_idUndefined: Self = StObject.set(x, "variant_id", js.undefined)
    }
  }
  
  /* Inlined {[ K in keyof swell-js.swell-js/types/product/snake.CrossSellSnake as swell-js.swell-js.SnakeToCamelCase<K> ]: swell-js.swell-js/types/product/snake.CrossSellSnake[K]} */
  trait CrossSellCamel extends StObject {
    
    var discount_amount: js.UndefOr[Double] = js.undefined
    
    var discount_percent: js.UndefOr[Double] = js.undefined
    
    var discount_type: js.UndefOr[String] = js.undefined
    
    var id: js.UndefOr[String] = js.undefined
    
    var product: js.UndefOr[ProductSnake] = js.undefined
    
    var product_id: js.UndefOr[String] = js.undefined
  }
  object CrossSellCamel {
    
    inline def apply(): CrossSellCamel = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[CrossSellCamel]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: CrossSellCamel] (val x: Self) extends AnyVal {
      
      inline def setDiscount_amount(value: Double): Self = StObject.set(x, "discount_amount", value.asInstanceOf[js.Any])
      
      inline def setDiscount_amountUndefined: Self = StObject.set(x, "discount_amount", js.undefined)
      
      inline def setDiscount_percent(value: Double): Self = StObject.set(x, "discount_percent", value.asInstanceOf[js.Any])
      
      inline def setDiscount_percentUndefined: Self = StObject.set(x, "discount_percent", js.undefined)
      
      inline def setDiscount_type(value: String): Self = StObject.set(x, "discount_type", value.asInstanceOf[js.Any])
      
      inline def setDiscount_typeUndefined: Self = StObject.set(x, "discount_type", js.undefined)
      
      inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
      
      inline def setProduct(value: ProductSnake): Self = StObject.set(x, "product", value.asInstanceOf[js.Any])
      
      inline def setProductUndefined: Self = StObject.set(x, "product", js.undefined)
      
      inline def setProduct_id(value: String): Self = StObject.set(x, "product_id", value.asInstanceOf[js.Any])
      
      inline def setProduct_idUndefined: Self = StObject.set(x, "product_id", js.undefined)
    }
  }
  
  /* Inlined {[ K in keyof swell-js.swell-js/types/product/snake.ImageSnake as swell-js.swell-js.SnakeToCamelCase<K> ]: swell-js.swell-js/types/product/snake.ImageSnake[K]} */
  trait ImageCamel extends StObject {
    
    var caption: js.UndefOr[String] = js.undefined
    
    var file: js.UndefOr[Contenttype] = js.undefined
    
    var id: js.UndefOr[String] = js.undefined
  }
  object ImageCamel {
    
    inline def apply(): ImageCamel = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ImageCamel]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ImageCamel] (val x: Self) extends AnyVal {
      
      inline def setCaption(value: String): Self = StObject.set(x, "caption", value.asInstanceOf[js.Any])
      
      inline def setCaptionUndefined: Self = StObject.set(x, "caption", js.undefined)
      
      inline def setFile(value: Contenttype): Self = StObject.set(x, "file", value.asInstanceOf[js.Any])
      
      inline def setFileUndefined: Self = StObject.set(x, "file", js.undefined)
      
      inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    }
  }
  
  /* Inlined {[ K in keyof swell-js.swell-js/types/product/snake.PriceSnake as swell-js.swell-js.SnakeToCamelCase<K> ]: swell-js.swell-js/types/product/snake.PriceSnake[K]} */
  trait PriceCamel extends StObject {
    
    var account_group: js.UndefOr[String] = js.undefined
    
    var price: js.UndefOr[Double] = js.undefined
    
    var quantity_max: js.UndefOr[Double] = js.undefined
    
    var quantity_min: js.UndefOr[Double] = js.undefined
  }
  object PriceCamel {
    
    inline def apply(): PriceCamel = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PriceCamel]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: PriceCamel] (val x: Self) extends AnyVal {
      
      inline def setAccount_group(value: String): Self = StObject.set(x, "account_group", value.asInstanceOf[js.Any])
      
      inline def setAccount_groupUndefined: Self = StObject.set(x, "account_group", js.undefined)
      
      inline def setPrice(value: Double): Self = StObject.set(x, "price", value.asInstanceOf[js.Any])
      
      inline def setPriceUndefined: Self = StObject.set(x, "price", js.undefined)
      
      inline def setQuantity_max(value: Double): Self = StObject.set(x, "quantity_max", value.asInstanceOf[js.Any])
      
      inline def setQuantity_maxUndefined: Self = StObject.set(x, "quantity_max", js.undefined)
      
      inline def setQuantity_min(value: Double): Self = StObject.set(x, "quantity_min", value.asInstanceOf[js.Any])
      
      inline def setQuantity_minUndefined: Self = StObject.set(x, "quantity_min", js.undefined)
    }
  }
  
  /* Inlined {[ K in keyof swell-js.swell-js/types/product/snake.PriceSnake as swell-js.swell-js.SnakeToCamelCase<K> ]: swell-js.swell-js/types/product/snake.PriceSnake[K]} */
  trait PricesCamel extends StObject {
    
    var account_group: js.UndefOr[String] = js.undefined
    
    var price: js.UndefOr[Double] = js.undefined
    
    var quantity_max: js.UndefOr[Double] = js.undefined
    
    var quantity_min: js.UndefOr[Double] = js.undefined
  }
  object PricesCamel {
    
    inline def apply(): PricesCamel = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PricesCamel]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: PricesCamel] (val x: Self) extends AnyVal {
      
      inline def setAccount_group(value: String): Self = StObject.set(x, "account_group", value.asInstanceOf[js.Any])
      
      inline def setAccount_groupUndefined: Self = StObject.set(x, "account_group", js.undefined)
      
      inline def setPrice(value: Double): Self = StObject.set(x, "price", value.asInstanceOf[js.Any])
      
      inline def setPriceUndefined: Self = StObject.set(x, "price", js.undefined)
      
      inline def setQuantity_max(value: Double): Self = StObject.set(x, "quantity_max", value.asInstanceOf[js.Any])
      
      inline def setQuantity_maxUndefined: Self = StObject.set(x, "quantity_max", js.undefined)
      
      inline def setQuantity_min(value: Double): Self = StObject.set(x, "quantity_min", value.asInstanceOf[js.Any])
      
      inline def setQuantity_minUndefined: Self = StObject.set(x, "quantity_min", js.undefined)
    }
  }
  
  /* Inlined {[ K in keyof swell-js.swell-js/types/product/snake.ProductSnake as swell-js.swell-js.SnakeToCamelCase<K> ]: swell-js.swell-js/types/product/snake.ProductSnake[K]} */
  trait ProductCamel extends StObject {
    
    var active: js.UndefOr[Boolean] = js.undefined
    
    var attributes: js.UndefOr[js.Array[Attribute]] = js.undefined
    
    var bundle: js.UndefOr[Boolean] = js.undefined
    
    var bundle_items: js.UndefOr[js.Array[Bundle]] = js.undefined
    
    var categories: js.UndefOr[js.Array[Any]] = js.undefined
    
    var category: js.UndefOr[Any] = js.undefined
    
    var category_id: js.UndefOr[String] = js.undefined
    
    var category_index: js.UndefOr[Id] = js.undefined
    
    var code: js.UndefOr[String] = js.undefined
    
    var content: js.UndefOr[ContentObject] = js.undefined
    
    var cost: js.UndefOr[Double] = js.undefined
    
    var cross_sells: js.UndefOr[js.Array[CrossSell]] = js.undefined
    
    var currency: js.UndefOr[String] = js.undefined
    
    var customizable: js.UndefOr[Boolean] = js.undefined
    
    var date_created: js.UndefOr[String] = js.undefined
    
    var date_updated: js.UndefOr[String] = js.undefined
    
    var delivery: js.UndefOr[shipment | subscription | giftcard | `null`] = js.undefined
    
    var description: js.UndefOr[String] = js.undefined
    
    var discontinued: js.UndefOr[Boolean] = js.undefined
    
    var id: js.UndefOr[String] = js.undefined
    
    var images: js.UndefOr[js.Array[Image]] = js.undefined
    
    var meta_description: js.UndefOr[String] = js.undefined
    
    var meta_keywords: js.UndefOr[String] = js.undefined
    
    var meta_title: js.UndefOr[String] = js.undefined
    
    var name: String
    
    var options: js.UndefOr[js.Array[ProductOption]] = js.undefined
    
    var orig_price: js.UndefOr[Double] = js.undefined
    
    var price: js.UndefOr[Double] = js.undefined
    
    var prices: js.UndefOr[js.Array[Price]] = js.undefined
    
    var purchase_options: js.UndefOr[PurchaseOption] = js.undefined
    
    var quantity_inc: js.UndefOr[Double] = js.undefined
    
    var quantity_min: js.UndefOr[Double] = js.undefined
    
    var related_product_ids: js.UndefOr[js.Array[String]] = js.undefined
    
    var sale: js.UndefOr[Boolean] = js.undefined
    
    var sale_price: js.UndefOr[Double] = js.undefined
    
    var shipment_dimensions: js.UndefOr[Height] = js.undefined
    
    var shipment_location: js.UndefOr[String] = js.undefined
    
    var sku: js.UndefOr[String] = js.undefined
    
    var slug: js.UndefOr[String] = js.undefined
    
    var stock_level: js.UndefOr[Double] = js.undefined
    
    var stock_purchasable: js.UndefOr[Boolean] = js.undefined
    
    var stock_status: js.UndefOr[discontinued | preorder | backorder | in_stock | out_of_stock | Null] = js.undefined
    
    var stock_tracking: js.UndefOr[Boolean] = js.undefined
    
    var tags: js.UndefOr[js.Array[String]] = js.undefined
    
    var up_sells: js.UndefOr[js.Array[Upsell]] = js.undefined
    
    var variable: js.UndefOr[Boolean] = js.undefined
    
    var variants: js.UndefOr[js.Array[Variant]] = js.undefined
    
    var virtual: js.UndefOr[Boolean] = js.undefined
  }
  object ProductCamel {
    
    inline def apply(name: String): ProductCamel = {
      val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
      __obj.asInstanceOf[ProductCamel]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ProductCamel] (val x: Self) extends AnyVal {
      
      inline def setActive(value: Boolean): Self = StObject.set(x, "active", value.asInstanceOf[js.Any])
      
      inline def setActiveUndefined: Self = StObject.set(x, "active", js.undefined)
      
      inline def setAttributes(value: js.Array[Attribute]): Self = StObject.set(x, "attributes", value.asInstanceOf[js.Any])
      
      inline def setAttributesUndefined: Self = StObject.set(x, "attributes", js.undefined)
      
      inline def setAttributesVarargs(value: Attribute*): Self = StObject.set(x, "attributes", js.Array(value*))
      
      inline def setBundle(value: Boolean): Self = StObject.set(x, "bundle", value.asInstanceOf[js.Any])
      
      inline def setBundleUndefined: Self = StObject.set(x, "bundle", js.undefined)
      
      inline def setBundle_items(value: js.Array[Bundle]): Self = StObject.set(x, "bundle_items", value.asInstanceOf[js.Any])
      
      inline def setBundle_itemsUndefined: Self = StObject.set(x, "bundle_items", js.undefined)
      
      inline def setBundle_itemsVarargs(value: Bundle*): Self = StObject.set(x, "bundle_items", js.Array(value*))
      
      inline def setCategories(value: js.Array[Any]): Self = StObject.set(x, "categories", value.asInstanceOf[js.Any])
      
      inline def setCategoriesUndefined: Self = StObject.set(x, "categories", js.undefined)
      
      inline def setCategoriesVarargs(value: Any*): Self = StObject.set(x, "categories", js.Array(value*))
      
      inline def setCategory(value: Any): Self = StObject.set(x, "category", value.asInstanceOf[js.Any])
      
      inline def setCategoryUndefined: Self = StObject.set(x, "category", js.undefined)
      
      inline def setCategory_id(value: String): Self = StObject.set(x, "category_id", value.asInstanceOf[js.Any])
      
      inline def setCategory_idUndefined: Self = StObject.set(x, "category_id", js.undefined)
      
      inline def setCategory_index(value: Id): Self = StObject.set(x, "category_index", value.asInstanceOf[js.Any])
      
      inline def setCategory_indexUndefined: Self = StObject.set(x, "category_index", js.undefined)
      
      inline def setCode(value: String): Self = StObject.set(x, "code", value.asInstanceOf[js.Any])
      
      inline def setCodeUndefined: Self = StObject.set(x, "code", js.undefined)
      
      inline def setContent(value: ContentObject): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
      
      inline def setContentUndefined: Self = StObject.set(x, "content", js.undefined)
      
      inline def setCost(value: Double): Self = StObject.set(x, "cost", value.asInstanceOf[js.Any])
      
      inline def setCostUndefined: Self = StObject.set(x, "cost", js.undefined)
      
      inline def setCross_sells(value: js.Array[CrossSell]): Self = StObject.set(x, "cross_sells", value.asInstanceOf[js.Any])
      
      inline def setCross_sellsUndefined: Self = StObject.set(x, "cross_sells", js.undefined)
      
      inline def setCross_sellsVarargs(value: CrossSell*): Self = StObject.set(x, "cross_sells", js.Array(value*))
      
      inline def setCurrency(value: String): Self = StObject.set(x, "currency", value.asInstanceOf[js.Any])
      
      inline def setCurrencyUndefined: Self = StObject.set(x, "currency", js.undefined)
      
      inline def setCustomizable(value: Boolean): Self = StObject.set(x, "customizable", value.asInstanceOf[js.Any])
      
      inline def setCustomizableUndefined: Self = StObject.set(x, "customizable", js.undefined)
      
      inline def setDate_created(value: String): Self = StObject.set(x, "date_created", value.asInstanceOf[js.Any])
      
      inline def setDate_createdUndefined: Self = StObject.set(x, "date_created", js.undefined)
      
      inline def setDate_updated(value: String): Self = StObject.set(x, "date_updated", value.asInstanceOf[js.Any])
      
      inline def setDate_updatedUndefined: Self = StObject.set(x, "date_updated", js.undefined)
      
      inline def setDelivery(value: shipment | subscription | giftcard | `null`): Self = StObject.set(x, "delivery", value.asInstanceOf[js.Any])
      
      inline def setDeliveryUndefined: Self = StObject.set(x, "delivery", js.undefined)
      
      inline def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
      
      inline def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
      
      inline def setDiscontinued(value: Boolean): Self = StObject.set(x, "discontinued", value.asInstanceOf[js.Any])
      
      inline def setDiscontinuedUndefined: Self = StObject.set(x, "discontinued", js.undefined)
      
      inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
      
      inline def setImages(value: js.Array[Image]): Self = StObject.set(x, "images", value.asInstanceOf[js.Any])
      
      inline def setImagesUndefined: Self = StObject.set(x, "images", js.undefined)
      
      inline def setImagesVarargs(value: Image*): Self = StObject.set(x, "images", js.Array(value*))
      
      inline def setMeta_description(value: String): Self = StObject.set(x, "meta_description", value.asInstanceOf[js.Any])
      
      inline def setMeta_descriptionUndefined: Self = StObject.set(x, "meta_description", js.undefined)
      
      inline def setMeta_keywords(value: String): Self = StObject.set(x, "meta_keywords", value.asInstanceOf[js.Any])
      
      inline def setMeta_keywordsUndefined: Self = StObject.set(x, "meta_keywords", js.undefined)
      
      inline def setMeta_title(value: String): Self = StObject.set(x, "meta_title", value.asInstanceOf[js.Any])
      
      inline def setMeta_titleUndefined: Self = StObject.set(x, "meta_title", js.undefined)
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setOptions(value: js.Array[ProductOption]): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
      
      inline def setOptionsUndefined: Self = StObject.set(x, "options", js.undefined)
      
      inline def setOptionsVarargs(value: ProductOption*): Self = StObject.set(x, "options", js.Array(value*))
      
      inline def setOrig_price(value: Double): Self = StObject.set(x, "orig_price", value.asInstanceOf[js.Any])
      
      inline def setOrig_priceUndefined: Self = StObject.set(x, "orig_price", js.undefined)
      
      inline def setPrice(value: Double): Self = StObject.set(x, "price", value.asInstanceOf[js.Any])
      
      inline def setPriceUndefined: Self = StObject.set(x, "price", js.undefined)
      
      inline def setPrices(value: js.Array[Price]): Self = StObject.set(x, "prices", value.asInstanceOf[js.Any])
      
      inline def setPricesUndefined: Self = StObject.set(x, "prices", js.undefined)
      
      inline def setPricesVarargs(value: Price*): Self = StObject.set(x, "prices", js.Array(value*))
      
      inline def setPurchase_options(value: PurchaseOption): Self = StObject.set(x, "purchase_options", value.asInstanceOf[js.Any])
      
      inline def setPurchase_optionsUndefined: Self = StObject.set(x, "purchase_options", js.undefined)
      
      inline def setQuantity_inc(value: Double): Self = StObject.set(x, "quantity_inc", value.asInstanceOf[js.Any])
      
      inline def setQuantity_incUndefined: Self = StObject.set(x, "quantity_inc", js.undefined)
      
      inline def setQuantity_min(value: Double): Self = StObject.set(x, "quantity_min", value.asInstanceOf[js.Any])
      
      inline def setQuantity_minUndefined: Self = StObject.set(x, "quantity_min", js.undefined)
      
      inline def setRelated_product_ids(value: js.Array[String]): Self = StObject.set(x, "related_product_ids", value.asInstanceOf[js.Any])
      
      inline def setRelated_product_idsUndefined: Self = StObject.set(x, "related_product_ids", js.undefined)
      
      inline def setRelated_product_idsVarargs(value: String*): Self = StObject.set(x, "related_product_ids", js.Array(value*))
      
      inline def setSale(value: Boolean): Self = StObject.set(x, "sale", value.asInstanceOf[js.Any])
      
      inline def setSaleUndefined: Self = StObject.set(x, "sale", js.undefined)
      
      inline def setSale_price(value: Double): Self = StObject.set(x, "sale_price", value.asInstanceOf[js.Any])
      
      inline def setSale_priceUndefined: Self = StObject.set(x, "sale_price", js.undefined)
      
      inline def setShipment_dimensions(value: Height): Self = StObject.set(x, "shipment_dimensions", value.asInstanceOf[js.Any])
      
      inline def setShipment_dimensionsUndefined: Self = StObject.set(x, "shipment_dimensions", js.undefined)
      
      inline def setShipment_location(value: String): Self = StObject.set(x, "shipment_location", value.asInstanceOf[js.Any])
      
      inline def setShipment_locationUndefined: Self = StObject.set(x, "shipment_location", js.undefined)
      
      inline def setSku(value: String): Self = StObject.set(x, "sku", value.asInstanceOf[js.Any])
      
      inline def setSkuUndefined: Self = StObject.set(x, "sku", js.undefined)
      
      inline def setSlug(value: String): Self = StObject.set(x, "slug", value.asInstanceOf[js.Any])
      
      inline def setSlugUndefined: Self = StObject.set(x, "slug", js.undefined)
      
      inline def setStock_level(value: Double): Self = StObject.set(x, "stock_level", value.asInstanceOf[js.Any])
      
      inline def setStock_levelUndefined: Self = StObject.set(x, "stock_level", js.undefined)
      
      inline def setStock_purchasable(value: Boolean): Self = StObject.set(x, "stock_purchasable", value.asInstanceOf[js.Any])
      
      inline def setStock_purchasableUndefined: Self = StObject.set(x, "stock_purchasable", js.undefined)
      
      inline def setStock_status(value: discontinued | preorder | backorder | in_stock | out_of_stock): Self = StObject.set(x, "stock_status", value.asInstanceOf[js.Any])
      
      inline def setStock_statusNull: Self = StObject.set(x, "stock_status", null)
      
      inline def setStock_statusUndefined: Self = StObject.set(x, "stock_status", js.undefined)
      
      inline def setStock_tracking(value: Boolean): Self = StObject.set(x, "stock_tracking", value.asInstanceOf[js.Any])
      
      inline def setStock_trackingUndefined: Self = StObject.set(x, "stock_tracking", js.undefined)
      
      inline def setTags(value: js.Array[String]): Self = StObject.set(x, "tags", value.asInstanceOf[js.Any])
      
      inline def setTagsUndefined: Self = StObject.set(x, "tags", js.undefined)
      
      inline def setTagsVarargs(value: String*): Self = StObject.set(x, "tags", js.Array(value*))
      
      inline def setUp_sells(value: js.Array[Upsell]): Self = StObject.set(x, "up_sells", value.asInstanceOf[js.Any])
      
      inline def setUp_sellsUndefined: Self = StObject.set(x, "up_sells", js.undefined)
      
      inline def setUp_sellsVarargs(value: Upsell*): Self = StObject.set(x, "up_sells", js.Array(value*))
      
      inline def setVariable(value: Boolean): Self = StObject.set(x, "variable", value.asInstanceOf[js.Any])
      
      inline def setVariableUndefined: Self = StObject.set(x, "variable", js.undefined)
      
      inline def setVariants(value: js.Array[Variant]): Self = StObject.set(x, "variants", value.asInstanceOf[js.Any])
      
      inline def setVariantsUndefined: Self = StObject.set(x, "variants", js.undefined)
      
      inline def setVariantsVarargs(value: Variant*): Self = StObject.set(x, "variants", js.Array(value*))
      
      inline def setVirtual(value: Boolean): Self = StObject.set(x, "virtual", value.asInstanceOf[js.Any])
      
      inline def setVirtualUndefined: Self = StObject.set(x, "virtual", js.undefined)
    }
  }
  
  /* Inlined {[ K in keyof swell-js.swell-js/types/product/snake.ProductOptionSnake as swell-js.swell-js.SnakeToCamelCase<K> ]: swell-js.swell-js/types/product/snake.ProductOptionSnake[K]} */
  trait ProductOptionCamel extends StObject {
    
    var active: js.UndefOr[Boolean] = js.undefined
    
    var attribute_id: js.UndefOr[String] = js.undefined
    
    var description: js.UndefOr[String] = js.undefined
    
    var id: js.UndefOr[String] = js.undefined
    
    var input_hint: js.UndefOr[String] = js.undefined
    
    var input_multi: js.UndefOr[Boolean] = js.undefined
    
    var input_type: js.UndefOr[text | textarea | select | multi_select | file | muti_file] = js.undefined
    
    var name: js.UndefOr[String] = js.undefined
    
    var parent_id: js.UndefOr[String] = js.undefined
    
    var parent_value_ids: js.UndefOr[js.Array[String]] = js.undefined
    
    var price: js.UndefOr[Double] = js.undefined
    
    var required: js.UndefOr[Boolean] = js.undefined
    
    var subscription: js.UndefOr[Boolean] = js.undefined
    
    var values: js.UndefOr[js.Array[OptionValueSnake]] = js.undefined
    
    var variant: js.UndefOr[Boolean] = js.undefined
  }
  object ProductOptionCamel {
    
    inline def apply(): ProductOptionCamel = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ProductOptionCamel]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ProductOptionCamel] (val x: Self) extends AnyVal {
      
      inline def setActive(value: Boolean): Self = StObject.set(x, "active", value.asInstanceOf[js.Any])
      
      inline def setActiveUndefined: Self = StObject.set(x, "active", js.undefined)
      
      inline def setAttribute_id(value: String): Self = StObject.set(x, "attribute_id", value.asInstanceOf[js.Any])
      
      inline def setAttribute_idUndefined: Self = StObject.set(x, "attribute_id", js.undefined)
      
      inline def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
      
      inline def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
      
      inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
      
      inline def setInput_hint(value: String): Self = StObject.set(x, "input_hint", value.asInstanceOf[js.Any])
      
      inline def setInput_hintUndefined: Self = StObject.set(x, "input_hint", js.undefined)
      
      inline def setInput_multi(value: Boolean): Self = StObject.set(x, "input_multi", value.asInstanceOf[js.Any])
      
      inline def setInput_multiUndefined: Self = StObject.set(x, "input_multi", js.undefined)
      
      inline def setInput_type(value: text | textarea | select | multi_select | file | muti_file): Self = StObject.set(x, "input_type", value.asInstanceOf[js.Any])
      
      inline def setInput_typeUndefined: Self = StObject.set(x, "input_type", js.undefined)
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
      
      inline def setParent_id(value: String): Self = StObject.set(x, "parent_id", value.asInstanceOf[js.Any])
      
      inline def setParent_idUndefined: Self = StObject.set(x, "parent_id", js.undefined)
      
      inline def setParent_value_ids(value: js.Array[String]): Self = StObject.set(x, "parent_value_ids", value.asInstanceOf[js.Any])
      
      inline def setParent_value_idsUndefined: Self = StObject.set(x, "parent_value_ids", js.undefined)
      
      inline def setParent_value_idsVarargs(value: String*): Self = StObject.set(x, "parent_value_ids", js.Array(value*))
      
      inline def setPrice(value: Double): Self = StObject.set(x, "price", value.asInstanceOf[js.Any])
      
      inline def setPriceUndefined: Self = StObject.set(x, "price", js.undefined)
      
      inline def setRequired(value: Boolean): Self = StObject.set(x, "required", value.asInstanceOf[js.Any])
      
      inline def setRequiredUndefined: Self = StObject.set(x, "required", js.undefined)
      
      inline def setSubscription(value: Boolean): Self = StObject.set(x, "subscription", value.asInstanceOf[js.Any])
      
      inline def setSubscriptionUndefined: Self = StObject.set(x, "subscription", js.undefined)
      
      inline def setValues(value: js.Array[OptionValueSnake]): Self = StObject.set(x, "values", value.asInstanceOf[js.Any])
      
      inline def setValuesUndefined: Self = StObject.set(x, "values", js.undefined)
      
      inline def setValuesVarargs(value: OptionValueSnake*): Self = StObject.set(x, "values", js.Array(value*))
      
      inline def setVariant(value: Boolean): Self = StObject.set(x, "variant", value.asInstanceOf[js.Any])
      
      inline def setVariantUndefined: Self = StObject.set(x, "variant", js.undefined)
    }
  }
  
  /* Inlined {[ K in keyof swell-js.swell-js/types/product/snake.UpsellSnake as swell-js.swell-js.SnakeToCamelCase<K> ]: swell-js.swell-js/types/product/snake.UpsellSnake[K]} */
  trait UpsellCamel extends StObject {
    
    var product: js.UndefOr[String] = js.undefined
    
    var product_id: js.UndefOr[String] = js.undefined
  }
  object UpsellCamel {
    
    inline def apply(): UpsellCamel = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[UpsellCamel]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: UpsellCamel] (val x: Self) extends AnyVal {
      
      inline def setProduct(value: String): Self = StObject.set(x, "product", value.asInstanceOf[js.Any])
      
      inline def setProductUndefined: Self = StObject.set(x, "product", js.undefined)
      
      inline def setProduct_id(value: String): Self = StObject.set(x, "product_id", value.asInstanceOf[js.Any])
      
      inline def setProduct_idUndefined: Self = StObject.set(x, "product_id", js.undefined)
    }
  }
  
  /* Inlined {[ K in keyof swell-js.swell-js/types/product/snake.VariantSnake as swell-js.swell-js.SnakeToCamelCase<K> ]: swell-js.swell-js/types/product/snake.VariantSnake[K]} */
  trait VariantCamel extends StObject {
    
    var active: js.UndefOr[Boolean] = js.undefined
    
    var archived: js.UndefOr[Boolean] = js.undefined
    
    var attributes: js.UndefOr[js.Array[Attribute]] = js.undefined
    
    var code: js.UndefOr[String] = js.undefined
    
    var cost: js.UndefOr[Double] = js.undefined
    
    var currency: js.UndefOr[String] = js.undefined
    
    var date_created: js.UndefOr[String] = js.undefined
    
    var date_updated: js.UndefOr[String] = js.undefined
    
    var id: js.UndefOr[String] = js.undefined
    
    var images: js.UndefOr[js.Array[ImageSnake]] = js.undefined
    
    var name: js.UndefOr[String] = js.undefined
    
    var option_value_ids: js.UndefOr[js.Array[String]] = js.undefined
    
    var orig_price: js.UndefOr[Double] = js.undefined
    
    var parent: js.UndefOr[ProductSnake] = js.undefined
    
    var parent_id: js.UndefOr[String] = js.undefined
    
    var price: js.UndefOr[Double] = js.undefined
    
    var prices: js.UndefOr[js.Array[PriceSnake]] = js.undefined
    
    var purchase_options: js.UndefOr[PurchaseOption] = js.undefined
    
    var sku: js.UndefOr[String] = js.undefined
    
    var stock_level: js.UndefOr[Double] = js.undefined
    
    var subscription_interval: js.UndefOr[monthly | yearly | weekly | daily] = js.undefined
    
    var subscription_trial_days: js.UndefOr[Double] = js.undefined
  }
  object VariantCamel {
    
    inline def apply(): VariantCamel = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[VariantCamel]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: VariantCamel] (val x: Self) extends AnyVal {
      
      inline def setActive(value: Boolean): Self = StObject.set(x, "active", value.asInstanceOf[js.Any])
      
      inline def setActiveUndefined: Self = StObject.set(x, "active", js.undefined)
      
      inline def setArchived(value: Boolean): Self = StObject.set(x, "archived", value.asInstanceOf[js.Any])
      
      inline def setArchivedUndefined: Self = StObject.set(x, "archived", js.undefined)
      
      inline def setAttributes(value: js.Array[Attribute]): Self = StObject.set(x, "attributes", value.asInstanceOf[js.Any])
      
      inline def setAttributesUndefined: Self = StObject.set(x, "attributes", js.undefined)
      
      inline def setAttributesVarargs(value: Attribute*): Self = StObject.set(x, "attributes", js.Array(value*))
      
      inline def setCode(value: String): Self = StObject.set(x, "code", value.asInstanceOf[js.Any])
      
      inline def setCodeUndefined: Self = StObject.set(x, "code", js.undefined)
      
      inline def setCost(value: Double): Self = StObject.set(x, "cost", value.asInstanceOf[js.Any])
      
      inline def setCostUndefined: Self = StObject.set(x, "cost", js.undefined)
      
      inline def setCurrency(value: String): Self = StObject.set(x, "currency", value.asInstanceOf[js.Any])
      
      inline def setCurrencyUndefined: Self = StObject.set(x, "currency", js.undefined)
      
      inline def setDate_created(value: String): Self = StObject.set(x, "date_created", value.asInstanceOf[js.Any])
      
      inline def setDate_createdUndefined: Self = StObject.set(x, "date_created", js.undefined)
      
      inline def setDate_updated(value: String): Self = StObject.set(x, "date_updated", value.asInstanceOf[js.Any])
      
      inline def setDate_updatedUndefined: Self = StObject.set(x, "date_updated", js.undefined)
      
      inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
      
      inline def setImages(value: js.Array[ImageSnake]): Self = StObject.set(x, "images", value.asInstanceOf[js.Any])
      
      inline def setImagesUndefined: Self = StObject.set(x, "images", js.undefined)
      
      inline def setImagesVarargs(value: ImageSnake*): Self = StObject.set(x, "images", js.Array(value*))
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
      
      inline def setOption_value_ids(value: js.Array[String]): Self = StObject.set(x, "option_value_ids", value.asInstanceOf[js.Any])
      
      inline def setOption_value_idsUndefined: Self = StObject.set(x, "option_value_ids", js.undefined)
      
      inline def setOption_value_idsVarargs(value: String*): Self = StObject.set(x, "option_value_ids", js.Array(value*))
      
      inline def setOrig_price(value: Double): Self = StObject.set(x, "orig_price", value.asInstanceOf[js.Any])
      
      inline def setOrig_priceUndefined: Self = StObject.set(x, "orig_price", js.undefined)
      
      inline def setParent(value: ProductSnake): Self = StObject.set(x, "parent", value.asInstanceOf[js.Any])
      
      inline def setParentUndefined: Self = StObject.set(x, "parent", js.undefined)
      
      inline def setParent_id(value: String): Self = StObject.set(x, "parent_id", value.asInstanceOf[js.Any])
      
      inline def setParent_idUndefined: Self = StObject.set(x, "parent_id", js.undefined)
      
      inline def setPrice(value: Double): Self = StObject.set(x, "price", value.asInstanceOf[js.Any])
      
      inline def setPriceUndefined: Self = StObject.set(x, "price", js.undefined)
      
      inline def setPrices(value: js.Array[PriceSnake]): Self = StObject.set(x, "prices", value.asInstanceOf[js.Any])
      
      inline def setPricesUndefined: Self = StObject.set(x, "prices", js.undefined)
      
      inline def setPricesVarargs(value: PriceSnake*): Self = StObject.set(x, "prices", js.Array(value*))
      
      inline def setPurchase_options(value: PurchaseOption): Self = StObject.set(x, "purchase_options", value.asInstanceOf[js.Any])
      
      inline def setPurchase_optionsUndefined: Self = StObject.set(x, "purchase_options", js.undefined)
      
      inline def setSku(value: String): Self = StObject.set(x, "sku", value.asInstanceOf[js.Any])
      
      inline def setSkuUndefined: Self = StObject.set(x, "sku", js.undefined)
      
      inline def setStock_level(value: Double): Self = StObject.set(x, "stock_level", value.asInstanceOf[js.Any])
      
      inline def setStock_levelUndefined: Self = StObject.set(x, "stock_level", js.undefined)
      
      inline def setSubscription_interval(value: monthly | yearly | weekly | daily): Self = StObject.set(x, "subscription_interval", value.asInstanceOf[js.Any])
      
      inline def setSubscription_intervalUndefined: Self = StObject.set(x, "subscription_interval", js.undefined)
      
      inline def setSubscription_trial_days(value: Double): Self = StObject.set(x, "subscription_trial_days", value.asInstanceOf[js.Any])
      
      inline def setSubscription_trial_daysUndefined: Self = StObject.set(x, "subscription_trial_days", js.undefined)
    }
  }
}

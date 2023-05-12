package typings.swellJs

import typings.swellJs.mod.ResultsResponse
import typings.swellJs.typesProductSnakeMod.BundleSnake
import typings.swellJs.typesProductSnakeMod.CrossSellSnake
import typings.swellJs.typesProductSnakeMod.ImageSnake
import typings.swellJs.typesProductSnakeMod.PriceSnake
import typings.swellJs.typesProductSnakeMod.ProductOptionSnake
import typings.swellJs.typesProductSnakeMod.ProductSnake
import typings.swellJs.typesProductSnakeMod.UpsellSnake
import typings.swellJs.typesProductSnakeMod.VariantSnake
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesProductMod {
  
  /* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
  - typings.swellJs.typesProductCamelMod.BundleCamel because var conflicts: id, product, product_id, product_name, quantity, variant, variant_id. Inlined  */ trait Bundle
    extends StObject
       with BundleSnake
  object Bundle {
    
    inline def apply(): Bundle = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Bundle]
    }
  }
  
  /* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
  - typings.swellJs.typesProductCamelMod.CrossSellCamel because var conflicts: discount_amount, discount_percent, discount_type, id, product, product_id. Inlined  */ trait CrossSell
    extends StObject
       with CrossSellSnake
  object CrossSell {
    
    inline def apply(): CrossSell = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[CrossSell]
    }
  }
  
  type FlexibleProductInput = js.Array[Product] | ResultsResponse[Product]
  
  /* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
  - typings.swellJs.typesProductCamelMod.ImageCamel because var conflicts: caption, file, id. Inlined  */ trait Image
    extends StObject
       with ImageSnake
  object Image {
    
    inline def apply(): Image = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Image]
    }
  }
  
  /* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
  - typings.swellJs.typesProductCamelMod.PriceCamel because var conflicts: account_group, price, quantity_max, quantity_min. Inlined  */ trait Price
    extends StObject
       with PriceSnake
  object Price {
    
    inline def apply(): Price = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Price]
    }
  }
  
  trait PriceRange extends StObject {
    
    var interval: Double
    
    var max: Double
    
    var min: Double
  }
  object PriceRange {
    
    inline def apply(interval: Double, max: Double, min: Double): PriceRange = {
      val __obj = js.Dynamic.literal(interval = interval.asInstanceOf[js.Any], max = max.asInstanceOf[js.Any], min = min.asInstanceOf[js.Any])
      __obj.asInstanceOf[PriceRange]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: PriceRange] (val x: Self) extends AnyVal {
      
      inline def setInterval(value: Double): Self = StObject.set(x, "interval", value.asInstanceOf[js.Any])
      
      inline def setMax(value: Double): Self = StObject.set(x, "max", value.asInstanceOf[js.Any])
      
      inline def setMin(value: Double): Self = StObject.set(x, "min", value.asInstanceOf[js.Any])
    }
  }
  
  /* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
  - typings.swellJs.typesProductCamelMod.ProductCamel because var conflicts: active, attributes, bundle, bundle_items, categories, category, category_id, category_index, code, content, cost, cross_sells, currency, customizable, date_created, date_updated, delivery, description, discontinued, id, images, meta_description, meta_keywords, meta_title, name, options, orig_price, price, prices, purchase_options, quantity_inc, quantity_min, related_product_ids, sale, sale_price, shipment_dimensions, shipment_location, sku, slug, stock_level, stock_purchasable, stock_status, stock_tracking, tags, up_sells, variable, variants, virtual. Inlined  */ trait Product
    extends StObject
       with ProductSnake
  object Product {
    
    inline def apply(name: String): Product = {
      val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
      __obj.asInstanceOf[Product]
    }
  }
  
  /* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
  - typings.swellJs.typesProductCamelMod.ProductOptionCamel because var conflicts: active, attribute_id, description, id, input_hint, input_multi, input_type, name, parent_id, parent_value_ids, price, required, subscription, values, variant. Inlined  */ trait ProductOption
    extends StObject
       with ProductOptionSnake
  object ProductOption {
    
    inline def apply(): ProductOption = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ProductOption]
    }
  }
  
  trait PurchaseOption extends StObject {
    
    var standard: js.UndefOr[js.Object] = js.undefined
    
    var subscription: js.UndefOr[js.Object] = js.undefined
  }
  object PurchaseOption {
    
    inline def apply(): PurchaseOption = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PurchaseOption]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: PurchaseOption] (val x: Self) extends AnyVal {
      
      inline def setStandard(value: js.Object): Self = StObject.set(x, "standard", value.asInstanceOf[js.Any])
      
      inline def setStandardUndefined: Self = StObject.set(x, "standard", js.undefined)
      
      inline def setSubscription(value: js.Object): Self = StObject.set(x, "subscription", value.asInstanceOf[js.Any])
      
      inline def setSubscriptionUndefined: Self = StObject.set(x, "subscription", js.undefined)
    }
  }
  
  /* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
  - typings.swellJs.typesProductCamelMod.UpsellCamel because var conflicts: product, product_id. Inlined  */ trait Upsell
    extends StObject
       with UpsellSnake
  object Upsell {
    
    inline def apply(): Upsell = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Upsell]
    }
  }
  
  /* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
  - typings.swellJs.typesProductCamelMod.VariantCamel because var conflicts: active, archived, attributes, code, cost, currency, date_created, date_updated, id, images, name, option_value_ids, orig_price, parent, parent_id, price, prices, purchase_options, sku, stock_level, subscription_interval, subscription_trial_days. Inlined  */ trait Variant
    extends StObject
       with VariantSnake
  object Variant {
    
    inline def apply(): Variant = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Variant]
    }
  }
}

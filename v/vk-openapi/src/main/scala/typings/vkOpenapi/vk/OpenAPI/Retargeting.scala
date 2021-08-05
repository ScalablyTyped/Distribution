package typings.vkOpenapi.vk.OpenAPI

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Retargeting {
  
  @js.native
  trait API extends StObject {
    
    def Add(audienceId: Double): Unit = js.native
    
    def Event(eventName: String): Unit = js.native
    
    def Hit(): Unit = js.native
    
    def Init(code: String): Unit = js.native
    
    def ProductEvent(priceListId: Double, eventName: typings.vkOpenapi.vk.OpenAPI.Retargeting.ProductEvent): Unit = js.native
    def ProductEvent(
      priceListId: Double,
      eventName: typings.vkOpenapi.vk.OpenAPI.Retargeting.ProductEvent,
      eventParams: ProductEventParams
    ): Unit = js.native
  }
  
  trait Product extends StObject {
    
    var group_id: js.UndefOr[String] = js.undefined
    
    var id: String
    
    var price: js.UndefOr[Double] = js.undefined
    
    var price_from: js.UndefOr[NumericBoolean] = js.undefined
    
    var price_old: js.UndefOr[Double] = js.undefined
    
    var recommended_ids: js.UndefOr[String] = js.undefined
  }
  object Product {
    
    inline def apply(id: String): Product = {
      val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any])
      __obj.asInstanceOf[Product]
    }
    
    extension [Self <: Product](x: Self) {
      
      inline def setGroup_id(value: String): Self = StObject.set(x, "group_id", value.asInstanceOf[js.Any])
      
      inline def setGroup_idUndefined: Self = StObject.set(x, "group_id", js.undefined)
      
      inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      inline def setPrice(value: Double): Self = StObject.set(x, "price", value.asInstanceOf[js.Any])
      
      inline def setPriceUndefined: Self = StObject.set(x, "price", js.undefined)
      
      inline def setPrice_from(value: NumericBoolean): Self = StObject.set(x, "price_from", value.asInstanceOf[js.Any])
      
      inline def setPrice_fromUndefined: Self = StObject.set(x, "price_from", js.undefined)
      
      inline def setPrice_old(value: Double): Self = StObject.set(x, "price_old", value.asInstanceOf[js.Any])
      
      inline def setPrice_oldUndefined: Self = StObject.set(x, "price_old", js.undefined)
      
      inline def setRecommended_ids(value: String): Self = StObject.set(x, "recommended_ids", value.asInstanceOf[js.Any])
      
      inline def setRecommended_idsUndefined: Self = StObject.set(x, "recommended_ids", js.undefined)
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.vkOpenapi.vkOpenapiStrings.view_home
    - typings.vkOpenapi.vkOpenapiStrings.view_category
    - typings.vkOpenapi.vkOpenapiStrings.view_product
    - typings.vkOpenapi.vkOpenapiStrings.view_search
    - typings.vkOpenapi.vkOpenapiStrings.view_other
    - typings.vkOpenapi.vkOpenapiStrings.add_to_wishlist
    - typings.vkOpenapi.vkOpenapiStrings.add_to_cart
    - typings.vkOpenapi.vkOpenapiStrings.remove_from_wishlist
    - typings.vkOpenapi.vkOpenapiStrings.remove_from_cart
    - typings.vkOpenapi.vkOpenapiStrings.init_checkout
    - typings.vkOpenapi.vkOpenapiStrings.add_payment_info
    - typings.vkOpenapi.vkOpenapiStrings.purchase
  */
  trait ProductEvent extends StObject
  object ProductEvent {
    
    inline def add_payment_info: typings.vkOpenapi.vkOpenapiStrings.add_payment_info = "add_payment_info".asInstanceOf[typings.vkOpenapi.vkOpenapiStrings.add_payment_info]
    
    inline def add_to_cart: typings.vkOpenapi.vkOpenapiStrings.add_to_cart = "add_to_cart".asInstanceOf[typings.vkOpenapi.vkOpenapiStrings.add_to_cart]
    
    inline def add_to_wishlist: typings.vkOpenapi.vkOpenapiStrings.add_to_wishlist = "add_to_wishlist".asInstanceOf[typings.vkOpenapi.vkOpenapiStrings.add_to_wishlist]
    
    inline def init_checkout: typings.vkOpenapi.vkOpenapiStrings.init_checkout = "init_checkout".asInstanceOf[typings.vkOpenapi.vkOpenapiStrings.init_checkout]
    
    inline def purchase: typings.vkOpenapi.vkOpenapiStrings.purchase = "purchase".asInstanceOf[typings.vkOpenapi.vkOpenapiStrings.purchase]
    
    inline def remove_from_cart: typings.vkOpenapi.vkOpenapiStrings.remove_from_cart = "remove_from_cart".asInstanceOf[typings.vkOpenapi.vkOpenapiStrings.remove_from_cart]
    
    inline def remove_from_wishlist: typings.vkOpenapi.vkOpenapiStrings.remove_from_wishlist = "remove_from_wishlist".asInstanceOf[typings.vkOpenapi.vkOpenapiStrings.remove_from_wishlist]
    
    inline def view_category: typings.vkOpenapi.vkOpenapiStrings.view_category = "view_category".asInstanceOf[typings.vkOpenapi.vkOpenapiStrings.view_category]
    
    inline def view_home: typings.vkOpenapi.vkOpenapiStrings.view_home = "view_home".asInstanceOf[typings.vkOpenapi.vkOpenapiStrings.view_home]
    
    inline def view_other: typings.vkOpenapi.vkOpenapiStrings.view_other = "view_other".asInstanceOf[typings.vkOpenapi.vkOpenapiStrings.view_other]
    
    inline def view_product: typings.vkOpenapi.vkOpenapiStrings.view_product = "view_product".asInstanceOf[typings.vkOpenapi.vkOpenapiStrings.view_product]
    
    inline def view_search: typings.vkOpenapi.vkOpenapiStrings.view_search = "view_search".asInstanceOf[typings.vkOpenapi.vkOpenapiStrings.view_search]
  }
  
  trait ProductEventParams extends StObject {
    
    var business_value: js.UndefOr[Double] = js.undefined
    
    var category_ids: js.UndefOr[String] = js.undefined
    
    var currency_code: js.UndefOr[String] = js.undefined
    
    var products: js.UndefOr[js.Array[Product]] = js.undefined
    
    var products_recommended_ids: js.UndefOr[String] = js.undefined
    
    var search_string: js.UndefOr[String] = js.undefined
    
    var total_price: js.UndefOr[Double] = js.undefined
  }
  object ProductEventParams {
    
    inline def apply(): ProductEventParams = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ProductEventParams]
    }
    
    extension [Self <: ProductEventParams](x: Self) {
      
      inline def setBusiness_value(value: Double): Self = StObject.set(x, "business_value", value.asInstanceOf[js.Any])
      
      inline def setBusiness_valueUndefined: Self = StObject.set(x, "business_value", js.undefined)
      
      inline def setCategory_ids(value: String): Self = StObject.set(x, "category_ids", value.asInstanceOf[js.Any])
      
      inline def setCategory_idsUndefined: Self = StObject.set(x, "category_ids", js.undefined)
      
      inline def setCurrency_code(value: String): Self = StObject.set(x, "currency_code", value.asInstanceOf[js.Any])
      
      inline def setCurrency_codeUndefined: Self = StObject.set(x, "currency_code", js.undefined)
      
      inline def setProducts(value: js.Array[Product]): Self = StObject.set(x, "products", value.asInstanceOf[js.Any])
      
      inline def setProductsUndefined: Self = StObject.set(x, "products", js.undefined)
      
      inline def setProductsVarargs(value: Product*): Self = StObject.set(x, "products", js.Array(value :_*))
      
      inline def setProducts_recommended_ids(value: String): Self = StObject.set(x, "products_recommended_ids", value.asInstanceOf[js.Any])
      
      inline def setProducts_recommended_idsUndefined: Self = StObject.set(x, "products_recommended_ids", js.undefined)
      
      inline def setSearch_string(value: String): Self = StObject.set(x, "search_string", value.asInstanceOf[js.Any])
      
      inline def setSearch_stringUndefined: Self = StObject.set(x, "search_string", js.undefined)
      
      inline def setTotal_price(value: Double): Self = StObject.set(x, "total_price", value.asInstanceOf[js.Any])
      
      inline def setTotal_priceUndefined: Self = StObject.set(x, "total_price", js.undefined)
    }
  }
}

package typings.swellJs

import typings.swellJs.swellJsStrings.coupon
import typings.swellJs.swellJsStrings.promo
import typings.swellJs.typesCouponMod.Coupon
import typings.swellJs.typesPromotionMod.Promotion
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesPurchaseLinkSnakeMod {
  
  trait PurchaseLinkDiscountSnake extends StObject {
    
    var amount: js.UndefOr[Double] = js.undefined
    
    var id: js.UndefOr[String] = js.undefined
    
    var rule: js.UndefOr[Any] = js.undefined
    
    var `type`: js.UndefOr[coupon | promo] = js.undefined
  }
  object PurchaseLinkDiscountSnake {
    
    inline def apply(): PurchaseLinkDiscountSnake = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PurchaseLinkDiscountSnake]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: PurchaseLinkDiscountSnake] (val x: Self) extends AnyVal {
      
      inline def setAmount(value: Double): Self = StObject.set(x, "amount", value.asInstanceOf[js.Any])
      
      inline def setAmountUndefined: Self = StObject.set(x, "amount", js.undefined)
      
      inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
      
      inline def setRule(value: Any): Self = StObject.set(x, "rule", value.asInstanceOf[js.Any])
      
      inline def setRuleUndefined: Self = StObject.set(x, "rule", js.undefined)
      
      inline def setType(value: coupon | promo): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    }
  }
  
  trait PurchaseLinkSnake extends StObject {
    
    var active: js.UndefOr[Boolean] = js.undefined
    
    var coupon: js.UndefOr[Coupon] = js.undefined
    
    var coupon_id: js.UndefOr[String] = js.undefined
    
    var currency: js.UndefOr[String] = js.undefined
    
    var discount_total: js.UndefOr[Double] = js.undefined
    
    var discounts: js.UndefOr[js.Array[PurchaseLinkDiscountSnake]] = js.undefined
    
    var grand_total: js.UndefOr[Double] = js.undefined
    
    var item_discount: js.UndefOr[Double] = js.undefined
    
    var items: js.UndefOr[js.Array[Any]] = js.undefined
    
    var metadata: js.UndefOr[Any] = js.undefined
    
    var name: js.UndefOr[String] = js.undefined
    
    var promotion_ids: js.UndefOr[js.Array[String]] = js.undefined
    
    var promotions: js.UndefOr[js.Array[Promotion]] = js.undefined
    
    var sub_total: js.UndefOr[Double] = js.undefined
  }
  object PurchaseLinkSnake {
    
    inline def apply(): PurchaseLinkSnake = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PurchaseLinkSnake]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: PurchaseLinkSnake] (val x: Self) extends AnyVal {
      
      inline def setActive(value: Boolean): Self = StObject.set(x, "active", value.asInstanceOf[js.Any])
      
      inline def setActiveUndefined: Self = StObject.set(x, "active", js.undefined)
      
      inline def setCoupon(value: Coupon): Self = StObject.set(x, "coupon", value.asInstanceOf[js.Any])
      
      inline def setCouponUndefined: Self = StObject.set(x, "coupon", js.undefined)
      
      inline def setCoupon_id(value: String): Self = StObject.set(x, "coupon_id", value.asInstanceOf[js.Any])
      
      inline def setCoupon_idUndefined: Self = StObject.set(x, "coupon_id", js.undefined)
      
      inline def setCurrency(value: String): Self = StObject.set(x, "currency", value.asInstanceOf[js.Any])
      
      inline def setCurrencyUndefined: Self = StObject.set(x, "currency", js.undefined)
      
      inline def setDiscount_total(value: Double): Self = StObject.set(x, "discount_total", value.asInstanceOf[js.Any])
      
      inline def setDiscount_totalUndefined: Self = StObject.set(x, "discount_total", js.undefined)
      
      inline def setDiscounts(value: js.Array[PurchaseLinkDiscountSnake]): Self = StObject.set(x, "discounts", value.asInstanceOf[js.Any])
      
      inline def setDiscountsUndefined: Self = StObject.set(x, "discounts", js.undefined)
      
      inline def setDiscountsVarargs(value: PurchaseLinkDiscountSnake*): Self = StObject.set(x, "discounts", js.Array(value*))
      
      inline def setGrand_total(value: Double): Self = StObject.set(x, "grand_total", value.asInstanceOf[js.Any])
      
      inline def setGrand_totalUndefined: Self = StObject.set(x, "grand_total", js.undefined)
      
      inline def setItem_discount(value: Double): Self = StObject.set(x, "item_discount", value.asInstanceOf[js.Any])
      
      inline def setItem_discountUndefined: Self = StObject.set(x, "item_discount", js.undefined)
      
      inline def setItems(value: js.Array[Any]): Self = StObject.set(x, "items", value.asInstanceOf[js.Any])
      
      inline def setItemsUndefined: Self = StObject.set(x, "items", js.undefined)
      
      inline def setItemsVarargs(value: Any*): Self = StObject.set(x, "items", js.Array(value*))
      
      inline def setMetadata(value: Any): Self = StObject.set(x, "metadata", value.asInstanceOf[js.Any])
      
      inline def setMetadataUndefined: Self = StObject.set(x, "metadata", js.undefined)
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
      
      inline def setPromotion_ids(value: js.Array[String]): Self = StObject.set(x, "promotion_ids", value.asInstanceOf[js.Any])
      
      inline def setPromotion_idsUndefined: Self = StObject.set(x, "promotion_ids", js.undefined)
      
      inline def setPromotion_idsVarargs(value: String*): Self = StObject.set(x, "promotion_ids", js.Array(value*))
      
      inline def setPromotions(value: js.Array[Promotion]): Self = StObject.set(x, "promotions", value.asInstanceOf[js.Any])
      
      inline def setPromotionsUndefined: Self = StObject.set(x, "promotions", js.undefined)
      
      inline def setPromotionsVarargs(value: Promotion*): Self = StObject.set(x, "promotions", js.Array(value*))
      
      inline def setSub_total(value: Double): Self = StObject.set(x, "sub_total", value.asInstanceOf[js.Any])
      
      inline def setSub_totalUndefined: Self = StObject.set(x, "sub_total", js.undefined)
    }
  }
}

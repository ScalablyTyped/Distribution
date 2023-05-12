package typings.swellJs

import typings.swellJs.typesOrderMod.Order
import typings.swellJs.typesSubscriptionMod.Subscription
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesPromotionCamelMod {
  
  /* Inlined {[ K in keyof swell-js.PromotionSnake as swell-js.swell-js.SnakeToCamelCase<K> ]: swell-js.PromotionSnake[K]} */
  trait PromotionCamel extends StObject {
    
    var active: js.UndefOr[Boolean] = js.undefined
    
    var currency: js.UndefOr[String] = js.undefined
    
    var date_created: js.UndefOr[String] = js.undefined
    
    var date_end: js.UndefOr[String] = js.undefined
    
    var date_start: js.UndefOr[String] = js.undefined
    
    var date_updated: js.UndefOr[String] = js.undefined
    
    var description: js.UndefOr[String] = js.undefined
    
    var discount_group: js.UndefOr[String] = js.undefined
    
    var discounts: js.UndefOr[js.Array[Any]] = js.undefined
    
    var exclusions: js.UndefOr[js.Array[Any]] = js.undefined
    
    var id: js.UndefOr[String] = js.undefined
    
    var limit_account_groups: js.UndefOr[js.Array[Any]] = js.undefined
    
    var limit_account_uses: js.UndefOr[Double] = js.undefined
    
    var limit_uses: js.UndefOr[Double] = js.undefined
    
    var name: js.UndefOr[String] = js.undefined
    
    var orders: js.UndefOr[js.Array[Order]] = js.undefined
    
    var subscriptions: js.UndefOr[js.Array[Subscription]] = js.undefined
    
    var use_count: js.UndefOr[Double] = js.undefined
    
    var uses: js.UndefOr[js.Array[Any]] = js.undefined
  }
  object PromotionCamel {
    
    inline def apply(): PromotionCamel = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PromotionCamel]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: PromotionCamel] (val x: Self) extends AnyVal {
      
      inline def setActive(value: Boolean): Self = StObject.set(x, "active", value.asInstanceOf[js.Any])
      
      inline def setActiveUndefined: Self = StObject.set(x, "active", js.undefined)
      
      inline def setCurrency(value: String): Self = StObject.set(x, "currency", value.asInstanceOf[js.Any])
      
      inline def setCurrencyUndefined: Self = StObject.set(x, "currency", js.undefined)
      
      inline def setDate_created(value: String): Self = StObject.set(x, "date_created", value.asInstanceOf[js.Any])
      
      inline def setDate_createdUndefined: Self = StObject.set(x, "date_created", js.undefined)
      
      inline def setDate_end(value: String): Self = StObject.set(x, "date_end", value.asInstanceOf[js.Any])
      
      inline def setDate_endUndefined: Self = StObject.set(x, "date_end", js.undefined)
      
      inline def setDate_start(value: String): Self = StObject.set(x, "date_start", value.asInstanceOf[js.Any])
      
      inline def setDate_startUndefined: Self = StObject.set(x, "date_start", js.undefined)
      
      inline def setDate_updated(value: String): Self = StObject.set(x, "date_updated", value.asInstanceOf[js.Any])
      
      inline def setDate_updatedUndefined: Self = StObject.set(x, "date_updated", js.undefined)
      
      inline def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
      
      inline def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
      
      inline def setDiscount_group(value: String): Self = StObject.set(x, "discount_group", value.asInstanceOf[js.Any])
      
      inline def setDiscount_groupUndefined: Self = StObject.set(x, "discount_group", js.undefined)
      
      inline def setDiscounts(value: js.Array[Any]): Self = StObject.set(x, "discounts", value.asInstanceOf[js.Any])
      
      inline def setDiscountsUndefined: Self = StObject.set(x, "discounts", js.undefined)
      
      inline def setDiscountsVarargs(value: Any*): Self = StObject.set(x, "discounts", js.Array(value*))
      
      inline def setExclusions(value: js.Array[Any]): Self = StObject.set(x, "exclusions", value.asInstanceOf[js.Any])
      
      inline def setExclusionsUndefined: Self = StObject.set(x, "exclusions", js.undefined)
      
      inline def setExclusionsVarargs(value: Any*): Self = StObject.set(x, "exclusions", js.Array(value*))
      
      inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
      
      inline def setLimit_account_groups(value: js.Array[Any]): Self = StObject.set(x, "limit_account_groups", value.asInstanceOf[js.Any])
      
      inline def setLimit_account_groupsUndefined: Self = StObject.set(x, "limit_account_groups", js.undefined)
      
      inline def setLimit_account_groupsVarargs(value: Any*): Self = StObject.set(x, "limit_account_groups", js.Array(value*))
      
      inline def setLimit_account_uses(value: Double): Self = StObject.set(x, "limit_account_uses", value.asInstanceOf[js.Any])
      
      inline def setLimit_account_usesUndefined: Self = StObject.set(x, "limit_account_uses", js.undefined)
      
      inline def setLimit_uses(value: Double): Self = StObject.set(x, "limit_uses", value.asInstanceOf[js.Any])
      
      inline def setLimit_usesUndefined: Self = StObject.set(x, "limit_uses", js.undefined)
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
      
      inline def setOrders(value: js.Array[Order]): Self = StObject.set(x, "orders", value.asInstanceOf[js.Any])
      
      inline def setOrdersUndefined: Self = StObject.set(x, "orders", js.undefined)
      
      inline def setOrdersVarargs(value: Order*): Self = StObject.set(x, "orders", js.Array(value*))
      
      inline def setSubscriptions(value: js.Array[Subscription]): Self = StObject.set(x, "subscriptions", value.asInstanceOf[js.Any])
      
      inline def setSubscriptionsUndefined: Self = StObject.set(x, "subscriptions", js.undefined)
      
      inline def setSubscriptionsVarargs(value: Subscription*): Self = StObject.set(x, "subscriptions", js.Array(value*))
      
      inline def setUse_count(value: Double): Self = StObject.set(x, "use_count", value.asInstanceOf[js.Any])
      
      inline def setUse_countUndefined: Self = StObject.set(x, "use_count", js.undefined)
      
      inline def setUses(value: js.Array[Any]): Self = StObject.set(x, "uses", value.asInstanceOf[js.Any])
      
      inline def setUsesUndefined: Self = StObject.set(x, "uses", js.undefined)
      
      inline def setUsesVarargs(value: Any*): Self = StObject.set(x, "uses", js.Array(value*))
    }
  }
}

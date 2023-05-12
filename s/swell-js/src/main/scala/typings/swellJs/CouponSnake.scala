package typings.swellJs

import typings.swellJs.mod.BaseModel
import typings.swellJs.typesOrderMod.Order
import typings.swellJs.typesSubscriptionMod.Subscription
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CouponSnake
  extends StObject
     with BaseModel {
  
  var account_id: js.UndefOr[String] = js.undefined
  
  var order: js.UndefOr[Order] = js.undefined
  
  var order_id: js.UndefOr[String] = js.undefined
  
  var parent: js.UndefOr[CouponSnake] = js.undefined
  
  var parent_id: js.UndefOr[String] = js.undefined
  
  var subscription: js.UndefOr[Subscription] = js.undefined
  
  var subscription_id: js.UndefOr[String] = js.undefined
}
object CouponSnake {
  
  inline def apply(): CouponSnake = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CouponSnake]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CouponSnake] (val x: Self) extends AnyVal {
    
    inline def setAccount_id(value: String): Self = StObject.set(x, "account_id", value.asInstanceOf[js.Any])
    
    inline def setAccount_idUndefined: Self = StObject.set(x, "account_id", js.undefined)
    
    inline def setOrder(value: Order): Self = StObject.set(x, "order", value.asInstanceOf[js.Any])
    
    inline def setOrderUndefined: Self = StObject.set(x, "order", js.undefined)
    
    inline def setOrder_id(value: String): Self = StObject.set(x, "order_id", value.asInstanceOf[js.Any])
    
    inline def setOrder_idUndefined: Self = StObject.set(x, "order_id", js.undefined)
    
    inline def setParent(value: CouponSnake): Self = StObject.set(x, "parent", value.asInstanceOf[js.Any])
    
    inline def setParentUndefined: Self = StObject.set(x, "parent", js.undefined)
    
    inline def setParent_id(value: String): Self = StObject.set(x, "parent_id", value.asInstanceOf[js.Any])
    
    inline def setParent_idUndefined: Self = StObject.set(x, "parent_id", js.undefined)
    
    inline def setSubscription(value: Subscription): Self = StObject.set(x, "subscription", value.asInstanceOf[js.Any])
    
    inline def setSubscriptionUndefined: Self = StObject.set(x, "subscription", js.undefined)
    
    inline def setSubscription_id(value: String): Self = StObject.set(x, "subscription_id", value.asInstanceOf[js.Any])
    
    inline def setSubscription_idUndefined: Self = StObject.set(x, "subscription_id", js.undefined)
  }
}

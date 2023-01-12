package typings.wordpressComponents.anon

import typings.wordpressComponents.queryControlsMod.QueryControls.Order
import typings.wordpressComponents.queryControlsMod.QueryControls.OrderBy
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait OnOrderByChange extends StObject {
  
  def onOrderByChange(orderBy: OrderBy): Unit
  
  def onOrderChange(order: Order): Unit
  
  var order: Order
  
  var orderBy: OrderBy
}
object OnOrderByChange {
  
  inline def apply(onOrderByChange: OrderBy => Unit, onOrderChange: Order => Unit, order: Order, orderBy: OrderBy): OnOrderByChange = {
    val __obj = js.Dynamic.literal(onOrderByChange = js.Any.fromFunction1(onOrderByChange), onOrderChange = js.Any.fromFunction1(onOrderChange), order = order.asInstanceOf[js.Any], orderBy = orderBy.asInstanceOf[js.Any])
    __obj.asInstanceOf[OnOrderByChange]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: OnOrderByChange] (val x: Self) extends AnyVal {
    
    inline def setOnOrderByChange(value: OrderBy => Unit): Self = StObject.set(x, "onOrderByChange", js.Any.fromFunction1(value))
    
    inline def setOnOrderChange(value: Order => Unit): Self = StObject.set(x, "onOrderChange", js.Any.fromFunction1(value))
    
    inline def setOrder(value: Order): Self = StObject.set(x, "order", value.asInstanceOf[js.Any])
    
    inline def setOrderBy(value: OrderBy): Self = StObject.set(x, "orderBy", value.asInstanceOf[js.Any])
  }
}

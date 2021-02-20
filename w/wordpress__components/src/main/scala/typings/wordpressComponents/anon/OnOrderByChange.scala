package typings.wordpressComponents.anon

import typings.wordpressComponents.queryControlsMod.QueryControls.Order
import typings.wordpressComponents.queryControlsMod.QueryControls.OrderBy
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait OnOrderByChange extends StObject {
  
  def onOrderByChange(orderBy: OrderBy): Unit = js.native
  
  def onOrderChange(order: Order): Unit = js.native
  
  var order: Order = js.native
  
  var orderBy: OrderBy = js.native
}
object OnOrderByChange {
  
  @scala.inline
  def apply(onOrderByChange: OrderBy => Unit, onOrderChange: Order => Unit, order: Order, orderBy: OrderBy): OnOrderByChange = {
    val __obj = js.Dynamic.literal(onOrderByChange = js.Any.fromFunction1(onOrderByChange), onOrderChange = js.Any.fromFunction1(onOrderChange), order = order.asInstanceOf[js.Any], orderBy = orderBy.asInstanceOf[js.Any])
    __obj.asInstanceOf[OnOrderByChange]
  }
  
  @scala.inline
  implicit class OnOrderByChangeMutableBuilder[Self <: OnOrderByChange] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setOnOrderByChange(value: OrderBy => Unit): Self = StObject.set(x, "onOrderByChange", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnOrderChange(value: Order => Unit): Self = StObject.set(x, "onOrderChange", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOrder(value: Order): Self = StObject.set(x, "order", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOrderBy(value: OrderBy): Self = StObject.set(x, "orderBy", value.asInstanceOf[js.Any])
  }
}

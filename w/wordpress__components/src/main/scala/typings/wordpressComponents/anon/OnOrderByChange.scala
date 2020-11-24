package typings.wordpressComponents.anon

import typings.wordpressComponents.queryControlsMod.QueryControls.Order
import typings.wordpressComponents.queryControlsMod.QueryControls.OrderBy
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait OnOrderByChange extends js.Object {
  
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
  implicit class OnOrderByChangeOps[Self <: OnOrderByChange] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setOnOrderByChange(value: OrderBy => Unit): Self = this.set("onOrderByChange", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnOrderChange(value: Order => Unit): Self = this.set("onOrderChange", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOrder(value: Order): Self = this.set("order", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOrderBy(value: OrderBy): Self = this.set("orderBy", value.asInstanceOf[js.Any])
  }
}

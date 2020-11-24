package typings.stripe.mod.orders

import typings.stripe.anon.Fulfilled
import typings.stripe.mod.IListOptionsCreated
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IOrderListOptions extends IListOptionsCreated {
  
  /**
    * Only return orders for the given customer
    */
  var customer: js.UndefOr[String] = js.native
  
  /**
    * Only return orders with the given IDs
    */
  var ids: js.UndefOr[js.Array[String]] = js.native
  
  /**
    * Only return orders that have the given status. One of "created", "paid", "fulfilled", or "refunded".
    */
  var status: OrderStatus = js.native
  
  /**
    * Filter orders based on when they were "paid", "fulfilled", "canceled", or "returned"
    */
  var status_transitions: js.UndefOr[Fulfilled] = js.native
}
object IOrderListOptions {
  
  @scala.inline
  def apply(status: OrderStatus): IOrderListOptions = {
    val __obj = js.Dynamic.literal(status = status.asInstanceOf[js.Any])
    __obj.asInstanceOf[IOrderListOptions]
  }
  
  @scala.inline
  implicit class IOrderListOptionsOps[Self <: IOrderListOptions] (val x: Self) extends AnyVal {
    
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
    def setStatus(value: OrderStatus): Self = this.set("status", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCustomer(value: String): Self = this.set("customer", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCustomer: Self = this.set("customer", js.undefined)
    
    @scala.inline
    def setIdsVarargs(value: String*): Self = this.set("ids", js.Array(value :_*))
    
    @scala.inline
    def setIds(value: js.Array[String]): Self = this.set("ids", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIds: Self = this.set("ids", js.undefined)
    
    @scala.inline
    def setStatus_transitions(value: Fulfilled): Self = this.set("status_transitions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStatus_transitions: Self = this.set("status_transitions", js.undefined)
  }
}

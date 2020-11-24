package typings.stripe.mod.checkouts.sessions

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ICheckOutCreationSubscriptionDataItem extends js.Object {
  
  /**
    * Plan ID for this item.
    */
  var plan: String = js.native
  
  /**
    * Quantity for this item.
    */
  var quantity: js.UndefOr[Double] = js.native
}
object ICheckOutCreationSubscriptionDataItem {
  
  @scala.inline
  def apply(plan: String): ICheckOutCreationSubscriptionDataItem = {
    val __obj = js.Dynamic.literal(plan = plan.asInstanceOf[js.Any])
    __obj.asInstanceOf[ICheckOutCreationSubscriptionDataItem]
  }
  
  @scala.inline
  implicit class ICheckOutCreationSubscriptionDataItemOps[Self <: ICheckOutCreationSubscriptionDataItem] (val x: Self) extends AnyVal {
    
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
    def setPlan(value: String): Self = this.set("plan", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setQuantity(value: Double): Self = this.set("quantity", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteQuantity: Self = this.set("quantity", js.undefined)
  }
}

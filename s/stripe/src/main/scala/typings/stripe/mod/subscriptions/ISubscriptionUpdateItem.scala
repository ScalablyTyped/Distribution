package typings.stripe.mod.subscriptions

import typings.stripe.mod.IOptionsMetadata
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ISubscriptionUpdateItem extends js.Object {
  
  /**
    * Delete all usage for a given subscription item. Only allowed when deleted is set to true and the current plan’s
    * usage_type is metered.
    */
  var clear_usage: js.UndefOr[Boolean] = js.native
  
  /**
    * Delete the specified item if set to true.
    */
  var deleted: js.UndefOr[Boolean] = js.native
  
  /**
    * SubscriptionItem to update.
    */
  var id: js.UndefOr[String] = js.native
  
  /**
    * Set of key/value pairs that you can attach to an object. It can be useful for storing additional information about
    * the object in a structured format.
    */
  var metadata: js.UndefOr[IOptionsMetadata] = js.native
  
  /**
    * Plan ID for this item.
    */
  var plan: js.UndefOr[String] = js.native
  
  /**
    * Quantity for this item.
    */
  var quantity: js.UndefOr[Double] = js.native
}
object ISubscriptionUpdateItem {
  
  @scala.inline
  def apply(): ISubscriptionUpdateItem = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ISubscriptionUpdateItem]
  }
  
  @scala.inline
  implicit class ISubscriptionUpdateItemOps[Self <: ISubscriptionUpdateItem] (val x: Self) extends AnyVal {
    
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
    def setClear_usage(value: Boolean): Self = this.set("clear_usage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteClear_usage: Self = this.set("clear_usage", js.undefined)
    
    @scala.inline
    def setDeleted(value: Boolean): Self = this.set("deleted", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDeleted: Self = this.set("deleted", js.undefined)
    
    @scala.inline
    def setId(value: String): Self = this.set("id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteId: Self = this.set("id", js.undefined)
    
    @scala.inline
    def setMetadata(value: IOptionsMetadata): Self = this.set("metadata", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMetadata: Self = this.set("metadata", js.undefined)
    
    @scala.inline
    def setPlan(value: String): Self = this.set("plan", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePlan: Self = this.set("plan", js.undefined)
    
    @scala.inline
    def setQuantity(value: Double): Self = this.set("quantity", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteQuantity: Self = this.set("quantity", js.undefined)
  }
}

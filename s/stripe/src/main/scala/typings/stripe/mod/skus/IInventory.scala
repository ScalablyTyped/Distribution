package typings.stripe.mod.skus

import typings.stripe.stripeStrings.bucket
import typings.stripe.stripeStrings.finite
import typings.stripe.stripeStrings.in_stock
import typings.stripe.stripeStrings.infinite
import typings.stripe.stripeStrings.limited
import typings.stripe.stripeStrings.out_of_stock
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Description of the SKU’s inventory.
  */
@js.native
trait IInventory extends js.Object {
  
  /**
    * The count of inventory available. Will be present if and only if type is "finite".
    *
    * Positive integer or zero
    */
  var quantity: js.UndefOr[Double] = js.native
  
  /**
    * Inventory type. Possible values are "finite", "bucket"" (not quantified), and "infinite".
    */
  var `type`: finite | bucket | infinite = js.native
  
  /**
    * An indicator of the inventory available. Possible values are "in_stock", "limited", and "out_of_stock".
    * Will be present if and only if type is "bucket".
    */
  var value: js.UndefOr[in_stock | limited | out_of_stock] = js.native
}
object IInventory {
  
  @scala.inline
  def apply(`type`: finite | bucket | infinite): IInventory = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[IInventory]
  }
  
  @scala.inline
  implicit class IInventoryOps[Self <: IInventory] (val x: Self) extends AnyVal {
    
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
    def setType(value: finite | bucket | infinite): Self = this.set("type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setQuantity(value: Double): Self = this.set("quantity", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteQuantity: Self = this.set("quantity", js.undefined)
    
    @scala.inline
    def setValue(value: in_stock | limited | out_of_stock): Self = this.set("value", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteValue: Self = this.set("value", js.undefined)
  }
}

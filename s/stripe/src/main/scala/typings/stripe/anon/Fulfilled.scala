package typings.stripe.anon

import typings.stripe.mod.IDateFilter
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Fulfilled extends js.Object {
  
  /**
    * A filter on the list based on the object canceled field. The value can be a string with an integer Unix timestamp,
    * or it can be a dictionary with the following options:
    */
  var canceled: js.UndefOr[IDateFilter] = js.native
  
  /**
    * A filter on the list based on the object fulfilled field. The value can be a string with an integer Unix timestamp,
    * or it can be a dictionary with the following options:
    */
  var fulfilled: js.UndefOr[IDateFilter] = js.native
  
  /**
    * A filter on the list based on the object paid field. The value can be a string with an integer Unix timestamp,
    * or it can be a dictionary with the following options:
    */
  var paid: js.UndefOr[IDateFilter] = js.native
  
  /**
    * A filter on the list based on the object returned field. The value can be a string with an integer Unix timestamp,
    * or it can be a dictionary with the following options:
    */
  var returned: js.UndefOr[IDateFilter] = js.native
}
object Fulfilled {
  
  @scala.inline
  def apply(): Fulfilled = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Fulfilled]
  }
  
  @scala.inline
  implicit class FulfilledOps[Self <: Fulfilled] (val x: Self) extends AnyVal {
    
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
    def setCanceled(value: IDateFilter): Self = this.set("canceled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCanceled: Self = this.set("canceled", js.undefined)
    
    @scala.inline
    def setFulfilled(value: IDateFilter): Self = this.set("fulfilled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFulfilled: Self = this.set("fulfilled", js.undefined)
    
    @scala.inline
    def setPaid(value: IDateFilter): Self = this.set("paid", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePaid: Self = this.set("paid", js.undefined)
    
    @scala.inline
    def setReturned(value: IDateFilter): Self = this.set("returned", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteReturned: Self = this.set("returned", js.undefined)
  }
}

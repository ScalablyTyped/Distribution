package typings.stripe.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Canceled extends js.Object {
  
  var canceled: Double = js.native
  
  var fulfiled: Double = js.native
  
  var paid: Double = js.native
  
  var returned: Double = js.native
}
object Canceled {
  
  @scala.inline
  def apply(canceled: Double, fulfiled: Double, paid: Double, returned: Double): Canceled = {
    val __obj = js.Dynamic.literal(canceled = canceled.asInstanceOf[js.Any], fulfiled = fulfiled.asInstanceOf[js.Any], paid = paid.asInstanceOf[js.Any], returned = returned.asInstanceOf[js.Any])
    __obj.asInstanceOf[Canceled]
  }
  
  @scala.inline
  implicit class CanceledOps[Self <: Canceled] (val x: Self) extends AnyVal {
    
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
    def setCanceled(value: Double): Self = this.set("canceled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFulfiled(value: Double): Self = this.set("fulfiled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPaid(value: Double): Self = this.set("paid", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReturned(value: Double): Self = this.set("returned", value.asInstanceOf[js.Any])
  }
}

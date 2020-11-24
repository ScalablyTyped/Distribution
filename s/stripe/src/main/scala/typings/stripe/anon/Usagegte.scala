package typings.stripe.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Usagegte extends js.Object {
  
  /**
    * Usage threshold that triggers the subscription to create an invoice
    */
  var usage_gte: Double = js.native
}
object Usagegte {
  
  @scala.inline
  def apply(usage_gte: Double): Usagegte = {
    val __obj = js.Dynamic.literal(usage_gte = usage_gte.asInstanceOf[js.Any])
    __obj.asInstanceOf[Usagegte]
  }
  
  @scala.inline
  implicit class UsagegteOps[Self <: Usagegte] (val x: Self) extends AnyVal {
    
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
    def setUsage_gte(value: Double): Self = this.set("usage_gte", value.asInstanceOf[js.Any])
  }
}

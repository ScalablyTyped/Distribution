package typings.vsoNodeApi.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AfterGatesAlways extends js.Object {
  
  var afterGatesAlways: scala.Double = js.native
  
  var afterSuccessfulGates: scala.Double = js.native
  
  var beforeGates: scala.Double = js.native
}
object AfterGatesAlways {
  
  @scala.inline
  def apply(afterGatesAlways: scala.Double, afterSuccessfulGates: scala.Double, beforeGates: scala.Double): AfterGatesAlways = {
    val __obj = js.Dynamic.literal(afterGatesAlways = afterGatesAlways.asInstanceOf[js.Any], afterSuccessfulGates = afterSuccessfulGates.asInstanceOf[js.Any], beforeGates = beforeGates.asInstanceOf[js.Any])
    __obj.asInstanceOf[AfterGatesAlways]
  }
  
  @scala.inline
  implicit class AfterGatesAlwaysOps[Self <: AfterGatesAlways] (val x: Self) extends AnyVal {
    
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
    def setAfterGatesAlways(value: scala.Double): Self = this.set("afterGatesAlways", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAfterSuccessfulGates(value: scala.Double): Self = this.set("afterSuccessfulGates", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBeforeGates(value: scala.Double): Self = this.set("beforeGates", value.asInstanceOf[js.Any])
  }
}

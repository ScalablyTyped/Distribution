package typings.vsoNodeApi.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Inactive extends js.Object {
  
  var active: scala.Double = js.native
  
  var inactive: scala.Double = js.native
}
object Inactive {
  
  @scala.inline
  def apply(active: scala.Double, inactive: scala.Double): Inactive = {
    val __obj = js.Dynamic.literal(active = active.asInstanceOf[js.Any], inactive = inactive.asInstanceOf[js.Any])
    __obj.asInstanceOf[Inactive]
  }
  
  @scala.inline
  implicit class InactiveOps[Self <: Inactive] (val x: Self) extends AnyVal {
    
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
    def setActive(value: scala.Double): Self = this.set("active", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInactive(value: scala.Double): Self = this.set("inactive", value.asInstanceOf[js.Any])
  }
}

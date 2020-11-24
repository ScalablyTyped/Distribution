package typings.vsoNodeApi.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Active extends js.Object {
  
  var active: scala.Double = js.native
  
  var byDesign: scala.Double = js.native
  
  var closed: scala.Double = js.native
  
  var fixed: scala.Double = js.native
  
  var pending: scala.Double = js.native
  
  var unknown: scala.Double = js.native
  
  var wontFix: scala.Double = js.native
}
object Active {
  
  @scala.inline
  def apply(
    active: scala.Double,
    byDesign: scala.Double,
    closed: scala.Double,
    fixed: scala.Double,
    pending: scala.Double,
    unknown: scala.Double,
    wontFix: scala.Double
  ): Active = {
    val __obj = js.Dynamic.literal(active = active.asInstanceOf[js.Any], byDesign = byDesign.asInstanceOf[js.Any], closed = closed.asInstanceOf[js.Any], fixed = fixed.asInstanceOf[js.Any], pending = pending.asInstanceOf[js.Any], unknown = unknown.asInstanceOf[js.Any], wontFix = wontFix.asInstanceOf[js.Any])
    __obj.asInstanceOf[Active]
  }
  
  @scala.inline
  implicit class ActiveOps[Self <: Active] (val x: Self) extends AnyVal {
    
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
    def setByDesign(value: scala.Double): Self = this.set("byDesign", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClosed(value: scala.Double): Self = this.set("closed", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFixed(value: scala.Double): Self = this.set("fixed", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPending(value: scala.Double): Self = this.set("pending", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUnknown(value: scala.Double): Self = this.set("unknown", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWontFix(value: scala.Double): Self = this.set("wontFix", value.asInstanceOf[js.Any])
  }
}

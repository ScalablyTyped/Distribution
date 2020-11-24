package typings.vueCompilerCore.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait VFor extends js.Object {
  
  var vFor: Double = js.native
  
  var vOnce: Double = js.native
  
  var vPre: Double = js.native
  
  var vSlot: Double = js.native
}
object VFor {
  
  @scala.inline
  def apply(vFor: Double, vOnce: Double, vPre: Double, vSlot: Double): VFor = {
    val __obj = js.Dynamic.literal(vFor = vFor.asInstanceOf[js.Any], vOnce = vOnce.asInstanceOf[js.Any], vPre = vPre.asInstanceOf[js.Any], vSlot = vSlot.asInstanceOf[js.Any])
    __obj.asInstanceOf[VFor]
  }
  
  @scala.inline
  implicit class VForOps[Self <: VFor] (val x: Self) extends AnyVal {
    
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
    def setVFor(value: Double): Self = this.set("vFor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVOnce(value: Double): Self = this.set("vOnce", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVPre(value: Double): Self = this.set("vPre", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVSlot(value: Double): Self = this.set("vSlot", value.asInstanceOf[js.Any])
  }
}

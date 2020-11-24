package typings.tensorflowTfjsLayers.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MaskValue extends js.Object {
  
  var maskValue: Double = js.native
}
object MaskValue {
  
  @scala.inline
  def apply(maskValue: Double): MaskValue = {
    val __obj = js.Dynamic.literal(maskValue = maskValue.asInstanceOf[js.Any])
    __obj.asInstanceOf[MaskValue]
  }
  
  @scala.inline
  implicit class MaskValueOps[Self <: MaskValue] (val x: Self) extends AnyVal {
    
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
    def setMaskValue(value: Double): Self = this.set("maskValue", value.asInstanceOf[js.Any])
  }
}

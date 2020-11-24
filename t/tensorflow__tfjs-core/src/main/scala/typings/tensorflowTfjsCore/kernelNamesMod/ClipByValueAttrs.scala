package typings.tensorflowTfjsCore.kernelNamesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ClipByValueAttrs extends js.Object {
  
  var clipValueMax: Double = js.native
  
  var clipValueMin: Double = js.native
}
object ClipByValueAttrs {
  
  @scala.inline
  def apply(clipValueMax: Double, clipValueMin: Double): ClipByValueAttrs = {
    val __obj = js.Dynamic.literal(clipValueMax = clipValueMax.asInstanceOf[js.Any], clipValueMin = clipValueMin.asInstanceOf[js.Any])
    __obj.asInstanceOf[ClipByValueAttrs]
  }
  
  @scala.inline
  implicit class ClipByValueAttrsOps[Self <: ClipByValueAttrs] (val x: Self) extends AnyVal {
    
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
    def setClipValueMax(value: Double): Self = this.set("clipValueMax", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClipValueMin(value: Double): Self = this.set("clipValueMin", value.asInstanceOf[js.Any])
  }
}

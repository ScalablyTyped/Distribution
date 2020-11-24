package typings.tensorflowTfjsCore.kernelNamesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CumsumAttrs extends js.Object {
  
  var axis: Double = js.native
  
  var exclusive: Boolean = js.native
  
  var reverse: Boolean = js.native
}
object CumsumAttrs {
  
  @scala.inline
  def apply(axis: Double, exclusive: Boolean, reverse: Boolean): CumsumAttrs = {
    val __obj = js.Dynamic.literal(axis = axis.asInstanceOf[js.Any], exclusive = exclusive.asInstanceOf[js.Any], reverse = reverse.asInstanceOf[js.Any])
    __obj.asInstanceOf[CumsumAttrs]
  }
  
  @scala.inline
  implicit class CumsumAttrsOps[Self <: CumsumAttrs] (val x: Self) extends AnyVal {
    
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
    def setAxis(value: Double): Self = this.set("axis", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExclusive(value: Boolean): Self = this.set("exclusive", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReverse(value: Boolean): Self = this.set("reverse", value.asInstanceOf[js.Any])
  }
}

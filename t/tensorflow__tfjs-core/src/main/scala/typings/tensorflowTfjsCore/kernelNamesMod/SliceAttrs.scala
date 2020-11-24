package typings.tensorflowTfjsCore.kernelNamesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SliceAttrs extends js.Object {
  
  var begin: Double | js.Array[Double] = js.native
  
  var size: Double | js.Array[Double] = js.native
}
object SliceAttrs {
  
  @scala.inline
  def apply(begin: Double | js.Array[Double], size: Double | js.Array[Double]): SliceAttrs = {
    val __obj = js.Dynamic.literal(begin = begin.asInstanceOf[js.Any], size = size.asInstanceOf[js.Any])
    __obj.asInstanceOf[SliceAttrs]
  }
  
  @scala.inline
  implicit class SliceAttrsOps[Self <: SliceAttrs] (val x: Self) extends AnyVal {
    
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
    def setBeginVarargs(value: Double*): Self = this.set("begin", js.Array(value :_*))
    
    @scala.inline
    def setBegin(value: Double | js.Array[Double]): Self = this.set("begin", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSizeVarargs(value: Double*): Self = this.set("size", js.Array(value :_*))
    
    @scala.inline
    def setSize(value: Double | js.Array[Double]): Self = this.set("size", value.asInstanceOf[js.Any])
  }
}

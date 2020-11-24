package typings.tensorflowTfjsCore.kernelNamesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ReverseAttrs extends js.Object {
  
  var dims: Double | js.Array[Double] = js.native
}
object ReverseAttrs {
  
  @scala.inline
  def apply(dims: Double | js.Array[Double]): ReverseAttrs = {
    val __obj = js.Dynamic.literal(dims = dims.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReverseAttrs]
  }
  
  @scala.inline
  implicit class ReverseAttrsOps[Self <: ReverseAttrs] (val x: Self) extends AnyVal {
    
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
    def setDimsVarargs(value: Double*): Self = this.set("dims", js.Array(value :_*))
    
    @scala.inline
    def setDims(value: Double | js.Array[Double]): Self = this.set("dims", value.asInstanceOf[js.Any])
  }
}

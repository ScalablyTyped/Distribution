package typings.tensorflowTfjsCore.kernelNamesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ProdAttrs extends js.Object {
  
  var axis: Double | js.Array[Double] = js.native
  
  var keepDims: Boolean = js.native
}
object ProdAttrs {
  
  @scala.inline
  def apply(axis: Double | js.Array[Double], keepDims: Boolean): ProdAttrs = {
    val __obj = js.Dynamic.literal(axis = axis.asInstanceOf[js.Any], keepDims = keepDims.asInstanceOf[js.Any])
    __obj.asInstanceOf[ProdAttrs]
  }
  
  @scala.inline
  implicit class ProdAttrsOps[Self <: ProdAttrs] (val x: Self) extends AnyVal {
    
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
    def setAxisVarargs(value: Double*): Self = this.set("axis", js.Array(value :_*))
    
    @scala.inline
    def setAxis(value: Double | js.Array[Double]): Self = this.set("axis", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKeepDims(value: Boolean): Self = this.set("keepDims", value.asInstanceOf[js.Any])
  }
}

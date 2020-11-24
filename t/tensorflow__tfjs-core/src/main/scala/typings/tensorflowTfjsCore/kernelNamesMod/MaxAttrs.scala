package typings.tensorflowTfjsCore.kernelNamesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MaxAttrs extends js.Object {
  
  var keepDims: Boolean = js.native
  
  var reductionIndices: Double | js.Array[Double] = js.native
}
object MaxAttrs {
  
  @scala.inline
  def apply(keepDims: Boolean, reductionIndices: Double | js.Array[Double]): MaxAttrs = {
    val __obj = js.Dynamic.literal(keepDims = keepDims.asInstanceOf[js.Any], reductionIndices = reductionIndices.asInstanceOf[js.Any])
    __obj.asInstanceOf[MaxAttrs]
  }
  
  @scala.inline
  implicit class MaxAttrsOps[Self <: MaxAttrs] (val x: Self) extends AnyVal {
    
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
    def setKeepDims(value: Boolean): Self = this.set("keepDims", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReductionIndicesVarargs(value: Double*): Self = this.set("reductionIndices", js.Array(value :_*))
    
    @scala.inline
    def setReductionIndices(value: Double | js.Array[Double]): Self = this.set("reductionIndices", value.asInstanceOf[js.Any])
  }
}

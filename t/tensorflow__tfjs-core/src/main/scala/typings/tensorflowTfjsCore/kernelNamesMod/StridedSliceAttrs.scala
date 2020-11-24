package typings.tensorflowTfjsCore.kernelNamesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait StridedSliceAttrs extends js.Object {
  
  var begin: js.Array[Double] = js.native
  
  var beginMask: Double = js.native
  
  var ellipsisMask: Double = js.native
  
  var end: js.Array[Double] = js.native
  
  var endMask: Double = js.native
  
  var newAxisMask: Double = js.native
  
  var shrinkAxisMask: Double = js.native
  
  var strides: js.Array[Double] = js.native
}
object StridedSliceAttrs {
  
  @scala.inline
  def apply(
    begin: js.Array[Double],
    beginMask: Double,
    ellipsisMask: Double,
    end: js.Array[Double],
    endMask: Double,
    newAxisMask: Double,
    shrinkAxisMask: Double,
    strides: js.Array[Double]
  ): StridedSliceAttrs = {
    val __obj = js.Dynamic.literal(begin = begin.asInstanceOf[js.Any], beginMask = beginMask.asInstanceOf[js.Any], ellipsisMask = ellipsisMask.asInstanceOf[js.Any], end = end.asInstanceOf[js.Any], endMask = endMask.asInstanceOf[js.Any], newAxisMask = newAxisMask.asInstanceOf[js.Any], shrinkAxisMask = shrinkAxisMask.asInstanceOf[js.Any], strides = strides.asInstanceOf[js.Any])
    __obj.asInstanceOf[StridedSliceAttrs]
  }
  
  @scala.inline
  implicit class StridedSliceAttrsOps[Self <: StridedSliceAttrs] (val x: Self) extends AnyVal {
    
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
    def setBegin(value: js.Array[Double]): Self = this.set("begin", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBeginMask(value: Double): Self = this.set("beginMask", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEllipsisMask(value: Double): Self = this.set("ellipsisMask", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEndVarargs(value: Double*): Self = this.set("end", js.Array(value :_*))
    
    @scala.inline
    def setEnd(value: js.Array[Double]): Self = this.set("end", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEndMask(value: Double): Self = this.set("endMask", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNewAxisMask(value: Double): Self = this.set("newAxisMask", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShrinkAxisMask(value: Double): Self = this.set("shrinkAxisMask", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStridesVarargs(value: Double*): Self = this.set("strides", js.Array(value :_*))
    
    @scala.inline
    def setStrides(value: js.Array[Double]): Self = this.set("strides", value.asInstanceOf[js.Any])
  }
}

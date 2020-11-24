package typings.tensorflowTfjsCore.scatterNdUtilMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ScatterShapeInfo extends js.Object {
  
  var numUpdates: Double = js.native
  
  var outputSize: Double = js.native
  
  var sliceRank: Double = js.native
  
  var sliceSize: Double = js.native
  
  var strides: js.Array[Double] = js.native
}
object ScatterShapeInfo {
  
  @scala.inline
  def apply(
    numUpdates: Double,
    outputSize: Double,
    sliceRank: Double,
    sliceSize: Double,
    strides: js.Array[Double]
  ): ScatterShapeInfo = {
    val __obj = js.Dynamic.literal(numUpdates = numUpdates.asInstanceOf[js.Any], outputSize = outputSize.asInstanceOf[js.Any], sliceRank = sliceRank.asInstanceOf[js.Any], sliceSize = sliceSize.asInstanceOf[js.Any], strides = strides.asInstanceOf[js.Any])
    __obj.asInstanceOf[ScatterShapeInfo]
  }
  
  @scala.inline
  implicit class ScatterShapeInfoOps[Self <: ScatterShapeInfo] (val x: Self) extends AnyVal {
    
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
    def setNumUpdates(value: Double): Self = this.set("numUpdates", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOutputSize(value: Double): Self = this.set("outputSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSliceRank(value: Double): Self = this.set("sliceRank", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSliceSize(value: Double): Self = this.set("sliceSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStridesVarargs(value: Double*): Self = this.set("strides", js.Array(value :_*))
    
    @scala.inline
    def setStrides(value: js.Array[Double]): Self = this.set("strides", value.asInstanceOf[js.Any])
  }
}

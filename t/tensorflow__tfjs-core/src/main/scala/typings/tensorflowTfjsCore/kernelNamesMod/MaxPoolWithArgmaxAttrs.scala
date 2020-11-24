package typings.tensorflowTfjsCore.kernelNamesMod

import typings.tensorflowTfjsCore.tensorflowTfjsCoreStrings.same_
import typings.tensorflowTfjsCore.tensorflowTfjsCoreStrings.valid_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MaxPoolWithArgmaxAttrs extends js.Object {
  
  var filterSize: (js.Tuple2[Double, Double]) | Double = js.native
  
  var includeBatchInIndex: Boolean = js.native
  
  var pad: valid_ | same_ | Double = js.native
  
  var strides: (js.Tuple2[Double, Double]) | Double = js.native
}
object MaxPoolWithArgmaxAttrs {
  
  @scala.inline
  def apply(
    filterSize: (js.Tuple2[Double, Double]) | Double,
    includeBatchInIndex: Boolean,
    pad: valid_ | same_ | Double,
    strides: (js.Tuple2[Double, Double]) | Double
  ): MaxPoolWithArgmaxAttrs = {
    val __obj = js.Dynamic.literal(filterSize = filterSize.asInstanceOf[js.Any], includeBatchInIndex = includeBatchInIndex.asInstanceOf[js.Any], pad = pad.asInstanceOf[js.Any], strides = strides.asInstanceOf[js.Any])
    __obj.asInstanceOf[MaxPoolWithArgmaxAttrs]
  }
  
  @scala.inline
  implicit class MaxPoolWithArgmaxAttrsOps[Self <: MaxPoolWithArgmaxAttrs] (val x: Self) extends AnyVal {
    
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
    def setFilterSize(value: (js.Tuple2[Double, Double]) | Double): Self = this.set("filterSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIncludeBatchInIndex(value: Boolean): Self = this.set("includeBatchInIndex", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPad(value: valid_ | same_ | Double): Self = this.set("pad", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStrides(value: (js.Tuple2[Double, Double]) | Double): Self = this.set("strides", value.asInstanceOf[js.Any])
  }
}

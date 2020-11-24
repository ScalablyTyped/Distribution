package typings.tensorflowTfjsCore.kernelNamesMod

import typings.tensorflowTfjsCore.tensorflowTfjsCoreStrings.bilinear
import typings.tensorflowTfjsCore.tensorflowTfjsCoreStrings.nearest
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CropAndResizeAttrs extends js.Object {
  
  var cropSize: js.Tuple2[Double, Double] = js.native
  
  var extrapolationValue: Double = js.native
  
  var method: bilinear | nearest = js.native
}
object CropAndResizeAttrs {
  
  @scala.inline
  def apply(cropSize: js.Tuple2[Double, Double], extrapolationValue: Double, method: bilinear | nearest): CropAndResizeAttrs = {
    val __obj = js.Dynamic.literal(cropSize = cropSize.asInstanceOf[js.Any], extrapolationValue = extrapolationValue.asInstanceOf[js.Any], method = method.asInstanceOf[js.Any])
    __obj.asInstanceOf[CropAndResizeAttrs]
  }
  
  @scala.inline
  implicit class CropAndResizeAttrsOps[Self <: CropAndResizeAttrs] (val x: Self) extends AnyVal {
    
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
    def setCropSize(value: js.Tuple2[Double, Double]): Self = this.set("cropSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExtrapolationValue(value: Double): Self = this.set("extrapolationValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMethod(value: bilinear | nearest): Self = this.set("method", value.asInstanceOf[js.Any])
  }
}

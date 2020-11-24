package typings.tensorflowTfjsCore.kernelNamesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RotateWithOffsetAttrs extends js.Object {
  
  var center: Double | (js.Tuple2[Double, Double]) = js.native
  
  var fillValue: Double | (js.Tuple3[Double, Double, Double]) = js.native
  
  var radians: Double = js.native
}
object RotateWithOffsetAttrs {
  
  @scala.inline
  def apply(
    center: Double | (js.Tuple2[Double, Double]),
    fillValue: Double | (js.Tuple3[Double, Double, Double]),
    radians: Double
  ): RotateWithOffsetAttrs = {
    val __obj = js.Dynamic.literal(center = center.asInstanceOf[js.Any], fillValue = fillValue.asInstanceOf[js.Any], radians = radians.asInstanceOf[js.Any])
    __obj.asInstanceOf[RotateWithOffsetAttrs]
  }
  
  @scala.inline
  implicit class RotateWithOffsetAttrsOps[Self <: RotateWithOffsetAttrs] (val x: Self) extends AnyVal {
    
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
    def setCenter(value: Double | (js.Tuple2[Double, Double])): Self = this.set("center", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFillValue(value: Double | (js.Tuple3[Double, Double, Double])): Self = this.set("fillValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRadians(value: Double): Self = this.set("radians", value.asInstanceOf[js.Any])
  }
}

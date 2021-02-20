package typings.tensorflowTfjsCore.kernelNamesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RotateWithOffsetAttrs extends StObject {
  
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
  implicit class RotateWithOffsetAttrsMutableBuilder[Self <: RotateWithOffsetAttrs] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCenter(value: Double | (js.Tuple2[Double, Double])): Self = StObject.set(x, "center", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFillValue(value: Double | (js.Tuple3[Double, Double, Double])): Self = StObject.set(x, "fillValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRadians(value: Double): Self = StObject.set(x, "radians", value.asInstanceOf[js.Any])
  }
}

package typings.tensorflowTfjsCore.distKernelNamesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RotateWithOffsetAttrs extends StObject {
  
  var center: Double | (js.Tuple2[Double, Double])
  
  var fillValue: Double | (js.Tuple3[Double, Double, Double])
  
  var radians: Double
}
object RotateWithOffsetAttrs {
  
  inline def apply(
    center: Double | (js.Tuple2[Double, Double]),
    fillValue: Double | (js.Tuple3[Double, Double, Double]),
    radians: Double
  ): RotateWithOffsetAttrs = {
    val __obj = js.Dynamic.literal(center = center.asInstanceOf[js.Any], fillValue = fillValue.asInstanceOf[js.Any], radians = radians.asInstanceOf[js.Any])
    __obj.asInstanceOf[RotateWithOffsetAttrs]
  }
  
  extension [Self <: RotateWithOffsetAttrs](x: Self) {
    
    inline def setCenter(value: Double | (js.Tuple2[Double, Double])): Self = StObject.set(x, "center", value.asInstanceOf[js.Any])
    
    inline def setFillValue(value: Double | (js.Tuple3[Double, Double, Double])): Self = StObject.set(x, "fillValue", value.asInstanceOf[js.Any])
    
    inline def setRadians(value: Double): Self = StObject.set(x, "radians", value.asInstanceOf[js.Any])
  }
}

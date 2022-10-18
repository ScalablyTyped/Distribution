package typings.tensorflowTfjsCore.distKernelNamesMod

import typings.tensorflowTfjsCore.tensorflowTfjsCoreStrings.same_
import typings.tensorflowTfjsCore.tensorflowTfjsCoreStrings.valid_
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Dilation2DAttrs extends StObject {
  
  var dilations: (js.Tuple2[Double, Double]) | Double
  
  var pad: valid_ | same_ | Double
  
  var strides: (js.Tuple2[Double, Double]) | Double
}
object Dilation2DAttrs {
  
  inline def apply(
    dilations: (js.Tuple2[Double, Double]) | Double,
    pad: valid_ | same_ | Double,
    strides: (js.Tuple2[Double, Double]) | Double
  ): Dilation2DAttrs = {
    val __obj = js.Dynamic.literal(dilations = dilations.asInstanceOf[js.Any], pad = pad.asInstanceOf[js.Any], strides = strides.asInstanceOf[js.Any])
    __obj.asInstanceOf[Dilation2DAttrs]
  }
  
  extension [Self <: Dilation2DAttrs](x: Self) {
    
    inline def setDilations(value: (js.Tuple2[Double, Double]) | Double): Self = StObject.set(x, "dilations", value.asInstanceOf[js.Any])
    
    inline def setPad(value: valid_ | same_ | Double): Self = StObject.set(x, "pad", value.asInstanceOf[js.Any])
    
    inline def setStrides(value: (js.Tuple2[Double, Double]) | Double): Self = StObject.set(x, "strides", value.asInstanceOf[js.Any])
  }
}

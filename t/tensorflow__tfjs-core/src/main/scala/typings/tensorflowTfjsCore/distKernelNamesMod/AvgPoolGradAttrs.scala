package typings.tensorflowTfjsCore.distKernelNamesMod

import typings.tensorflowTfjsCore.distOpsConvUtilMod.ExplicitPadding
import typings.tensorflowTfjsCore.tensorflowTfjsCoreStrings.same_
import typings.tensorflowTfjsCore.tensorflowTfjsCoreStrings.valid_
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AvgPoolGradAttrs extends StObject {
  
  var filterSize: (js.Tuple2[Double, Double]) | Double
  
  var pad: valid_ | same_ | Double | ExplicitPadding
  
  var strides: (js.Tuple2[Double, Double]) | Double
}
object AvgPoolGradAttrs {
  
  inline def apply(
    filterSize: (js.Tuple2[Double, Double]) | Double,
    pad: valid_ | same_ | Double | ExplicitPadding,
    strides: (js.Tuple2[Double, Double]) | Double
  ): AvgPoolGradAttrs = {
    val __obj = js.Dynamic.literal(filterSize = filterSize.asInstanceOf[js.Any], pad = pad.asInstanceOf[js.Any], strides = strides.asInstanceOf[js.Any])
    __obj.asInstanceOf[AvgPoolGradAttrs]
  }
  
  extension [Self <: AvgPoolGradAttrs](x: Self) {
    
    inline def setFilterSize(value: (js.Tuple2[Double, Double]) | Double): Self = StObject.set(x, "filterSize", value.asInstanceOf[js.Any])
    
    inline def setPad(value: valid_ | same_ | Double | ExplicitPadding): Self = StObject.set(x, "pad", value.asInstanceOf[js.Any])
    
    inline def setStrides(value: (js.Tuple2[Double, Double]) | Double): Self = StObject.set(x, "strides", value.asInstanceOf[js.Any])
  }
}

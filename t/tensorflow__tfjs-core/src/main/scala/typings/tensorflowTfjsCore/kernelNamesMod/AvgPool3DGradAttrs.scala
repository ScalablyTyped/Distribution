package typings.tensorflowTfjsCore.kernelNamesMod

import typings.tensorflowTfjsCore.tensorflowTfjsCoreStrings.ceil
import typings.tensorflowTfjsCore.tensorflowTfjsCoreStrings.floor
import typings.tensorflowTfjsCore.tensorflowTfjsCoreStrings.round
import typings.tensorflowTfjsCore.tensorflowTfjsCoreStrings.same_
import typings.tensorflowTfjsCore.tensorflowTfjsCoreStrings.valid_
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AvgPool3DGradAttrs extends StObject {
  
  var dimRoundingMode: js.UndefOr[floor | round | ceil] = js.undefined
  
  var filterSize: (js.Tuple3[Double, Double, Double]) | Double
  
  var pad: valid_ | same_ | Double
  
  var strides: (js.Tuple3[Double, Double, Double]) | Double
}
object AvgPool3DGradAttrs {
  
  inline def apply(
    filterSize: (js.Tuple3[Double, Double, Double]) | Double,
    pad: valid_ | same_ | Double,
    strides: (js.Tuple3[Double, Double, Double]) | Double
  ): AvgPool3DGradAttrs = {
    val __obj = js.Dynamic.literal(filterSize = filterSize.asInstanceOf[js.Any], pad = pad.asInstanceOf[js.Any], strides = strides.asInstanceOf[js.Any])
    __obj.asInstanceOf[AvgPool3DGradAttrs]
  }
  
  extension [Self <: AvgPool3DGradAttrs](x: Self) {
    
    inline def setDimRoundingMode(value: floor | round | ceil): Self = StObject.set(x, "dimRoundingMode", value.asInstanceOf[js.Any])
    
    inline def setDimRoundingModeUndefined: Self = StObject.set(x, "dimRoundingMode", js.undefined)
    
    inline def setFilterSize(value: (js.Tuple3[Double, Double, Double]) | Double): Self = StObject.set(x, "filterSize", value.asInstanceOf[js.Any])
    
    inline def setPad(value: valid_ | same_ | Double): Self = StObject.set(x, "pad", value.asInstanceOf[js.Any])
    
    inline def setStrides(value: (js.Tuple3[Double, Double, Double]) | Double): Self = StObject.set(x, "strides", value.asInstanceOf[js.Any])
  }
}

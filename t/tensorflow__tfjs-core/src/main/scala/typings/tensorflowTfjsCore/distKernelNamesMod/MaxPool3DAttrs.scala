package typings.tensorflowTfjsCore.distKernelNamesMod

import typings.tensorflowTfjsCore.tensorflowTfjsCoreStrings.NCDHW
import typings.tensorflowTfjsCore.tensorflowTfjsCoreStrings.NDHWC
import typings.tensorflowTfjsCore.tensorflowTfjsCoreStrings.ceil
import typings.tensorflowTfjsCore.tensorflowTfjsCoreStrings.floor
import typings.tensorflowTfjsCore.tensorflowTfjsCoreStrings.round
import typings.tensorflowTfjsCore.tensorflowTfjsCoreStrings.same_
import typings.tensorflowTfjsCore.tensorflowTfjsCoreStrings.valid_
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MaxPool3DAttrs extends StObject {
  
  var dataFormat: NDHWC | NCDHW
  
  var dimRoundingMode: js.UndefOr[floor | round | ceil] = js.undefined
  
  var filterSize: (js.Tuple3[Double, Double, Double]) | Double
  
  var pad: valid_ | same_ | Double
  
  var strides: (js.Tuple3[Double, Double, Double]) | Double
}
object MaxPool3DAttrs {
  
  inline def apply(
    dataFormat: NDHWC | NCDHW,
    filterSize: (js.Tuple3[Double, Double, Double]) | Double,
    pad: valid_ | same_ | Double,
    strides: (js.Tuple3[Double, Double, Double]) | Double
  ): MaxPool3DAttrs = {
    val __obj = js.Dynamic.literal(dataFormat = dataFormat.asInstanceOf[js.Any], filterSize = filterSize.asInstanceOf[js.Any], pad = pad.asInstanceOf[js.Any], strides = strides.asInstanceOf[js.Any])
    __obj.asInstanceOf[MaxPool3DAttrs]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: MaxPool3DAttrs] (val x: Self) extends AnyVal {
    
    inline def setDataFormat(value: NDHWC | NCDHW): Self = StObject.set(x, "dataFormat", value.asInstanceOf[js.Any])
    
    inline def setDimRoundingMode(value: floor | round | ceil): Self = StObject.set(x, "dimRoundingMode", value.asInstanceOf[js.Any])
    
    inline def setDimRoundingModeUndefined: Self = StObject.set(x, "dimRoundingMode", js.undefined)
    
    inline def setFilterSize(value: (js.Tuple3[Double, Double, Double]) | Double): Self = StObject.set(x, "filterSize", value.asInstanceOf[js.Any])
    
    inline def setPad(value: valid_ | same_ | Double): Self = StObject.set(x, "pad", value.asInstanceOf[js.Any])
    
    inline def setStrides(value: (js.Tuple3[Double, Double, Double]) | Double): Self = StObject.set(x, "strides", value.asInstanceOf[js.Any])
  }
}

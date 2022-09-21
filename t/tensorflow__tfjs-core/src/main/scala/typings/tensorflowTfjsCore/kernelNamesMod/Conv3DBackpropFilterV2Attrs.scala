package typings.tensorflowTfjsCore.kernelNamesMod

import typings.tensorflowTfjsCore.tensorflowTfjsCoreStrings.same_
import typings.tensorflowTfjsCore.tensorflowTfjsCoreStrings.valid_
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Conv3DBackpropFilterV2Attrs extends StObject {
  
  var filterShape: js.Tuple5[Double, Double, Double, Double, Double]
  
  var pad: valid_ | same_
  
  var strides: (js.Tuple3[Double, Double, Double]) | Double
}
object Conv3DBackpropFilterV2Attrs {
  
  inline def apply(
    filterShape: js.Tuple5[Double, Double, Double, Double, Double],
    pad: valid_ | same_,
    strides: (js.Tuple3[Double, Double, Double]) | Double
  ): Conv3DBackpropFilterV2Attrs = {
    val __obj = js.Dynamic.literal(filterShape = filterShape.asInstanceOf[js.Any], pad = pad.asInstanceOf[js.Any], strides = strides.asInstanceOf[js.Any])
    __obj.asInstanceOf[Conv3DBackpropFilterV2Attrs]
  }
  
  extension [Self <: Conv3DBackpropFilterV2Attrs](x: Self) {
    
    inline def setFilterShape(value: js.Tuple5[Double, Double, Double, Double, Double]): Self = StObject.set(x, "filterShape", value.asInstanceOf[js.Any])
    
    inline def setPad(value: valid_ | same_): Self = StObject.set(x, "pad", value.asInstanceOf[js.Any])
    
    inline def setStrides(value: (js.Tuple3[Double, Double, Double]) | Double): Self = StObject.set(x, "strides", value.asInstanceOf[js.Any])
  }
}

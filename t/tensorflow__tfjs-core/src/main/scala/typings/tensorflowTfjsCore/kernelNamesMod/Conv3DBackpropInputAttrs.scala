package typings.tensorflowTfjsCore.kernelNamesMod

import typings.tensorflowTfjsCore.tensorflowTfjsCoreStrings.same_
import typings.tensorflowTfjsCore.tensorflowTfjsCoreStrings.valid_
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Conv3DBackpropInputAttrs extends StObject {
  
  var inputShape: js.Tuple5[Double, Double, Double, Double, Double]
  
  var pad: valid_ | same_
  
  var strides: (js.Tuple3[Double, Double, Double]) | Double
}
object Conv3DBackpropInputAttrs {
  
  inline def apply(
    inputShape: js.Tuple5[Double, Double, Double, Double, Double],
    pad: valid_ | same_,
    strides: (js.Tuple3[Double, Double, Double]) | Double
  ): Conv3DBackpropInputAttrs = {
    val __obj = js.Dynamic.literal(inputShape = inputShape.asInstanceOf[js.Any], pad = pad.asInstanceOf[js.Any], strides = strides.asInstanceOf[js.Any])
    __obj.asInstanceOf[Conv3DBackpropInputAttrs]
  }
  
  extension [Self <: Conv3DBackpropInputAttrs](x: Self) {
    
    inline def setInputShape(value: js.Tuple5[Double, Double, Double, Double, Double]): Self = StObject.set(x, "inputShape", value.asInstanceOf[js.Any])
    
    inline def setPad(value: valid_ | same_): Self = StObject.set(x, "pad", value.asInstanceOf[js.Any])
    
    inline def setStrides(value: (js.Tuple3[Double, Double, Double]) | Double): Self = StObject.set(x, "strides", value.asInstanceOf[js.Any])
  }
}

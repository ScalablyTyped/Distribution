package typings.tensorflowTfjsCore.distKernelNamesMod

import typings.tensorflowTfjsCore.tensorflowTfjsCoreStrings.same_
import typings.tensorflowTfjsCore.tensorflowTfjsCoreStrings.valid_
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Conv3DBackpropInputV2Attrs extends StObject {
  
  var inputShape: js.Tuple5[Double, Double, Double, Double, Double]
  
  var pad: valid_ | same_
  
  var strides: (js.Tuple3[Double, Double, Double]) | Double
}
object Conv3DBackpropInputV2Attrs {
  
  inline def apply(
    inputShape: js.Tuple5[Double, Double, Double, Double, Double],
    pad: valid_ | same_,
    strides: (js.Tuple3[Double, Double, Double]) | Double
  ): Conv3DBackpropInputV2Attrs = {
    val __obj = js.Dynamic.literal(inputShape = inputShape.asInstanceOf[js.Any], pad = pad.asInstanceOf[js.Any], strides = strides.asInstanceOf[js.Any])
    __obj.asInstanceOf[Conv3DBackpropInputV2Attrs]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Conv3DBackpropInputV2Attrs] (val x: Self) extends AnyVal {
    
    inline def setInputShape(value: js.Tuple5[Double, Double, Double, Double, Double]): Self = StObject.set(x, "inputShape", value.asInstanceOf[js.Any])
    
    inline def setPad(value: valid_ | same_): Self = StObject.set(x, "pad", value.asInstanceOf[js.Any])
    
    inline def setStrides(value: (js.Tuple3[Double, Double, Double]) | Double): Self = StObject.set(x, "strides", value.asInstanceOf[js.Any])
  }
}

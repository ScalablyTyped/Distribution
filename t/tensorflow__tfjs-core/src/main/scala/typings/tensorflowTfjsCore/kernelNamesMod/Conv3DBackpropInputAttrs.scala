package typings.tensorflowTfjsCore.kernelNamesMod

import typings.tensorflowTfjsCore.tensorflowTfjsCoreStrings.same_
import typings.tensorflowTfjsCore.tensorflowTfjsCoreStrings.valid_
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Conv3DBackpropInputAttrs extends StObject {
  
  var inputShape: js.Tuple5[Double, Double, Double, Double, Double] = js.native
  
  var pad: valid_ | same_ = js.native
  
  var strides: (js.Tuple3[Double, Double, Double]) | Double = js.native
}
object Conv3DBackpropInputAttrs {
  
  @scala.inline
  def apply(
    inputShape: js.Tuple5[Double, Double, Double, Double, Double],
    pad: valid_ | same_,
    strides: (js.Tuple3[Double, Double, Double]) | Double
  ): Conv3DBackpropInputAttrs = {
    val __obj = js.Dynamic.literal(inputShape = inputShape.asInstanceOf[js.Any], pad = pad.asInstanceOf[js.Any], strides = strides.asInstanceOf[js.Any])
    __obj.asInstanceOf[Conv3DBackpropInputAttrs]
  }
  
  @scala.inline
  implicit class Conv3DBackpropInputAttrsMutableBuilder[Self <: Conv3DBackpropInputAttrs] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setInputShape(value: js.Tuple5[Double, Double, Double, Double, Double]): Self = StObject.set(x, "inputShape", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPad(value: valid_ | same_): Self = StObject.set(x, "pad", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStrides(value: (js.Tuple3[Double, Double, Double]) | Double): Self = StObject.set(x, "strides", value.asInstanceOf[js.Any])
  }
}

package typings.tensorflowTfjsCore.distKernelNamesMod

import typings.tensorflowTfjsCore.tensorflowTfjsCoreStrings.NCDHW
import typings.tensorflowTfjsCore.tensorflowTfjsCoreStrings.NDHWC
import typings.tensorflowTfjsCore.tensorflowTfjsCoreStrings.same_
import typings.tensorflowTfjsCore.tensorflowTfjsCoreStrings.valid_
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Conv3DAttrs extends StObject {
  
  var dataFormat: NDHWC | NCDHW
  
  var dilations: (js.Tuple3[Double, Double, Double]) | Double
  
  var pad: valid_ | same_
  
  var strides: (js.Tuple3[Double, Double, Double]) | Double
}
object Conv3DAttrs {
  
  inline def apply(
    dataFormat: NDHWC | NCDHW,
    dilations: (js.Tuple3[Double, Double, Double]) | Double,
    pad: valid_ | same_,
    strides: (js.Tuple3[Double, Double, Double]) | Double
  ): Conv3DAttrs = {
    val __obj = js.Dynamic.literal(dataFormat = dataFormat.asInstanceOf[js.Any], dilations = dilations.asInstanceOf[js.Any], pad = pad.asInstanceOf[js.Any], strides = strides.asInstanceOf[js.Any])
    __obj.asInstanceOf[Conv3DAttrs]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Conv3DAttrs] (val x: Self) extends AnyVal {
    
    inline def setDataFormat(value: NDHWC | NCDHW): Self = StObject.set(x, "dataFormat", value.asInstanceOf[js.Any])
    
    inline def setDilations(value: (js.Tuple3[Double, Double, Double]) | Double): Self = StObject.set(x, "dilations", value.asInstanceOf[js.Any])
    
    inline def setPad(value: valid_ | same_): Self = StObject.set(x, "pad", value.asInstanceOf[js.Any])
    
    inline def setStrides(value: (js.Tuple3[Double, Double, Double]) | Double): Self = StObject.set(x, "strides", value.asInstanceOf[js.Any])
  }
}

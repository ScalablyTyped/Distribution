package typings.tensorflowTfjsCore.kernelNamesMod

import typings.tensorflowTfjsCore.tensorflowTfjsCoreStrings.NCDHW
import typings.tensorflowTfjsCore.tensorflowTfjsCoreStrings.NDHWC
import typings.tensorflowTfjsCore.tensorflowTfjsCoreStrings.same_
import typings.tensorflowTfjsCore.tensorflowTfjsCoreStrings.valid_
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Conv3DAttrs extends StObject {
  
  var dataFormat: NDHWC | NCDHW = js.native
  
  var dilations: (js.Tuple3[Double, Double, Double]) | Double = js.native
  
  var pad: valid_ | same_ = js.native
  
  var strides: (js.Tuple3[Double, Double, Double]) | Double = js.native
}
object Conv3DAttrs {
  
  @scala.inline
  def apply(
    dataFormat: NDHWC | NCDHW,
    dilations: (js.Tuple3[Double, Double, Double]) | Double,
    pad: valid_ | same_,
    strides: (js.Tuple3[Double, Double, Double]) | Double
  ): Conv3DAttrs = {
    val __obj = js.Dynamic.literal(dataFormat = dataFormat.asInstanceOf[js.Any], dilations = dilations.asInstanceOf[js.Any], pad = pad.asInstanceOf[js.Any], strides = strides.asInstanceOf[js.Any])
    __obj.asInstanceOf[Conv3DAttrs]
  }
  
  @scala.inline
  implicit class Conv3DAttrsMutableBuilder[Self <: Conv3DAttrs] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDataFormat(value: NDHWC | NCDHW): Self = StObject.set(x, "dataFormat", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDilations(value: (js.Tuple3[Double, Double, Double]) | Double): Self = StObject.set(x, "dilations", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPad(value: valid_ | same_): Self = StObject.set(x, "pad", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStrides(value: (js.Tuple3[Double, Double, Double]) | Double): Self = StObject.set(x, "strides", value.asInstanceOf[js.Any])
  }
}

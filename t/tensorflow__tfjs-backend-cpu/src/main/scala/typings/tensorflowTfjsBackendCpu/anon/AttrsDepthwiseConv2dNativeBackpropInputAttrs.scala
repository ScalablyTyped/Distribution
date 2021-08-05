package typings.tensorflowTfjsBackendCpu.anon

import typings.tensorflowTfjsBackendCpu.backendCpuMod.MathBackendCPU
import typings.tensorflowTfjsCore.kernelNamesMod.DepthwiseConv2dNativeBackpropInputAttrs
import typings.tensorflowTfjsCore.kernelNamesMod.DepthwiseConv2dNativeBackpropInputInputs
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AttrsDepthwiseConv2dNativeBackpropInputAttrs extends StObject {
  
  var attrs: DepthwiseConv2dNativeBackpropInputAttrs
  
  var backend: MathBackendCPU
  
  var inputs: DepthwiseConv2dNativeBackpropInputInputs
}
object AttrsDepthwiseConv2dNativeBackpropInputAttrs {
  
  inline def apply(
    attrs: DepthwiseConv2dNativeBackpropInputAttrs,
    backend: MathBackendCPU,
    inputs: DepthwiseConv2dNativeBackpropInputInputs
  ): AttrsDepthwiseConv2dNativeBackpropInputAttrs = {
    val __obj = js.Dynamic.literal(attrs = attrs.asInstanceOf[js.Any], backend = backend.asInstanceOf[js.Any], inputs = inputs.asInstanceOf[js.Any])
    __obj.asInstanceOf[AttrsDepthwiseConv2dNativeBackpropInputAttrs]
  }
  
  extension [Self <: AttrsDepthwiseConv2dNativeBackpropInputAttrs](x: Self) {
    
    inline def setAttrs(value: DepthwiseConv2dNativeBackpropInputAttrs): Self = StObject.set(x, "attrs", value.asInstanceOf[js.Any])
    
    inline def setBackend(value: MathBackendCPU): Self = StObject.set(x, "backend", value.asInstanceOf[js.Any])
    
    inline def setInputs(value: DepthwiseConv2dNativeBackpropInputInputs): Self = StObject.set(x, "inputs", value.asInstanceOf[js.Any])
  }
}

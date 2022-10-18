package typings.tensorflowTfjsBackendCpu.anon

import typings.tensorflowTfjsBackendCpu.distBackendCpuMod.MathBackendCPU
import typings.tensorflowTfjsCore.distKernelNamesMod.Conv3DBackpropInputV2Attrs
import typings.tensorflowTfjsCore.distKernelNamesMod.Conv3DBackpropInputV2Inputs
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AttrsConv3DBackpropInputV2Attrs extends StObject {
  
  var attrs: Conv3DBackpropInputV2Attrs
  
  var backend: MathBackendCPU
  
  var inputs: Conv3DBackpropInputV2Inputs
}
object AttrsConv3DBackpropInputV2Attrs {
  
  inline def apply(attrs: Conv3DBackpropInputV2Attrs, backend: MathBackendCPU, inputs: Conv3DBackpropInputV2Inputs): AttrsConv3DBackpropInputV2Attrs = {
    val __obj = js.Dynamic.literal(attrs = attrs.asInstanceOf[js.Any], backend = backend.asInstanceOf[js.Any], inputs = inputs.asInstanceOf[js.Any])
    __obj.asInstanceOf[AttrsConv3DBackpropInputV2Attrs]
  }
  
  extension [Self <: AttrsConv3DBackpropInputV2Attrs](x: Self) {
    
    inline def setAttrs(value: Conv3DBackpropInputV2Attrs): Self = StObject.set(x, "attrs", value.asInstanceOf[js.Any])
    
    inline def setBackend(value: MathBackendCPU): Self = StObject.set(x, "backend", value.asInstanceOf[js.Any])
    
    inline def setInputs(value: Conv3DBackpropInputV2Inputs): Self = StObject.set(x, "inputs", value.asInstanceOf[js.Any])
  }
}

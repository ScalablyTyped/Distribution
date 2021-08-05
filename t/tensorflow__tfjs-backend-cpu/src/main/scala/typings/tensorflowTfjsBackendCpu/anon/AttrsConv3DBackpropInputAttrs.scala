package typings.tensorflowTfjsBackendCpu.anon

import typings.tensorflowTfjsBackendCpu.backendCpuMod.MathBackendCPU
import typings.tensorflowTfjsCore.kernelNamesMod.Conv3DBackpropInputAttrs
import typings.tensorflowTfjsCore.kernelNamesMod.Conv3DBackpropInputInputs
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AttrsConv3DBackpropInputAttrs extends StObject {
  
  var attrs: Conv3DBackpropInputAttrs
  
  var backend: MathBackendCPU
  
  var inputs: Conv3DBackpropInputInputs
}
object AttrsConv3DBackpropInputAttrs {
  
  inline def apply(attrs: Conv3DBackpropInputAttrs, backend: MathBackendCPU, inputs: Conv3DBackpropInputInputs): AttrsConv3DBackpropInputAttrs = {
    val __obj = js.Dynamic.literal(attrs = attrs.asInstanceOf[js.Any], backend = backend.asInstanceOf[js.Any], inputs = inputs.asInstanceOf[js.Any])
    __obj.asInstanceOf[AttrsConv3DBackpropInputAttrs]
  }
  
  extension [Self <: AttrsConv3DBackpropInputAttrs](x: Self) {
    
    inline def setAttrs(value: Conv3DBackpropInputAttrs): Self = StObject.set(x, "attrs", value.asInstanceOf[js.Any])
    
    inline def setBackend(value: MathBackendCPU): Self = StObject.set(x, "backend", value.asInstanceOf[js.Any])
    
    inline def setInputs(value: Conv3DBackpropInputInputs): Self = StObject.set(x, "inputs", value.asInstanceOf[js.Any])
  }
}

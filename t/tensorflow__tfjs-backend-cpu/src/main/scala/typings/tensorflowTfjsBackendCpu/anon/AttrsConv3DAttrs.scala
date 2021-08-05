package typings.tensorflowTfjsBackendCpu.anon

import typings.tensorflowTfjsBackendCpu.backendCpuMod.MathBackendCPU
import typings.tensorflowTfjsCore.kernelNamesMod.Conv3DAttrs
import typings.tensorflowTfjsCore.kernelNamesMod.Conv3DInputs
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AttrsConv3DAttrs extends StObject {
  
  var attrs: Conv3DAttrs
  
  var backend: MathBackendCPU
  
  var inputs: Conv3DInputs
}
object AttrsConv3DAttrs {
  
  inline def apply(attrs: Conv3DAttrs, backend: MathBackendCPU, inputs: Conv3DInputs): AttrsConv3DAttrs = {
    val __obj = js.Dynamic.literal(attrs = attrs.asInstanceOf[js.Any], backend = backend.asInstanceOf[js.Any], inputs = inputs.asInstanceOf[js.Any])
    __obj.asInstanceOf[AttrsConv3DAttrs]
  }
  
  extension [Self <: AttrsConv3DAttrs](x: Self) {
    
    inline def setAttrs(value: Conv3DAttrs): Self = StObject.set(x, "attrs", value.asInstanceOf[js.Any])
    
    inline def setBackend(value: MathBackendCPU): Self = StObject.set(x, "backend", value.asInstanceOf[js.Any])
    
    inline def setInputs(value: Conv3DInputs): Self = StObject.set(x, "inputs", value.asInstanceOf[js.Any])
  }
}

package typings.tensorflowTfjsBackendCpu.anon

import typings.tensorflowTfjsBackendCpu.backendCpuMod.MathBackendCPU
import typings.tensorflowTfjsCore.kernelNamesMod.LRNGradAttrs
import typings.tensorflowTfjsCore.kernelNamesMod.LRNGradInputs
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AttrsLRNGradAttrs extends StObject {
  
  var attrs: LRNGradAttrs
  
  var backend: MathBackendCPU
  
  var inputs: LRNGradInputs
}
object AttrsLRNGradAttrs {
  
  inline def apply(attrs: LRNGradAttrs, backend: MathBackendCPU, inputs: LRNGradInputs): AttrsLRNGradAttrs = {
    val __obj = js.Dynamic.literal(attrs = attrs.asInstanceOf[js.Any], backend = backend.asInstanceOf[js.Any], inputs = inputs.asInstanceOf[js.Any])
    __obj.asInstanceOf[AttrsLRNGradAttrs]
  }
  
  extension [Self <: AttrsLRNGradAttrs](x: Self) {
    
    inline def setAttrs(value: LRNGradAttrs): Self = StObject.set(x, "attrs", value.asInstanceOf[js.Any])
    
    inline def setBackend(value: MathBackendCPU): Self = StObject.set(x, "backend", value.asInstanceOf[js.Any])
    
    inline def setInputs(value: LRNGradInputs): Self = StObject.set(x, "inputs", value.asInstanceOf[js.Any])
  }
}

package typings.tensorflowTfjsBackendCpu.anon

import typings.tensorflowTfjsBackendCpu.backendCpuMod.MathBackendCPU
import typings.tensorflowTfjsCore.kernelNamesMod.LRNAttrs
import typings.tensorflowTfjsCore.kernelNamesMod.LRNInputs
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AttrsLRNAttrs extends StObject {
  
  var attrs: LRNAttrs
  
  var backend: MathBackendCPU
  
  var inputs: LRNInputs
}
object AttrsLRNAttrs {
  
  inline def apply(attrs: LRNAttrs, backend: MathBackendCPU, inputs: LRNInputs): AttrsLRNAttrs = {
    val __obj = js.Dynamic.literal(attrs = attrs.asInstanceOf[js.Any], backend = backend.asInstanceOf[js.Any], inputs = inputs.asInstanceOf[js.Any])
    __obj.asInstanceOf[AttrsLRNAttrs]
  }
  
  extension [Self <: AttrsLRNAttrs](x: Self) {
    
    inline def setAttrs(value: LRNAttrs): Self = StObject.set(x, "attrs", value.asInstanceOf[js.Any])
    
    inline def setBackend(value: MathBackendCPU): Self = StObject.set(x, "backend", value.asInstanceOf[js.Any])
    
    inline def setInputs(value: LRNInputs): Self = StObject.set(x, "inputs", value.asInstanceOf[js.Any])
  }
}

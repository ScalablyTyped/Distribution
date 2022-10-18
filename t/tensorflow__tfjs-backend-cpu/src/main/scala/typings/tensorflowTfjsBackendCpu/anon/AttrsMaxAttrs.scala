package typings.tensorflowTfjsBackendCpu.anon

import typings.tensorflowTfjsBackendCpu.distBackendCpuMod.MathBackendCPU
import typings.tensorflowTfjsCore.distKernelNamesMod.MaxAttrs
import typings.tensorflowTfjsCore.distKernelNamesMod.MaxInputs
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AttrsMaxAttrs extends StObject {
  
  var attrs: MaxAttrs
  
  var backend: MathBackendCPU
  
  var inputs: MaxInputs
}
object AttrsMaxAttrs {
  
  inline def apply(attrs: MaxAttrs, backend: MathBackendCPU, inputs: MaxInputs): AttrsMaxAttrs = {
    val __obj = js.Dynamic.literal(attrs = attrs.asInstanceOf[js.Any], backend = backend.asInstanceOf[js.Any], inputs = inputs.asInstanceOf[js.Any])
    __obj.asInstanceOf[AttrsMaxAttrs]
  }
  
  extension [Self <: AttrsMaxAttrs](x: Self) {
    
    inline def setAttrs(value: MaxAttrs): Self = StObject.set(x, "attrs", value.asInstanceOf[js.Any])
    
    inline def setBackend(value: MathBackendCPU): Self = StObject.set(x, "backend", value.asInstanceOf[js.Any])
    
    inline def setInputs(value: MaxInputs): Self = StObject.set(x, "inputs", value.asInstanceOf[js.Any])
  }
}

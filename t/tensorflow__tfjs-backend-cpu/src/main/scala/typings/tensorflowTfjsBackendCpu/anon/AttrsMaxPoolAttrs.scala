package typings.tensorflowTfjsBackendCpu.anon

import typings.tensorflowTfjsBackendCpu.backendCpuMod.MathBackendCPU
import typings.tensorflowTfjsCore.kernelNamesMod.MaxPoolAttrs
import typings.tensorflowTfjsCore.kernelNamesMod.MaxPoolInputs
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AttrsMaxPoolAttrs extends StObject {
  
  var attrs: MaxPoolAttrs
  
  var backend: MathBackendCPU
  
  var inputs: MaxPoolInputs
}
object AttrsMaxPoolAttrs {
  
  inline def apply(attrs: MaxPoolAttrs, backend: MathBackendCPU, inputs: MaxPoolInputs): AttrsMaxPoolAttrs = {
    val __obj = js.Dynamic.literal(attrs = attrs.asInstanceOf[js.Any], backend = backend.asInstanceOf[js.Any], inputs = inputs.asInstanceOf[js.Any])
    __obj.asInstanceOf[AttrsMaxPoolAttrs]
  }
  
  extension [Self <: AttrsMaxPoolAttrs](x: Self) {
    
    inline def setAttrs(value: MaxPoolAttrs): Self = StObject.set(x, "attrs", value.asInstanceOf[js.Any])
    
    inline def setBackend(value: MathBackendCPU): Self = StObject.set(x, "backend", value.asInstanceOf[js.Any])
    
    inline def setInputs(value: MaxPoolInputs): Self = StObject.set(x, "inputs", value.asInstanceOf[js.Any])
  }
}

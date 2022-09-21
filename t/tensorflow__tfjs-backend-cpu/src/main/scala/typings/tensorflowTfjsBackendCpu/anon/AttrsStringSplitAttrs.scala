package typings.tensorflowTfjsBackendCpu.anon

import typings.tensorflowTfjsBackendCpu.backendCpuMod.MathBackendCPU
import typings.tensorflowTfjsCore.kernelNamesMod.StringSplitAttrs
import typings.tensorflowTfjsCore.kernelNamesMod.StringSplitInputs
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AttrsStringSplitAttrs extends StObject {
  
  var attrs: StringSplitAttrs
  
  var backend: MathBackendCPU
  
  var inputs: StringSplitInputs
}
object AttrsStringSplitAttrs {
  
  inline def apply(attrs: StringSplitAttrs, backend: MathBackendCPU, inputs: StringSplitInputs): AttrsStringSplitAttrs = {
    val __obj = js.Dynamic.literal(attrs = attrs.asInstanceOf[js.Any], backend = backend.asInstanceOf[js.Any], inputs = inputs.asInstanceOf[js.Any])
    __obj.asInstanceOf[AttrsStringSplitAttrs]
  }
  
  extension [Self <: AttrsStringSplitAttrs](x: Self) {
    
    inline def setAttrs(value: StringSplitAttrs): Self = StObject.set(x, "attrs", value.asInstanceOf[js.Any])
    
    inline def setBackend(value: MathBackendCPU): Self = StObject.set(x, "backend", value.asInstanceOf[js.Any])
    
    inline def setInputs(value: StringSplitInputs): Self = StObject.set(x, "inputs", value.asInstanceOf[js.Any])
  }
}

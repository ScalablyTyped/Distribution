package typings.tensorflowTfjsBackendCpu.anon

import typings.tensorflowTfjsBackendCpu.distBackendCpuMod.MathBackendCPU
import typings.tensorflowTfjsCore.distKernelNamesMod.ExpandDimsAttrs
import typings.tensorflowTfjsCore.distKernelNamesMod.ExpandDimsInputs
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AttrsExpandDimsAttrs extends StObject {
  
  var attrs: ExpandDimsAttrs
  
  var backend: MathBackendCPU
  
  var inputs: ExpandDimsInputs
}
object AttrsExpandDimsAttrs {
  
  inline def apply(attrs: ExpandDimsAttrs, backend: MathBackendCPU, inputs: ExpandDimsInputs): AttrsExpandDimsAttrs = {
    val __obj = js.Dynamic.literal(attrs = attrs.asInstanceOf[js.Any], backend = backend.asInstanceOf[js.Any], inputs = inputs.asInstanceOf[js.Any])
    __obj.asInstanceOf[AttrsExpandDimsAttrs]
  }
  
  extension [Self <: AttrsExpandDimsAttrs](x: Self) {
    
    inline def setAttrs(value: ExpandDimsAttrs): Self = StObject.set(x, "attrs", value.asInstanceOf[js.Any])
    
    inline def setBackend(value: MathBackendCPU): Self = StObject.set(x, "backend", value.asInstanceOf[js.Any])
    
    inline def setInputs(value: ExpandDimsInputs): Self = StObject.set(x, "inputs", value.asInstanceOf[js.Any])
  }
}

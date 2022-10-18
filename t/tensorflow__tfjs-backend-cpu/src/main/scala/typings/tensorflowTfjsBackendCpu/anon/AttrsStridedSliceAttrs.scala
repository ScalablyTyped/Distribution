package typings.tensorflowTfjsBackendCpu.anon

import typings.tensorflowTfjsBackendCpu.distBackendCpuMod.MathBackendCPU
import typings.tensorflowTfjsCore.distKernelNamesMod.StridedSliceAttrs
import typings.tensorflowTfjsCore.distKernelNamesMod.StridedSliceInputs
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AttrsStridedSliceAttrs extends StObject {
  
  var attrs: StridedSliceAttrs
  
  var backend: MathBackendCPU
  
  var inputs: StridedSliceInputs
}
object AttrsStridedSliceAttrs {
  
  inline def apply(attrs: StridedSliceAttrs, backend: MathBackendCPU, inputs: StridedSliceInputs): AttrsStridedSliceAttrs = {
    val __obj = js.Dynamic.literal(attrs = attrs.asInstanceOf[js.Any], backend = backend.asInstanceOf[js.Any], inputs = inputs.asInstanceOf[js.Any])
    __obj.asInstanceOf[AttrsStridedSliceAttrs]
  }
  
  extension [Self <: AttrsStridedSliceAttrs](x: Self) {
    
    inline def setAttrs(value: StridedSliceAttrs): Self = StObject.set(x, "attrs", value.asInstanceOf[js.Any])
    
    inline def setBackend(value: MathBackendCPU): Self = StObject.set(x, "backend", value.asInstanceOf[js.Any])
    
    inline def setInputs(value: StridedSliceInputs): Self = StObject.set(x, "inputs", value.asInstanceOf[js.Any])
  }
}

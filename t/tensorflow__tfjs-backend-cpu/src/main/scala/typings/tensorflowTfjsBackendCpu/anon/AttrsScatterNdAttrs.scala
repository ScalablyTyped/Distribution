package typings.tensorflowTfjsBackendCpu.anon

import typings.tensorflowTfjsBackendCpu.distBackendCpuMod.MathBackendCPU
import typings.tensorflowTfjsCore.distKernelNamesMod.ScatterNdAttrs
import typings.tensorflowTfjsCore.distKernelNamesMod.ScatterNdInputs
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AttrsScatterNdAttrs extends StObject {
  
  var attrs: ScatterNdAttrs
  
  var backend: MathBackendCPU
  
  var inputs: ScatterNdInputs
}
object AttrsScatterNdAttrs {
  
  inline def apply(attrs: ScatterNdAttrs, backend: MathBackendCPU, inputs: ScatterNdInputs): AttrsScatterNdAttrs = {
    val __obj = js.Dynamic.literal(attrs = attrs.asInstanceOf[js.Any], backend = backend.asInstanceOf[js.Any], inputs = inputs.asInstanceOf[js.Any])
    __obj.asInstanceOf[AttrsScatterNdAttrs]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: AttrsScatterNdAttrs] (val x: Self) extends AnyVal {
    
    inline def setAttrs(value: ScatterNdAttrs): Self = StObject.set(x, "attrs", value.asInstanceOf[js.Any])
    
    inline def setBackend(value: MathBackendCPU): Self = StObject.set(x, "backend", value.asInstanceOf[js.Any])
    
    inline def setInputs(value: ScatterNdInputs): Self = StObject.set(x, "inputs", value.asInstanceOf[js.Any])
  }
}

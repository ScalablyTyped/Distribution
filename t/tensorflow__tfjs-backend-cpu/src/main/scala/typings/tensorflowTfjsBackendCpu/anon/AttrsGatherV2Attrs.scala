package typings.tensorflowTfjsBackendCpu.anon

import typings.tensorflowTfjsBackendCpu.distBackendCpuMod.MathBackendCPU
import typings.tensorflowTfjsCore.distKernelNamesMod.GatherV2Attrs
import typings.tensorflowTfjsCore.distKernelNamesMod.GatherV2Inputs
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AttrsGatherV2Attrs extends StObject {
  
  var attrs: GatherV2Attrs
  
  var backend: MathBackendCPU
  
  var inputs: GatherV2Inputs
}
object AttrsGatherV2Attrs {
  
  inline def apply(attrs: GatherV2Attrs, backend: MathBackendCPU, inputs: GatherV2Inputs): AttrsGatherV2Attrs = {
    val __obj = js.Dynamic.literal(attrs = attrs.asInstanceOf[js.Any], backend = backend.asInstanceOf[js.Any], inputs = inputs.asInstanceOf[js.Any])
    __obj.asInstanceOf[AttrsGatherV2Attrs]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: AttrsGatherV2Attrs] (val x: Self) extends AnyVal {
    
    inline def setAttrs(value: GatherV2Attrs): Self = StObject.set(x, "attrs", value.asInstanceOf[js.Any])
    
    inline def setBackend(value: MathBackendCPU): Self = StObject.set(x, "backend", value.asInstanceOf[js.Any])
    
    inline def setInputs(value: GatherV2Inputs): Self = StObject.set(x, "inputs", value.asInstanceOf[js.Any])
  }
}

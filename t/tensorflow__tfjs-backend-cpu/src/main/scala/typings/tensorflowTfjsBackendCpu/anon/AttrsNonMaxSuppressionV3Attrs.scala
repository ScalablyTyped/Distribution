package typings.tensorflowTfjsBackendCpu.anon

import typings.tensorflowTfjsBackendCpu.distBackendCpuMod.MathBackendCPU
import typings.tensorflowTfjsCore.distKernelNamesMod.NonMaxSuppressionV3Attrs
import typings.tensorflowTfjsCore.distKernelNamesMod.NonMaxSuppressionV3Inputs
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AttrsNonMaxSuppressionV3Attrs extends StObject {
  
  var attrs: NonMaxSuppressionV3Attrs
  
  var backend: MathBackendCPU
  
  var inputs: NonMaxSuppressionV3Inputs
}
object AttrsNonMaxSuppressionV3Attrs {
  
  inline def apply(attrs: NonMaxSuppressionV3Attrs, backend: MathBackendCPU, inputs: NonMaxSuppressionV3Inputs): AttrsNonMaxSuppressionV3Attrs = {
    val __obj = js.Dynamic.literal(attrs = attrs.asInstanceOf[js.Any], backend = backend.asInstanceOf[js.Any], inputs = inputs.asInstanceOf[js.Any])
    __obj.asInstanceOf[AttrsNonMaxSuppressionV3Attrs]
  }
  
  extension [Self <: AttrsNonMaxSuppressionV3Attrs](x: Self) {
    
    inline def setAttrs(value: NonMaxSuppressionV3Attrs): Self = StObject.set(x, "attrs", value.asInstanceOf[js.Any])
    
    inline def setBackend(value: MathBackendCPU): Self = StObject.set(x, "backend", value.asInstanceOf[js.Any])
    
    inline def setInputs(value: NonMaxSuppressionV3Inputs): Self = StObject.set(x, "inputs", value.asInstanceOf[js.Any])
  }
}

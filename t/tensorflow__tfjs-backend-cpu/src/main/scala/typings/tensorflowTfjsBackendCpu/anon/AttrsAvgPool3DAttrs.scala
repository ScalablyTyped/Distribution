package typings.tensorflowTfjsBackendCpu.anon

import typings.tensorflowTfjsBackendCpu.distBackendCpuMod.MathBackendCPU
import typings.tensorflowTfjsCore.distKernelNamesMod.AvgPool3DAttrs
import typings.tensorflowTfjsCore.distKernelNamesMod.AvgPool3DInputs
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AttrsAvgPool3DAttrs extends StObject {
  
  var attrs: AvgPool3DAttrs
  
  var backend: MathBackendCPU
  
  var inputs: AvgPool3DInputs
}
object AttrsAvgPool3DAttrs {
  
  inline def apply(attrs: AvgPool3DAttrs, backend: MathBackendCPU, inputs: AvgPool3DInputs): AttrsAvgPool3DAttrs = {
    val __obj = js.Dynamic.literal(attrs = attrs.asInstanceOf[js.Any], backend = backend.asInstanceOf[js.Any], inputs = inputs.asInstanceOf[js.Any])
    __obj.asInstanceOf[AttrsAvgPool3DAttrs]
  }
  
  extension [Self <: AttrsAvgPool3DAttrs](x: Self) {
    
    inline def setAttrs(value: AvgPool3DAttrs): Self = StObject.set(x, "attrs", value.asInstanceOf[js.Any])
    
    inline def setBackend(value: MathBackendCPU): Self = StObject.set(x, "backend", value.asInstanceOf[js.Any])
    
    inline def setInputs(value: AvgPool3DInputs): Self = StObject.set(x, "inputs", value.asInstanceOf[js.Any])
  }
}

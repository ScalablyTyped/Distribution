package typings.tensorflowTfjsBackendCpu.anon

import typings.tensorflowTfjsBackendCpu.distBackendCpuMod.MathBackendCPU
import typings.tensorflowTfjsCore.distKernelNamesMod.MeanAttrs
import typings.tensorflowTfjsCore.distKernelNamesMod.MeanInputs
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AttrsMeanAttrs extends StObject {
  
  var attrs: MeanAttrs
  
  var backend: MathBackendCPU
  
  var inputs: MeanInputs
}
object AttrsMeanAttrs {
  
  inline def apply(attrs: MeanAttrs, backend: MathBackendCPU, inputs: MeanInputs): AttrsMeanAttrs = {
    val __obj = js.Dynamic.literal(attrs = attrs.asInstanceOf[js.Any], backend = backend.asInstanceOf[js.Any], inputs = inputs.asInstanceOf[js.Any])
    __obj.asInstanceOf[AttrsMeanAttrs]
  }
  
  extension [Self <: AttrsMeanAttrs](x: Self) {
    
    inline def setAttrs(value: MeanAttrs): Self = StObject.set(x, "attrs", value.asInstanceOf[js.Any])
    
    inline def setBackend(value: MathBackendCPU): Self = StObject.set(x, "backend", value.asInstanceOf[js.Any])
    
    inline def setInputs(value: MeanInputs): Self = StObject.set(x, "inputs", value.asInstanceOf[js.Any])
  }
}

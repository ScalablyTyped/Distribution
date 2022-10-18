package typings.tensorflowTfjsBackendCpu.anon

import typings.tensorflowTfjsBackendCpu.distBackendCpuMod.MathBackendCPU
import typings.tensorflowTfjsCore.distKernelNamesMod.SoftmaxAttrs
import typings.tensorflowTfjsCore.distKernelNamesMod.SoftmaxInputs
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AttrsSoftmaxAttrs extends StObject {
  
  var attrs: SoftmaxAttrs
  
  var backend: MathBackendCPU
  
  var inputs: SoftmaxInputs
}
object AttrsSoftmaxAttrs {
  
  inline def apply(attrs: SoftmaxAttrs, backend: MathBackendCPU, inputs: SoftmaxInputs): AttrsSoftmaxAttrs = {
    val __obj = js.Dynamic.literal(attrs = attrs.asInstanceOf[js.Any], backend = backend.asInstanceOf[js.Any], inputs = inputs.asInstanceOf[js.Any])
    __obj.asInstanceOf[AttrsSoftmaxAttrs]
  }
  
  extension [Self <: AttrsSoftmaxAttrs](x: Self) {
    
    inline def setAttrs(value: SoftmaxAttrs): Self = StObject.set(x, "attrs", value.asInstanceOf[js.Any])
    
    inline def setBackend(value: MathBackendCPU): Self = StObject.set(x, "backend", value.asInstanceOf[js.Any])
    
    inline def setInputs(value: SoftmaxInputs): Self = StObject.set(x, "inputs", value.asInstanceOf[js.Any])
  }
}

package typings.tensorflowTfjsBackendCpu.anon

import typings.tensorflowTfjsBackendCpu.distBackendCpuMod.MathBackendCPU
import typings.tensorflowTfjsCore.distKernelNamesMod.BatchMatMulAttrs
import typings.tensorflowTfjsCore.distKernelNamesMod.BatchMatMulInputs
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AttrsBatchMatMulAttrs extends StObject {
  
  var attrs: BatchMatMulAttrs
  
  var backend: MathBackendCPU
  
  var inputs: BatchMatMulInputs
}
object AttrsBatchMatMulAttrs {
  
  inline def apply(attrs: BatchMatMulAttrs, backend: MathBackendCPU, inputs: BatchMatMulInputs): AttrsBatchMatMulAttrs = {
    val __obj = js.Dynamic.literal(attrs = attrs.asInstanceOf[js.Any], backend = backend.asInstanceOf[js.Any], inputs = inputs.asInstanceOf[js.Any])
    __obj.asInstanceOf[AttrsBatchMatMulAttrs]
  }
  
  extension [Self <: AttrsBatchMatMulAttrs](x: Self) {
    
    inline def setAttrs(value: BatchMatMulAttrs): Self = StObject.set(x, "attrs", value.asInstanceOf[js.Any])
    
    inline def setBackend(value: MathBackendCPU): Self = StObject.set(x, "backend", value.asInstanceOf[js.Any])
    
    inline def setInputs(value: BatchMatMulInputs): Self = StObject.set(x, "inputs", value.asInstanceOf[js.Any])
  }
}

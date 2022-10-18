package typings.tensorflowTfjsBackendCpu.anon

import typings.tensorflowTfjsBackendCpu.distBackendCpuMod.MathBackendCPU
import typings.tensorflowTfjsCore.distKernelNamesMod.FusedMatMulAttrs
import typings.tensorflowTfjsCore.distKernelNamesMod.FusedMatMulInputs
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AttrsFusedMatMulAttrs extends StObject {
  
  var attrs: FusedMatMulAttrs
  
  var backend: MathBackendCPU
  
  var inputs: FusedMatMulInputs
}
object AttrsFusedMatMulAttrs {
  
  inline def apply(attrs: FusedMatMulAttrs, backend: MathBackendCPU, inputs: FusedMatMulInputs): AttrsFusedMatMulAttrs = {
    val __obj = js.Dynamic.literal(attrs = attrs.asInstanceOf[js.Any], backend = backend.asInstanceOf[js.Any], inputs = inputs.asInstanceOf[js.Any])
    __obj.asInstanceOf[AttrsFusedMatMulAttrs]
  }
  
  extension [Self <: AttrsFusedMatMulAttrs](x: Self) {
    
    inline def setAttrs(value: FusedMatMulAttrs): Self = StObject.set(x, "attrs", value.asInstanceOf[js.Any])
    
    inline def setBackend(value: MathBackendCPU): Self = StObject.set(x, "backend", value.asInstanceOf[js.Any])
    
    inline def setInputs(value: FusedMatMulInputs): Self = StObject.set(x, "inputs", value.asInstanceOf[js.Any])
  }
}

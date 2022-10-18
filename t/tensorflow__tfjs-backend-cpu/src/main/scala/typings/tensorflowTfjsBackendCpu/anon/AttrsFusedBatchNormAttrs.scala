package typings.tensorflowTfjsBackendCpu.anon

import typings.tensorflowTfjsBackendCpu.distBackendCpuMod.MathBackendCPU
import typings.tensorflowTfjsCore.distKernelNamesMod.FusedBatchNormAttrs
import typings.tensorflowTfjsCore.distKernelNamesMod.FusedBatchNormInputs
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AttrsFusedBatchNormAttrs extends StObject {
  
  var attrs: FusedBatchNormAttrs
  
  var backend: MathBackendCPU
  
  var inputs: FusedBatchNormInputs
}
object AttrsFusedBatchNormAttrs {
  
  inline def apply(attrs: FusedBatchNormAttrs, backend: MathBackendCPU, inputs: FusedBatchNormInputs): AttrsFusedBatchNormAttrs = {
    val __obj = js.Dynamic.literal(attrs = attrs.asInstanceOf[js.Any], backend = backend.asInstanceOf[js.Any], inputs = inputs.asInstanceOf[js.Any])
    __obj.asInstanceOf[AttrsFusedBatchNormAttrs]
  }
  
  extension [Self <: AttrsFusedBatchNormAttrs](x: Self) {
    
    inline def setAttrs(value: FusedBatchNormAttrs): Self = StObject.set(x, "attrs", value.asInstanceOf[js.Any])
    
    inline def setBackend(value: MathBackendCPU): Self = StObject.set(x, "backend", value.asInstanceOf[js.Any])
    
    inline def setInputs(value: FusedBatchNormInputs): Self = StObject.set(x, "inputs", value.asInstanceOf[js.Any])
  }
}

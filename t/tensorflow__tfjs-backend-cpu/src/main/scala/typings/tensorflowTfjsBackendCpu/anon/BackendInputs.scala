package typings.tensorflowTfjsBackendCpu.anon

import typings.tensorflowTfjsBackendCpu.backendCpuMod.MathBackendCPU
import typings.tensorflowTfjsCore.kernelNamesMod.FusedBatchNormAttrs
import typings.tensorflowTfjsCore.kernelNamesMod.FusedBatchNormInputs
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BackendInputs extends StObject {
  
  var attrs: FusedBatchNormAttrs
  
  var backend: MathBackendCPU
  
  var inputs: FusedBatchNormInputs
}
object BackendInputs {
  
  @scala.inline
  def apply(attrs: FusedBatchNormAttrs, backend: MathBackendCPU, inputs: FusedBatchNormInputs): BackendInputs = {
    val __obj = js.Dynamic.literal(attrs = attrs.asInstanceOf[js.Any], backend = backend.asInstanceOf[js.Any], inputs = inputs.asInstanceOf[js.Any])
    __obj.asInstanceOf[BackendInputs]
  }
  
  @scala.inline
  implicit class BackendInputsMutableBuilder[Self <: BackendInputs] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAttrs(value: FusedBatchNormAttrs): Self = StObject.set(x, "attrs", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBackend(value: MathBackendCPU): Self = StObject.set(x, "backend", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInputs(value: FusedBatchNormInputs): Self = StObject.set(x, "inputs", value.asInstanceOf[js.Any])
  }
}

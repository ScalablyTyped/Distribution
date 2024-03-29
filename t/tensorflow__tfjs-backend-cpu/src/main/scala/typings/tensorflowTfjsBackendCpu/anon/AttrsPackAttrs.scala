package typings.tensorflowTfjsBackendCpu.anon

import typings.tensorflowTfjsBackendCpu.distBackendCpuMod.MathBackendCPU
import typings.tensorflowTfjsCore.distKernelNamesMod.PackAttrs
import typings.tensorflowTfjsCore.distKernelNamesMod.PackInputs
import typings.tensorflowTfjsCore.distTensorInfoMod.TensorInfo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AttrsPackAttrs extends StObject {
  
  var attrs: PackAttrs
  
  var backend: MathBackendCPU
  
  var inputs: PackInputs
}
object AttrsPackAttrs {
  
  inline def apply(attrs: PackAttrs, backend: MathBackendCPU, inputs: PackInputs): AttrsPackAttrs = {
    val __obj = js.Dynamic.literal(attrs = attrs.asInstanceOf[js.Any], backend = backend.asInstanceOf[js.Any], inputs = inputs.asInstanceOf[js.Any])
    __obj.asInstanceOf[AttrsPackAttrs]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: AttrsPackAttrs] (val x: Self) extends AnyVal {
    
    inline def setAttrs(value: PackAttrs): Self = StObject.set(x, "attrs", value.asInstanceOf[js.Any])
    
    inline def setBackend(value: MathBackendCPU): Self = StObject.set(x, "backend", value.asInstanceOf[js.Any])
    
    inline def setInputs(value: PackInputs): Self = StObject.set(x, "inputs", value.asInstanceOf[js.Any])
    
    inline def setInputsVarargs(value: TensorInfo*): Self = StObject.set(x, "inputs", js.Array(value*))
  }
}

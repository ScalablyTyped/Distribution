package typings.tensorflowTfjsBackendCpu.anon

import typings.tensorflowTfjsBackendCpu.distBackendCpuMod.MathBackendCPU
import typings.tensorflowTfjsCore.distKernelNamesMod.ConcatAttrs
import typings.tensorflowTfjsCore.distKernelNamesMod.ConcatInputs
import typings.tensorflowTfjsCore.distTensorInfoMod.TensorInfo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AttrsConcatAttrs extends StObject {
  
  var attrs: ConcatAttrs
  
  var backend: MathBackendCPU
  
  var inputs: ConcatInputs
}
object AttrsConcatAttrs {
  
  inline def apply(attrs: ConcatAttrs, backend: MathBackendCPU, inputs: ConcatInputs): AttrsConcatAttrs = {
    val __obj = js.Dynamic.literal(attrs = attrs.asInstanceOf[js.Any], backend = backend.asInstanceOf[js.Any], inputs = inputs.asInstanceOf[js.Any])
    __obj.asInstanceOf[AttrsConcatAttrs]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: AttrsConcatAttrs] (val x: Self) extends AnyVal {
    
    inline def setAttrs(value: ConcatAttrs): Self = StObject.set(x, "attrs", value.asInstanceOf[js.Any])
    
    inline def setBackend(value: MathBackendCPU): Self = StObject.set(x, "backend", value.asInstanceOf[js.Any])
    
    inline def setInputs(value: ConcatInputs): Self = StObject.set(x, "inputs", value.asInstanceOf[js.Any])
    
    inline def setInputsVarargs(value: TensorInfo*): Self = StObject.set(x, "inputs", js.Array(value*))
  }
}

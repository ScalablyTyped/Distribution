package typings.tensorflowTfjsBackendCpu.anon

import typings.tensorflowTfjsBackendCpu.distBackendCpuMod.MathBackendCPU
import typings.tensorflowTfjsCore.distKernelNamesMod.TensorScatterUpdateAttrs
import typings.tensorflowTfjsCore.distKernelNamesMod.TensorScatterUpdateInputs
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AttrsTensorScatterUpdateAttrs extends StObject {
  
  var attrs: TensorScatterUpdateAttrs
  
  var backend: MathBackendCPU
  
  var inputs: TensorScatterUpdateInputs
}
object AttrsTensorScatterUpdateAttrs {
  
  inline def apply(attrs: TensorScatterUpdateAttrs, backend: MathBackendCPU, inputs: TensorScatterUpdateInputs): AttrsTensorScatterUpdateAttrs = {
    val __obj = js.Dynamic.literal(attrs = attrs.asInstanceOf[js.Any], backend = backend.asInstanceOf[js.Any], inputs = inputs.asInstanceOf[js.Any])
    __obj.asInstanceOf[AttrsTensorScatterUpdateAttrs]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: AttrsTensorScatterUpdateAttrs] (val x: Self) extends AnyVal {
    
    inline def setAttrs(value: TensorScatterUpdateAttrs): Self = StObject.set(x, "attrs", value.asInstanceOf[js.Any])
    
    inline def setBackend(value: MathBackendCPU): Self = StObject.set(x, "backend", value.asInstanceOf[js.Any])
    
    inline def setInputs(value: TensorScatterUpdateInputs): Self = StObject.set(x, "inputs", value.asInstanceOf[js.Any])
  }
}

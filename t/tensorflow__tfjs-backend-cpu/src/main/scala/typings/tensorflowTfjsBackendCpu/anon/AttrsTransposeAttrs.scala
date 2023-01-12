package typings.tensorflowTfjsBackendCpu.anon

import typings.tensorflowTfjsBackendCpu.distBackendCpuMod.MathBackendCPU
import typings.tensorflowTfjsCore.distKernelNamesMod.TransposeAttrs
import typings.tensorflowTfjsCore.distKernelNamesMod.TransposeInputs
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AttrsTransposeAttrs extends StObject {
  
  var attrs: TransposeAttrs
  
  var backend: MathBackendCPU
  
  var inputs: TransposeInputs
}
object AttrsTransposeAttrs {
  
  inline def apply(attrs: TransposeAttrs, backend: MathBackendCPU, inputs: TransposeInputs): AttrsTransposeAttrs = {
    val __obj = js.Dynamic.literal(attrs = attrs.asInstanceOf[js.Any], backend = backend.asInstanceOf[js.Any], inputs = inputs.asInstanceOf[js.Any])
    __obj.asInstanceOf[AttrsTransposeAttrs]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: AttrsTransposeAttrs] (val x: Self) extends AnyVal {
    
    inline def setAttrs(value: TransposeAttrs): Self = StObject.set(x, "attrs", value.asInstanceOf[js.Any])
    
    inline def setBackend(value: MathBackendCPU): Self = StObject.set(x, "backend", value.asInstanceOf[js.Any])
    
    inline def setInputs(value: TransposeInputs): Self = StObject.set(x, "inputs", value.asInstanceOf[js.Any])
  }
}

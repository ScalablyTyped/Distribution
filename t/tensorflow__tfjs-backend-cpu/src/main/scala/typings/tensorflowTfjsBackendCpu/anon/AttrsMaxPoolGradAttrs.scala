package typings.tensorflowTfjsBackendCpu.anon

import typings.tensorflowTfjsBackendCpu.distBackendCpuMod.MathBackendCPU
import typings.tensorflowTfjsCore.distKernelNamesMod.MaxPoolGradAttrs
import typings.tensorflowTfjsCore.distKernelNamesMod.MaxPoolGradInputs
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AttrsMaxPoolGradAttrs extends StObject {
  
  var attrs: MaxPoolGradAttrs
  
  var backend: MathBackendCPU
  
  var inputs: MaxPoolGradInputs
}
object AttrsMaxPoolGradAttrs {
  
  inline def apply(attrs: MaxPoolGradAttrs, backend: MathBackendCPU, inputs: MaxPoolGradInputs): AttrsMaxPoolGradAttrs = {
    val __obj = js.Dynamic.literal(attrs = attrs.asInstanceOf[js.Any], backend = backend.asInstanceOf[js.Any], inputs = inputs.asInstanceOf[js.Any])
    __obj.asInstanceOf[AttrsMaxPoolGradAttrs]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: AttrsMaxPoolGradAttrs] (val x: Self) extends AnyVal {
    
    inline def setAttrs(value: MaxPoolGradAttrs): Self = StObject.set(x, "attrs", value.asInstanceOf[js.Any])
    
    inline def setBackend(value: MathBackendCPU): Self = StObject.set(x, "backend", value.asInstanceOf[js.Any])
    
    inline def setInputs(value: MaxPoolGradInputs): Self = StObject.set(x, "inputs", value.asInstanceOf[js.Any])
  }
}

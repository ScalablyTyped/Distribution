package typings.tensorflowTfjsBackendCpu.anon

import typings.tensorflowTfjsBackendCpu.distBackendCpuMod.MathBackendCPU
import typings.tensorflowTfjsCore.distKernelNamesMod.AnyAttrs
import typings.tensorflowTfjsCore.distKernelNamesMod.AnyInputs
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AttrsBackend extends StObject {
  
  var attrs: AnyAttrs
  
  var backend: MathBackendCPU
  
  var inputs: AnyInputs
}
object AttrsBackend {
  
  inline def apply(attrs: AnyAttrs, backend: MathBackendCPU, inputs: AnyInputs): AttrsBackend = {
    val __obj = js.Dynamic.literal(attrs = attrs.asInstanceOf[js.Any], backend = backend.asInstanceOf[js.Any], inputs = inputs.asInstanceOf[js.Any])
    __obj.asInstanceOf[AttrsBackend]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: AttrsBackend] (val x: Self) extends AnyVal {
    
    inline def setAttrs(value: AnyAttrs): Self = StObject.set(x, "attrs", value.asInstanceOf[js.Any])
    
    inline def setBackend(value: MathBackendCPU): Self = StObject.set(x, "backend", value.asInstanceOf[js.Any])
    
    inline def setInputs(value: AnyInputs): Self = StObject.set(x, "inputs", value.asInstanceOf[js.Any])
  }
}

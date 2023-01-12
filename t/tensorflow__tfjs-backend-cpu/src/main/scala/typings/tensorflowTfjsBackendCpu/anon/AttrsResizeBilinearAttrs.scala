package typings.tensorflowTfjsBackendCpu.anon

import typings.tensorflowTfjsBackendCpu.distBackendCpuMod.MathBackendCPU
import typings.tensorflowTfjsCore.distKernelNamesMod.ResizeBilinearAttrs
import typings.tensorflowTfjsCore.distKernelNamesMod.ResizeBilinearInputs
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AttrsResizeBilinearAttrs extends StObject {
  
  var attrs: ResizeBilinearAttrs
  
  var backend: MathBackendCPU
  
  var inputs: ResizeBilinearInputs
}
object AttrsResizeBilinearAttrs {
  
  inline def apply(attrs: ResizeBilinearAttrs, backend: MathBackendCPU, inputs: ResizeBilinearInputs): AttrsResizeBilinearAttrs = {
    val __obj = js.Dynamic.literal(attrs = attrs.asInstanceOf[js.Any], backend = backend.asInstanceOf[js.Any], inputs = inputs.asInstanceOf[js.Any])
    __obj.asInstanceOf[AttrsResizeBilinearAttrs]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: AttrsResizeBilinearAttrs] (val x: Self) extends AnyVal {
    
    inline def setAttrs(value: ResizeBilinearAttrs): Self = StObject.set(x, "attrs", value.asInstanceOf[js.Any])
    
    inline def setBackend(value: MathBackendCPU): Self = StObject.set(x, "backend", value.asInstanceOf[js.Any])
    
    inline def setInputs(value: ResizeBilinearInputs): Self = StObject.set(x, "inputs", value.asInstanceOf[js.Any])
  }
}

package typings.tensorflowTfjsBackendCpu.anon

import typings.tensorflowTfjsBackendCpu.distBackendCpuMod.MathBackendCPU
import typings.tensorflowTfjsCore.distKernelNamesMod.CropAndResizeAttrs
import typings.tensorflowTfjsCore.distKernelNamesMod.CropAndResizeInputs
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AttrsCropAndResizeAttrs extends StObject {
  
  var attrs: CropAndResizeAttrs
  
  var backend: MathBackendCPU
  
  var inputs: CropAndResizeInputs
}
object AttrsCropAndResizeAttrs {
  
  inline def apply(attrs: CropAndResizeAttrs, backend: MathBackendCPU, inputs: CropAndResizeInputs): AttrsCropAndResizeAttrs = {
    val __obj = js.Dynamic.literal(attrs = attrs.asInstanceOf[js.Any], backend = backend.asInstanceOf[js.Any], inputs = inputs.asInstanceOf[js.Any])
    __obj.asInstanceOf[AttrsCropAndResizeAttrs]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: AttrsCropAndResizeAttrs] (val x: Self) extends AnyVal {
    
    inline def setAttrs(value: CropAndResizeAttrs): Self = StObject.set(x, "attrs", value.asInstanceOf[js.Any])
    
    inline def setBackend(value: MathBackendCPU): Self = StObject.set(x, "backend", value.asInstanceOf[js.Any])
    
    inline def setInputs(value: CropAndResizeInputs): Self = StObject.set(x, "inputs", value.asInstanceOf[js.Any])
  }
}

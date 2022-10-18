package typings.tensorflowTfjsBackendWebgl.anon

import typings.tensorflowTfjsBackendWebgl.distBackendWebglMod.MathBackendWebGL
import typings.tensorflowTfjsCore.distKernelNamesMod.ResizeBilinearGradAttrs
import typings.tensorflowTfjsCore.distKernelNamesMod.ResizeBilinearGradInputs
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AttrsResizeBilinearGradAttrs extends StObject {
  
  var attrs: ResizeBilinearGradAttrs
  
  var backend: MathBackendWebGL
  
  var inputs: ResizeBilinearGradInputs
}
object AttrsResizeBilinearGradAttrs {
  
  inline def apply(attrs: ResizeBilinearGradAttrs, backend: MathBackendWebGL, inputs: ResizeBilinearGradInputs): AttrsResizeBilinearGradAttrs = {
    val __obj = js.Dynamic.literal(attrs = attrs.asInstanceOf[js.Any], backend = backend.asInstanceOf[js.Any], inputs = inputs.asInstanceOf[js.Any])
    __obj.asInstanceOf[AttrsResizeBilinearGradAttrs]
  }
  
  extension [Self <: AttrsResizeBilinearGradAttrs](x: Self) {
    
    inline def setAttrs(value: ResizeBilinearGradAttrs): Self = StObject.set(x, "attrs", value.asInstanceOf[js.Any])
    
    inline def setBackend(value: MathBackendWebGL): Self = StObject.set(x, "backend", value.asInstanceOf[js.Any])
    
    inline def setInputs(value: ResizeBilinearGradInputs): Self = StObject.set(x, "inputs", value.asInstanceOf[js.Any])
  }
}

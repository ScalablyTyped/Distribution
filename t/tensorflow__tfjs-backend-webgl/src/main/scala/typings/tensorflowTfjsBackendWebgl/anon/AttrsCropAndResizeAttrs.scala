package typings.tensorflowTfjsBackendWebgl.anon

import typings.tensorflowTfjsBackendWebgl.distBackendWebglMod.MathBackendWebGL
import typings.tensorflowTfjsCore.distKernelNamesMod.CropAndResizeAttrs
import typings.tensorflowTfjsCore.distKernelNamesMod.CropAndResizeInputs
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AttrsCropAndResizeAttrs extends StObject {
  
  var attrs: CropAndResizeAttrs
  
  var backend: MathBackendWebGL
  
  var inputs: CropAndResizeInputs
}
object AttrsCropAndResizeAttrs {
  
  inline def apply(attrs: CropAndResizeAttrs, backend: MathBackendWebGL, inputs: CropAndResizeInputs): AttrsCropAndResizeAttrs = {
    val __obj = js.Dynamic.literal(attrs = attrs.asInstanceOf[js.Any], backend = backend.asInstanceOf[js.Any], inputs = inputs.asInstanceOf[js.Any])
    __obj.asInstanceOf[AttrsCropAndResizeAttrs]
  }
  
  extension [Self <: AttrsCropAndResizeAttrs](x: Self) {
    
    inline def setAttrs(value: CropAndResizeAttrs): Self = StObject.set(x, "attrs", value.asInstanceOf[js.Any])
    
    inline def setBackend(value: MathBackendWebGL): Self = StObject.set(x, "backend", value.asInstanceOf[js.Any])
    
    inline def setInputs(value: CropAndResizeInputs): Self = StObject.set(x, "inputs", value.asInstanceOf[js.Any])
  }
}

package typings.tensorflowTfjsBackendWebgl.anon

import typings.tensorflowTfjsBackendWebgl.distBackendWebglMod.MathBackendWebGL
import typings.tensorflowTfjsCore.distKernelNamesMod.SliceAttrs
import typings.tensorflowTfjsCore.distKernelNamesMod.SliceInputs
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AttrsSliceAttrs extends StObject {
  
  var attrs: SliceAttrs
  
  var backend: MathBackendWebGL
  
  var inputs: SliceInputs
}
object AttrsSliceAttrs {
  
  inline def apply(attrs: SliceAttrs, backend: MathBackendWebGL, inputs: SliceInputs): AttrsSliceAttrs = {
    val __obj = js.Dynamic.literal(attrs = attrs.asInstanceOf[js.Any], backend = backend.asInstanceOf[js.Any], inputs = inputs.asInstanceOf[js.Any])
    __obj.asInstanceOf[AttrsSliceAttrs]
  }
  
  extension [Self <: AttrsSliceAttrs](x: Self) {
    
    inline def setAttrs(value: SliceAttrs): Self = StObject.set(x, "attrs", value.asInstanceOf[js.Any])
    
    inline def setBackend(value: MathBackendWebGL): Self = StObject.set(x, "backend", value.asInstanceOf[js.Any])
    
    inline def setInputs(value: SliceInputs): Self = StObject.set(x, "inputs", value.asInstanceOf[js.Any])
  }
}

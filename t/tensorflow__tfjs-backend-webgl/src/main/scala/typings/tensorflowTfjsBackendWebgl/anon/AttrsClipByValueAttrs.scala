package typings.tensorflowTfjsBackendWebgl.anon

import typings.tensorflowTfjsBackendWebgl.distBackendWebglMod.MathBackendWebGL
import typings.tensorflowTfjsCore.distKernelNamesMod.ClipByValueAttrs
import typings.tensorflowTfjsCore.distKernelNamesMod.ClipByValueInputs
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AttrsClipByValueAttrs extends StObject {
  
  var attrs: ClipByValueAttrs
  
  var backend: MathBackendWebGL
  
  var inputs: ClipByValueInputs
}
object AttrsClipByValueAttrs {
  
  inline def apply(attrs: ClipByValueAttrs, backend: MathBackendWebGL, inputs: ClipByValueInputs): AttrsClipByValueAttrs = {
    val __obj = js.Dynamic.literal(attrs = attrs.asInstanceOf[js.Any], backend = backend.asInstanceOf[js.Any], inputs = inputs.asInstanceOf[js.Any])
    __obj.asInstanceOf[AttrsClipByValueAttrs]
  }
  
  extension [Self <: AttrsClipByValueAttrs](x: Self) {
    
    inline def setAttrs(value: ClipByValueAttrs): Self = StObject.set(x, "attrs", value.asInstanceOf[js.Any])
    
    inline def setBackend(value: MathBackendWebGL): Self = StObject.set(x, "backend", value.asInstanceOf[js.Any])
    
    inline def setInputs(value: ClipByValueInputs): Self = StObject.set(x, "inputs", value.asInstanceOf[js.Any])
  }
}

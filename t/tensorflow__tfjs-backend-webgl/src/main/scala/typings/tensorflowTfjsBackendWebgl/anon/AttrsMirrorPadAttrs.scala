package typings.tensorflowTfjsBackendWebgl.anon

import typings.tensorflowTfjsBackendWebgl.backendWebglMod.MathBackendWebGL
import typings.tensorflowTfjsCore.kernelNamesMod.MirrorPadAttrs
import typings.tensorflowTfjsCore.kernelNamesMod.MirrorPadInputs
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AttrsMirrorPadAttrs extends StObject {
  
  var attrs: MirrorPadAttrs
  
  var backend: MathBackendWebGL
  
  var inputs: MirrorPadInputs
}
object AttrsMirrorPadAttrs {
  
  inline def apply(attrs: MirrorPadAttrs, backend: MathBackendWebGL, inputs: MirrorPadInputs): AttrsMirrorPadAttrs = {
    val __obj = js.Dynamic.literal(attrs = attrs.asInstanceOf[js.Any], backend = backend.asInstanceOf[js.Any], inputs = inputs.asInstanceOf[js.Any])
    __obj.asInstanceOf[AttrsMirrorPadAttrs]
  }
  
  extension [Self <: AttrsMirrorPadAttrs](x: Self) {
    
    inline def setAttrs(value: MirrorPadAttrs): Self = StObject.set(x, "attrs", value.asInstanceOf[js.Any])
    
    inline def setBackend(value: MathBackendWebGL): Self = StObject.set(x, "backend", value.asInstanceOf[js.Any])
    
    inline def setInputs(value: MirrorPadInputs): Self = StObject.set(x, "inputs", value.asInstanceOf[js.Any])
  }
}

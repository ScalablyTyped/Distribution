package typings.tensorflowTfjsBackendWebgl.anon

import typings.tensorflowTfjsBackendWebgl.backendWebglMod.MathBackendWebGL
import typings.tensorflowTfjsCore.kernelNamesMod.MaxPoolBackpropAttrs
import typings.tensorflowTfjsCore.kernelNamesMod.MaxPoolBackpropInputs
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AttrsMaxPoolBackpropAttrs extends StObject {
  
  var attrs: MaxPoolBackpropAttrs
  
  var backend: MathBackendWebGL
  
  var inputs: MaxPoolBackpropInputs
}
object AttrsMaxPoolBackpropAttrs {
  
  inline def apply(attrs: MaxPoolBackpropAttrs, backend: MathBackendWebGL, inputs: MaxPoolBackpropInputs): AttrsMaxPoolBackpropAttrs = {
    val __obj = js.Dynamic.literal(attrs = attrs.asInstanceOf[js.Any], backend = backend.asInstanceOf[js.Any], inputs = inputs.asInstanceOf[js.Any])
    __obj.asInstanceOf[AttrsMaxPoolBackpropAttrs]
  }
  
  extension [Self <: AttrsMaxPoolBackpropAttrs](x: Self) {
    
    inline def setAttrs(value: MaxPoolBackpropAttrs): Self = StObject.set(x, "attrs", value.asInstanceOf[js.Any])
    
    inline def setBackend(value: MathBackendWebGL): Self = StObject.set(x, "backend", value.asInstanceOf[js.Any])
    
    inline def setInputs(value: MaxPoolBackpropInputs): Self = StObject.set(x, "inputs", value.asInstanceOf[js.Any])
  }
}

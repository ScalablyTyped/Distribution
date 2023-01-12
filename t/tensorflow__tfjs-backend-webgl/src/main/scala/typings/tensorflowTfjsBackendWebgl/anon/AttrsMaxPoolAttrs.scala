package typings.tensorflowTfjsBackendWebgl.anon

import typings.tensorflowTfjsBackendWebgl.distBackendWebglMod.MathBackendWebGL
import typings.tensorflowTfjsCore.distKernelNamesMod.MaxPoolAttrs
import typings.tensorflowTfjsCore.distKernelNamesMod.MaxPoolInputs
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AttrsMaxPoolAttrs extends StObject {
  
  var attrs: MaxPoolAttrs
  
  var backend: MathBackendWebGL
  
  var inputs: MaxPoolInputs
}
object AttrsMaxPoolAttrs {
  
  inline def apply(attrs: MaxPoolAttrs, backend: MathBackendWebGL, inputs: MaxPoolInputs): AttrsMaxPoolAttrs = {
    val __obj = js.Dynamic.literal(attrs = attrs.asInstanceOf[js.Any], backend = backend.asInstanceOf[js.Any], inputs = inputs.asInstanceOf[js.Any])
    __obj.asInstanceOf[AttrsMaxPoolAttrs]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: AttrsMaxPoolAttrs] (val x: Self) extends AnyVal {
    
    inline def setAttrs(value: MaxPoolAttrs): Self = StObject.set(x, "attrs", value.asInstanceOf[js.Any])
    
    inline def setBackend(value: MathBackendWebGL): Self = StObject.set(x, "backend", value.asInstanceOf[js.Any])
    
    inline def setInputs(value: MaxPoolInputs): Self = StObject.set(x, "inputs", value.asInstanceOf[js.Any])
  }
}

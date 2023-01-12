package typings.tensorflowTfjsBackendWebgl.anon

import typings.tensorflowTfjsBackendWebgl.distBackendWebglMod.MathBackendWebGL
import typings.tensorflowTfjsCore.distKernelNamesMod.MaxPool3DAttrs
import typings.tensorflowTfjsCore.distKernelNamesMod.MaxPool3DInputs
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AttrsMaxPool3DAttrs extends StObject {
  
  var attrs: MaxPool3DAttrs
  
  var backend: MathBackendWebGL
  
  var inputs: MaxPool3DInputs
}
object AttrsMaxPool3DAttrs {
  
  inline def apply(attrs: MaxPool3DAttrs, backend: MathBackendWebGL, inputs: MaxPool3DInputs): AttrsMaxPool3DAttrs = {
    val __obj = js.Dynamic.literal(attrs = attrs.asInstanceOf[js.Any], backend = backend.asInstanceOf[js.Any], inputs = inputs.asInstanceOf[js.Any])
    __obj.asInstanceOf[AttrsMaxPool3DAttrs]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: AttrsMaxPool3DAttrs] (val x: Self) extends AnyVal {
    
    inline def setAttrs(value: MaxPool3DAttrs): Self = StObject.set(x, "attrs", value.asInstanceOf[js.Any])
    
    inline def setBackend(value: MathBackendWebGL): Self = StObject.set(x, "backend", value.asInstanceOf[js.Any])
    
    inline def setInputs(value: MaxPool3DInputs): Self = StObject.set(x, "inputs", value.asInstanceOf[js.Any])
  }
}

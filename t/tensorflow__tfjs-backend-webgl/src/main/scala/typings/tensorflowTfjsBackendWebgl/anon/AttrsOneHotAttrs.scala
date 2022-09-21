package typings.tensorflowTfjsBackendWebgl.anon

import typings.tensorflowTfjsBackendWebgl.backendWebglMod.MathBackendWebGL
import typings.tensorflowTfjsCore.kernelNamesMod.OneHotAttrs
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AttrsOneHotAttrs extends StObject {
  
  var attrs: OneHotAttrs
  
  var backend: MathBackendWebGL
  
  var inputs: PickNamedTensorInfoMapind
}
object AttrsOneHotAttrs {
  
  inline def apply(attrs: OneHotAttrs, backend: MathBackendWebGL, inputs: PickNamedTensorInfoMapind): AttrsOneHotAttrs = {
    val __obj = js.Dynamic.literal(attrs = attrs.asInstanceOf[js.Any], backend = backend.asInstanceOf[js.Any], inputs = inputs.asInstanceOf[js.Any])
    __obj.asInstanceOf[AttrsOneHotAttrs]
  }
  
  extension [Self <: AttrsOneHotAttrs](x: Self) {
    
    inline def setAttrs(value: OneHotAttrs): Self = StObject.set(x, "attrs", value.asInstanceOf[js.Any])
    
    inline def setBackend(value: MathBackendWebGL): Self = StObject.set(x, "backend", value.asInstanceOf[js.Any])
    
    inline def setInputs(value: PickNamedTensorInfoMapind): Self = StObject.set(x, "inputs", value.asInstanceOf[js.Any])
  }
}

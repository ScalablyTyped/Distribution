package typings.tensorflowTfjsBackendWebgl.anon

import typings.tensorflowTfjsBackendWebgl.backendWebglMod.MathBackendWebGL
import typings.tensorflowTfjsCore.kernelNamesMod.LRNGradAttrs
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AttrsLRNGradAttrs extends StObject {
  
  var attrs: LRNGradAttrs
  
  var backend: MathBackendWebGL
  
  var inputs: PickNamedTensorInfoMapxyd
}
object AttrsLRNGradAttrs {
  
  inline def apply(attrs: LRNGradAttrs, backend: MathBackendWebGL, inputs: PickNamedTensorInfoMapxyd): AttrsLRNGradAttrs = {
    val __obj = js.Dynamic.literal(attrs = attrs.asInstanceOf[js.Any], backend = backend.asInstanceOf[js.Any], inputs = inputs.asInstanceOf[js.Any])
    __obj.asInstanceOf[AttrsLRNGradAttrs]
  }
  
  extension [Self <: AttrsLRNGradAttrs](x: Self) {
    
    inline def setAttrs(value: LRNGradAttrs): Self = StObject.set(x, "attrs", value.asInstanceOf[js.Any])
    
    inline def setBackend(value: MathBackendWebGL): Self = StObject.set(x, "backend", value.asInstanceOf[js.Any])
    
    inline def setInputs(value: PickNamedTensorInfoMapxyd): Self = StObject.set(x, "inputs", value.asInstanceOf[js.Any])
  }
}

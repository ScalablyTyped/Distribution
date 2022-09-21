package typings.tensorflowTfjsBackendWebgl.anon

import typings.tensorflowTfjsBackendWebgl.backendWebglMod.MathBackendWebGL
import typings.tensorflowTfjsCore.kernelNamesMod.LRNAttrs
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AttrsLRNAttrs extends StObject {
  
  var attrs: LRNAttrs
  
  var backend: MathBackendWebGL
  
  var inputs: PickNamedTensorInfoMapx
}
object AttrsLRNAttrs {
  
  inline def apply(attrs: LRNAttrs, backend: MathBackendWebGL, inputs: PickNamedTensorInfoMapx): AttrsLRNAttrs = {
    val __obj = js.Dynamic.literal(attrs = attrs.asInstanceOf[js.Any], backend = backend.asInstanceOf[js.Any], inputs = inputs.asInstanceOf[js.Any])
    __obj.asInstanceOf[AttrsLRNAttrs]
  }
  
  extension [Self <: AttrsLRNAttrs](x: Self) {
    
    inline def setAttrs(value: LRNAttrs): Self = StObject.set(x, "attrs", value.asInstanceOf[js.Any])
    
    inline def setBackend(value: MathBackendWebGL): Self = StObject.set(x, "backend", value.asInstanceOf[js.Any])
    
    inline def setInputs(value: PickNamedTensorInfoMapx): Self = StObject.set(x, "inputs", value.asInstanceOf[js.Any])
  }
}

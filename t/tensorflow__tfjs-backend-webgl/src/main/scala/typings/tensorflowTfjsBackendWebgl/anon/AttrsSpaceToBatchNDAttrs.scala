package typings.tensorflowTfjsBackendWebgl.anon

import typings.tensorflowTfjsBackendWebgl.backendWebglMod.MathBackendWebGL
import typings.tensorflowTfjsCore.kernelNamesMod.SpaceToBatchNDAttrs
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AttrsSpaceToBatchNDAttrs extends StObject {
  
  var attrs: SpaceToBatchNDAttrs
  
  var backend: MathBackendWebGL
  
  var inputs: PickNamedTensorInfoMapx
}
object AttrsSpaceToBatchNDAttrs {
  
  inline def apply(attrs: SpaceToBatchNDAttrs, backend: MathBackendWebGL, inputs: PickNamedTensorInfoMapx): AttrsSpaceToBatchNDAttrs = {
    val __obj = js.Dynamic.literal(attrs = attrs.asInstanceOf[js.Any], backend = backend.asInstanceOf[js.Any], inputs = inputs.asInstanceOf[js.Any])
    __obj.asInstanceOf[AttrsSpaceToBatchNDAttrs]
  }
  
  extension [Self <: AttrsSpaceToBatchNDAttrs](x: Self) {
    
    inline def setAttrs(value: SpaceToBatchNDAttrs): Self = StObject.set(x, "attrs", value.asInstanceOf[js.Any])
    
    inline def setBackend(value: MathBackendWebGL): Self = StObject.set(x, "backend", value.asInstanceOf[js.Any])
    
    inline def setInputs(value: PickNamedTensorInfoMapx): Self = StObject.set(x, "inputs", value.asInstanceOf[js.Any])
  }
}

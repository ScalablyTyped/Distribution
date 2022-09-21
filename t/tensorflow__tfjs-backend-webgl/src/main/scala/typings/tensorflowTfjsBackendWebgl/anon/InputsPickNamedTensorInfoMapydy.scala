package typings.tensorflowTfjsBackendWebgl.anon

import typings.tensorflowTfjsBackendWebgl.backendWebglMod.MathBackendWebGL
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait InputsPickNamedTensorInfoMapydy extends StObject {
  
  var backend: MathBackendWebGL
  
  var inputs: PickNamedTensorInfoMapydy
}
object InputsPickNamedTensorInfoMapydy {
  
  inline def apply(backend: MathBackendWebGL, inputs: PickNamedTensorInfoMapydy): InputsPickNamedTensorInfoMapydy = {
    val __obj = js.Dynamic.literal(backend = backend.asInstanceOf[js.Any], inputs = inputs.asInstanceOf[js.Any])
    __obj.asInstanceOf[InputsPickNamedTensorInfoMapydy]
  }
  
  extension [Self <: InputsPickNamedTensorInfoMapydy](x: Self) {
    
    inline def setBackend(value: MathBackendWebGL): Self = StObject.set(x, "backend", value.asInstanceOf[js.Any])
    
    inline def setInputs(value: PickNamedTensorInfoMapydy): Self = StObject.set(x, "inputs", value.asInstanceOf[js.Any])
  }
}

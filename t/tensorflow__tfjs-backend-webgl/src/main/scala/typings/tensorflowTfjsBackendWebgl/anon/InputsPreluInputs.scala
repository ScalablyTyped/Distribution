package typings.tensorflowTfjsBackendWebgl.anon

import typings.tensorflowTfjsBackendWebgl.backendWebglMod.MathBackendWebGL
import typings.tensorflowTfjsCore.kernelNamesMod.PreluInputs
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait InputsPreluInputs extends StObject {
  
  var backend: MathBackendWebGL
  
  var inputs: PreluInputs
}
object InputsPreluInputs {
  
  inline def apply(backend: MathBackendWebGL, inputs: PreluInputs): InputsPreluInputs = {
    val __obj = js.Dynamic.literal(backend = backend.asInstanceOf[js.Any], inputs = inputs.asInstanceOf[js.Any])
    __obj.asInstanceOf[InputsPreluInputs]
  }
  
  extension [Self <: InputsPreluInputs](x: Self) {
    
    inline def setBackend(value: MathBackendWebGL): Self = StObject.set(x, "backend", value.asInstanceOf[js.Any])
    
    inline def setInputs(value: PreluInputs): Self = StObject.set(x, "inputs", value.asInstanceOf[js.Any])
  }
}

package typings.tensorflowTfjsBackendWebgl.anon

import typings.tensorflowTfjsBackendWebgl.backendWebglMod.MathBackendWebGL
import typings.tensorflowTfjsCore.kernelNamesMod.SelectInputs
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait InputsSelectInputs extends StObject {
  
  var backend: MathBackendWebGL
  
  var inputs: SelectInputs
}
object InputsSelectInputs {
  
  inline def apply(backend: MathBackendWebGL, inputs: SelectInputs): InputsSelectInputs = {
    val __obj = js.Dynamic.literal(backend = backend.asInstanceOf[js.Any], inputs = inputs.asInstanceOf[js.Any])
    __obj.asInstanceOf[InputsSelectInputs]
  }
  
  extension [Self <: InputsSelectInputs](x: Self) {
    
    inline def setBackend(value: MathBackendWebGL): Self = StObject.set(x, "backend", value.asInstanceOf[js.Any])
    
    inline def setInputs(value: SelectInputs): Self = StObject.set(x, "inputs", value.asInstanceOf[js.Any])
  }
}

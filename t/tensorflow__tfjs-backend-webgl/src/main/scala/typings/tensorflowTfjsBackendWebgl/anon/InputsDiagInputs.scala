package typings.tensorflowTfjsBackendWebgl.anon

import typings.tensorflowTfjsBackendWebgl.backendWebglMod.MathBackendWebGL
import typings.tensorflowTfjsCore.kernelNamesMod.DiagInputs
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait InputsDiagInputs extends StObject {
  
  var backend: MathBackendWebGL
  
  var inputs: DiagInputs
}
object InputsDiagInputs {
  
  inline def apply(backend: MathBackendWebGL, inputs: DiagInputs): InputsDiagInputs = {
    val __obj = js.Dynamic.literal(backend = backend.asInstanceOf[js.Any], inputs = inputs.asInstanceOf[js.Any])
    __obj.asInstanceOf[InputsDiagInputs]
  }
  
  extension [Self <: InputsDiagInputs](x: Self) {
    
    inline def setBackend(value: MathBackendWebGL): Self = StObject.set(x, "backend", value.asInstanceOf[js.Any])
    
    inline def setInputs(value: DiagInputs): Self = StObject.set(x, "inputs", value.asInstanceOf[js.Any])
  }
}

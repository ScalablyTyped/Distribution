package typings.tensorflowTfjsBackendWebgl.anon

import typings.tensorflowTfjsBackendWebgl.backendWebglMod.MathBackendWebGL
import typings.tensorflowTfjsCore.kernelNamesMod.FFTInputs
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BackendMathBackendWebGL extends StObject {
  
  var backend: MathBackendWebGL
  
  var inputs: FFTInputs
}
object BackendMathBackendWebGL {
  
  inline def apply(backend: MathBackendWebGL, inputs: FFTInputs): BackendMathBackendWebGL = {
    val __obj = js.Dynamic.literal(backend = backend.asInstanceOf[js.Any], inputs = inputs.asInstanceOf[js.Any])
    __obj.asInstanceOf[BackendMathBackendWebGL]
  }
  
  extension [Self <: BackendMathBackendWebGL](x: Self) {
    
    inline def setBackend(value: MathBackendWebGL): Self = StObject.set(x, "backend", value.asInstanceOf[js.Any])
    
    inline def setInputs(value: FFTInputs): Self = StObject.set(x, "inputs", value.asInstanceOf[js.Any])
  }
}

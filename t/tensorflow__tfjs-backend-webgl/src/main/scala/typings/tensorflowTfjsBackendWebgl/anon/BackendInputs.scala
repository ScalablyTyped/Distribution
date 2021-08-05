package typings.tensorflowTfjsBackendWebgl.anon

import typings.tensorflowTfjsBackendWebgl.backendWebglMod.MathBackendWebGL
import typings.tensorflowTfjsCore.kernelNamesMod.ComplexInputs
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BackendInputs extends StObject {
  
  var backend: MathBackendWebGL
  
  var inputs: ComplexInputs
}
object BackendInputs {
  
  inline def apply(backend: MathBackendWebGL, inputs: ComplexInputs): BackendInputs = {
    val __obj = js.Dynamic.literal(backend = backend.asInstanceOf[js.Any], inputs = inputs.asInstanceOf[js.Any])
    __obj.asInstanceOf[BackendInputs]
  }
  
  extension [Self <: BackendInputs](x: Self) {
    
    inline def setBackend(value: MathBackendWebGL): Self = StObject.set(x, "backend", value.asInstanceOf[js.Any])
    
    inline def setInputs(value: ComplexInputs): Self = StObject.set(x, "inputs", value.asInstanceOf[js.Any])
  }
}

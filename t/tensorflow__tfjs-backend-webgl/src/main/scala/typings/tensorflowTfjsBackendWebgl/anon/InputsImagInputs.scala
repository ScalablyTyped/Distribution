package typings.tensorflowTfjsBackendWebgl.anon

import typings.tensorflowTfjsBackendWebgl.backendWebglMod.MathBackendWebGL
import typings.tensorflowTfjsCore.kernelNamesMod.ImagInputs
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait InputsImagInputs extends StObject {
  
  var backend: MathBackendWebGL
  
  var inputs: ImagInputs
}
object InputsImagInputs {
  
  inline def apply(backend: MathBackendWebGL, inputs: ImagInputs): InputsImagInputs = {
    val __obj = js.Dynamic.literal(backend = backend.asInstanceOf[js.Any], inputs = inputs.asInstanceOf[js.Any])
    __obj.asInstanceOf[InputsImagInputs]
  }
  
  extension [Self <: InputsImagInputs](x: Self) {
    
    inline def setBackend(value: MathBackendWebGL): Self = StObject.set(x, "backend", value.asInstanceOf[js.Any])
    
    inline def setInputs(value: ImagInputs): Self = StObject.set(x, "inputs", value.asInstanceOf[js.Any])
  }
}

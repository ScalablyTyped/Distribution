package typings.tensorflowTfjsBackendWebgl.anon

import typings.tensorflowTfjsBackendWebgl.distBackendWebglMod.MathBackendWebGL
import typings.tensorflowTfjsCore.distKernelNamesMod.NegInputs
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait InputsNegInputs extends StObject {
  
  var backend: MathBackendWebGL
  
  var inputs: NegInputs
}
object InputsNegInputs {
  
  inline def apply(backend: MathBackendWebGL, inputs: NegInputs): InputsNegInputs = {
    val __obj = js.Dynamic.literal(backend = backend.asInstanceOf[js.Any], inputs = inputs.asInstanceOf[js.Any])
    __obj.asInstanceOf[InputsNegInputs]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: InputsNegInputs] (val x: Self) extends AnyVal {
    
    inline def setBackend(value: MathBackendWebGL): Self = StObject.set(x, "backend", value.asInstanceOf[js.Any])
    
    inline def setInputs(value: NegInputs): Self = StObject.set(x, "inputs", value.asInstanceOf[js.Any])
  }
}

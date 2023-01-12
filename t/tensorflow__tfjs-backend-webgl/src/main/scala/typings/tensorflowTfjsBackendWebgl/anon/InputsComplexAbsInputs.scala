package typings.tensorflowTfjsBackendWebgl.anon

import typings.tensorflowTfjsBackendWebgl.distBackendWebglMod.MathBackendWebGL
import typings.tensorflowTfjsCore.distKernelNamesMod.ComplexAbsInputs
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait InputsComplexAbsInputs extends StObject {
  
  var backend: MathBackendWebGL
  
  var inputs: ComplexAbsInputs
}
object InputsComplexAbsInputs {
  
  inline def apply(backend: MathBackendWebGL, inputs: ComplexAbsInputs): InputsComplexAbsInputs = {
    val __obj = js.Dynamic.literal(backend = backend.asInstanceOf[js.Any], inputs = inputs.asInstanceOf[js.Any])
    __obj.asInstanceOf[InputsComplexAbsInputs]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: InputsComplexAbsInputs] (val x: Self) extends AnyVal {
    
    inline def setBackend(value: MathBackendWebGL): Self = StObject.set(x, "backend", value.asInstanceOf[js.Any])
    
    inline def setInputs(value: ComplexAbsInputs): Self = StObject.set(x, "inputs", value.asInstanceOf[js.Any])
  }
}

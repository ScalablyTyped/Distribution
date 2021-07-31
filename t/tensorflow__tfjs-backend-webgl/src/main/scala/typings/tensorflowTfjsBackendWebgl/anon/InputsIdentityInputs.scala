package typings.tensorflowTfjsBackendWebgl.anon

import typings.tensorflowTfjsBackendWebgl.backendWebglMod.MathBackendWebGL
import typings.tensorflowTfjsCore.kernelNamesMod.IdentityInputs
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait InputsIdentityInputs extends StObject {
  
  var backend: MathBackendWebGL
  
  var inputs: IdentityInputs
}
object InputsIdentityInputs {
  
  @scala.inline
  def apply(backend: MathBackendWebGL, inputs: IdentityInputs): InputsIdentityInputs = {
    val __obj = js.Dynamic.literal(backend = backend.asInstanceOf[js.Any], inputs = inputs.asInstanceOf[js.Any])
    __obj.asInstanceOf[InputsIdentityInputs]
  }
  
  @scala.inline
  implicit class InputsIdentityInputsMutableBuilder[Self <: InputsIdentityInputs] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBackend(value: MathBackendWebGL): Self = StObject.set(x, "backend", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInputs(value: IdentityInputs): Self = StObject.set(x, "inputs", value.asInstanceOf[js.Any])
  }
}

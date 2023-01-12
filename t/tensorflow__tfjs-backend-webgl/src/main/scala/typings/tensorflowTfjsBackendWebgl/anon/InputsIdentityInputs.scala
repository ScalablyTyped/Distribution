package typings.tensorflowTfjsBackendWebgl.anon

import typings.tensorflowTfjsBackendWebgl.distBackendWebglMod.MathBackendWebGL
import typings.tensorflowTfjsCore.distKernelNamesMod.IdentityInputs
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait InputsIdentityInputs extends StObject {
  
  var backend: MathBackendWebGL
  
  var inputs: IdentityInputs
}
object InputsIdentityInputs {
  
  inline def apply(backend: MathBackendWebGL, inputs: IdentityInputs): InputsIdentityInputs = {
    val __obj = js.Dynamic.literal(backend = backend.asInstanceOf[js.Any], inputs = inputs.asInstanceOf[js.Any])
    __obj.asInstanceOf[InputsIdentityInputs]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: InputsIdentityInputs] (val x: Self) extends AnyVal {
    
    inline def setBackend(value: MathBackendWebGL): Self = StObject.set(x, "backend", value.asInstanceOf[js.Any])
    
    inline def setInputs(value: IdentityInputs): Self = StObject.set(x, "inputs", value.asInstanceOf[js.Any])
  }
}

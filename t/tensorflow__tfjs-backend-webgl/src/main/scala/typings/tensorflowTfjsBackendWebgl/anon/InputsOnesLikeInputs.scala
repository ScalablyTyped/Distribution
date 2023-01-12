package typings.tensorflowTfjsBackendWebgl.anon

import typings.tensorflowTfjsBackendWebgl.distBackendWebglMod.MathBackendWebGL
import typings.tensorflowTfjsCore.distKernelNamesMod.OnesLikeInputs
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait InputsOnesLikeInputs extends StObject {
  
  var backend: MathBackendWebGL
  
  var inputs: OnesLikeInputs
}
object InputsOnesLikeInputs {
  
  inline def apply(backend: MathBackendWebGL, inputs: OnesLikeInputs): InputsOnesLikeInputs = {
    val __obj = js.Dynamic.literal(backend = backend.asInstanceOf[js.Any], inputs = inputs.asInstanceOf[js.Any])
    __obj.asInstanceOf[InputsOnesLikeInputs]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: InputsOnesLikeInputs] (val x: Self) extends AnyVal {
    
    inline def setBackend(value: MathBackendWebGL): Self = StObject.set(x, "backend", value.asInstanceOf[js.Any])
    
    inline def setInputs(value: OnesLikeInputs): Self = StObject.set(x, "inputs", value.asInstanceOf[js.Any])
  }
}

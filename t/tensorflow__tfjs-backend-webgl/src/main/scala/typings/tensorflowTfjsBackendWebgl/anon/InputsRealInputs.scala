package typings.tensorflowTfjsBackendWebgl.anon

import typings.tensorflowTfjsBackendWebgl.distBackendWebglMod.MathBackendWebGL
import typings.tensorflowTfjsCore.distKernelNamesMod.RealInputs
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait InputsRealInputs extends StObject {
  
  var backend: MathBackendWebGL
  
  var inputs: RealInputs
}
object InputsRealInputs {
  
  inline def apply(backend: MathBackendWebGL, inputs: RealInputs): InputsRealInputs = {
    val __obj = js.Dynamic.literal(backend = backend.asInstanceOf[js.Any], inputs = inputs.asInstanceOf[js.Any])
    __obj.asInstanceOf[InputsRealInputs]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: InputsRealInputs] (val x: Self) extends AnyVal {
    
    inline def setBackend(value: MathBackendWebGL): Self = StObject.set(x, "backend", value.asInstanceOf[js.Any])
    
    inline def setInputs(value: RealInputs): Self = StObject.set(x, "inputs", value.asInstanceOf[js.Any])
  }
}

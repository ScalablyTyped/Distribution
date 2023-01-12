package typings.tensorflowTfjsBackendWebgl.anon

import typings.tensorflowTfjsBackendWebgl.distBackendWebglMod.MathBackendWebGL
import typings.tensorflowTfjsCore.distKernelNamesMod.RaggedRangeInputs
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait InputsRaggedRangeInputs extends StObject {
  
  var backend: MathBackendWebGL
  
  var inputs: RaggedRangeInputs
}
object InputsRaggedRangeInputs {
  
  inline def apply(backend: MathBackendWebGL, inputs: RaggedRangeInputs): InputsRaggedRangeInputs = {
    val __obj = js.Dynamic.literal(backend = backend.asInstanceOf[js.Any], inputs = inputs.asInstanceOf[js.Any])
    __obj.asInstanceOf[InputsRaggedRangeInputs]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: InputsRaggedRangeInputs] (val x: Self) extends AnyVal {
    
    inline def setBackend(value: MathBackendWebGL): Self = StObject.set(x, "backend", value.asInstanceOf[js.Any])
    
    inline def setInputs(value: RaggedRangeInputs): Self = StObject.set(x, "inputs", value.asInstanceOf[js.Any])
  }
}

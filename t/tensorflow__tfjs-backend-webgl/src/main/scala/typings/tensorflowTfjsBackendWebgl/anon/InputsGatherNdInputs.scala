package typings.tensorflowTfjsBackendWebgl.anon

import typings.tensorflowTfjsBackendWebgl.distBackendWebglMod.MathBackendWebGL
import typings.tensorflowTfjsCore.distKernelNamesMod.GatherNdInputs
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait InputsGatherNdInputs extends StObject {
  
  var backend: MathBackendWebGL
  
  var inputs: GatherNdInputs
}
object InputsGatherNdInputs {
  
  inline def apply(backend: MathBackendWebGL, inputs: GatherNdInputs): InputsGatherNdInputs = {
    val __obj = js.Dynamic.literal(backend = backend.asInstanceOf[js.Any], inputs = inputs.asInstanceOf[js.Any])
    __obj.asInstanceOf[InputsGatherNdInputs]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: InputsGatherNdInputs] (val x: Self) extends AnyVal {
    
    inline def setBackend(value: MathBackendWebGL): Self = StObject.set(x, "backend", value.asInstanceOf[js.Any])
    
    inline def setInputs(value: GatherNdInputs): Self = StObject.set(x, "inputs", value.asInstanceOf[js.Any])
  }
}

package typings.tensorflowTfjsBackendWebgl.anon

import typings.tensorflowTfjsBackendWebgl.distBackendWebglMod.MathBackendWebGL
import typings.tensorflowTfjsCore.distKernelNamesMod.StepAttrs
import typings.tensorflowTfjsCore.distKernelNamesMod.UnaryInputs
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AttrsStepAttrs extends StObject {
  
  var attrs: StepAttrs
  
  var backend: MathBackendWebGL
  
  var inputs: UnaryInputs
}
object AttrsStepAttrs {
  
  inline def apply(attrs: StepAttrs, backend: MathBackendWebGL, inputs: UnaryInputs): AttrsStepAttrs = {
    val __obj = js.Dynamic.literal(attrs = attrs.asInstanceOf[js.Any], backend = backend.asInstanceOf[js.Any], inputs = inputs.asInstanceOf[js.Any])
    __obj.asInstanceOf[AttrsStepAttrs]
  }
  
  extension [Self <: AttrsStepAttrs](x: Self) {
    
    inline def setAttrs(value: StepAttrs): Self = StObject.set(x, "attrs", value.asInstanceOf[js.Any])
    
    inline def setBackend(value: MathBackendWebGL): Self = StObject.set(x, "backend", value.asInstanceOf[js.Any])
    
    inline def setInputs(value: UnaryInputs): Self = StObject.set(x, "inputs", value.asInstanceOf[js.Any])
  }
}

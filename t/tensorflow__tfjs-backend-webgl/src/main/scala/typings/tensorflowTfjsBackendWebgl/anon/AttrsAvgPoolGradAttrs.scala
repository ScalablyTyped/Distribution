package typings.tensorflowTfjsBackendWebgl.anon

import typings.tensorflowTfjsBackendWebgl.backendWebglMod.MathBackendWebGL
import typings.tensorflowTfjsCore.kernelNamesMod.AvgPoolGradAttrs
import typings.tensorflowTfjsCore.kernelNamesMod.AvgPoolGradInputs
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AttrsAvgPoolGradAttrs extends StObject {
  
  var attrs: AvgPoolGradAttrs
  
  var backend: MathBackendWebGL
  
  var inputs: AvgPoolGradInputs
}
object AttrsAvgPoolGradAttrs {
  
  inline def apply(attrs: AvgPoolGradAttrs, backend: MathBackendWebGL, inputs: AvgPoolGradInputs): AttrsAvgPoolGradAttrs = {
    val __obj = js.Dynamic.literal(attrs = attrs.asInstanceOf[js.Any], backend = backend.asInstanceOf[js.Any], inputs = inputs.asInstanceOf[js.Any])
    __obj.asInstanceOf[AttrsAvgPoolGradAttrs]
  }
  
  extension [Self <: AttrsAvgPoolGradAttrs](x: Self) {
    
    inline def setAttrs(value: AvgPoolGradAttrs): Self = StObject.set(x, "attrs", value.asInstanceOf[js.Any])
    
    inline def setBackend(value: MathBackendWebGL): Self = StObject.set(x, "backend", value.asInstanceOf[js.Any])
    
    inline def setInputs(value: AvgPoolGradInputs): Self = StObject.set(x, "inputs", value.asInstanceOf[js.Any])
  }
}

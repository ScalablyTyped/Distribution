package typings.tensorflowTfjsBackendWebgl.anon

import typings.tensorflowTfjsBackendWebgl.backendWebglMod.MathBackendWebGL
import typings.tensorflowTfjsCore.kernelNamesMod.AvgPoolAttrs
import typings.tensorflowTfjsCore.kernelNamesMod.AvgPoolInputs
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AttrsAvgPoolAttrs extends StObject {
  
  var attrs: AvgPoolAttrs
  
  var backend: MathBackendWebGL
  
  var inputs: AvgPoolInputs
}
object AttrsAvgPoolAttrs {
  
  inline def apply(attrs: AvgPoolAttrs, backend: MathBackendWebGL, inputs: AvgPoolInputs): AttrsAvgPoolAttrs = {
    val __obj = js.Dynamic.literal(attrs = attrs.asInstanceOf[js.Any], backend = backend.asInstanceOf[js.Any], inputs = inputs.asInstanceOf[js.Any])
    __obj.asInstanceOf[AttrsAvgPoolAttrs]
  }
  
  extension [Self <: AttrsAvgPoolAttrs](x: Self) {
    
    inline def setAttrs(value: AvgPoolAttrs): Self = StObject.set(x, "attrs", value.asInstanceOf[js.Any])
    
    inline def setBackend(value: MathBackendWebGL): Self = StObject.set(x, "backend", value.asInstanceOf[js.Any])
    
    inline def setInputs(value: AvgPoolInputs): Self = StObject.set(x, "inputs", value.asInstanceOf[js.Any])
  }
}

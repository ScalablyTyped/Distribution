package typings.tensorflowTfjsBackendWebgl.anon

import typings.tensorflowTfjsBackendWebgl.backendWebglMod.MathBackendWebGL
import typings.tensorflowTfjsCore.kernelNamesMod.AvgPoolBackpropAttrs
import typings.tensorflowTfjsCore.kernelNamesMod.AvgPoolBackpropInputs
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Backend extends StObject {
  
  var attrs: AvgPoolBackpropAttrs
  
  var backend: MathBackendWebGL
  
  var inputs: AvgPoolBackpropInputs
}
object Backend {
  
  inline def apply(attrs: AvgPoolBackpropAttrs, backend: MathBackendWebGL, inputs: AvgPoolBackpropInputs): Backend = {
    val __obj = js.Dynamic.literal(attrs = attrs.asInstanceOf[js.Any], backend = backend.asInstanceOf[js.Any], inputs = inputs.asInstanceOf[js.Any])
    __obj.asInstanceOf[Backend]
  }
  
  extension [Self <: Backend](x: Self) {
    
    inline def setAttrs(value: AvgPoolBackpropAttrs): Self = StObject.set(x, "attrs", value.asInstanceOf[js.Any])
    
    inline def setBackend(value: MathBackendWebGL): Self = StObject.set(x, "backend", value.asInstanceOf[js.Any])
    
    inline def setInputs(value: AvgPoolBackpropInputs): Self = StObject.set(x, "inputs", value.asInstanceOf[js.Any])
  }
}

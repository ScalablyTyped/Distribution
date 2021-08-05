package typings.tensorflowTfjsBackendWebgl.anon

import typings.tensorflowTfjsBackendWebgl.backendWebglMod.MathBackendWebGL
import typings.tensorflowTfjsCore.kernelNamesMod.UniqueAttrs
import typings.tensorflowTfjsCore.kernelNamesMod.UniqueInputs
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AttrsUniqueAttrs extends StObject {
  
  var attrs: UniqueAttrs
  
  var backend: MathBackendWebGL
  
  var inputs: UniqueInputs
}
object AttrsUniqueAttrs {
  
  inline def apply(attrs: UniqueAttrs, backend: MathBackendWebGL, inputs: UniqueInputs): AttrsUniqueAttrs = {
    val __obj = js.Dynamic.literal(attrs = attrs.asInstanceOf[js.Any], backend = backend.asInstanceOf[js.Any], inputs = inputs.asInstanceOf[js.Any])
    __obj.asInstanceOf[AttrsUniqueAttrs]
  }
  
  extension [Self <: AttrsUniqueAttrs](x: Self) {
    
    inline def setAttrs(value: UniqueAttrs): Self = StObject.set(x, "attrs", value.asInstanceOf[js.Any])
    
    inline def setBackend(value: MathBackendWebGL): Self = StObject.set(x, "backend", value.asInstanceOf[js.Any])
    
    inline def setInputs(value: UniqueInputs): Self = StObject.set(x, "inputs", value.asInstanceOf[js.Any])
  }
}

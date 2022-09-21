package typings.tensorflowTfjsBackendWebgl.anon

import typings.tensorflowTfjsBackendWebgl.backendWebglMod.MathBackendWebGL
import typings.tensorflowTfjsCore.kernelNamesMod.ArgMaxAttrs
import typings.tensorflowTfjsCore.kernelNamesMod.ArgMaxInputs
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BackendInputs extends StObject {
  
  var attrs: ArgMaxAttrs
  
  var backend: MathBackendWebGL
  
  var inputs: ArgMaxInputs
}
object BackendInputs {
  
  inline def apply(attrs: ArgMaxAttrs, backend: MathBackendWebGL, inputs: ArgMaxInputs): BackendInputs = {
    val __obj = js.Dynamic.literal(attrs = attrs.asInstanceOf[js.Any], backend = backend.asInstanceOf[js.Any], inputs = inputs.asInstanceOf[js.Any])
    __obj.asInstanceOf[BackendInputs]
  }
  
  extension [Self <: BackendInputs](x: Self) {
    
    inline def setAttrs(value: ArgMaxAttrs): Self = StObject.set(x, "attrs", value.asInstanceOf[js.Any])
    
    inline def setBackend(value: MathBackendWebGL): Self = StObject.set(x, "backend", value.asInstanceOf[js.Any])
    
    inline def setInputs(value: ArgMaxInputs): Self = StObject.set(x, "inputs", value.asInstanceOf[js.Any])
  }
}

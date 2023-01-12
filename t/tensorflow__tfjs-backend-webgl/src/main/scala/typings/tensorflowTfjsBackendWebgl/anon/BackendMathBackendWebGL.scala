package typings.tensorflowTfjsBackendWebgl.anon

import typings.tensorflowTfjsBackendWebgl.distBackendWebglMod.MathBackendWebGL
import typings.tensorflowTfjsCore.distKernelNamesMod.BroadcastArgsInputs
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BackendMathBackendWebGL extends StObject {
  
  var backend: MathBackendWebGL
  
  var inputs: BroadcastArgsInputs
}
object BackendMathBackendWebGL {
  
  inline def apply(backend: MathBackendWebGL, inputs: BroadcastArgsInputs): BackendMathBackendWebGL = {
    val __obj = js.Dynamic.literal(backend = backend.asInstanceOf[js.Any], inputs = inputs.asInstanceOf[js.Any])
    __obj.asInstanceOf[BackendMathBackendWebGL]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: BackendMathBackendWebGL] (val x: Self) extends AnyVal {
    
    inline def setBackend(value: MathBackendWebGL): Self = StObject.set(x, "backend", value.asInstanceOf[js.Any])
    
    inline def setInputs(value: BroadcastArgsInputs): Self = StObject.set(x, "inputs", value.asInstanceOf[js.Any])
  }
}

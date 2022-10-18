package typings.tensorflowTfjsBackendWebgl.anon

import typings.tensorflowTfjsBackendWebgl.distBackendWebglMod.MathBackendWebGL
import typings.tensorflowTfjsCore.distKernelNamesMod.BinaryInputs
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait InputsBinaryInputs extends StObject {
  
  var backend: MathBackendWebGL
  
  var inputs: BinaryInputs
}
object InputsBinaryInputs {
  
  inline def apply(backend: MathBackendWebGL, inputs: BinaryInputs): InputsBinaryInputs = {
    val __obj = js.Dynamic.literal(backend = backend.asInstanceOf[js.Any], inputs = inputs.asInstanceOf[js.Any])
    __obj.asInstanceOf[InputsBinaryInputs]
  }
  
  extension [Self <: InputsBinaryInputs](x: Self) {
    
    inline def setBackend(value: MathBackendWebGL): Self = StObject.set(x, "backend", value.asInstanceOf[js.Any])
    
    inline def setInputs(value: BinaryInputs): Self = StObject.set(x, "inputs", value.asInstanceOf[js.Any])
  }
}

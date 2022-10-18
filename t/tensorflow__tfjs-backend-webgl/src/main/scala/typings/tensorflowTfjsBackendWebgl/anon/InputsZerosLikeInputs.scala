package typings.tensorflowTfjsBackendWebgl.anon

import typings.tensorflowTfjsBackendWebgl.distBackendWebglMod.MathBackendWebGL
import typings.tensorflowTfjsCore.distKernelNamesMod.ZerosLikeInputs
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait InputsZerosLikeInputs extends StObject {
  
  var backend: MathBackendWebGL
  
  var inputs: ZerosLikeInputs
}
object InputsZerosLikeInputs {
  
  inline def apply(backend: MathBackendWebGL, inputs: ZerosLikeInputs): InputsZerosLikeInputs = {
    val __obj = js.Dynamic.literal(backend = backend.asInstanceOf[js.Any], inputs = inputs.asInstanceOf[js.Any])
    __obj.asInstanceOf[InputsZerosLikeInputs]
  }
  
  extension [Self <: InputsZerosLikeInputs](x: Self) {
    
    inline def setBackend(value: MathBackendWebGL): Self = StObject.set(x, "backend", value.asInstanceOf[js.Any])
    
    inline def setInputs(value: ZerosLikeInputs): Self = StObject.set(x, "inputs", value.asInstanceOf[js.Any])
  }
}

package typings.tensorflowTfjsBackendWebgl.anon

import typings.tensorflowTfjsBackendWebgl.backendWebglMod.MathBackendWebGL
import typings.tensorflowTfjsCore.kernelNamesMod.SparseSegmentSumInputs
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait InputsSparseSegmentSumInputs extends StObject {
  
  var backend: MathBackendWebGL
  
  var inputs: SparseSegmentSumInputs
}
object InputsSparseSegmentSumInputs {
  
  inline def apply(backend: MathBackendWebGL, inputs: SparseSegmentSumInputs): InputsSparseSegmentSumInputs = {
    val __obj = js.Dynamic.literal(backend = backend.asInstanceOf[js.Any], inputs = inputs.asInstanceOf[js.Any])
    __obj.asInstanceOf[InputsSparseSegmentSumInputs]
  }
  
  extension [Self <: InputsSparseSegmentSumInputs](x: Self) {
    
    inline def setBackend(value: MathBackendWebGL): Self = StObject.set(x, "backend", value.asInstanceOf[js.Any])
    
    inline def setInputs(value: SparseSegmentSumInputs): Self = StObject.set(x, "inputs", value.asInstanceOf[js.Any])
  }
}

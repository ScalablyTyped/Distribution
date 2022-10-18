package typings.tensorflowTfjsBackendWebgl.anon

import typings.tensorflowTfjsBackendWebgl.distBackendWebglMod.MathBackendWebGL
import typings.tensorflowTfjsCore.distKernelNamesMod.SparseToDenseAttrs
import typings.tensorflowTfjsCore.distKernelNamesMod.SparseToDenseInputs
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AttrsSparseToDenseAttrs extends StObject {
  
  var attrs: SparseToDenseAttrs
  
  var backend: MathBackendWebGL
  
  var inputs: SparseToDenseInputs
}
object AttrsSparseToDenseAttrs {
  
  inline def apply(attrs: SparseToDenseAttrs, backend: MathBackendWebGL, inputs: SparseToDenseInputs): AttrsSparseToDenseAttrs = {
    val __obj = js.Dynamic.literal(attrs = attrs.asInstanceOf[js.Any], backend = backend.asInstanceOf[js.Any], inputs = inputs.asInstanceOf[js.Any])
    __obj.asInstanceOf[AttrsSparseToDenseAttrs]
  }
  
  extension [Self <: AttrsSparseToDenseAttrs](x: Self) {
    
    inline def setAttrs(value: SparseToDenseAttrs): Self = StObject.set(x, "attrs", value.asInstanceOf[js.Any])
    
    inline def setBackend(value: MathBackendWebGL): Self = StObject.set(x, "backend", value.asInstanceOf[js.Any])
    
    inline def setInputs(value: SparseToDenseInputs): Self = StObject.set(x, "inputs", value.asInstanceOf[js.Any])
  }
}

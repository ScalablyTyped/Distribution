package typings.tensorflowTfjsBackendWebgl.anon

import typings.tensorflowTfjsBackendWebgl.backendWebglMod.MathBackendWebGL
import typings.tensorflowTfjsCore.kernelNamesMod.FusedMatMulAttrs
import typings.tensorflowTfjsCore.kernelNamesMod.FusedMatMulInputs
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AttrsFusedMatMulAttrs extends StObject {
  
  var attrs: FusedMatMulAttrs
  
  var backend: MathBackendWebGL
  
  var inputs: FusedMatMulInputs
}
object AttrsFusedMatMulAttrs {
  
  inline def apply(attrs: FusedMatMulAttrs, backend: MathBackendWebGL, inputs: FusedMatMulInputs): AttrsFusedMatMulAttrs = {
    val __obj = js.Dynamic.literal(attrs = attrs.asInstanceOf[js.Any], backend = backend.asInstanceOf[js.Any], inputs = inputs.asInstanceOf[js.Any])
    __obj.asInstanceOf[AttrsFusedMatMulAttrs]
  }
  
  extension [Self <: AttrsFusedMatMulAttrs](x: Self) {
    
    inline def setAttrs(value: FusedMatMulAttrs): Self = StObject.set(x, "attrs", value.asInstanceOf[js.Any])
    
    inline def setBackend(value: MathBackendWebGL): Self = StObject.set(x, "backend", value.asInstanceOf[js.Any])
    
    inline def setInputs(value: FusedMatMulInputs): Self = StObject.set(x, "inputs", value.asInstanceOf[js.Any])
  }
}

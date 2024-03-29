package typings.tensorflowTfjsBackendWebgl.anon

import typings.tensorflowTfjsBackendWebgl.distBackendWebglMod.MathBackendWebGL
import typings.tensorflowTfjsCore.distKernelNamesMod.FusedMatMulAttrs
import typings.tensorflowTfjsCore.distKernelNamesMod.FusedMatMulInputs
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
  
  @scala.inline
  implicit open class MutableBuilder[Self <: AttrsFusedMatMulAttrs] (val x: Self) extends AnyVal {
    
    inline def setAttrs(value: FusedMatMulAttrs): Self = StObject.set(x, "attrs", value.asInstanceOf[js.Any])
    
    inline def setBackend(value: MathBackendWebGL): Self = StObject.set(x, "backend", value.asInstanceOf[js.Any])
    
    inline def setInputs(value: FusedMatMulInputs): Self = StObject.set(x, "inputs", value.asInstanceOf[js.Any])
  }
}

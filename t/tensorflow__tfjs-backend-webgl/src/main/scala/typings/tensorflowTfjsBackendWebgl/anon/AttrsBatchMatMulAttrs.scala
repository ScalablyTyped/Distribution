package typings.tensorflowTfjsBackendWebgl.anon

import typings.tensorflowTfjsBackendWebgl.distBackendWebglMod.MathBackendWebGL
import typings.tensorflowTfjsCore.distKernelNamesMod.BatchMatMulAttrs
import typings.tensorflowTfjsCore.distKernelNamesMod.BatchMatMulInputs
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AttrsBatchMatMulAttrs extends StObject {
  
  var attrs: BatchMatMulAttrs
  
  var backend: MathBackendWebGL
  
  var inputs: BatchMatMulInputs
}
object AttrsBatchMatMulAttrs {
  
  inline def apply(attrs: BatchMatMulAttrs, backend: MathBackendWebGL, inputs: BatchMatMulInputs): AttrsBatchMatMulAttrs = {
    val __obj = js.Dynamic.literal(attrs = attrs.asInstanceOf[js.Any], backend = backend.asInstanceOf[js.Any], inputs = inputs.asInstanceOf[js.Any])
    __obj.asInstanceOf[AttrsBatchMatMulAttrs]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: AttrsBatchMatMulAttrs] (val x: Self) extends AnyVal {
    
    inline def setAttrs(value: BatchMatMulAttrs): Self = StObject.set(x, "attrs", value.asInstanceOf[js.Any])
    
    inline def setBackend(value: MathBackendWebGL): Self = StObject.set(x, "backend", value.asInstanceOf[js.Any])
    
    inline def setInputs(value: BatchMatMulInputs): Self = StObject.set(x, "inputs", value.asInstanceOf[js.Any])
  }
}

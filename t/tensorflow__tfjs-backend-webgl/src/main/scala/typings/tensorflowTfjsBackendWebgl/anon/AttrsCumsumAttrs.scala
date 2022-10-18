package typings.tensorflowTfjsBackendWebgl.anon

import typings.tensorflowTfjsBackendWebgl.distBackendWebglMod.MathBackendWebGL
import typings.tensorflowTfjsCore.distKernelNamesMod.CumsumAttrs
import typings.tensorflowTfjsCore.distKernelNamesMod.CumsumInputs
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AttrsCumsumAttrs extends StObject {
  
  var attrs: CumsumAttrs
  
  var backend: MathBackendWebGL
  
  var inputs: CumsumInputs
}
object AttrsCumsumAttrs {
  
  inline def apply(attrs: CumsumAttrs, backend: MathBackendWebGL, inputs: CumsumInputs): AttrsCumsumAttrs = {
    val __obj = js.Dynamic.literal(attrs = attrs.asInstanceOf[js.Any], backend = backend.asInstanceOf[js.Any], inputs = inputs.asInstanceOf[js.Any])
    __obj.asInstanceOf[AttrsCumsumAttrs]
  }
  
  extension [Self <: AttrsCumsumAttrs](x: Self) {
    
    inline def setAttrs(value: CumsumAttrs): Self = StObject.set(x, "attrs", value.asInstanceOf[js.Any])
    
    inline def setBackend(value: MathBackendWebGL): Self = StObject.set(x, "backend", value.asInstanceOf[js.Any])
    
    inline def setInputs(value: CumsumInputs): Self = StObject.set(x, "inputs", value.asInstanceOf[js.Any])
  }
}

package typings.tensorflowTfjsBackendWebgl.anon

import typings.tensorflowTfjsBackendWebgl.distBackendWebglMod.MathBackendWebGL
import typings.tensorflowTfjsCore.distKernelNamesMod.Dilation2DAttrs
import typings.tensorflowTfjsCore.distKernelNamesMod.Dilation2DInputs
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AttrsDilation2DAttrs extends StObject {
  
  var attrs: Dilation2DAttrs
  
  var backend: MathBackendWebGL
  
  var inputs: Dilation2DInputs
}
object AttrsDilation2DAttrs {
  
  inline def apply(attrs: Dilation2DAttrs, backend: MathBackendWebGL, inputs: Dilation2DInputs): AttrsDilation2DAttrs = {
    val __obj = js.Dynamic.literal(attrs = attrs.asInstanceOf[js.Any], backend = backend.asInstanceOf[js.Any], inputs = inputs.asInstanceOf[js.Any])
    __obj.asInstanceOf[AttrsDilation2DAttrs]
  }
  
  extension [Self <: AttrsDilation2DAttrs](x: Self) {
    
    inline def setAttrs(value: Dilation2DAttrs): Self = StObject.set(x, "attrs", value.asInstanceOf[js.Any])
    
    inline def setBackend(value: MathBackendWebGL): Self = StObject.set(x, "backend", value.asInstanceOf[js.Any])
    
    inline def setInputs(value: Dilation2DInputs): Self = StObject.set(x, "inputs", value.asInstanceOf[js.Any])
  }
}

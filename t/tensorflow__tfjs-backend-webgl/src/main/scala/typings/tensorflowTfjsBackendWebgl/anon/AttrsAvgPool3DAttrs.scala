package typings.tensorflowTfjsBackendWebgl.anon

import typings.tensorflowTfjsBackendWebgl.distBackendWebglMod.MathBackendWebGL
import typings.tensorflowTfjsCore.distKernelNamesMod.AvgPool3DAttrs
import typings.tensorflowTfjsCore.distKernelNamesMod.AvgPool3DInputs
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AttrsAvgPool3DAttrs extends StObject {
  
  var attrs: AvgPool3DAttrs
  
  var backend: MathBackendWebGL
  
  var inputs: AvgPool3DInputs
}
object AttrsAvgPool3DAttrs {
  
  inline def apply(attrs: AvgPool3DAttrs, backend: MathBackendWebGL, inputs: AvgPool3DInputs): AttrsAvgPool3DAttrs = {
    val __obj = js.Dynamic.literal(attrs = attrs.asInstanceOf[js.Any], backend = backend.asInstanceOf[js.Any], inputs = inputs.asInstanceOf[js.Any])
    __obj.asInstanceOf[AttrsAvgPool3DAttrs]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: AttrsAvgPool3DAttrs] (val x: Self) extends AnyVal {
    
    inline def setAttrs(value: AvgPool3DAttrs): Self = StObject.set(x, "attrs", value.asInstanceOf[js.Any])
    
    inline def setBackend(value: MathBackendWebGL): Self = StObject.set(x, "backend", value.asInstanceOf[js.Any])
    
    inline def setInputs(value: AvgPool3DInputs): Self = StObject.set(x, "inputs", value.asInstanceOf[js.Any])
  }
}

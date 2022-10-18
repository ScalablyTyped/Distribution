package typings.tensorflowTfjsBackendWebgl.anon

import typings.tensorflowTfjsBackendWebgl.distBackendWebglMod.MathBackendWebGL
import typings.tensorflowTfjsCore.distKernelNamesMod.TransformAttrs
import typings.tensorflowTfjsCore.distKernelNamesMod.TransformInputs
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AttrsTransformAttrs extends StObject {
  
  var attrs: TransformAttrs
  
  var backend: MathBackendWebGL
  
  var inputs: TransformInputs
}
object AttrsTransformAttrs {
  
  inline def apply(attrs: TransformAttrs, backend: MathBackendWebGL, inputs: TransformInputs): AttrsTransformAttrs = {
    val __obj = js.Dynamic.literal(attrs = attrs.asInstanceOf[js.Any], backend = backend.asInstanceOf[js.Any], inputs = inputs.asInstanceOf[js.Any])
    __obj.asInstanceOf[AttrsTransformAttrs]
  }
  
  extension [Self <: AttrsTransformAttrs](x: Self) {
    
    inline def setAttrs(value: TransformAttrs): Self = StObject.set(x, "attrs", value.asInstanceOf[js.Any])
    
    inline def setBackend(value: MathBackendWebGL): Self = StObject.set(x, "backend", value.asInstanceOf[js.Any])
    
    inline def setInputs(value: TransformInputs): Self = StObject.set(x, "inputs", value.asInstanceOf[js.Any])
  }
}

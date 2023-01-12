package typings.tensorflowTfjsBackendWebgl.anon

import typings.tensorflowTfjsBackendWebgl.distBackendWebglMod.MathBackendWebGL
import typings.tensorflowTfjsCore.distKernelNamesMod.SpaceToBatchNDAttrs
import typings.tensorflowTfjsCore.distKernelNamesMod.SpaceToBatchNDInputs
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AttrsSpaceToBatchNDAttrs extends StObject {
  
  var attrs: SpaceToBatchNDAttrs
  
  var backend: MathBackendWebGL
  
  var inputs: SpaceToBatchNDInputs
}
object AttrsSpaceToBatchNDAttrs {
  
  inline def apply(attrs: SpaceToBatchNDAttrs, backend: MathBackendWebGL, inputs: SpaceToBatchNDInputs): AttrsSpaceToBatchNDAttrs = {
    val __obj = js.Dynamic.literal(attrs = attrs.asInstanceOf[js.Any], backend = backend.asInstanceOf[js.Any], inputs = inputs.asInstanceOf[js.Any])
    __obj.asInstanceOf[AttrsSpaceToBatchNDAttrs]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: AttrsSpaceToBatchNDAttrs] (val x: Self) extends AnyVal {
    
    inline def setAttrs(value: SpaceToBatchNDAttrs): Self = StObject.set(x, "attrs", value.asInstanceOf[js.Any])
    
    inline def setBackend(value: MathBackendWebGL): Self = StObject.set(x, "backend", value.asInstanceOf[js.Any])
    
    inline def setInputs(value: SpaceToBatchNDInputs): Self = StObject.set(x, "inputs", value.asInstanceOf[js.Any])
  }
}

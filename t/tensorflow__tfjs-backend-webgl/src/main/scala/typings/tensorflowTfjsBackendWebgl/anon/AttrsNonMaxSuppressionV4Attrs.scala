package typings.tensorflowTfjsBackendWebgl.anon

import typings.tensorflowTfjsBackendWebgl.distBackendWebglMod.MathBackendWebGL
import typings.tensorflowTfjsCore.distKernelNamesMod.NonMaxSuppressionV4Attrs
import typings.tensorflowTfjsCore.distKernelNamesMod.NonMaxSuppressionV4Inputs
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AttrsNonMaxSuppressionV4Attrs extends StObject {
  
  var attrs: NonMaxSuppressionV4Attrs
  
  var backend: MathBackendWebGL
  
  var inputs: NonMaxSuppressionV4Inputs
}
object AttrsNonMaxSuppressionV4Attrs {
  
  inline def apply(attrs: NonMaxSuppressionV4Attrs, backend: MathBackendWebGL, inputs: NonMaxSuppressionV4Inputs): AttrsNonMaxSuppressionV4Attrs = {
    val __obj = js.Dynamic.literal(attrs = attrs.asInstanceOf[js.Any], backend = backend.asInstanceOf[js.Any], inputs = inputs.asInstanceOf[js.Any])
    __obj.asInstanceOf[AttrsNonMaxSuppressionV4Attrs]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: AttrsNonMaxSuppressionV4Attrs] (val x: Self) extends AnyVal {
    
    inline def setAttrs(value: NonMaxSuppressionV4Attrs): Self = StObject.set(x, "attrs", value.asInstanceOf[js.Any])
    
    inline def setBackend(value: MathBackendWebGL): Self = StObject.set(x, "backend", value.asInstanceOf[js.Any])
    
    inline def setInputs(value: NonMaxSuppressionV4Inputs): Self = StObject.set(x, "inputs", value.asInstanceOf[js.Any])
  }
}

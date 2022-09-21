package typings.tensorflowTfjsBackendWebgl.anon

import typings.tensorflowTfjsBackendWebgl.backendWebglMod.MathBackendWebGL
import typings.tensorflowTfjsCore.kernelNamesMod.PadV2Attrs
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AttrsPadV2Attrs extends StObject {
  
  var attrs: PadV2Attrs
  
  var backend: MathBackendWebGL
  
  var inputs: PickNamedTensorInfoMapx
}
object AttrsPadV2Attrs {
  
  inline def apply(attrs: PadV2Attrs, backend: MathBackendWebGL, inputs: PickNamedTensorInfoMapx): AttrsPadV2Attrs = {
    val __obj = js.Dynamic.literal(attrs = attrs.asInstanceOf[js.Any], backend = backend.asInstanceOf[js.Any], inputs = inputs.asInstanceOf[js.Any])
    __obj.asInstanceOf[AttrsPadV2Attrs]
  }
  
  extension [Self <: AttrsPadV2Attrs](x: Self) {
    
    inline def setAttrs(value: PadV2Attrs): Self = StObject.set(x, "attrs", value.asInstanceOf[js.Any])
    
    inline def setBackend(value: MathBackendWebGL): Self = StObject.set(x, "backend", value.asInstanceOf[js.Any])
    
    inline def setInputs(value: PickNamedTensorInfoMapx): Self = StObject.set(x, "inputs", value.asInstanceOf[js.Any])
  }
}

package typings.tensorflowTfjsBackendWebgl.anon

import typings.tensorflowTfjsBackendWebgl.distBackendWebglMod.MathBackendWebGL
import typings.tensorflowTfjsCore.distKernelNamesMod.PadV2Attrs
import typings.tensorflowTfjsCore.distKernelNamesMod.PadV2Inputs
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AttrsPadV2Attrs extends StObject {
  
  var attrs: PadV2Attrs
  
  var backend: MathBackendWebGL
  
  var inputs: PadV2Inputs
}
object AttrsPadV2Attrs {
  
  inline def apply(attrs: PadV2Attrs, backend: MathBackendWebGL, inputs: PadV2Inputs): AttrsPadV2Attrs = {
    val __obj = js.Dynamic.literal(attrs = attrs.asInstanceOf[js.Any], backend = backend.asInstanceOf[js.Any], inputs = inputs.asInstanceOf[js.Any])
    __obj.asInstanceOf[AttrsPadV2Attrs]
  }
  
  extension [Self <: AttrsPadV2Attrs](x: Self) {
    
    inline def setAttrs(value: PadV2Attrs): Self = StObject.set(x, "attrs", value.asInstanceOf[js.Any])
    
    inline def setBackend(value: MathBackendWebGL): Self = StObject.set(x, "backend", value.asInstanceOf[js.Any])
    
    inline def setInputs(value: PadV2Inputs): Self = StObject.set(x, "inputs", value.asInstanceOf[js.Any])
  }
}

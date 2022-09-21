package typings.tensorflowTfjsBackendWebgl.anon

import typings.tensorflowTfjsBackendWebgl.backendWebglMod.MathBackendWebGL
import typings.tensorflowTfjsCore.kernelNamesMod.GatherV2Attrs
import typings.tensorflowTfjsCore.kernelNamesMod.GatherV2Inputs
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AttrsGatherV2Attrs extends StObject {
  
  var attrs: GatherV2Attrs
  
  var backend: MathBackendWebGL
  
  var inputs: GatherV2Inputs
}
object AttrsGatherV2Attrs {
  
  inline def apply(attrs: GatherV2Attrs, backend: MathBackendWebGL, inputs: GatherV2Inputs): AttrsGatherV2Attrs = {
    val __obj = js.Dynamic.literal(attrs = attrs.asInstanceOf[js.Any], backend = backend.asInstanceOf[js.Any], inputs = inputs.asInstanceOf[js.Any])
    __obj.asInstanceOf[AttrsGatherV2Attrs]
  }
  
  extension [Self <: AttrsGatherV2Attrs](x: Self) {
    
    inline def setAttrs(value: GatherV2Attrs): Self = StObject.set(x, "attrs", value.asInstanceOf[js.Any])
    
    inline def setBackend(value: MathBackendWebGL): Self = StObject.set(x, "backend", value.asInstanceOf[js.Any])
    
    inline def setInputs(value: GatherV2Inputs): Self = StObject.set(x, "inputs", value.asInstanceOf[js.Any])
  }
}

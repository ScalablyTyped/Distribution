package typings.tensorflowTfjsBackendCpu.anon

import typings.tensorflowTfjsBackendCpu.backendCpuMod.MathBackendCPU
import typings.tensorflowTfjsCore.kernelNamesMod.PadV2Attrs
import typings.tensorflowTfjsCore.kernelNamesMod.PadV2Inputs
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AttrsPadV2Attrs extends StObject {
  
  var attrs: PadV2Attrs
  
  var backend: MathBackendCPU
  
  var inputs: PadV2Inputs
}
object AttrsPadV2Attrs {
  
  inline def apply(attrs: PadV2Attrs, backend: MathBackendCPU, inputs: PadV2Inputs): AttrsPadV2Attrs = {
    val __obj = js.Dynamic.literal(attrs = attrs.asInstanceOf[js.Any], backend = backend.asInstanceOf[js.Any], inputs = inputs.asInstanceOf[js.Any])
    __obj.asInstanceOf[AttrsPadV2Attrs]
  }
  
  extension [Self <: AttrsPadV2Attrs](x: Self) {
    
    inline def setAttrs(value: PadV2Attrs): Self = StObject.set(x, "attrs", value.asInstanceOf[js.Any])
    
    inline def setBackend(value: MathBackendCPU): Self = StObject.set(x, "backend", value.asInstanceOf[js.Any])
    
    inline def setInputs(value: PadV2Inputs): Self = StObject.set(x, "inputs", value.asInstanceOf[js.Any])
  }
}

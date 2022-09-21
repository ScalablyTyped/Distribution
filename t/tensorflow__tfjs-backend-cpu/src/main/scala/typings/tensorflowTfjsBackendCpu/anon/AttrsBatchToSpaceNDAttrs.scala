package typings.tensorflowTfjsBackendCpu.anon

import typings.tensorflowTfjsBackendCpu.backendCpuMod.MathBackendCPU
import typings.tensorflowTfjsCore.kernelNamesMod.BatchToSpaceNDAttrs
import typings.tensorflowTfjsCore.kernelNamesMod.BatchToSpaceNDInputs
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AttrsBatchToSpaceNDAttrs extends StObject {
  
  var attrs: BatchToSpaceNDAttrs
  
  var backend: MathBackendCPU
  
  var inputs: BatchToSpaceNDInputs
}
object AttrsBatchToSpaceNDAttrs {
  
  inline def apply(attrs: BatchToSpaceNDAttrs, backend: MathBackendCPU, inputs: BatchToSpaceNDInputs): AttrsBatchToSpaceNDAttrs = {
    val __obj = js.Dynamic.literal(attrs = attrs.asInstanceOf[js.Any], backend = backend.asInstanceOf[js.Any], inputs = inputs.asInstanceOf[js.Any])
    __obj.asInstanceOf[AttrsBatchToSpaceNDAttrs]
  }
  
  extension [Self <: AttrsBatchToSpaceNDAttrs](x: Self) {
    
    inline def setAttrs(value: BatchToSpaceNDAttrs): Self = StObject.set(x, "attrs", value.asInstanceOf[js.Any])
    
    inline def setBackend(value: MathBackendCPU): Self = StObject.set(x, "backend", value.asInstanceOf[js.Any])
    
    inline def setInputs(value: BatchToSpaceNDInputs): Self = StObject.set(x, "inputs", value.asInstanceOf[js.Any])
  }
}

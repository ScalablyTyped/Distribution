package typings.tensorflowTfjsBackendCpu.anon

import typings.tensorflowTfjsBackendCpu.distBackendCpuMod.MathBackendCPU
import typings.tensorflowTfjsCore.distKernelNamesMod.BatchToSpaceNDAttrs
import typings.tensorflowTfjsCore.distKernelNamesMod.BatchToSpaceNDInputs
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
  
  @scala.inline
  implicit open class MutableBuilder[Self <: AttrsBatchToSpaceNDAttrs] (val x: Self) extends AnyVal {
    
    inline def setAttrs(value: BatchToSpaceNDAttrs): Self = StObject.set(x, "attrs", value.asInstanceOf[js.Any])
    
    inline def setBackend(value: MathBackendCPU): Self = StObject.set(x, "backend", value.asInstanceOf[js.Any])
    
    inline def setInputs(value: BatchToSpaceNDInputs): Self = StObject.set(x, "inputs", value.asInstanceOf[js.Any])
  }
}

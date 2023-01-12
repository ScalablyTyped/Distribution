package typings.tensorflowTfjsBackendCpu.anon

import typings.tensorflowTfjsBackendCpu.distBackendCpuMod.MathBackendCPU
import typings.tensorflowTfjsCore.distKernelNamesMod.UnsortedSegmentSumAttrs
import typings.tensorflowTfjsCore.distKernelNamesMod.UnsortedSegmentSumInputs
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AttrsUnsortedSegmentSumAttrs extends StObject {
  
  var attrs: UnsortedSegmentSumAttrs
  
  var backend: MathBackendCPU
  
  var inputs: UnsortedSegmentSumInputs
}
object AttrsUnsortedSegmentSumAttrs {
  
  inline def apply(attrs: UnsortedSegmentSumAttrs, backend: MathBackendCPU, inputs: UnsortedSegmentSumInputs): AttrsUnsortedSegmentSumAttrs = {
    val __obj = js.Dynamic.literal(attrs = attrs.asInstanceOf[js.Any], backend = backend.asInstanceOf[js.Any], inputs = inputs.asInstanceOf[js.Any])
    __obj.asInstanceOf[AttrsUnsortedSegmentSumAttrs]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: AttrsUnsortedSegmentSumAttrs] (val x: Self) extends AnyVal {
    
    inline def setAttrs(value: UnsortedSegmentSumAttrs): Self = StObject.set(x, "attrs", value.asInstanceOf[js.Any])
    
    inline def setBackend(value: MathBackendCPU): Self = StObject.set(x, "backend", value.asInstanceOf[js.Any])
    
    inline def setInputs(value: UnsortedSegmentSumInputs): Self = StObject.set(x, "inputs", value.asInstanceOf[js.Any])
  }
}

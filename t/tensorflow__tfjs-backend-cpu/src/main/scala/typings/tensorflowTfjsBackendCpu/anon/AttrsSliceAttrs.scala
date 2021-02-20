package typings.tensorflowTfjsBackendCpu.anon

import typings.tensorflowTfjsBackendCpu.backendCpuMod.MathBackendCPU
import typings.tensorflowTfjsCore.kernelNamesMod.SliceAttrs
import typings.tensorflowTfjsCore.kernelNamesMod.SliceInputs
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AttrsSliceAttrs extends StObject {
  
  var attrs: SliceAttrs = js.native
  
  var backend: MathBackendCPU = js.native
  
  var inputs: SliceInputs = js.native
}
object AttrsSliceAttrs {
  
  @scala.inline
  def apply(attrs: SliceAttrs, backend: MathBackendCPU, inputs: SliceInputs): AttrsSliceAttrs = {
    val __obj = js.Dynamic.literal(attrs = attrs.asInstanceOf[js.Any], backend = backend.asInstanceOf[js.Any], inputs = inputs.asInstanceOf[js.Any])
    __obj.asInstanceOf[AttrsSliceAttrs]
  }
  
  @scala.inline
  implicit class AttrsSliceAttrsMutableBuilder[Self <: AttrsSliceAttrs] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAttrs(value: SliceAttrs): Self = StObject.set(x, "attrs", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBackend(value: MathBackendCPU): Self = StObject.set(x, "backend", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInputs(value: SliceInputs): Self = StObject.set(x, "inputs", value.asInstanceOf[js.Any])
  }
}

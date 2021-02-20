package typings.tensorflowTfjsBackendCpu.anon

import typings.tensorflowTfjsBackendCpu.backendCpuMod.MathBackendCPU
import typings.tensorflowTfjsCore.kernelNamesMod.TransposeAttrs
import typings.tensorflowTfjsCore.kernelNamesMod.TransposeInputs
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AttrsTransposeAttrs extends StObject {
  
  var attrs: TransposeAttrs = js.native
  
  var backend: MathBackendCPU = js.native
  
  var inputs: TransposeInputs = js.native
}
object AttrsTransposeAttrs {
  
  @scala.inline
  def apply(attrs: TransposeAttrs, backend: MathBackendCPU, inputs: TransposeInputs): AttrsTransposeAttrs = {
    val __obj = js.Dynamic.literal(attrs = attrs.asInstanceOf[js.Any], backend = backend.asInstanceOf[js.Any], inputs = inputs.asInstanceOf[js.Any])
    __obj.asInstanceOf[AttrsTransposeAttrs]
  }
  
  @scala.inline
  implicit class AttrsTransposeAttrsMutableBuilder[Self <: AttrsTransposeAttrs] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAttrs(value: TransposeAttrs): Self = StObject.set(x, "attrs", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBackend(value: MathBackendCPU): Self = StObject.set(x, "backend", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInputs(value: TransposeInputs): Self = StObject.set(x, "inputs", value.asInstanceOf[js.Any])
  }
}

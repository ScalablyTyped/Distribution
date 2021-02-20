package typings.tensorflowTfjsBackendCpu.anon

import typings.tensorflowTfjsBackendCpu.backendCpuMod.MathBackendCPU
import typings.tensorflowTfjsCore.kernelNamesMod.FusedMatMulAttrs
import typings.tensorflowTfjsCore.kernelNamesMod.FusedMatMulInputs
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AttrsFusedMatMulAttrs extends StObject {
  
  var attrs: FusedMatMulAttrs = js.native
  
  var backend: MathBackendCPU = js.native
  
  var inputs: FusedMatMulInputs = js.native
}
object AttrsFusedMatMulAttrs {
  
  @scala.inline
  def apply(attrs: FusedMatMulAttrs, backend: MathBackendCPU, inputs: FusedMatMulInputs): AttrsFusedMatMulAttrs = {
    val __obj = js.Dynamic.literal(attrs = attrs.asInstanceOf[js.Any], backend = backend.asInstanceOf[js.Any], inputs = inputs.asInstanceOf[js.Any])
    __obj.asInstanceOf[AttrsFusedMatMulAttrs]
  }
  
  @scala.inline
  implicit class AttrsFusedMatMulAttrsMutableBuilder[Self <: AttrsFusedMatMulAttrs] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAttrs(value: FusedMatMulAttrs): Self = StObject.set(x, "attrs", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBackend(value: MathBackendCPU): Self = StObject.set(x, "backend", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInputs(value: FusedMatMulInputs): Self = StObject.set(x, "inputs", value.asInstanceOf[js.Any])
  }
}

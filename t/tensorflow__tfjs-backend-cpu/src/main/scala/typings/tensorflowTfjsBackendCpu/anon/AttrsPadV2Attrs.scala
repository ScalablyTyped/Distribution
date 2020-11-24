package typings.tensorflowTfjsBackendCpu.anon

import typings.tensorflowTfjsBackendCpu.backendCpuMod.MathBackendCPU
import typings.tensorflowTfjsCore.kernelNamesMod.PadV2Attrs
import typings.tensorflowTfjsCore.kernelNamesMod.PadV2Inputs
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AttrsPadV2Attrs extends js.Object {
  
  var attrs: PadV2Attrs = js.native
  
  var backend: MathBackendCPU = js.native
  
  var inputs: PadV2Inputs = js.native
}
object AttrsPadV2Attrs {
  
  @scala.inline
  def apply(attrs: PadV2Attrs, backend: MathBackendCPU, inputs: PadV2Inputs): AttrsPadV2Attrs = {
    val __obj = js.Dynamic.literal(attrs = attrs.asInstanceOf[js.Any], backend = backend.asInstanceOf[js.Any], inputs = inputs.asInstanceOf[js.Any])
    __obj.asInstanceOf[AttrsPadV2Attrs]
  }
  
  @scala.inline
  implicit class AttrsPadV2AttrsOps[Self <: AttrsPadV2Attrs] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setAttrs(value: PadV2Attrs): Self = this.set("attrs", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBackend(value: MathBackendCPU): Self = this.set("backend", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInputs(value: PadV2Inputs): Self = this.set("inputs", value.asInstanceOf[js.Any])
  }
}

package typings.tensorflowTfjsBackendCpu.anon

import typings.tensorflowTfjsBackendCpu.backendCpuMod.MathBackendCPU
import typings.tensorflowTfjsCore.kernelNamesMod.MirrorPadAttrs
import typings.tensorflowTfjsCore.kernelNamesMod.MirrorPadInputs
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AttrsMirrorPadAttrs extends js.Object {
  
  var attrs: MirrorPadAttrs = js.native
  
  var backend: MathBackendCPU = js.native
  
  var inputs: MirrorPadInputs = js.native
}
object AttrsMirrorPadAttrs {
  
  @scala.inline
  def apply(attrs: MirrorPadAttrs, backend: MathBackendCPU, inputs: MirrorPadInputs): AttrsMirrorPadAttrs = {
    val __obj = js.Dynamic.literal(attrs = attrs.asInstanceOf[js.Any], backend = backend.asInstanceOf[js.Any], inputs = inputs.asInstanceOf[js.Any])
    __obj.asInstanceOf[AttrsMirrorPadAttrs]
  }
  
  @scala.inline
  implicit class AttrsMirrorPadAttrsOps[Self <: AttrsMirrorPadAttrs] (val x: Self) extends AnyVal {
    
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
    def setAttrs(value: MirrorPadAttrs): Self = this.set("attrs", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBackend(value: MathBackendCPU): Self = this.set("backend", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInputs(value: MirrorPadInputs): Self = this.set("inputs", value.asInstanceOf[js.Any])
  }
}

package typings.tensorflowTfjsBackendWebgl.anon

import typings.tensorflowTfjsBackendWebgl.backendWebglMod.MathBackendWebGL
import typings.tensorflowTfjsCore.kernelNamesMod.ConcatAttrs
import typings.tensorflowTfjsCore.kernelNamesMod.ConcatInputs
import typings.tensorflowTfjsCore.kernelRegistryMod.TensorInfo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AttrsBackendInputs extends js.Object {
  
  var attrs: ConcatAttrs = js.native
  
  var backend: MathBackendWebGL = js.native
  
  var inputs: ConcatInputs = js.native
}
object AttrsBackendInputs {
  
  @scala.inline
  def apply(attrs: ConcatAttrs, backend: MathBackendWebGL, inputs: ConcatInputs): AttrsBackendInputs = {
    val __obj = js.Dynamic.literal(attrs = attrs.asInstanceOf[js.Any], backend = backend.asInstanceOf[js.Any], inputs = inputs.asInstanceOf[js.Any])
    __obj.asInstanceOf[AttrsBackendInputs]
  }
  
  @scala.inline
  implicit class AttrsBackendInputsOps[Self <: AttrsBackendInputs] (val x: Self) extends AnyVal {
    
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
    def setAttrs(value: ConcatAttrs): Self = this.set("attrs", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBackend(value: MathBackendWebGL): Self = this.set("backend", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInputsVarargs(value: TensorInfo*): Self = this.set("inputs", js.Array(value :_*))
    
    @scala.inline
    def setInputs(value: ConcatInputs): Self = this.set("inputs", value.asInstanceOf[js.Any])
  }
}

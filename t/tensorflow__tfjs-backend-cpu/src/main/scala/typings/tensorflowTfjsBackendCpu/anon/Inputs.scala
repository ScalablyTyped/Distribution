package typings.tensorflowTfjsBackendCpu.anon

import typings.tensorflowTfjsBackendCpu.backendCpuMod.MathBackendCPU
import typings.tensorflowTfjsCore.kernelNamesMod.AvgPoolBackpropAttrs
import typings.tensorflowTfjsCore.kernelNamesMod.AvgPoolBackpropInputs
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Inputs extends js.Object {
  
  var attrs: AvgPoolBackpropAttrs = js.native
  
  var backend: MathBackendCPU = js.native
  
  var inputs: AvgPoolBackpropInputs = js.native
}
object Inputs {
  
  @scala.inline
  def apply(attrs: AvgPoolBackpropAttrs, backend: MathBackendCPU, inputs: AvgPoolBackpropInputs): Inputs = {
    val __obj = js.Dynamic.literal(attrs = attrs.asInstanceOf[js.Any], backend = backend.asInstanceOf[js.Any], inputs = inputs.asInstanceOf[js.Any])
    __obj.asInstanceOf[Inputs]
  }
  
  @scala.inline
  implicit class InputsOps[Self <: Inputs] (val x: Self) extends AnyVal {
    
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
    def setAttrs(value: AvgPoolBackpropAttrs): Self = this.set("attrs", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBackend(value: MathBackendCPU): Self = this.set("backend", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInputs(value: AvgPoolBackpropInputs): Self = this.set("inputs", value.asInstanceOf[js.Any])
  }
}

package typings.tensorflowTfjsCore.kernelNamesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Pick<@tensorflow/tfjs-core.@tensorflow/tfjs-core/dist/kernel_registry.NamedTensorInfoMap, 'logits'> */
@js.native
trait LogSoftmaxInputs extends js.Object {
  
  var logits: js.UndefOr[js.Any] = js.native
}
object LogSoftmaxInputs {
  
  @scala.inline
  def apply(): LogSoftmaxInputs = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LogSoftmaxInputs]
  }
  
  @scala.inline
  implicit class LogSoftmaxInputsOps[Self <: LogSoftmaxInputs] (val x: Self) extends AnyVal {
    
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
    def setLogits(value: js.Any): Self = this.set("logits", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLogits: Self = this.set("logits", js.undefined)
  }
}

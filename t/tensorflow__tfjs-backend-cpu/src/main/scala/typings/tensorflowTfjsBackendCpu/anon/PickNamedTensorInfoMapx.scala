package typings.tensorflowTfjsBackendCpu.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Pick<@tensorflow/tfjs-core.@tensorflow/tfjs-core.NamedTensorInfoMap, 'x'> */
@js.native
trait PickNamedTensorInfoMapx extends js.Object {
  
  var x: js.UndefOr[js.Any] = js.native
}
object PickNamedTensorInfoMapx {
  
  @scala.inline
  def apply(): PickNamedTensorInfoMapx = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PickNamedTensorInfoMapx]
  }
  
  @scala.inline
  implicit class PickNamedTensorInfoMapxOps[Self <: PickNamedTensorInfoMapx] (val x: Self) extends AnyVal {
    
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
    def setX(value: js.Any): Self = this.set("x", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteX: Self = this.set("x", js.undefined)
  }
}

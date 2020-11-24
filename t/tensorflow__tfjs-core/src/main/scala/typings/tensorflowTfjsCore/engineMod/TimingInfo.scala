package typings.tensorflowTfjsCore.engineMod

import typings.tensorflowTfjsCore.anon.Error
import typings.tensorflowTfjsCore.backendMod.BackendTimingInfo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TimingInfo extends BackendTimingInfo {
  
  var wallMs: Double = js.native
}
object TimingInfo {
  
  @scala.inline
  def apply(kernelMs: Double | Error, wallMs: Double): TimingInfo = {
    val __obj = js.Dynamic.literal(kernelMs = kernelMs.asInstanceOf[js.Any], wallMs = wallMs.asInstanceOf[js.Any])
    __obj.asInstanceOf[TimingInfo]
  }
  
  @scala.inline
  implicit class TimingInfoOps[Self <: TimingInfo] (val x: Self) extends AnyVal {
    
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
    def setWallMs(value: Double): Self = this.set("wallMs", value.asInstanceOf[js.Any])
  }
}

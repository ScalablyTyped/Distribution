package typings.tensorflowTfjsCore.backendMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BackendTimer extends js.Object {
  
  def time(f: js.Function0[Unit]): js.Promise[BackendTimingInfo] = js.native
}
object BackendTimer {
  
  @scala.inline
  def apply(time: js.Function0[Unit] => js.Promise[BackendTimingInfo]): BackendTimer = {
    val __obj = js.Dynamic.literal(time = js.Any.fromFunction1(time))
    __obj.asInstanceOf[BackendTimer]
  }
  
  @scala.inline
  implicit class BackendTimerOps[Self <: BackendTimer] (val x: Self) extends AnyVal {
    
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
    def setTime(value: js.Function0[Unit] => js.Promise[BackendTimingInfo]): Self = this.set("time", js.Any.fromFunction1(value))
  }
}

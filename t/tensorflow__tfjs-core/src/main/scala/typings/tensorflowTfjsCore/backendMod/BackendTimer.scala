package typings.tensorflowTfjsCore.backendMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BackendTimer extends js.Object {
  def time(f: js.Function0[Unit]): js.Promise[BackendTimingInfo]
}

object BackendTimer {
  @scala.inline
  def apply(time: js.Function0[Unit] => js.Promise[BackendTimingInfo]): BackendTimer = {
    val __obj = js.Dynamic.literal(time = js.Any.fromFunction1(time))
  
    __obj.asInstanceOf[BackendTimer]
  }
}


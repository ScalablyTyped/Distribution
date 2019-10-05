package typings.winrt.Windows.System.Threading

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IThreadPoolTimer extends js.Object {
  var delay: Double
  var period: Double
  def cancel(): Unit
}

object IThreadPoolTimer {
  @scala.inline
  def apply(cancel: () => Unit, delay: Double, period: Double): IThreadPoolTimer = {
    val __obj = js.Dynamic.literal(cancel = js.Any.fromFunction0(cancel), delay = delay, period = period)
  
    __obj.asInstanceOf[IThreadPoolTimer]
  }
}


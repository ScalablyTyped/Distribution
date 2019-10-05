package typings.winrt.Windows.System.Threading

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Windows.System.Threading.ThreadPoolTimer")
@js.native
class ThreadPoolTimer () extends IThreadPoolTimer {
  /* CompleteClass */
  override var delay: Double = js.native
  /* CompleteClass */
  override var period: Double = js.native
  /* CompleteClass */
  override def cancel(): Unit = js.native
}

/* static members */
@JSGlobal("Windows.System.Threading.ThreadPoolTimer")
@js.native
object ThreadPoolTimer extends js.Object {
  def createPeriodicTimer(handler: TimerElapsedHandler, period: Double): ThreadPoolTimer = js.native
  def createPeriodicTimer(handler: TimerElapsedHandler, period: Double, destroyed: TimerDestroyedHandler): ThreadPoolTimer = js.native
  def createTimer(handler: TimerElapsedHandler, delay: Double): ThreadPoolTimer = js.native
  def createTimer(handler: TimerElapsedHandler, delay: Double, destroyed: TimerDestroyedHandler): ThreadPoolTimer = js.native
}


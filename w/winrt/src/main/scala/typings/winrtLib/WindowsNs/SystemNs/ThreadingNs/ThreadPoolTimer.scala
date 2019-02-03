package typings
package winrtLib.WindowsNs.SystemNs.ThreadingNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Windows.System.Threading.ThreadPoolTimer")
@js.native
class ThreadPoolTimer () extends IThreadPoolTimer {
  /* CompleteClass */
  override var delay: scala.Double = js.native
  /* CompleteClass */
  override var period: scala.Double = js.native
  /* CompleteClass */
  override def cancel(): scala.Unit = js.native
}

/* static members */
@JSGlobal("Windows.System.Threading.ThreadPoolTimer")
@js.native
object ThreadPoolTimer extends js.Object {
  def createPeriodicTimer(handler: winrtLib.WindowsNs.SystemNs.ThreadingNs.TimerElapsedHandler, period: scala.Double): winrtLib.WindowsNs.SystemNs.ThreadingNs.ThreadPoolTimer = js.native
  def createPeriodicTimer(
    handler: winrtLib.WindowsNs.SystemNs.ThreadingNs.TimerElapsedHandler,
    period: scala.Double,
    destroyed: winrtLib.WindowsNs.SystemNs.ThreadingNs.TimerDestroyedHandler
  ): winrtLib.WindowsNs.SystemNs.ThreadingNs.ThreadPoolTimer = js.native
  def createTimer(handler: winrtLib.WindowsNs.SystemNs.ThreadingNs.TimerElapsedHandler, delay: scala.Double): winrtLib.WindowsNs.SystemNs.ThreadingNs.ThreadPoolTimer = js.native
  def createTimer(
    handler: winrtLib.WindowsNs.SystemNs.ThreadingNs.TimerElapsedHandler,
    delay: scala.Double,
    destroyed: winrtLib.WindowsNs.SystemNs.ThreadingNs.TimerDestroyedHandler
  ): winrtLib.WindowsNs.SystemNs.ThreadingNs.ThreadPoolTimer = js.native
}


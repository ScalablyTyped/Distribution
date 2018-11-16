package typings
package winrtLib.WindowsNs.SystemNs.ThreadingNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IThreadPoolTimerStatics extends js.Object {
  def createPeriodicTimer(handler: TimerElapsedHandler, period: scala.Double): ThreadPoolTimer = js.native
  def createPeriodicTimer(handler: TimerElapsedHandler, period: scala.Double, destroyed: TimerDestroyedHandler): ThreadPoolTimer = js.native
  def createTimer(handler: TimerElapsedHandler, delay: scala.Double): ThreadPoolTimer = js.native
  def createTimer(handler: TimerElapsedHandler, delay: scala.Double, destroyed: TimerDestroyedHandler): ThreadPoolTimer = js.native
}


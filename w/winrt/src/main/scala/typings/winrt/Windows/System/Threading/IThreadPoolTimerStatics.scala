package typings.winrt.Windows.System.Threading

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IThreadPoolTimerStatics extends js.Object {
  def createPeriodicTimer(handler: TimerElapsedHandler, period: Double): ThreadPoolTimer = js.native
  def createPeriodicTimer(handler: TimerElapsedHandler, period: Double, destroyed: TimerDestroyedHandler): ThreadPoolTimer = js.native
  def createTimer(handler: TimerElapsedHandler, delay: Double): ThreadPoolTimer = js.native
  def createTimer(handler: TimerElapsedHandler, delay: Double, destroyed: TimerDestroyedHandler): ThreadPoolTimer = js.native
}


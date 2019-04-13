package typings
package timerDashMachineLib.timerDashMachineMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Timer extends js.Object {
  def emitTime(): scala.Unit = js.native
  def isStarted(): scala.Boolean = js.native
  def isStopped(): scala.Boolean = js.native
  def on(event: TimerEvent): scala.Unit = js.native
  def on(event: TimerEvent, callback: js.Function0[scala.Unit]): scala.Unit = js.native
  def start(): scala.Unit = js.native
  def stop(): scala.Unit = js.native
  def time(): scala.Double = js.native
  def timeFromStart(): scala.Double = js.native
  def toggle(): scala.Unit = js.native
}


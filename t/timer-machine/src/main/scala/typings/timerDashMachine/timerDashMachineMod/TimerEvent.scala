package typings.timerDashMachine.timerDashMachineMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.timerDashMachine.timerDashMachineStrings.start
  - typings.timerDashMachine.timerDashMachineStrings.stop
  - typings.timerDashMachine.timerDashMachineStrings.time
*/
trait TimerEvent extends js.Object

object TimerEvent {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def start: typings.timerDashMachine.timerDashMachineStrings.start = this.cast("start")
  @scala.inline
  def stop: typings.timerDashMachine.timerDashMachineStrings.stop = this.cast("stop")
  @scala.inline
  def time: typings.timerDashMachine.timerDashMachineStrings.time = this.cast("time")
}


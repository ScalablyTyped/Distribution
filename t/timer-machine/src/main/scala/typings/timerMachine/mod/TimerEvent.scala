package typings.timerMachine.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.timerMachine.timerMachineStrings.start
  - typings.timerMachine.timerMachineStrings.stop
  - typings.timerMachine.timerMachineStrings.time
*/
trait TimerEvent extends js.Object

object TimerEvent {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def start: typings.timerMachine.timerMachineStrings.start = this.cast("start")
  @scala.inline
  def stop: typings.timerMachine.timerMachineStrings.stop = this.cast("stop")
  @scala.inline
  def time: typings.timerMachine.timerMachineStrings.time = this.cast("time")
}


package typings
package timerDashMachineLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object timerDashMachineLibStrings {
  @js.native
  sealed trait start
    extends timerDashMachineLib.timerDashMachineMod.TimerEvent
  
  @js.native
  sealed trait stop
    extends timerDashMachineLib.timerDashMachineMod.TimerEvent
  
  @js.native
  sealed trait time
    extends timerDashMachineLib.timerDashMachineMod.TimerEvent
  
  @scala.inline
  def start: start = "start".asInstanceOf[start]
  @scala.inline
  def stop: stop = "stop".asInstanceOf[stop]
  @scala.inline
  def time: time = "time".asInstanceOf[time]
}


package typings.timerDashMachine

import typings.timerDashMachine.timerDashMachineMod.TimerEvent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object timerDashMachineStrings {
  @js.native
  sealed trait start extends TimerEvent
  
  @js.native
  sealed trait stop extends TimerEvent
  
  @js.native
  sealed trait time extends TimerEvent
  
  @scala.inline
  def start: start = "start".asInstanceOf[start]
  @scala.inline
  def stop: stop = "stop".asInstanceOf[stop]
  @scala.inline
  def time: time = "time".asInstanceOf[time]
}


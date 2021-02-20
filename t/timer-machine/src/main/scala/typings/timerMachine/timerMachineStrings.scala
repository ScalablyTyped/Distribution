package typings.timerMachine

import typings.timerMachine.mod.TimerEvent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object timerMachineStrings {
  
  @js.native
  sealed trait start extends TimerEvent
  @scala.inline
  def start: start = "start".asInstanceOf[start]
  
  @js.native
  sealed trait stop extends TimerEvent
  @scala.inline
  def stop: stop = "stop".asInstanceOf[stop]
  
  @js.native
  sealed trait time extends TimerEvent
  @scala.inline
  def time: time = "time".asInstanceOf[time]
}

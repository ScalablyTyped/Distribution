package typings.timerMachine

import typings.timerMachine.mod.TimerEvent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object timerMachineStrings {
  
  @js.native
  sealed trait start
    extends StObject
       with TimerEvent
  inline def start: start = "start".asInstanceOf[start]
  
  @js.native
  sealed trait stop
    extends StObject
       with TimerEvent
  inline def stop: stop = "stop".asInstanceOf[stop]
  
  @js.native
  sealed trait time
    extends StObject
       with TimerEvent
  inline def time: time = "time".asInstanceOf[time]
}

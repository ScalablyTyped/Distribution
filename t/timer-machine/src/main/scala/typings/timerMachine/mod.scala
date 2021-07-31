package typings.timerMachine

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("timer-machine", JSImport.Namespace)
  @js.native
  class ^ ()
    extends StObject
       with Timer {
    def this(started: Boolean) = this()
  }
  @JSImport("timer-machine", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  /* static member */
  @scala.inline
  def destroy(reference: String): Timer = ^.asInstanceOf[js.Dynamic].applyDynamic("destroy")(reference.asInstanceOf[js.Any]).asInstanceOf[Timer]
  
  /* static member */
  @scala.inline
  def get(reference: String): Timer = ^.asInstanceOf[js.Dynamic].applyDynamic("get")(reference.asInstanceOf[js.Any]).asInstanceOf[Timer]
  
  @js.native
  trait Timer extends StObject {
    
    def emitTime(): Unit = js.native
    
    def isStarted(): Boolean = js.native
    
    def isStopped(): Boolean = js.native
    
    def on(event: TimerEvent): Unit = js.native
    def on(event: TimerEvent, callback: js.Function0[Unit]): Unit = js.native
    
    def start(): Unit = js.native
    
    def stop(): Unit = js.native
    
    def time(): Double = js.native
    
    def timeFromStart(): Double = js.native
    
    def toggle(): Unit = js.native
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.timerMachine.timerMachineStrings.start
    - typings.timerMachine.timerMachineStrings.stop
    - typings.timerMachine.timerMachineStrings.time
  */
  trait TimerEvent extends StObject
  object TimerEvent {
    
    @scala.inline
    def start: typings.timerMachine.timerMachineStrings.start = "start".asInstanceOf[typings.timerMachine.timerMachineStrings.start]
    
    @scala.inline
    def stop: typings.timerMachine.timerMachineStrings.stop = "stop".asInstanceOf[typings.timerMachine.timerMachineStrings.stop]
    
    @scala.inline
    def time: typings.timerMachine.timerMachineStrings.time = "time".asInstanceOf[typings.timerMachine.timerMachineStrings.time]
  }
}

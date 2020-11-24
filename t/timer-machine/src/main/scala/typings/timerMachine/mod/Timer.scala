package typings.timerMachine.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Timer extends js.Object {
  
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

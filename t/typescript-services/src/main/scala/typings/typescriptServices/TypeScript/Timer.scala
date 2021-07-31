package typings.typescriptServices.TypeScript

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Timer extends StObject {
  
  def end(): Unit
  
  def start(): Unit
  
  var startTime: Double
  
  var time: Double
}
object Timer {
  
  @scala.inline
  def apply(end: () => Unit, start: () => Unit, startTime: Double, time: Double): Timer = {
    val __obj = js.Dynamic.literal(end = js.Any.fromFunction0(end), start = js.Any.fromFunction0(start), startTime = startTime.asInstanceOf[js.Any], time = time.asInstanceOf[js.Any])
    __obj.asInstanceOf[Timer]
  }
  
  @scala.inline
  implicit class TimerMutableBuilder[Self <: Timer] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEnd(value: () => Unit): Self = StObject.set(x, "end", js.Any.fromFunction0(value))
    
    @scala.inline
    def setStart(value: () => Unit): Self = StObject.set(x, "start", js.Any.fromFunction0(value))
    
    @scala.inline
    def setStartTime(value: Double): Self = StObject.set(x, "startTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTime(value: Double): Self = StObject.set(x, "time", value.asInstanceOf[js.Any])
  }
}

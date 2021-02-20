package typings.webcl.WEBCL

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

// 3.10
@js.native
trait WebCLEvent extends StObject {
  
  def getInfo(name: EventInfo): js.Any = js.native
  
  def getProfilingInfo(name: ProfilingInfo): Double = js.native
  
  def release(): Unit = js.native
  
  def setCallback(commandExecCallbackType: CommandExecutionStatus, notify: WebCLCallback): Unit = js.native
}
object WebCLEvent {
  
  @scala.inline
  def apply(
    getInfo: EventInfo => js.Any,
    getProfilingInfo: ProfilingInfo => Double,
    release: () => Unit,
    setCallback: (CommandExecutionStatus, WebCLCallback) => Unit
  ): WebCLEvent = {
    val __obj = js.Dynamic.literal(getInfo = js.Any.fromFunction1(getInfo), getProfilingInfo = js.Any.fromFunction1(getProfilingInfo), release = js.Any.fromFunction0(release), setCallback = js.Any.fromFunction2(setCallback))
    __obj.asInstanceOf[WebCLEvent]
  }
  
  @scala.inline
  implicit class WebCLEventMutableBuilder[Self <: WebCLEvent] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setGetInfo(value: EventInfo => js.Any): Self = StObject.set(x, "getInfo", js.Any.fromFunction1(value))
    
    @scala.inline
    def setGetProfilingInfo(value: ProfilingInfo => Double): Self = StObject.set(x, "getProfilingInfo", js.Any.fromFunction1(value))
    
    @scala.inline
    def setRelease(value: () => Unit): Self = StObject.set(x, "release", js.Any.fromFunction0(value))
    
    @scala.inline
    def setSetCallback(value: (CommandExecutionStatus, WebCLCallback) => Unit): Self = StObject.set(x, "setCallback", js.Any.fromFunction2(value))
  }
}

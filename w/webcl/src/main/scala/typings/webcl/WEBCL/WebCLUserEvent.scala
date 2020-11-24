package typings.webcl.WEBCL

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

// 3.10.1
@js.native
trait WebCLUserEvent extends WebCLEvent {
  
  def setStatus(executionStatus: CommandExecutionStatus): Unit = js.native
}
object WebCLUserEvent {
  
  @scala.inline
  def apply(
    getInfo: EventInfo => js.Any,
    getProfilingInfo: ProfilingInfo => Double,
    release: () => Unit,
    setCallback: (CommandExecutionStatus, WebCLCallback) => Unit,
    setStatus: CommandExecutionStatus => Unit
  ): WebCLUserEvent = {
    val __obj = js.Dynamic.literal(getInfo = js.Any.fromFunction1(getInfo), getProfilingInfo = js.Any.fromFunction1(getProfilingInfo), release = js.Any.fromFunction0(release), setCallback = js.Any.fromFunction2(setCallback), setStatus = js.Any.fromFunction1(setStatus))
    __obj.asInstanceOf[WebCLUserEvent]
  }
  
  @scala.inline
  implicit class WebCLUserEventOps[Self <: WebCLUserEvent] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setSetStatus(value: CommandExecutionStatus => Unit): Self = this.set("setStatus", js.Any.fromFunction1(value))
  }
}

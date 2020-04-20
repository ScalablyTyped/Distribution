package typings.webcl.WEBCL

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// 3.10.1
trait WebCLUserEvent extends WebCLEvent {
  def setStatus(executionStatus: CommandExecutionStatus): Unit
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
}


package typings.webcl.WEBCL

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// 3.10
trait WebCLEvent extends js.Object {
  def getInfo(name: EventInfo): js.Any
  def getProfilingInfo(name: ProfilingInfo): Double
  def release(): Unit
  def setCallback(commandExecCallbackType: CommandExecutionStatus, notify: WebCLCallback): Unit
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
}


package typings
package webclLib.WEBCLNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// 3.10
trait WebCLEvent extends js.Object {
  def getInfo(name: EventInfo): js.Any
  def getProfilingInfo(name: ProfilingInfo): scala.Double
  def release(): scala.Unit
  def setCallback(commandExecCallbackType: CommandExecutionStatus, notify: WebCLCallback): scala.Unit
}

object WebCLEvent {
  @scala.inline
  def apply(
    getInfo: EventInfo => js.Any,
    getProfilingInfo: ProfilingInfo => scala.Double,
    release: () => scala.Unit,
    setCallback: (CommandExecutionStatus, WebCLCallback) => scala.Unit
  ): WebCLEvent = {
    val __obj = js.Dynamic.literal(getInfo = js.Any.fromFunction1(getInfo), getProfilingInfo = js.Any.fromFunction1(getProfilingInfo), release = js.Any.fromFunction0(release), setCallback = js.Any.fromFunction2(setCallback))
  
    __obj.asInstanceOf[WebCLEvent]
  }
}


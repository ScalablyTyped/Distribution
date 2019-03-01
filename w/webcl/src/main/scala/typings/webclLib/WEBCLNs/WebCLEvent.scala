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
    getInfo: js.Function1[EventInfo, js.Any],
    getProfilingInfo: js.Function1[ProfilingInfo, scala.Double],
    release: js.Function0[scala.Unit],
    setCallback: js.Function2[CommandExecutionStatus, WebCLCallback, scala.Unit]
  ): WebCLEvent = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("getInfo")(getInfo)
    __obj.updateDynamic("getProfilingInfo")(getProfilingInfo)
    __obj.updateDynamic("release")(release)
    __obj.updateDynamic("setCallback")(setCallback)
    __obj.asInstanceOf[WebCLEvent]
  }
}


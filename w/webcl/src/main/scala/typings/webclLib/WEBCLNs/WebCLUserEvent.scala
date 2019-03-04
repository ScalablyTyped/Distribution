package typings
package webclLib.WEBCLNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// 3.10.1
trait WebCLUserEvent extends WebCLEvent {
  def setStatus(executionStatus: CommandExecutionStatus): scala.Unit
}

object WebCLUserEvent {
  @scala.inline
  def apply(
    getInfo: js.Function1[EventInfo, js.Any],
    getProfilingInfo: js.Function1[ProfilingInfo, scala.Double],
    release: js.Function0[scala.Unit],
    setCallback: js.Function2[CommandExecutionStatus, WebCLCallback, scala.Unit],
    setStatus: js.Function1[CommandExecutionStatus, scala.Unit]
  ): WebCLUserEvent = {
    val __obj = js.Dynamic.literal(getInfo = getInfo, getProfilingInfo = getProfilingInfo, release = release, setCallback = setCallback, setStatus = setStatus)
  
    __obj.asInstanceOf[WebCLUserEvent]
  }
}


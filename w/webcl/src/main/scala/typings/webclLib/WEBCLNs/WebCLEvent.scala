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


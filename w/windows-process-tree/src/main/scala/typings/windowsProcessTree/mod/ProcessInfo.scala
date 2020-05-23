package typings.windowsProcessTree.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ProcessInfo extends js.Object {
  /**
    * The string returned is at most 512 chars, strings exceeding this length are truncated.
    */
  var commandLine: js.UndefOr[String] = js.undefined
  /**
    * The working set size of the process, in bytes.
    */
  var memory: js.UndefOr[Double] = js.undefined
  var name: String
  var pid: Double
  var ppid: Double
}

object ProcessInfo {
  @scala.inline
  def apply(
    name: String,
    pid: Double,
    ppid: Double,
    commandLine: String = null,
    memory: js.UndefOr[Double] = js.undefined
  ): ProcessInfo = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], pid = pid.asInstanceOf[js.Any], ppid = ppid.asInstanceOf[js.Any])
    if (commandLine != null) __obj.updateDynamic("commandLine")(commandLine.asInstanceOf[js.Any])
    if (!js.isUndefined(memory)) __obj.updateDynamic("memory")(memory.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[ProcessInfo]
  }
}


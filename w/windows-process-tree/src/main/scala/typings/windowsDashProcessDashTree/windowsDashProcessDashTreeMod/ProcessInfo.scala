package typings.windowsDashProcessDashTree.windowsDashProcessDashTreeMod

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
  def apply(name: String, pid: Double, ppid: Double, commandLine: String = null, memory: Int | Double = null): ProcessInfo = {
    val __obj = js.Dynamic.literal(name = name, pid = pid, ppid = ppid)
    if (commandLine != null) __obj.updateDynamic("commandLine")(commandLine)
    if (memory != null) __obj.updateDynamic("memory")(memory.asInstanceOf[js.Any])
    __obj.asInstanceOf[ProcessInfo]
  }
}


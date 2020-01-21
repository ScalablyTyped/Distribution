package typings.windowsProcessTree.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ProcessCpuInfo extends ProcessInfo {
  var cpu: js.UndefOr[Double] = js.undefined
}

object ProcessCpuInfo {
  @scala.inline
  def apply(
    name: String,
    pid: Double,
    ppid: Double,
    commandLine: String = null,
    cpu: Int | Double = null,
    memory: Int | Double = null
  ): ProcessCpuInfo = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], pid = pid.asInstanceOf[js.Any], ppid = ppid.asInstanceOf[js.Any])
    if (commandLine != null) __obj.updateDynamic("commandLine")(commandLine.asInstanceOf[js.Any])
    if (cpu != null) __obj.updateDynamic("cpu")(cpu.asInstanceOf[js.Any])
    if (memory != null) __obj.updateDynamic("memory")(memory.asInstanceOf[js.Any])
    __obj.asInstanceOf[ProcessCpuInfo]
  }
}


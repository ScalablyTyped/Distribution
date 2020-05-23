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
    cpu: js.UndefOr[Double] = js.undefined,
    memory: js.UndefOr[Double] = js.undefined
  ): ProcessCpuInfo = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], pid = pid.asInstanceOf[js.Any], ppid = ppid.asInstanceOf[js.Any])
    if (commandLine != null) __obj.updateDynamic("commandLine")(commandLine.asInstanceOf[js.Any])
    if (!js.isUndefined(cpu)) __obj.updateDynamic("cpu")(cpu.get.asInstanceOf[js.Any])
    if (!js.isUndefined(memory)) __obj.updateDynamic("memory")(memory.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[ProcessCpuInfo]
  }
}


package typings.systeminformation.mod.Systeminformation

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ProcessesProcessLoadData extends js.Object {
  var cpu: Double
  var mem: Double
  var pid: Double
  var pids: js.Array[Double]
  var proc: String
}

object ProcessesProcessLoadData {
  @scala.inline
  def apply(cpu: Double, mem: Double, pid: Double, pids: js.Array[Double], proc: String): ProcessesProcessLoadData = {
    val __obj = js.Dynamic.literal(cpu = cpu.asInstanceOf[js.Any], mem = mem.asInstanceOf[js.Any], pid = pid.asInstanceOf[js.Any], pids = pids.asInstanceOf[js.Any], proc = proc.asInstanceOf[js.Any])
    __obj.asInstanceOf[ProcessesProcessLoadData]
  }
}


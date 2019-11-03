package typings.systeminformation.systeminformationMod.Systeminformation

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
    val __obj = js.Dynamic.literal(cpu = cpu, mem = mem, pid = pid, pids = pids, proc = proc)
  
    __obj.asInstanceOf[ProcessesProcessLoadData]
  }
}


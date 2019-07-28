package typings.systeminformation.systeminformationMod.SysteminformationNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ProcessesProcessLoadData extends js.Object {
  var cpu: Double
  var mem: Double
  var pid: Double
  var proc: String
}

object ProcessesProcessLoadData {
  @scala.inline
  def apply(cpu: Double, mem: Double, pid: Double, proc: String): ProcessesProcessLoadData = {
    val __obj = js.Dynamic.literal(cpu = cpu, mem = mem, pid = pid, proc = proc)
  
    __obj.asInstanceOf[ProcessesProcessLoadData]
  }
}


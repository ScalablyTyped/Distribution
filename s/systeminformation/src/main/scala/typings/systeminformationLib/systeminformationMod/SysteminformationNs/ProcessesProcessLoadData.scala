package typings
package systeminformationLib.systeminformationMod.SysteminformationNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ProcessesProcessLoadData extends js.Object {
  var cpu: scala.Double
  var mem: scala.Double
  var pid: scala.Double
  var proc: java.lang.String
}

object ProcessesProcessLoadData {
  @scala.inline
  def apply(cpu: scala.Double, mem: scala.Double, pid: scala.Double, proc: java.lang.String): ProcessesProcessLoadData = {
    val __obj = js.Dynamic.literal(cpu = cpu, mem = mem, pid = pid, proc = proc)
  
    __obj.asInstanceOf[ProcessesProcessLoadData]
  }
}


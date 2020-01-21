package typings.systeminformation.mod.Systeminformation

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ProcessesProcessData extends js.Object {
  var command: String
  var mem_rss: Double
  var mem_vsz: Double
  var name: String
  var nice: Double
  var params: String
  var parentPid: Double
  var path: String
  var pcpu: Double
  var pcpus: Double
  var pcpuu: Double
  var pid: Double
  var pmem: Double
  var priority: Double
  var started: String
  var state: String
  var tty: String
  var user: String
}

object ProcessesProcessData {
  @scala.inline
  def apply(
    command: String,
    mem_rss: Double,
    mem_vsz: Double,
    name: String,
    nice: Double,
    params: String,
    parentPid: Double,
    path: String,
    pcpu: Double,
    pcpus: Double,
    pcpuu: Double,
    pid: Double,
    pmem: Double,
    priority: Double,
    started: String,
    state: String,
    tty: String,
    user: String
  ): ProcessesProcessData = {
    val __obj = js.Dynamic.literal(command = command.asInstanceOf[js.Any], mem_rss = mem_rss.asInstanceOf[js.Any], mem_vsz = mem_vsz.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], nice = nice.asInstanceOf[js.Any], params = params.asInstanceOf[js.Any], parentPid = parentPid.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any], pcpu = pcpu.asInstanceOf[js.Any], pcpus = pcpus.asInstanceOf[js.Any], pcpuu = pcpuu.asInstanceOf[js.Any], pid = pid.asInstanceOf[js.Any], pmem = pmem.asInstanceOf[js.Any], priority = priority.asInstanceOf[js.Any], started = started.asInstanceOf[js.Any], state = state.asInstanceOf[js.Any], tty = tty.asInstanceOf[js.Any], user = user.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[ProcessesProcessData]
  }
}


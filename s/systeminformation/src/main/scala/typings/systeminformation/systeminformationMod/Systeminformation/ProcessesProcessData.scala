package typings.systeminformation.systeminformationMod.Systeminformation

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ProcessesProcessData extends js.Object {
  var command: String
  var mem_rss: Double
  var mem_vsz: Double
  var name: String
  var nice: Double
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
    val __obj = js.Dynamic.literal(command = command, mem_rss = mem_rss, mem_vsz = mem_vsz, name = name, nice = nice, pcpu = pcpu, pcpus = pcpus, pcpuu = pcpuu, pid = pid, pmem = pmem, priority = priority, started = started, state = state, tty = tty, user = user)
  
    __obj.asInstanceOf[ProcessesProcessData]
  }
}


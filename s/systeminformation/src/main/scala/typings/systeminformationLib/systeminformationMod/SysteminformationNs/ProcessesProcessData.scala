package typings
package systeminformationLib.systeminformationMod.SysteminformationNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ProcessesProcessData extends js.Object {
  var command: java.lang.String
  var mem_rss: scala.Double
  var mem_vsz: scala.Double
  var name: java.lang.String
  var nice: scala.Double
  var pcpu: scala.Double
  var pcpus: scala.Double
  var pcpuu: scala.Double
  var pid: scala.Double
  var pmem: scala.Double
  var priority: scala.Double
  var started: java.lang.String
  var state: java.lang.String
  var tty: java.lang.String
  var user: java.lang.String
}

object ProcessesProcessData {
  @scala.inline
  def apply(
    command: java.lang.String,
    mem_rss: scala.Double,
    mem_vsz: scala.Double,
    name: java.lang.String,
    nice: scala.Double,
    pcpu: scala.Double,
    pcpus: scala.Double,
    pcpuu: scala.Double,
    pid: scala.Double,
    pmem: scala.Double,
    priority: scala.Double,
    started: java.lang.String,
    state: java.lang.String,
    tty: java.lang.String,
    user: java.lang.String
  ): ProcessesProcessData = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("command")(command)
    __obj.updateDynamic("mem_rss")(mem_rss)
    __obj.updateDynamic("mem_vsz")(mem_vsz)
    __obj.updateDynamic("name")(name)
    __obj.updateDynamic("nice")(nice)
    __obj.updateDynamic("pcpu")(pcpu)
    __obj.updateDynamic("pcpus")(pcpus)
    __obj.updateDynamic("pcpuu")(pcpuu)
    __obj.updateDynamic("pid")(pid)
    __obj.updateDynamic("pmem")(pmem)
    __obj.updateDynamic("priority")(priority)
    __obj.updateDynamic("started")(started)
    __obj.updateDynamic("state")(state)
    __obj.updateDynamic("tty")(tty)
    __obj.updateDynamic("user")(user)
    __obj.asInstanceOf[ProcessesProcessData]
  }
}


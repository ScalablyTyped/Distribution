package typings
package systeminformationLib.systeminformationMod.SysteminformationNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
- systeminformationLib.systeminformationMod.SysteminformationNs.DockerContainerStatsData because var conflicts: id. Inlined mem_usage, mem_limit, mem_percent, cpu_percent, netIO, blockIO, cpu_stats, precpu_stats, memory_stats, networks */ trait DockerContainerAllData extends DockerContainerData {
  var blockIO: systeminformationLib.Anon_R
  var cpu_percent: scala.Double
  var cpu_stats: systeminformationLib.Anon_Cpuusage
  var mem_limit: scala.Double
  var mem_percent: scala.Double
  var mem_usage: scala.Double
  var memory_stats: systeminformationLib.Anon_Limit
  var netIO: systeminformationLib.Anon_Rx
  var networks: js.Any
  var pids: scala.Double
  var precpu_stats: systeminformationLib.Anon_Cpuusage
  var processes: js.Array[DockerContainerStatsProcessesData]
}


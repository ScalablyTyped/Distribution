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

object DockerContainerAllData {
  @scala.inline
  def apply(
    blockIO: systeminformationLib.Anon_R,
    command: java.lang.String,
    cpu_percent: scala.Double,
    cpu_stats: systeminformationLib.Anon_Cpuusage,
    created: scala.Double,
    id: java.lang.String,
    image: java.lang.String,
    imageID: java.lang.String,
    mem_limit: scala.Double,
    mem_percent: scala.Double,
    mem_usage: scala.Double,
    memory_stats: systeminformationLib.Anon_Limit,
    mounts: js.Array[DockerContainerMountData],
    name: java.lang.String,
    netIO: systeminformationLib.Anon_Rx,
    networks: js.Any,
    pids: scala.Double,
    ports: js.Array[scala.Double],
    precpu_stats: systeminformationLib.Anon_Cpuusage,
    processes: js.Array[DockerContainerStatsProcessesData],
    state: java.lang.String
  ): DockerContainerAllData = {
    val __obj = js.Dynamic.literal(blockIO = blockIO, command = command, cpu_percent = cpu_percent, cpu_stats = cpu_stats, created = created, id = id, image = image, imageID = imageID, mem_limit = mem_limit, mem_percent = mem_percent, mem_usage = mem_usage, memory_stats = memory_stats, mounts = mounts, name = name, netIO = netIO, networks = networks, pids = pids, ports = ports, precpu_stats = precpu_stats, processes = processes, state = state)
  
    __obj.asInstanceOf[DockerContainerAllData]
  }
}


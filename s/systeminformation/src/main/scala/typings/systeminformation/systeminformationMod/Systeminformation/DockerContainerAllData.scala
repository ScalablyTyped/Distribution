package typings.systeminformation.systeminformationMod.Systeminformation

import typings.systeminformation.Anon_Cpuusage
import typings.systeminformation.Anon_Limit
import typings.systeminformation.Anon_R
import typings.systeminformation.Anon_Rx
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
- typings.systeminformation.systeminformationMod.Systeminformation.DockerContainerStatsData because var conflicts: id. Inlined mem_usage, mem_limit, mem_percent, cpu_percent, netIO, blockIO, cpu_stats, precpu_stats, memory_stats, networks */ trait DockerContainerAllData extends DockerContainerData {
  var blockIO: Anon_R
  var cpu_percent: Double
  var cpu_stats: Anon_Cpuusage
  var mem_limit: Double
  var mem_percent: Double
  var mem_usage: Double
  var memory_stats: Anon_Limit
  var netIO: Anon_Rx
  var networks: js.Any
  var pids: Double
  var precpu_stats: Anon_Cpuusage
  var processes: js.Array[DockerContainerStatsProcessesData]
}

object DockerContainerAllData {
  @scala.inline
  def apply(
    blockIO: Anon_R,
    command: String,
    cpu_percent: Double,
    cpu_stats: Anon_Cpuusage,
    created: Double,
    id: String,
    image: String,
    imageID: String,
    mem_limit: Double,
    mem_percent: Double,
    mem_usage: Double,
    memory_stats: Anon_Limit,
    mounts: js.Array[DockerContainerMountData],
    name: String,
    netIO: Anon_Rx,
    networks: js.Any,
    pids: Double,
    ports: js.Array[Double],
    precpu_stats: Anon_Cpuusage,
    processes: js.Array[DockerContainerStatsProcessesData],
    state: String
  ): DockerContainerAllData = {
    val __obj = js.Dynamic.literal(blockIO = blockIO, command = command, cpu_percent = cpu_percent, cpu_stats = cpu_stats, created = created, id = id, image = image, imageID = imageID, mem_limit = mem_limit, mem_percent = mem_percent, mem_usage = mem_usage, memory_stats = memory_stats, mounts = mounts, name = name, netIO = netIO, networks = networks, pids = pids, ports = ports, precpu_stats = precpu_stats, processes = processes, state = state)
  
    __obj.asInstanceOf[DockerContainerAllData]
  }
}


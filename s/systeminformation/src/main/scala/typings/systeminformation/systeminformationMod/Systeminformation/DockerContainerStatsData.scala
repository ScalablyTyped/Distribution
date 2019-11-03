package typings.systeminformation.systeminformationMod.Systeminformation

import typings.systeminformation.Anon_R
import typings.systeminformation.Anon_Rx
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DockerContainerStatsData extends js.Object {
  var blockIO: Anon_R
  var cpu_percent: Double
  var cpu_stats: js.Any
  var id: String
  var mem_limit: Double
  var mem_percent: Double
  var mem_usage: Double
  var memory_stats: js.Any
  var netIO: Anon_Rx
  var networks: js.Any
  var precpu_stats: js.Any
  var restartCount: Double
}

object DockerContainerStatsData {
  @scala.inline
  def apply(
    blockIO: Anon_R,
    cpu_percent: Double,
    cpu_stats: js.Any,
    id: String,
    mem_limit: Double,
    mem_percent: Double,
    mem_usage: Double,
    memory_stats: js.Any,
    netIO: Anon_Rx,
    networks: js.Any,
    precpu_stats: js.Any,
    restartCount: Double
  ): DockerContainerStatsData = {
    val __obj = js.Dynamic.literal(blockIO = blockIO, cpu_percent = cpu_percent, cpu_stats = cpu_stats, id = id, mem_limit = mem_limit, mem_percent = mem_percent, mem_usage = mem_usage, memory_stats = memory_stats, netIO = netIO, networks = networks, precpu_stats = precpu_stats, restartCount = restartCount)
  
    __obj.asInstanceOf[DockerContainerStatsData]
  }
}


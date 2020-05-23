package typings.systeminformation.mod.Systeminformation

import typings.systeminformation.anon.R
import typings.systeminformation.anon.Rx
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DockerContainerStatsData extends js.Object {
  var blockIO: R
  var cpu_percent: Double
  var cpu_stats: js.Any
  var id: String
  var mem_limit: Double
  var mem_percent: Double
  var mem_usage: Double
  var memory_stats: js.Any
  var netIO: Rx
  var networks: js.Any
  var precpu_stats: js.Any
  var restartCount: Double
}

object DockerContainerStatsData {
  @scala.inline
  def apply(
    blockIO: R,
    cpu_percent: Double,
    cpu_stats: js.Any,
    id: String,
    mem_limit: Double,
    mem_percent: Double,
    mem_usage: Double,
    memory_stats: js.Any,
    netIO: Rx,
    networks: js.Any,
    precpu_stats: js.Any,
    restartCount: Double
  ): DockerContainerStatsData = {
    val __obj = js.Dynamic.literal(blockIO = blockIO.asInstanceOf[js.Any], cpu_percent = cpu_percent.asInstanceOf[js.Any], cpu_stats = cpu_stats.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], mem_limit = mem_limit.asInstanceOf[js.Any], mem_percent = mem_percent.asInstanceOf[js.Any], mem_usage = mem_usage.asInstanceOf[js.Any], memory_stats = memory_stats.asInstanceOf[js.Any], netIO = netIO.asInstanceOf[js.Any], networks = networks.asInstanceOf[js.Any], precpu_stats = precpu_stats.asInstanceOf[js.Any], restartCount = restartCount.asInstanceOf[js.Any])
    __obj.asInstanceOf[DockerContainerStatsData]
  }
}


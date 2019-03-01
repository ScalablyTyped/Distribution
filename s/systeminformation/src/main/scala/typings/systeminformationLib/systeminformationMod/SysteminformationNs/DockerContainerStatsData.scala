package typings
package systeminformationLib.systeminformationMod.SysteminformationNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DockerContainerStatsData extends js.Object {
  var blockIO: systeminformationLib.Anon_R
  var cpu_percent: scala.Double
  var cpu_stats: systeminformationLib.Anon_Cpuusage
  var id: java.lang.String
  var mem_limit: scala.Double
  var mem_percent: scala.Double
  var mem_usage: scala.Double
  var memory_stats: systeminformationLib.Anon_Limit
  var netIO: systeminformationLib.Anon_Rx
  var networks: js.Any
  var precpu_stats: systeminformationLib.Anon_Cpuusage
}

object DockerContainerStatsData {
  @scala.inline
  def apply(
    blockIO: systeminformationLib.Anon_R,
    cpu_percent: scala.Double,
    cpu_stats: systeminformationLib.Anon_Cpuusage,
    id: java.lang.String,
    mem_limit: scala.Double,
    mem_percent: scala.Double,
    mem_usage: scala.Double,
    memory_stats: systeminformationLib.Anon_Limit,
    netIO: systeminformationLib.Anon_Rx,
    networks: js.Any,
    precpu_stats: systeminformationLib.Anon_Cpuusage
  ): DockerContainerStatsData = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("blockIO")(blockIO)
    __obj.updateDynamic("cpu_percent")(cpu_percent)
    __obj.updateDynamic("cpu_stats")(cpu_stats)
    __obj.updateDynamic("id")(id)
    __obj.updateDynamic("mem_limit")(mem_limit)
    __obj.updateDynamic("mem_percent")(mem_percent)
    __obj.updateDynamic("mem_usage")(mem_usage)
    __obj.updateDynamic("memory_stats")(memory_stats)
    __obj.updateDynamic("netIO")(netIO)
    __obj.updateDynamic("networks")(networks)
    __obj.updateDynamic("precpu_stats")(precpu_stats)
    __obj.asInstanceOf[DockerContainerStatsData]
  }
}


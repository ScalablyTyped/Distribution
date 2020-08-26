package typings.systeminformation.mod.Systeminformation

import typings.systeminformation.anon.R
import typings.systeminformation.anon.Rx
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DockerContainerStatsData extends js.Object {
  var blockIO: R = js.native
  var cpu_percent: Double = js.native
  var cpu_stats: js.Any = js.native
  var id: String = js.native
  var mem_limit: Double = js.native
  var mem_percent: Double = js.native
  var mem_usage: Double = js.native
  var memory_stats: js.Any = js.native
  var netIO: Rx = js.native
  var networks: js.Any = js.native
  var precpu_stats: js.Any = js.native
  var restartCount: Double = js.native
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
  @scala.inline
  implicit class DockerContainerStatsDataOps[Self <: DockerContainerStatsData] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setBlockIO(value: R): Self = this.set("blockIO", value.asInstanceOf[js.Any])
    @scala.inline
    def setCpu_percent(value: Double): Self = this.set("cpu_percent", value.asInstanceOf[js.Any])
    @scala.inline
    def setCpu_stats(value: js.Any): Self = this.set("cpu_stats", value.asInstanceOf[js.Any])
    @scala.inline
    def setId(value: String): Self = this.set("id", value.asInstanceOf[js.Any])
    @scala.inline
    def setMem_limit(value: Double): Self = this.set("mem_limit", value.asInstanceOf[js.Any])
    @scala.inline
    def setMem_percent(value: Double): Self = this.set("mem_percent", value.asInstanceOf[js.Any])
    @scala.inline
    def setMem_usage(value: Double): Self = this.set("mem_usage", value.asInstanceOf[js.Any])
    @scala.inline
    def setMemory_stats(value: js.Any): Self = this.set("memory_stats", value.asInstanceOf[js.Any])
    @scala.inline
    def setNetIO(value: Rx): Self = this.set("netIO", value.asInstanceOf[js.Any])
    @scala.inline
    def setNetworks(value: js.Any): Self = this.set("networks", value.asInstanceOf[js.Any])
    @scala.inline
    def setPrecpu_stats(value: js.Any): Self = this.set("precpu_stats", value.asInstanceOf[js.Any])
    @scala.inline
    def setRestartCount(value: Double): Self = this.set("restartCount", value.asInstanceOf[js.Any])
  }
  
}


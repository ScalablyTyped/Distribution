package typings.swaggerStats.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TimelineStatsData extends js.Object {
  var stats: ReqResStats = js.native
  var sys: SysStats = js.native
}

object TimelineStatsData {
  @scala.inline
  def apply(stats: ReqResStats, sys: SysStats): TimelineStatsData = {
    val __obj = js.Dynamic.literal(stats = stats.asInstanceOf[js.Any], sys = sys.asInstanceOf[js.Any])
    __obj.asInstanceOf[TimelineStatsData]
  }
  @scala.inline
  implicit class TimelineStatsDataOps[Self <: TimelineStatsData] (val x: Self) extends AnyVal {
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
    def setStats(value: ReqResStats): Self = this.set("stats", value.asInstanceOf[js.Any])
    @scala.inline
    def setSys(value: SysStats): Self = this.set("sys", value.asInstanceOf[js.Any])
  }
  
}


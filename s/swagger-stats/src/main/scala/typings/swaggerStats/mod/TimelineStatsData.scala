package typings.swaggerStats.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TimelineStatsData extends js.Object {
  var stats: ReqResStats
  var sys: SysStats
}

object TimelineStatsData {
  @scala.inline
  def apply(stats: ReqResStats, sys: SysStats): TimelineStatsData = {
    val __obj = js.Dynamic.literal(stats = stats.asInstanceOf[js.Any], sys = sys.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[TimelineStatsData]
  }
}


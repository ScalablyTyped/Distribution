package typings.swaggerStats.mod

import typings.std.Record
import typings.swaggerStats.anon.Bucketcurrent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TimelineStats extends js.Object {
  var data: Record[String, TimelineStatsData]
  var settings: Bucketcurrent
}

object TimelineStats {
  @scala.inline
  def apply(data: Record[String, TimelineStatsData], settings: Bucketcurrent): TimelineStats = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], settings = settings.asInstanceOf[js.Any])
    __obj.asInstanceOf[TimelineStats]
  }
}


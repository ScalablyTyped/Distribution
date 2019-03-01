package typings
package xtermLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RTCStats extends js.Object {
  var id: java.lang.String
  var timestamp: scala.Double
  var `type`: RTCStatsType
}

object RTCStats {
  @scala.inline
  def apply(id: java.lang.String, timestamp: scala.Double, `type`: RTCStatsType): RTCStats = {
    val __obj = js.Dynamic.literal(`type` = `type`)
    __obj.updateDynamic("id")(id)
    __obj.updateDynamic("timestamp")(timestamp)
    __obj.asInstanceOf[RTCStats]
  }
}


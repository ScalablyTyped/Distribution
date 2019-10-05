package typings.systeminformation.systeminformationMod.Systeminformation

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NetStatsData extends js.Object {
  var iface: String
  var ms: Double
  var rx: Double
  var rx_sec: Double
  var tx: Double
  var tx_sec: Double
}

object NetStatsData {
  @scala.inline
  def apply(iface: String, ms: Double, rx: Double, rx_sec: Double, tx: Double, tx_sec: Double): NetStatsData = {
    val __obj = js.Dynamic.literal(iface = iface, ms = ms, rx = rx, rx_sec = rx_sec, tx = tx, tx_sec = tx_sec)
  
    __obj.asInstanceOf[NetStatsData]
  }
}


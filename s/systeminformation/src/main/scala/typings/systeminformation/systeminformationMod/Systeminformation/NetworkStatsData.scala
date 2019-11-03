package typings.systeminformation.systeminformationMod.Systeminformation

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NetworkStatsData extends js.Object {
  var iface: String
  var ms: Double
  var operstate: String
  var rx_bytes: Double
  var rx_dropped: Double
  var rx_errors: Double
  var rx_sec: Double
  var tx_bytes: Double
  var tx_dropped: Double
  var tx_errors: Double
  var tx_sec: Double
}

object NetworkStatsData {
  @scala.inline
  def apply(
    iface: String,
    ms: Double,
    operstate: String,
    rx_bytes: Double,
    rx_dropped: Double,
    rx_errors: Double,
    rx_sec: Double,
    tx_bytes: Double,
    tx_dropped: Double,
    tx_errors: Double,
    tx_sec: Double
  ): NetworkStatsData = {
    val __obj = js.Dynamic.literal(iface = iface, ms = ms, operstate = operstate, rx_bytes = rx_bytes, rx_dropped = rx_dropped, rx_errors = rx_errors, rx_sec = rx_sec, tx_bytes = tx_bytes, tx_dropped = tx_dropped, tx_errors = tx_errors, tx_sec = tx_sec)
  
    __obj.asInstanceOf[NetworkStatsData]
  }
}


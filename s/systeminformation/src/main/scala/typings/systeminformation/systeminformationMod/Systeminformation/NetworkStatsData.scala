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
    val __obj = js.Dynamic.literal(iface = iface.asInstanceOf[js.Any], ms = ms.asInstanceOf[js.Any], operstate = operstate.asInstanceOf[js.Any], rx_bytes = rx_bytes.asInstanceOf[js.Any], rx_dropped = rx_dropped.asInstanceOf[js.Any], rx_errors = rx_errors.asInstanceOf[js.Any], rx_sec = rx_sec.asInstanceOf[js.Any], tx_bytes = tx_bytes.asInstanceOf[js.Any], tx_dropped = tx_dropped.asInstanceOf[js.Any], tx_errors = tx_errors.asInstanceOf[js.Any], tx_sec = tx_sec.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[NetworkStatsData]
  }
}


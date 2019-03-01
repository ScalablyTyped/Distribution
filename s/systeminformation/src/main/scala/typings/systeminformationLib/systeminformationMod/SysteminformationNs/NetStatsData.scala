package typings
package systeminformationLib.systeminformationMod.SysteminformationNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NetStatsData extends js.Object {
  var iface: java.lang.String
  var ms: scala.Double
  var rx: scala.Double
  var rx_sec: scala.Double
  var tx: scala.Double
  var tx_sec: scala.Double
}

object NetStatsData {
  @scala.inline
  def apply(
    iface: java.lang.String,
    ms: scala.Double,
    rx: scala.Double,
    rx_sec: scala.Double,
    tx: scala.Double,
    tx_sec: scala.Double
  ): NetStatsData = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("iface")(iface)
    __obj.updateDynamic("ms")(ms)
    __obj.updateDynamic("rx")(rx)
    __obj.updateDynamic("rx_sec")(rx_sec)
    __obj.updateDynamic("tx")(tx)
    __obj.updateDynamic("tx_sec")(tx_sec)
    __obj.asInstanceOf[NetStatsData]
  }
}


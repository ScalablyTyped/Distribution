package typings.systeminformation.mod.Systeminformation

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait NetworkStatsData extends js.Object {
  var iface: String = js.native
  var ms: Double = js.native
  var operstate: String = js.native
  var rx_bytes: Double = js.native
  var rx_dropped: Double = js.native
  var rx_errors: Double = js.native
  var rx_sec: Double = js.native
  var tx_bytes: Double = js.native
  var tx_dropped: Double = js.native
  var tx_errors: Double = js.native
  var tx_sec: Double = js.native
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
  @scala.inline
  implicit class NetworkStatsDataOps[Self <: NetworkStatsData] (val x: Self) extends AnyVal {
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
    def setIface(value: String): Self = this.set("iface", value.asInstanceOf[js.Any])
    @scala.inline
    def setMs(value: Double): Self = this.set("ms", value.asInstanceOf[js.Any])
    @scala.inline
    def setOperstate(value: String): Self = this.set("operstate", value.asInstanceOf[js.Any])
    @scala.inline
    def setRx_bytes(value: Double): Self = this.set("rx_bytes", value.asInstanceOf[js.Any])
    @scala.inline
    def setRx_dropped(value: Double): Self = this.set("rx_dropped", value.asInstanceOf[js.Any])
    @scala.inline
    def setRx_errors(value: Double): Self = this.set("rx_errors", value.asInstanceOf[js.Any])
    @scala.inline
    def setRx_sec(value: Double): Self = this.set("rx_sec", value.asInstanceOf[js.Any])
    @scala.inline
    def setTx_bytes(value: Double): Self = this.set("tx_bytes", value.asInstanceOf[js.Any])
    @scala.inline
    def setTx_dropped(value: Double): Self = this.set("tx_dropped", value.asInstanceOf[js.Any])
    @scala.inline
    def setTx_errors(value: Double): Self = this.set("tx_errors", value.asInstanceOf[js.Any])
    @scala.inline
    def setTx_sec(value: Double): Self = this.set("tx_sec", value.asInstanceOf[js.Any])
  }
  
}


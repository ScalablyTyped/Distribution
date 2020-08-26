package typings.systeminformation.mod.Systeminformation

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FsStatsData extends js.Object {
  var ms: Double = js.native
  var rx_bytes: Double = js.native
  var rx_sec: Double = js.native
  var tx_bytes: Double = js.native
  var tx_sec: Double = js.native
  var wx_bytes: Double = js.native
  var wx_sec: Double = js.native
}

object FsStatsData {
  @scala.inline
  def apply(
    ms: Double,
    rx_bytes: Double,
    rx_sec: Double,
    tx_bytes: Double,
    tx_sec: Double,
    wx_bytes: Double,
    wx_sec: Double
  ): FsStatsData = {
    val __obj = js.Dynamic.literal(ms = ms.asInstanceOf[js.Any], rx_bytes = rx_bytes.asInstanceOf[js.Any], rx_sec = rx_sec.asInstanceOf[js.Any], tx_bytes = tx_bytes.asInstanceOf[js.Any], tx_sec = tx_sec.asInstanceOf[js.Any], wx_bytes = wx_bytes.asInstanceOf[js.Any], wx_sec = wx_sec.asInstanceOf[js.Any])
    __obj.asInstanceOf[FsStatsData]
  }
  @scala.inline
  implicit class FsStatsDataOps[Self <: FsStatsData] (val x: Self) extends AnyVal {
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
    def setMs(value: Double): Self = this.set("ms", value.asInstanceOf[js.Any])
    @scala.inline
    def setRx_bytes(value: Double): Self = this.set("rx_bytes", value.asInstanceOf[js.Any])
    @scala.inline
    def setRx_sec(value: Double): Self = this.set("rx_sec", value.asInstanceOf[js.Any])
    @scala.inline
    def setTx_bytes(value: Double): Self = this.set("tx_bytes", value.asInstanceOf[js.Any])
    @scala.inline
    def setTx_sec(value: Double): Self = this.set("tx_sec", value.asInstanceOf[js.Any])
    @scala.inline
    def setWx_bytes(value: Double): Self = this.set("wx_bytes", value.asInstanceOf[js.Any])
    @scala.inline
    def setWx_sec(value: Double): Self = this.set("wx_sec", value.asInstanceOf[js.Any])
  }
  
}


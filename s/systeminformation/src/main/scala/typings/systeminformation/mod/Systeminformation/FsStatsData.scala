package typings.systeminformation.mod.Systeminformation

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FsStatsData extends js.Object {
  var ms: Double
  var rx_bytes: Double
  var rx_sec: Double
  var tx_bytes: Double
  var tx_sec: Double
  var wx_bytes: Double
  var wx_sec: Double
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
}


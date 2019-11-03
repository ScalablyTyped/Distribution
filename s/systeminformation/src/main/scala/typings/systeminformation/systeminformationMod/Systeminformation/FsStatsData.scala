package typings.systeminformation.systeminformationMod.Systeminformation

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
    val __obj = js.Dynamic.literal(ms = ms, rx_bytes = rx_bytes, rx_sec = rx_sec, tx_bytes = tx_bytes, tx_sec = tx_sec, wx_bytes = wx_bytes, wx_sec = wx_sec)
  
    __obj.asInstanceOf[FsStatsData]
  }
}


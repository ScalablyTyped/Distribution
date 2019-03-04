package typings
package systeminformationLib.systeminformationMod.SysteminformationNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FsStatsData extends js.Object {
  var ms: scala.Double
  var rx: scala.Double
  var rx_sec: scala.Double
  var tx: scala.Double
  var tx_sec: scala.Double
  var wx: scala.Double
  var wx_sec: scala.Double
}

object FsStatsData {
  @scala.inline
  def apply(
    ms: scala.Double,
    rx: scala.Double,
    rx_sec: scala.Double,
    tx: scala.Double,
    tx_sec: scala.Double,
    wx: scala.Double,
    wx_sec: scala.Double
  ): FsStatsData = {
    val __obj = js.Dynamic.literal(ms = ms, rx = rx, rx_sec = rx_sec, tx = tx, tx_sec = tx_sec, wx = wx, wx_sec = wx_sec)
  
    __obj.asInstanceOf[FsStatsData]
  }
}


package typings.systeminformation.systeminformationMod.Systeminformation

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FsStatsData extends js.Object {
  var ms: Double
  var rx: Double
  var rx_sec: Double
  var tx: Double
  var tx_sec: Double
  var wx: Double
  var wx_sec: Double
}

object FsStatsData {
  @scala.inline
  def apply(ms: Double, rx: Double, rx_sec: Double, tx: Double, tx_sec: Double, wx: Double, wx_sec: Double): FsStatsData = {
    val __obj = js.Dynamic.literal(ms = ms, rx = rx, rx_sec = rx_sec, tx = tx, tx_sec = tx_sec, wx = wx, wx_sec = wx_sec)
  
    __obj.asInstanceOf[FsStatsData]
  }
}


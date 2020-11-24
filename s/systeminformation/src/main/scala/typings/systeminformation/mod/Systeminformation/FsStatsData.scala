package typings.systeminformation.mod.Systeminformation

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FsStatsData extends js.Object {
  
  var ms: Double = js.native
  
  var rx: Double = js.native
  
  var rx_sec: Double = js.native
  
  var tx: Double = js.native
  
  var tx_sec: Double = js.native
  
  var wx: Double = js.native
  
  var wx_sec: Double = js.native
}
object FsStatsData {
  
  @scala.inline
  def apply(ms: Double, rx: Double, rx_sec: Double, tx: Double, tx_sec: Double, wx: Double, wx_sec: Double): FsStatsData = {
    val __obj = js.Dynamic.literal(ms = ms.asInstanceOf[js.Any], rx = rx.asInstanceOf[js.Any], rx_sec = rx_sec.asInstanceOf[js.Any], tx = tx.asInstanceOf[js.Any], tx_sec = tx_sec.asInstanceOf[js.Any], wx = wx.asInstanceOf[js.Any], wx_sec = wx_sec.asInstanceOf[js.Any])
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
    def setRx(value: Double): Self = this.set("rx", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRx_sec(value: Double): Self = this.set("rx_sec", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTx(value: Double): Self = this.set("tx", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTx_sec(value: Double): Self = this.set("tx_sec", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWx(value: Double): Self = this.set("wx", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWx_sec(value: Double): Self = this.set("wx_sec", value.asInstanceOf[js.Any])
  }
}

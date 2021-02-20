package typings.systeminformation.mod.Systeminformation

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FsStatsData extends StObject {
  
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
  implicit class FsStatsDataMutableBuilder[Self <: FsStatsData] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setMs(value: Double): Self = StObject.set(x, "ms", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRx(value: Double): Self = StObject.set(x, "rx", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRx_sec(value: Double): Self = StObject.set(x, "rx_sec", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTx(value: Double): Self = StObject.set(x, "tx", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTx_sec(value: Double): Self = StObject.set(x, "tx_sec", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWx(value: Double): Self = StObject.set(x, "wx", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWx_sec(value: Double): Self = StObject.set(x, "wx_sec", value.asInstanceOf[js.Any])
  }
}

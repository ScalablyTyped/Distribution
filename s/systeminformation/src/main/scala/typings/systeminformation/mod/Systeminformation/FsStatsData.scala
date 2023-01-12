package typings.systeminformation.mod.Systeminformation

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FsStatsData extends StObject {
  
  var ms: Double
  
  var rx: Double
  
  var rx_sec: Double | Null
  
  var tx: Double
  
  var tx_sec: Double | Null
  
  var wx: Double
  
  var wx_sec: Double | Null
}
object FsStatsData {
  
  inline def apply(ms: Double, rx: Double, tx: Double, wx: Double): FsStatsData = {
    val __obj = js.Dynamic.literal(ms = ms.asInstanceOf[js.Any], rx = rx.asInstanceOf[js.Any], tx = tx.asInstanceOf[js.Any], wx = wx.asInstanceOf[js.Any], rx_sec = null, tx_sec = null, wx_sec = null)
    __obj.asInstanceOf[FsStatsData]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: FsStatsData] (val x: Self) extends AnyVal {
    
    inline def setMs(value: Double): Self = StObject.set(x, "ms", value.asInstanceOf[js.Any])
    
    inline def setRx(value: Double): Self = StObject.set(x, "rx", value.asInstanceOf[js.Any])
    
    inline def setRx_sec(value: Double): Self = StObject.set(x, "rx_sec", value.asInstanceOf[js.Any])
    
    inline def setRx_secNull: Self = StObject.set(x, "rx_sec", null)
    
    inline def setTx(value: Double): Self = StObject.set(x, "tx", value.asInstanceOf[js.Any])
    
    inline def setTx_sec(value: Double): Self = StObject.set(x, "tx_sec", value.asInstanceOf[js.Any])
    
    inline def setTx_secNull: Self = StObject.set(x, "tx_sec", null)
    
    inline def setWx(value: Double): Self = StObject.set(x, "wx", value.asInstanceOf[js.Any])
    
    inline def setWx_sec(value: Double): Self = StObject.set(x, "wx_sec", value.asInstanceOf[js.Any])
    
    inline def setWx_secNull: Self = StObject.set(x, "wx_sec", null)
  }
}

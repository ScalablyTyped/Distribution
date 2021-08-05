package typings.systeminformation.mod.Systeminformation

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait NetworkStatsData extends StObject {
  
  var iface: String
  
  var ms: Double
  
  var operstate: String
  
  var rx_bytes: Double
  
  var rx_dropped: Double
  
  var rx_errors: Double
  
  var rx_sec: Double
  
  var tx_bytes: Double
  
  var tx_dropped: Double
  
  var tx_errors: Double
  
  var tx_sec: Double
}
object NetworkStatsData {
  
  inline def apply(
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
  
  extension [Self <: NetworkStatsData](x: Self) {
    
    inline def setIface(value: String): Self = StObject.set(x, "iface", value.asInstanceOf[js.Any])
    
    inline def setMs(value: Double): Self = StObject.set(x, "ms", value.asInstanceOf[js.Any])
    
    inline def setOperstate(value: String): Self = StObject.set(x, "operstate", value.asInstanceOf[js.Any])
    
    inline def setRx_bytes(value: Double): Self = StObject.set(x, "rx_bytes", value.asInstanceOf[js.Any])
    
    inline def setRx_dropped(value: Double): Self = StObject.set(x, "rx_dropped", value.asInstanceOf[js.Any])
    
    inline def setRx_errors(value: Double): Self = StObject.set(x, "rx_errors", value.asInstanceOf[js.Any])
    
    inline def setRx_sec(value: Double): Self = StObject.set(x, "rx_sec", value.asInstanceOf[js.Any])
    
    inline def setTx_bytes(value: Double): Self = StObject.set(x, "tx_bytes", value.asInstanceOf[js.Any])
    
    inline def setTx_dropped(value: Double): Self = StObject.set(x, "tx_dropped", value.asInstanceOf[js.Any])
    
    inline def setTx_errors(value: Double): Self = StObject.set(x, "tx_errors", value.asInstanceOf[js.Any])
    
    inline def setTx_sec(value: Double): Self = StObject.set(x, "tx_sec", value.asInstanceOf[js.Any])
  }
}

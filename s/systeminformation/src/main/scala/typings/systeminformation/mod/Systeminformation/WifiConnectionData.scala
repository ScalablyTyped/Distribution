package typings.systeminformation.mod.Systeminformation

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait WifiConnectionData extends StObject {
  
  var bssid: String
  
  var channel: Double
  
  var frequency: Double
  
  var id: String
  
  var iface: String
  
  var model: String
  
  var security: String
  
  var signalLevel: Double
  
  var ssid: String
  
  var txRate: Double
  
  var `type`: String
}
object WifiConnectionData {
  
  inline def apply(
    bssid: String,
    channel: Double,
    frequency: Double,
    id: String,
    iface: String,
    model: String,
    security: String,
    signalLevel: Double,
    ssid: String,
    txRate: Double,
    `type`: String
  ): WifiConnectionData = {
    val __obj = js.Dynamic.literal(bssid = bssid.asInstanceOf[js.Any], channel = channel.asInstanceOf[js.Any], frequency = frequency.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], iface = iface.asInstanceOf[js.Any], model = model.asInstanceOf[js.Any], security = security.asInstanceOf[js.Any], signalLevel = signalLevel.asInstanceOf[js.Any], ssid = ssid.asInstanceOf[js.Any], txRate = txRate.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[WifiConnectionData]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: WifiConnectionData] (val x: Self) extends AnyVal {
    
    inline def setBssid(value: String): Self = StObject.set(x, "bssid", value.asInstanceOf[js.Any])
    
    inline def setChannel(value: Double): Self = StObject.set(x, "channel", value.asInstanceOf[js.Any])
    
    inline def setFrequency(value: Double): Self = StObject.set(x, "frequency", value.asInstanceOf[js.Any])
    
    inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setIface(value: String): Self = StObject.set(x, "iface", value.asInstanceOf[js.Any])
    
    inline def setModel(value: String): Self = StObject.set(x, "model", value.asInstanceOf[js.Any])
    
    inline def setSecurity(value: String): Self = StObject.set(x, "security", value.asInstanceOf[js.Any])
    
    inline def setSignalLevel(value: Double): Self = StObject.set(x, "signalLevel", value.asInstanceOf[js.Any])
    
    inline def setSsid(value: String): Self = StObject.set(x, "ssid", value.asInstanceOf[js.Any])
    
    inline def setTxRate(value: Double): Self = StObject.set(x, "txRate", value.asInstanceOf[js.Any])
    
    inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}

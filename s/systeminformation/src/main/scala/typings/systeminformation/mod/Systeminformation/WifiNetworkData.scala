package typings.systeminformation.mod.Systeminformation

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait WifiNetworkData extends StObject {
  
  var bssid: String
  
  var channel: Double
  
  var frequency: Double
  
  var mode: String
  
  var quality: Double
  
  var rsnFlags: js.Array[String]
  
  var security: js.Array[String]
  
  var signalLevel: Double
  
  var ssid: String
  
  var wpaFlags: js.Array[String]
}
object WifiNetworkData {
  
  inline def apply(
    bssid: String,
    channel: Double,
    frequency: Double,
    mode: String,
    quality: Double,
    rsnFlags: js.Array[String],
    security: js.Array[String],
    signalLevel: Double,
    ssid: String,
    wpaFlags: js.Array[String]
  ): WifiNetworkData = {
    val __obj = js.Dynamic.literal(bssid = bssid.asInstanceOf[js.Any], channel = channel.asInstanceOf[js.Any], frequency = frequency.asInstanceOf[js.Any], mode = mode.asInstanceOf[js.Any], quality = quality.asInstanceOf[js.Any], rsnFlags = rsnFlags.asInstanceOf[js.Any], security = security.asInstanceOf[js.Any], signalLevel = signalLevel.asInstanceOf[js.Any], ssid = ssid.asInstanceOf[js.Any], wpaFlags = wpaFlags.asInstanceOf[js.Any])
    __obj.asInstanceOf[WifiNetworkData]
  }
  
  extension [Self <: WifiNetworkData](x: Self) {
    
    inline def setBssid(value: String): Self = StObject.set(x, "bssid", value.asInstanceOf[js.Any])
    
    inline def setChannel(value: Double): Self = StObject.set(x, "channel", value.asInstanceOf[js.Any])
    
    inline def setFrequency(value: Double): Self = StObject.set(x, "frequency", value.asInstanceOf[js.Any])
    
    inline def setMode(value: String): Self = StObject.set(x, "mode", value.asInstanceOf[js.Any])
    
    inline def setQuality(value: Double): Self = StObject.set(x, "quality", value.asInstanceOf[js.Any])
    
    inline def setRsnFlags(value: js.Array[String]): Self = StObject.set(x, "rsnFlags", value.asInstanceOf[js.Any])
    
    inline def setRsnFlagsVarargs(value: String*): Self = StObject.set(x, "rsnFlags", js.Array(value*))
    
    inline def setSecurity(value: js.Array[String]): Self = StObject.set(x, "security", value.asInstanceOf[js.Any])
    
    inline def setSecurityVarargs(value: String*): Self = StObject.set(x, "security", js.Array(value*))
    
    inline def setSignalLevel(value: Double): Self = StObject.set(x, "signalLevel", value.asInstanceOf[js.Any])
    
    inline def setSsid(value: String): Self = StObject.set(x, "ssid", value.asInstanceOf[js.Any])
    
    inline def setWpaFlags(value: js.Array[String]): Self = StObject.set(x, "wpaFlags", value.asInstanceOf[js.Any])
    
    inline def setWpaFlagsVarargs(value: String*): Self = StObject.set(x, "wpaFlags", js.Array(value*))
  }
}

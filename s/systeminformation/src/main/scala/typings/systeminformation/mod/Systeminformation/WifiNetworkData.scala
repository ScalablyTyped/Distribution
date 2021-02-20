package typings.systeminformation.mod.Systeminformation

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait WifiNetworkData extends StObject {
  
  var bssid: String = js.native
  
  var channel: Double = js.native
  
  var frequency: Double = js.native
  
  var mode: String = js.native
  
  var quality: Double = js.native
  
  var rsnFlags: js.Array[String] = js.native
  
  var security: js.Array[String] = js.native
  
  var signalLevel: Double = js.native
  
  var ssid: String = js.native
  
  var wpaFlags: js.Array[String] = js.native
}
object WifiNetworkData {
  
  @scala.inline
  def apply(
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
  
  @scala.inline
  implicit class WifiNetworkDataMutableBuilder[Self <: WifiNetworkData] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBssid(value: String): Self = StObject.set(x, "bssid", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setChannel(value: Double): Self = StObject.set(x, "channel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFrequency(value: Double): Self = StObject.set(x, "frequency", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMode(value: String): Self = StObject.set(x, "mode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setQuality(value: Double): Self = StObject.set(x, "quality", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRsnFlags(value: js.Array[String]): Self = StObject.set(x, "rsnFlags", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRsnFlagsVarargs(value: String*): Self = StObject.set(x, "rsnFlags", js.Array(value :_*))
    
    @scala.inline
    def setSecurity(value: js.Array[String]): Self = StObject.set(x, "security", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSecurityVarargs(value: String*): Self = StObject.set(x, "security", js.Array(value :_*))
    
    @scala.inline
    def setSignalLevel(value: Double): Self = StObject.set(x, "signalLevel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSsid(value: String): Self = StObject.set(x, "ssid", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWpaFlags(value: js.Array[String]): Self = StObject.set(x, "wpaFlags", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWpaFlagsVarargs(value: String*): Self = StObject.set(x, "wpaFlags", js.Array(value :_*))
  }
}

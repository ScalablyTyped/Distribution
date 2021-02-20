package typings.wechatMiniprogram.WechatMiniprogram

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Wifi 信息 */
@js.native
trait WifiInfo extends StObject {
  
  /** Wi-Fi 的 BSSID */
  var BSSID: String = js.native
  
  /** Wi-Fi 的 SSID */
  var SSID: String = js.native
  
  /** Wi-Fi 频段单位 MHz
    *
    * 最低基础库： `2.12.0` */
  var frequency: Double = js.native
  
  /** Wi-Fi 是否安全 */
  var secure: Boolean = js.native
  
  /** Wi-Fi 信号强度 */
  var signalStrength: Double = js.native
}
object WifiInfo {
  
  @scala.inline
  def apply(BSSID: String, SSID: String, frequency: Double, secure: Boolean, signalStrength: Double): WifiInfo = {
    val __obj = js.Dynamic.literal(BSSID = BSSID.asInstanceOf[js.Any], SSID = SSID.asInstanceOf[js.Any], frequency = frequency.asInstanceOf[js.Any], secure = secure.asInstanceOf[js.Any], signalStrength = signalStrength.asInstanceOf[js.Any])
    __obj.asInstanceOf[WifiInfo]
  }
  
  @scala.inline
  implicit class WifiInfoMutableBuilder[Self <: WifiInfo] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBSSID(value: String): Self = StObject.set(x, "BSSID", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFrequency(value: Double): Self = StObject.set(x, "frequency", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSSID(value: String): Self = StObject.set(x, "SSID", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSecure(value: Boolean): Self = StObject.set(x, "secure", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSignalStrength(value: Double): Self = StObject.set(x, "signalStrength", value.asInstanceOf[js.Any])
  }
}

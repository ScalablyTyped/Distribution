package typings.webostvjs.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait WifiWfdInfo extends StObject {
  
  /**
    * The flag that indicates whether the Wi-Fi Direct content protection is supported:
    * - true: Supported.
    * - false: Not supported.
    */
  var wfdCpSupport: Boolean
  
  /**
    * Wi-Fi Direct device type, one of:
    * - 'source'
    * - 'primary-sink'
    * - 'secondary-sink'
    */
  var wfdDeviceType: WfdDeviceType
  
  /**
    * Control port for Wi-Fi Direct session management.
    */
  var wfdRtspPort: Double
  
  /**
    * The flag that indicates whether the session is available:
    * - true: Available.
    * - false: Not available.
    */
  var wfdSessionAvail: Boolean
}
object WifiWfdInfo {
  
  inline def apply(wfdCpSupport: Boolean, wfdDeviceType: WfdDeviceType, wfdRtspPort: Double, wfdSessionAvail: Boolean): WifiWfdInfo = {
    val __obj = js.Dynamic.literal(wfdCpSupport = wfdCpSupport.asInstanceOf[js.Any], wfdDeviceType = wfdDeviceType.asInstanceOf[js.Any], wfdRtspPort = wfdRtspPort.asInstanceOf[js.Any], wfdSessionAvail = wfdSessionAvail.asInstanceOf[js.Any])
    __obj.asInstanceOf[WifiWfdInfo]
  }
  
  extension [Self <: WifiWfdInfo](x: Self) {
    
    inline def setWfdCpSupport(value: Boolean): Self = StObject.set(x, "wfdCpSupport", value.asInstanceOf[js.Any])
    
    inline def setWfdDeviceType(value: WfdDeviceType): Self = StObject.set(x, "wfdDeviceType", value.asInstanceOf[js.Any])
    
    inline def setWfdRtspPort(value: Double): Self = StObject.set(x, "wfdRtspPort", value.asInstanceOf[js.Any])
    
    inline def setWfdSessionAvail(value: Boolean): Self = StObject.set(x, "wfdSessionAvail", value.asInstanceOf[js.Any])
  }
}

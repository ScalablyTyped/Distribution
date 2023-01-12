package typings.wdioTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeviceMetrics extends StObject {
  
  var deviceMetrics: js.UndefOr[Height] = js.undefined
  
  var deviceName: js.UndefOr[String] = js.undefined
  
  var userAgent: js.UndefOr[String] = js.undefined
}
object DeviceMetrics {
  
  inline def apply(): DeviceMetrics = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DeviceMetrics]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DeviceMetrics] (val x: Self) extends AnyVal {
    
    inline def setDeviceMetrics(value: Height): Self = StObject.set(x, "deviceMetrics", value.asInstanceOf[js.Any])
    
    inline def setDeviceMetricsUndefined: Self = StObject.set(x, "deviceMetrics", js.undefined)
    
    inline def setDeviceName(value: String): Self = StObject.set(x, "deviceName", value.asInstanceOf[js.Any])
    
    inline def setDeviceNameUndefined: Self = StObject.set(x, "deviceName", js.undefined)
    
    inline def setUserAgent(value: String): Self = StObject.set(x, "userAgent", value.asInstanceOf[js.Any])
    
    inline def setUserAgentUndefined: Self = StObject.set(x, "userAgent", js.undefined)
  }
}

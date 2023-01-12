package typings.webxr

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait XRSystemEventMap extends StObject {
  
  var devicechange: XRSystemDeviceChangeEvent
  
  // Session Grant events are an Meta Oculus Browser extension
  var sessiongranted: XRSystemSessionGrantedEvent
}
object XRSystemEventMap {
  
  inline def apply(devicechange: XRSystemDeviceChangeEvent, sessiongranted: XRSystemSessionGrantedEvent): XRSystemEventMap = {
    val __obj = js.Dynamic.literal(devicechange = devicechange.asInstanceOf[js.Any], sessiongranted = sessiongranted.asInstanceOf[js.Any])
    __obj.asInstanceOf[XRSystemEventMap]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: XRSystemEventMap] (val x: Self) extends AnyVal {
    
    inline def setDevicechange(value: XRSystemDeviceChangeEvent): Self = StObject.set(x, "devicechange", value.asInstanceOf[js.Any])
    
    inline def setSessiongranted(value: XRSystemSessionGrantedEvent): Self = StObject.set(x, "sessiongranted", value.asInstanceOf[js.Any])
  }
}

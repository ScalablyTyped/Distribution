package typings.winrt.Windows.Devices.Sms

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ISmsReceivedEventDetails extends StObject {
  
  var deviceId: String
  
  var messageIndex: Double
}
object ISmsReceivedEventDetails {
  
  inline def apply(deviceId: String, messageIndex: Double): ISmsReceivedEventDetails = {
    val __obj = js.Dynamic.literal(deviceId = deviceId.asInstanceOf[js.Any], messageIndex = messageIndex.asInstanceOf[js.Any])
    __obj.asInstanceOf[ISmsReceivedEventDetails]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ISmsReceivedEventDetails] (val x: Self) extends AnyVal {
    
    inline def setDeviceId(value: String): Self = StObject.set(x, "deviceId", value.asInstanceOf[js.Any])
    
    inline def setMessageIndex(value: Double): Self = StObject.set(x, "messageIndex", value.asInstanceOf[js.Any])
  }
}

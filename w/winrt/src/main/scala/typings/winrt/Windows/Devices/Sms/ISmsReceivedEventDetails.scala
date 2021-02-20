package typings.winrt.Windows.Devices.Sms

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ISmsReceivedEventDetails extends StObject {
  
  var deviceId: String = js.native
  
  var messageIndex: Double = js.native
}
object ISmsReceivedEventDetails {
  
  @scala.inline
  def apply(deviceId: String, messageIndex: Double): ISmsReceivedEventDetails = {
    val __obj = js.Dynamic.literal(deviceId = deviceId.asInstanceOf[js.Any], messageIndex = messageIndex.asInstanceOf[js.Any])
    __obj.asInstanceOf[ISmsReceivedEventDetails]
  }
  
  @scala.inline
  implicit class ISmsReceivedEventDetailsMutableBuilder[Self <: ISmsReceivedEventDetails] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDeviceId(value: String): Self = StObject.set(x, "deviceId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMessageIndex(value: Double): Self = StObject.set(x, "messageIndex", value.asInstanceOf[js.Any])
  }
}

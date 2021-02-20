package typings.winrtUwp.Windows.Devices.Sms

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Presents the details of SMS message events to the background work item that handles messages while your app is suspended. */
@js.native
trait SmsReceivedEventDetails extends StObject {
  
  /** Gets the binary message object for the SMS message received by the background task. */
  var binaryMessage: SmsBinaryMessage = js.native
  
  /** Returns the DeviceInformation ID of the network interface that received the SMS message. This ID can be passed to SmsDevice.FromIdAsync to activate the device and retrieve additional message details. */
  var deviceId: String = js.native
  
  /** Gets the message class for the SMS message received by the background task. */
  var messageClass: SmsMessageClass = js.native
  
  /** Returns the index of the new message that raised the event. You can pass this to SmsDevice.GetMessageAsync to retrieve the new message itself. */
  var messageIndex: Double = js.native
}
object SmsReceivedEventDetails {
  
  @scala.inline
  def apply(
    binaryMessage: SmsBinaryMessage,
    deviceId: String,
    messageClass: SmsMessageClass,
    messageIndex: Double
  ): SmsReceivedEventDetails = {
    val __obj = js.Dynamic.literal(binaryMessage = binaryMessage.asInstanceOf[js.Any], deviceId = deviceId.asInstanceOf[js.Any], messageClass = messageClass.asInstanceOf[js.Any], messageIndex = messageIndex.asInstanceOf[js.Any])
    __obj.asInstanceOf[SmsReceivedEventDetails]
  }
  
  @scala.inline
  implicit class SmsReceivedEventDetailsMutableBuilder[Self <: SmsReceivedEventDetails] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBinaryMessage(value: SmsBinaryMessage): Self = StObject.set(x, "binaryMessage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDeviceId(value: String): Self = StObject.set(x, "deviceId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMessageClass(value: SmsMessageClass): Self = StObject.set(x, "messageClass", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMessageIndex(value: Double): Self = StObject.set(x, "messageIndex", value.asInstanceOf[js.Any])
  }
}

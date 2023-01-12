package typings.winrtUwp.Windows.Devices.Sms

import typings.winrtUwp.Windows.Storage.Streams.IBuffer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** The interface for manipulating an SMS Application message. Application messages are those which cannot be characterized as any other message type. */
trait SmsAppMessage extends StObject {
  
  /** Reads or writes the binary part of the Application message. */
  var binaryBody: IBuffer
  
  /** The plain text body of the message. */
  var body: String
  
  /** The number to be dialed in reply to a received SMS message. */
  var callbackNumber: String
  
  /** The class of the cellular device that received the message. */
  var cellularClass: CellularClass
  
  /** The device ID of the device that received the message. */
  var deviceId: String
  
  /** The encoding used to send the message. */
  var encoding: SmsEncoding
  
  /** The telephone number of the sender of the message. */
  var from: String
  
  /** Indicates whether an SMS delivery status report was sent by the SMSC. */
  var isDeliveryNotificationEnabled: Boolean
  
  /** The message class of the message. */
  var messageClass: SmsMessageClass
  
  /** The message type of the message. */
  var messageType: SmsMessageType
  
  /** The port number of the message. */
  var portNumber: Double
  
  /** The Protocol identifier for the message. */
  var protocolId: Double
  
  /** The retry attempt count for the message. */
  var retryAttemptCount: Double
  
  /** Gets the ICCID (Integrated Circuit Card Identifier) of the SIM that received the message. */
  var simIccId: String
  
  /** The Teleservice identifier for the message. */
  var teleserviceId: Double
  
  /** The timestamp of the message. */
  var timestamp: js.Date
  
  /** The telephone number of the recipient of this message. */
  var to: String
}
object SmsAppMessage {
  
  inline def apply(
    binaryBody: IBuffer,
    body: String,
    callbackNumber: String,
    cellularClass: CellularClass,
    deviceId: String,
    encoding: SmsEncoding,
    from: String,
    isDeliveryNotificationEnabled: Boolean,
    messageClass: SmsMessageClass,
    messageType: SmsMessageType,
    portNumber: Double,
    protocolId: Double,
    retryAttemptCount: Double,
    simIccId: String,
    teleserviceId: Double,
    timestamp: js.Date,
    to: String
  ): SmsAppMessage = {
    val __obj = js.Dynamic.literal(binaryBody = binaryBody.asInstanceOf[js.Any], body = body.asInstanceOf[js.Any], callbackNumber = callbackNumber.asInstanceOf[js.Any], cellularClass = cellularClass.asInstanceOf[js.Any], deviceId = deviceId.asInstanceOf[js.Any], encoding = encoding.asInstanceOf[js.Any], from = from.asInstanceOf[js.Any], isDeliveryNotificationEnabled = isDeliveryNotificationEnabled.asInstanceOf[js.Any], messageClass = messageClass.asInstanceOf[js.Any], messageType = messageType.asInstanceOf[js.Any], portNumber = portNumber.asInstanceOf[js.Any], protocolId = protocolId.asInstanceOf[js.Any], retryAttemptCount = retryAttemptCount.asInstanceOf[js.Any], simIccId = simIccId.asInstanceOf[js.Any], teleserviceId = teleserviceId.asInstanceOf[js.Any], timestamp = timestamp.asInstanceOf[js.Any], to = to.asInstanceOf[js.Any])
    __obj.asInstanceOf[SmsAppMessage]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: SmsAppMessage] (val x: Self) extends AnyVal {
    
    inline def setBinaryBody(value: IBuffer): Self = StObject.set(x, "binaryBody", value.asInstanceOf[js.Any])
    
    inline def setBody(value: String): Self = StObject.set(x, "body", value.asInstanceOf[js.Any])
    
    inline def setCallbackNumber(value: String): Self = StObject.set(x, "callbackNumber", value.asInstanceOf[js.Any])
    
    inline def setCellularClass(value: CellularClass): Self = StObject.set(x, "cellularClass", value.asInstanceOf[js.Any])
    
    inline def setDeviceId(value: String): Self = StObject.set(x, "deviceId", value.asInstanceOf[js.Any])
    
    inline def setEncoding(value: SmsEncoding): Self = StObject.set(x, "encoding", value.asInstanceOf[js.Any])
    
    inline def setFrom(value: String): Self = StObject.set(x, "from", value.asInstanceOf[js.Any])
    
    inline def setIsDeliveryNotificationEnabled(value: Boolean): Self = StObject.set(x, "isDeliveryNotificationEnabled", value.asInstanceOf[js.Any])
    
    inline def setMessageClass(value: SmsMessageClass): Self = StObject.set(x, "messageClass", value.asInstanceOf[js.Any])
    
    inline def setMessageType(value: SmsMessageType): Self = StObject.set(x, "messageType", value.asInstanceOf[js.Any])
    
    inline def setPortNumber(value: Double): Self = StObject.set(x, "portNumber", value.asInstanceOf[js.Any])
    
    inline def setProtocolId(value: Double): Self = StObject.set(x, "protocolId", value.asInstanceOf[js.Any])
    
    inline def setRetryAttemptCount(value: Double): Self = StObject.set(x, "retryAttemptCount", value.asInstanceOf[js.Any])
    
    inline def setSimIccId(value: String): Self = StObject.set(x, "simIccId", value.asInstanceOf[js.Any])
    
    inline def setTeleserviceId(value: Double): Self = StObject.set(x, "teleserviceId", value.asInstanceOf[js.Any])
    
    inline def setTimestamp(value: js.Date): Self = StObject.set(x, "timestamp", value.asInstanceOf[js.Any])
    
    inline def setTo(value: String): Self = StObject.set(x, "to", value.asInstanceOf[js.Any])
  }
}

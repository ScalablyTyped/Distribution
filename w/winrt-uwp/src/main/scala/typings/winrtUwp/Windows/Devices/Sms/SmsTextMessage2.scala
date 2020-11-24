package typings.winrtUwp.Windows.Devices.Sms

import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Encapsulates a decoded SMS text message. Prefer this class to the older SmsTextMessage class. */
@js.native
trait SmsTextMessage2 extends js.Object {
  
  /** Gets or sets the body of the text message. */
  var body: String = js.native
  
  /** Gets or sets the callback number for the message. */
  var callbackNumber: String = js.native
  
  /** Gets the cellular class of the message. */
  var cellularClass: CellularClass = js.native
  
  /** Gets the device identifier for the device associated with the SMS text message. */
  var deviceId: String = js.native
  
  /** Gets or sets the encoding scheme used for the message. */
  var encoding: SmsEncoding = js.native
  
  /** gets the phone number of the sender of the message. */
  var from: String = js.native
  
  /** Gets or sets whether text message delivery notification is enabled for this message. */
  var isDeliveryNotificationEnabled: Boolean = js.native
  
  /** Gets the message class of the message. */
  var messageClass: SmsMessageClass = js.native
  
  /** Gets the message type of the message. */
  var messageType: SmsMessageType = js.native
  
  /** Gets the protocol identifier for the message. */
  var protocolId: Double = js.native
  
  /** Gets or sets the number of retry attempts for the message. */
  var retryAttemptCount: Double = js.native
  
  /** Gets the ICCID (Integrated Circuit Card Identifier) of the SIM that received the message. */
  var simIccId: String = js.native
  
  /** Gets the teleservice identifier associated with this message. */
  var teleserviceId: Double = js.native
  
  /** The timestamp of this message. */
  var timestamp: Date = js.native
  
  /** Gets or sets the recipient phone number for the message. */
  var to: String = js.native
}
object SmsTextMessage2 {
  
  @scala.inline
  def apply(
    body: String,
    callbackNumber: String,
    cellularClass: CellularClass,
    deviceId: String,
    encoding: SmsEncoding,
    from: String,
    isDeliveryNotificationEnabled: Boolean,
    messageClass: SmsMessageClass,
    messageType: SmsMessageType,
    protocolId: Double,
    retryAttemptCount: Double,
    simIccId: String,
    teleserviceId: Double,
    timestamp: Date,
    to: String
  ): SmsTextMessage2 = {
    val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any], callbackNumber = callbackNumber.asInstanceOf[js.Any], cellularClass = cellularClass.asInstanceOf[js.Any], deviceId = deviceId.asInstanceOf[js.Any], encoding = encoding.asInstanceOf[js.Any], from = from.asInstanceOf[js.Any], isDeliveryNotificationEnabled = isDeliveryNotificationEnabled.asInstanceOf[js.Any], messageClass = messageClass.asInstanceOf[js.Any], messageType = messageType.asInstanceOf[js.Any], protocolId = protocolId.asInstanceOf[js.Any], retryAttemptCount = retryAttemptCount.asInstanceOf[js.Any], simIccId = simIccId.asInstanceOf[js.Any], teleserviceId = teleserviceId.asInstanceOf[js.Any], timestamp = timestamp.asInstanceOf[js.Any], to = to.asInstanceOf[js.Any])
    __obj.asInstanceOf[SmsTextMessage2]
  }
  
  @scala.inline
  implicit class SmsTextMessage2Ops[Self <: SmsTextMessage2] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setBody(value: String): Self = this.set("body", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCallbackNumber(value: String): Self = this.set("callbackNumber", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCellularClass(value: CellularClass): Self = this.set("cellularClass", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDeviceId(value: String): Self = this.set("deviceId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEncoding(value: SmsEncoding): Self = this.set("encoding", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFrom(value: String): Self = this.set("from", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsDeliveryNotificationEnabled(value: Boolean): Self = this.set("isDeliveryNotificationEnabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMessageClass(value: SmsMessageClass): Self = this.set("messageClass", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMessageType(value: SmsMessageType): Self = this.set("messageType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProtocolId(value: Double): Self = this.set("protocolId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRetryAttemptCount(value: Double): Self = this.set("retryAttemptCount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSimIccId(value: String): Self = this.set("simIccId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTeleserviceId(value: Double): Self = this.set("teleserviceId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTimestamp(value: Date): Self = this.set("timestamp", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTo(value: String): Self = this.set("to", value.asInstanceOf[js.Any])
  }
}

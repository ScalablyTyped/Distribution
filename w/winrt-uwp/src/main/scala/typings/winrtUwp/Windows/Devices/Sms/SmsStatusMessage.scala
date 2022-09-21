package typings.winrtUwp.Windows.Devices.Sms

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Encapsulates an SMS status message. */
trait SmsStatusMessage extends StObject {
  
  /** Gets the body of the status message. */
  var body: String
  
  /** Gets the cellular class of the message. */
  var cellularClass: CellularClass
  
  /** Gets the device identifier associated with the status message. */
  var deviceId: String
  
  /** The discharge time of the status message. */
  var dischargeTime: js.Date
  
  /** Gets the phone number that sent the status message. */
  var from: String
  
  /** Gets the message class of the status message. */
  var messageClass: SmsMessageClass
  
  /** Gets the reference number of the status message. */
  var messageReferenceNumber: Double
  
  /** Gets the message type of the status message. */
  var messageType: SmsMessageType
  
  /** Gets the service center timestamp of the status message. */
  var serviceCenterTimestamp: js.Date
  
  /** Gets the ICCID (Integrated Circuit Card Identifier) of the SIM that received the message. */
  var simIccId: String
  
  /** The status code associated with this message. */
  var status: Double
  
  /** Gets the phone number the status message was sent to. */
  var to: String
}
object SmsStatusMessage {
  
  inline def apply(
    body: String,
    cellularClass: CellularClass,
    deviceId: String,
    dischargeTime: js.Date,
    from: String,
    messageClass: SmsMessageClass,
    messageReferenceNumber: Double,
    messageType: SmsMessageType,
    serviceCenterTimestamp: js.Date,
    simIccId: String,
    status: Double,
    to: String
  ): SmsStatusMessage = {
    val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any], cellularClass = cellularClass.asInstanceOf[js.Any], deviceId = deviceId.asInstanceOf[js.Any], dischargeTime = dischargeTime.asInstanceOf[js.Any], from = from.asInstanceOf[js.Any], messageClass = messageClass.asInstanceOf[js.Any], messageReferenceNumber = messageReferenceNumber.asInstanceOf[js.Any], messageType = messageType.asInstanceOf[js.Any], serviceCenterTimestamp = serviceCenterTimestamp.asInstanceOf[js.Any], simIccId = simIccId.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any], to = to.asInstanceOf[js.Any])
    __obj.asInstanceOf[SmsStatusMessage]
  }
  
  extension [Self <: SmsStatusMessage](x: Self) {
    
    inline def setBody(value: String): Self = StObject.set(x, "body", value.asInstanceOf[js.Any])
    
    inline def setCellularClass(value: CellularClass): Self = StObject.set(x, "cellularClass", value.asInstanceOf[js.Any])
    
    inline def setDeviceId(value: String): Self = StObject.set(x, "deviceId", value.asInstanceOf[js.Any])
    
    inline def setDischargeTime(value: js.Date): Self = StObject.set(x, "dischargeTime", value.asInstanceOf[js.Any])
    
    inline def setFrom(value: String): Self = StObject.set(x, "from", value.asInstanceOf[js.Any])
    
    inline def setMessageClass(value: SmsMessageClass): Self = StObject.set(x, "messageClass", value.asInstanceOf[js.Any])
    
    inline def setMessageReferenceNumber(value: Double): Self = StObject.set(x, "messageReferenceNumber", value.asInstanceOf[js.Any])
    
    inline def setMessageType(value: SmsMessageType): Self = StObject.set(x, "messageType", value.asInstanceOf[js.Any])
    
    inline def setServiceCenterTimestamp(value: js.Date): Self = StObject.set(x, "serviceCenterTimestamp", value.asInstanceOf[js.Any])
    
    inline def setSimIccId(value: String): Self = StObject.set(x, "simIccId", value.asInstanceOf[js.Any])
    
    inline def setStatus(value: Double): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    inline def setTo(value: String): Self = StObject.set(x, "to", value.asInstanceOf[js.Any])
  }
}

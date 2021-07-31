package typings.winrtUwp.Windows.Devices.Sms

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** This interface specifies base functionality for all SMS message types. */
trait ISmsMessageBase extends StObject {
  
  /** Gets the cellular class of the message. */
  var cellularClass: CellularClass
  
  /** Gets the unique device identifier associated with this message. */
  var deviceId: String
  
  /** Gets the message class of this message. */
  var messageClass: SmsMessageClass
  
  /** Gets the message type of this message. */
  var messageType: SmsMessageType
  
  /** Gets the ICCID (Integrated Circuit Card Identifier) of the SIM that received the message. */
  var simIccId: String
}
object ISmsMessageBase {
  
  @scala.inline
  def apply(
    cellularClass: CellularClass,
    deviceId: String,
    messageClass: SmsMessageClass,
    messageType: SmsMessageType,
    simIccId: String
  ): ISmsMessageBase = {
    val __obj = js.Dynamic.literal(cellularClass = cellularClass.asInstanceOf[js.Any], deviceId = deviceId.asInstanceOf[js.Any], messageClass = messageClass.asInstanceOf[js.Any], messageType = messageType.asInstanceOf[js.Any], simIccId = simIccId.asInstanceOf[js.Any])
    __obj.asInstanceOf[ISmsMessageBase]
  }
  
  @scala.inline
  implicit class ISmsMessageBaseMutableBuilder[Self <: ISmsMessageBase] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCellularClass(value: CellularClass): Self = StObject.set(x, "cellularClass", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDeviceId(value: String): Self = StObject.set(x, "deviceId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMessageClass(value: SmsMessageClass): Self = StObject.set(x, "messageClass", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMessageType(value: SmsMessageType): Self = StObject.set(x, "messageType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSimIccId(value: String): Self = StObject.set(x, "simIccId", value.asInstanceOf[js.Any])
  }
}

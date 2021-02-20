package typings.winrtUwp.Windows.Devices.Sms

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Contains event details for the event raised when an SMS message is received. */
@js.native
trait SmsMessageReceivedTriggerDetails extends StObject {
  
  /** Delivers the filtered message to the messaging app. */
  def accept(): Unit = js.native
  
  /** When MessageType is App, the message details for the message. */
  var appMessage: SmsAppMessage = js.native
  
  /** When MessageType is Broadcast, the message details for the message. */
  var broadcastMessage: SmsBroadcastMessage = js.native
  
  /** Drops the filtered message, so that it is not passed on to the messaging app. */
  def drop(): Unit = js.native
  
  /** The SmsMessageType of the received message. */
  var messageType: SmsMessageType = js.native
  
  /** When MessageType is Status, the message details for the message. */
  var statusMessage: SmsStatusMessage = js.native
  
  /** When MessageType is Text, the message details for the message. */
  var textMessage: SmsTextMessage2 = js.native
  
  /** When MessageType is Voicemail, the message details for the message. */
  var voicemailMessage: SmsVoicemailMessage = js.native
  
  /** When MessageType is Wap, the message details for the message. */
  var wapMessage: SmsWapMessage = js.native
}
object SmsMessageReceivedTriggerDetails {
  
  @scala.inline
  def apply(
    accept: () => Unit,
    appMessage: SmsAppMessage,
    broadcastMessage: SmsBroadcastMessage,
    drop: () => Unit,
    messageType: SmsMessageType,
    statusMessage: SmsStatusMessage,
    textMessage: SmsTextMessage2,
    voicemailMessage: SmsVoicemailMessage,
    wapMessage: SmsWapMessage
  ): SmsMessageReceivedTriggerDetails = {
    val __obj = js.Dynamic.literal(accept = js.Any.fromFunction0(accept), appMessage = appMessage.asInstanceOf[js.Any], broadcastMessage = broadcastMessage.asInstanceOf[js.Any], drop = js.Any.fromFunction0(drop), messageType = messageType.asInstanceOf[js.Any], statusMessage = statusMessage.asInstanceOf[js.Any], textMessage = textMessage.asInstanceOf[js.Any], voicemailMessage = voicemailMessage.asInstanceOf[js.Any], wapMessage = wapMessage.asInstanceOf[js.Any])
    __obj.asInstanceOf[SmsMessageReceivedTriggerDetails]
  }
  
  @scala.inline
  implicit class SmsMessageReceivedTriggerDetailsMutableBuilder[Self <: SmsMessageReceivedTriggerDetails] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAccept(value: () => Unit): Self = StObject.set(x, "accept", js.Any.fromFunction0(value))
    
    @scala.inline
    def setAppMessage(value: SmsAppMessage): Self = StObject.set(x, "appMessage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBroadcastMessage(value: SmsBroadcastMessage): Self = StObject.set(x, "broadcastMessage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDrop(value: () => Unit): Self = StObject.set(x, "drop", js.Any.fromFunction0(value))
    
    @scala.inline
    def setMessageType(value: SmsMessageType): Self = StObject.set(x, "messageType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStatusMessage(value: SmsStatusMessage): Self = StObject.set(x, "statusMessage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTextMessage(value: SmsTextMessage2): Self = StObject.set(x, "textMessage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVoicemailMessage(value: SmsVoicemailMessage): Self = StObject.set(x, "voicemailMessage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWapMessage(value: SmsWapMessage): Self = StObject.set(x, "wapMessage", value.asInstanceOf[js.Any])
  }
}

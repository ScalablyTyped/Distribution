package typings.winrtUwp.Windows.Devices.Sms

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Contains event details for the event raised when an SMS message is received. */
trait SmsMessageReceivedTriggerDetails extends js.Object {
  /** When MessageType is App, the message details for the message. */
  var appMessage: SmsAppMessage
  /** When MessageType is Broadcast, the message details for the message. */
  var broadcastMessage: SmsBroadcastMessage
  /** The SmsMessageType of the received message. */
  var messageType: SmsMessageType
  /** When MessageType is Status, the message details for the message. */
  var statusMessage: SmsStatusMessage
  /** When MessageType is Text, the message details for the message. */
  var textMessage: SmsTextMessage2
  /** When MessageType is Voicemail, the message details for the message. */
  var voicemailMessage: SmsVoicemailMessage
  /** When MessageType is Wap, the message details for the message. */
  var wapMessage: SmsWapMessage
  /** Delivers the filtered message to the messaging app. */
  def accept(): Unit
  /** Drops the filtered message, so that it is not passed on to the messaging app. */
  def drop(): Unit
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
}


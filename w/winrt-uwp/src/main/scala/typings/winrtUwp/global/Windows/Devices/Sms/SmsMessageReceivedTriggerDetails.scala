package typings.winrtUwp.global.Windows.Devices.Sms

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Contains event details for the event raised when an SMS message is received. */
@JSGlobal("Windows.Devices.Sms.SmsMessageReceivedTriggerDetails")
@js.native
abstract class SmsMessageReceivedTriggerDetails ()
  extends typings.winrtUwp.Windows.Devices.Sms.SmsMessageReceivedTriggerDetails {
  /** When MessageType is App, the message details for the message. */
  /* CompleteClass */
  override var appMessage: typings.winrtUwp.Windows.Devices.Sms.SmsAppMessage = js.native
  /** When MessageType is Broadcast, the message details for the message. */
  /* CompleteClass */
  override var broadcastMessage: typings.winrtUwp.Windows.Devices.Sms.SmsBroadcastMessage = js.native
  /** The SmsMessageType of the received message. */
  /* CompleteClass */
  override var messageType: typings.winrtUwp.Windows.Devices.Sms.SmsMessageType = js.native
  /** When MessageType is Status, the message details for the message. */
  /* CompleteClass */
  override var statusMessage: typings.winrtUwp.Windows.Devices.Sms.SmsStatusMessage = js.native
  /** When MessageType is Text, the message details for the message. */
  /* CompleteClass */
  override var textMessage: typings.winrtUwp.Windows.Devices.Sms.SmsTextMessage2 = js.native
  /** When MessageType is Voicemail, the message details for the message. */
  /* CompleteClass */
  override var voicemailMessage: typings.winrtUwp.Windows.Devices.Sms.SmsVoicemailMessage = js.native
  /** When MessageType is Wap, the message details for the message. */
  /* CompleteClass */
  override var wapMessage: typings.winrtUwp.Windows.Devices.Sms.SmsWapMessage = js.native
  /** Delivers the filtered message to the messaging app. */
  /* CompleteClass */
  override def accept(): Unit = js.native
  /** Drops the filtered message, so that it is not passed on to the messaging app. */
  /* CompleteClass */
  override def drop(): Unit = js.native
}


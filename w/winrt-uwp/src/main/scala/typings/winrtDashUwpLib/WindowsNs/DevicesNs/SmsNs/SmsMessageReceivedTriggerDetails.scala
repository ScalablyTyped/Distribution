package typings
package winrtDashUwpLib.WindowsNs.DevicesNs.SmsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Contains event details for the event raised when an SMS message is received. */
@JSGlobal("Windows.Devices.Sms.SmsMessageReceivedTriggerDetails")
@js.native
abstract class SmsMessageReceivedTriggerDetails () extends js.Object {
  /** When MessageType is App, the message details for the message. */
  var appMessage: SmsAppMessage = js.native
  /** When MessageType is Broadcast, the message details for the message. */
  var broadcastMessage: SmsBroadcastMessage = js.native
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
  /** Delivers the filtered message to the messaging app. */
  def accept(): scala.Unit = js.native
  /** Drops the filtered message, so that it is not passed on to the messaging app. */
  def drop(): scala.Unit = js.native
}


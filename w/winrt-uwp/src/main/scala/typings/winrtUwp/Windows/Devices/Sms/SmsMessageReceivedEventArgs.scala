package typings.winrtUwp.Windows.Devices.Sms

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Provides data for ISmsBinaryMessage event handlers. */
@JSGlobal("Windows.Devices.Sms.SmsMessageReceivedEventArgs")
@js.native
abstract class SmsMessageReceivedEventArgs () extends js.Object {
  /** Retrieves an object that holds the binary representation of the message. This is of interest only to clients who want to pass binary messages on directly or do their own interpretation of the binary message contents. */
  var binaryMessage: SmsBinaryMessage = js.native
  /** Retrieves an object that holds the text representation of the message. If the message is not successfully decoded, an error is returned. */
  var textMessage: SmsTextMessage = js.native
}


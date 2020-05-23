package typings.winrtUwp.global.Windows.Devices.Sms

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Provides data for ISmsBinaryMessage event handlers. */
@JSGlobal("Windows.Devices.Sms.SmsMessageReceivedEventArgs")
@js.native
abstract class SmsMessageReceivedEventArgs ()
  extends typings.winrtUwp.Windows.Devices.Sms.SmsMessageReceivedEventArgs {
  /** Retrieves an object that holds the binary representation of the message. This is of interest only to clients who want to pass binary messages on directly or do their own interpretation of the binary message contents. */
  /* CompleteClass */
  override var binaryMessage: typings.winrtUwp.Windows.Devices.Sms.SmsBinaryMessage = js.native
  /** Retrieves an object that holds the text representation of the message. If the message is not successfully decoded, an error is returned. */
  /* CompleteClass */
  override var textMessage: typings.winrtUwp.Windows.Devices.Sms.SmsTextMessage = js.native
}


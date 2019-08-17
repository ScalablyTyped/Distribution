package typings.winrtDashUwp.WindowsNs.DevicesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object SmsNs {
  import typings.winrtDashUwp.WindowsNs.WinRTEvent

  /** This handler is called when the status on the SMS device changes. Callers should implement this when they want to be notified when a significant state change occurs on the device. For example, the caller might want to know when the device is ready to send and receive messages. */
  type SmsDeviceStatusChangedEventHandler = js.Function1[/* ev */ WinRTEvent[SmsDevice], Unit]
  /** This event handler is called when a new binary message is received. Callers should implement this when they want to handle new binary messages from a given SMS device. */
  type SmsMessageReceivedEventHandler = js.Function1[/* ev */ SmsMessageReceivedEventArgs with WinRTEvent[SmsDevice], Unit]
}

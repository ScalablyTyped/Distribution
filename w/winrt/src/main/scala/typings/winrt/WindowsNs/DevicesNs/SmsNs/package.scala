package typings.winrt.WindowsNs.DevicesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object SmsNs {
  type SmsDeviceStatusChangedEventHandler = js.Function1[/* sender */ SmsDevice, Unit]
  type SmsMessageReceivedEventHandler = js.Function2[/* sender */ SmsDevice, /* e */ SmsMessageReceivedEventArgs, Unit]
}

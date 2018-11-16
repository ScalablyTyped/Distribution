package typings
package winrtLib.WindowsNs.DevicesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object SmsNs {
  type SmsDeviceStatusChangedEventHandler = js.Function1[/* sender */ SmsDevice, scala.Unit]
  type SmsMessageReceivedEventHandler = js.Function2[/* sender */ SmsDevice, /* e */ SmsMessageReceivedEventArgs, scala.Unit]
}

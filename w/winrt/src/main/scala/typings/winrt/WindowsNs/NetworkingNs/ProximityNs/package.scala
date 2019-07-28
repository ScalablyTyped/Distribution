package typings.winrt.WindowsNs.NetworkingNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object ProximityNs {
  type DeviceArrivedEventHandler = js.Function1[/* sender */ ProximityDevice, Unit]
  type DeviceDepartedEventHandler = js.Function1[/* sender */ ProximityDevice, Unit]
  type MessageReceivedHandler = js.Function2[/* sender */ ProximityDevice, /* message */ ProximityMessage, Unit]
  type MessageTransmittedHandler = js.Function2[/* sender */ ProximityDevice, /* messageId */ Double, Unit]
}

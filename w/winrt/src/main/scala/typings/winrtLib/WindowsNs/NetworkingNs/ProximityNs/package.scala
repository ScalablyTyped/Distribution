package typings
package winrtLib.WindowsNs.NetworkingNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object ProximityNs {
  type DeviceArrivedEventHandler = js.Function1[/* sender */ ProximityDevice, scala.Unit]
  type DeviceDepartedEventHandler = js.Function1[/* sender */ ProximityDevice, scala.Unit]
  type MessageReceivedHandler = js.Function2[/* sender */ ProximityDevice, /* message */ ProximityMessage, scala.Unit]
  type MessageTransmittedHandler = js.Function2[/* sender */ ProximityDevice, /* messageId */ scala.Double, scala.Unit]
}

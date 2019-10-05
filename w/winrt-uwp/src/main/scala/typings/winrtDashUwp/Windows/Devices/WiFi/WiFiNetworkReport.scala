package typings.winrtDashUwp.Windows.Devices.WiFi

import typings.std.Date
import typings.winrtDashUwp.Windows.Foundation.Collections.IVectorView
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Contains the result of a network scan operation. */
@JSGlobal("Windows.Devices.WiFi.WiFiNetworkReport")
@js.native
abstract class WiFiNetworkReport () extends js.Object {
  /** A list of available networks. */
  var availableNetworks: IVectorView[WiFiAvailableNetwork] = js.native
  /** Contains the result of a network scan operation. */
  var timestamp: Date = js.native
}


package typings
package winrtDashUwpLib.WindowsNs.DevicesNs.WiFiNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Contains the result of a network scan operation. */
@JSGlobal("Windows.Devices.WiFi.WiFiNetworkReport")
@js.native
abstract class WiFiNetworkReport () extends js.Object {
  /** A list of available networks. */
  var availableNetworks: winrtDashUwpLib.WindowsNs.FoundationNs.CollectionsNs.IVectorView[WiFiAvailableNetwork] = js.native
  /** Contains the result of a network scan operation. */
  var timestamp: stdLib.Date = js.native
}


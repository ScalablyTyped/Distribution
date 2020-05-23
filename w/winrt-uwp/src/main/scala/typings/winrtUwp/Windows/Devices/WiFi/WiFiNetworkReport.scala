package typings.winrtUwp.Windows.Devices.WiFi

import typings.std.Date
import typings.winrtUwp.Windows.Foundation.Collections.IVectorView
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Contains the result of a network scan operation. */
trait WiFiNetworkReport extends js.Object {
  /** A list of available networks. */
  var availableNetworks: IVectorView[WiFiAvailableNetwork]
  /** Contains the result of a network scan operation. */
  var timestamp: Date
}

object WiFiNetworkReport {
  @scala.inline
  def apply(availableNetworks: IVectorView[WiFiAvailableNetwork], timestamp: Date): WiFiNetworkReport = {
    val __obj = js.Dynamic.literal(availableNetworks = availableNetworks.asInstanceOf[js.Any], timestamp = timestamp.asInstanceOf[js.Any])
    __obj.asInstanceOf[WiFiNetworkReport]
  }
}

